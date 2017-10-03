/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.sabre.client;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.message.GZipEncoder;
import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.mule.modules.sabre.exception.SabreException;
import org.mule.modules.sabre.model.authentication.AuthentcationResponse;
import org.mule.modules.sabre.model.authentication.AuthenticationResponseError;
import org.mule.modules.sabre.model.generic.GenericErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;

public class SabreClient {

    private static final Logger logger = LoggerFactory.getLogger(SabreClient.class);

    private Client client;
    private WebTarget webTarget;
    private final String apiUrl;
    private final String clientId;
    private final String clientSecret;
    private String accesToken;

    public SabreClient(String apiUrl, String clientId, String clientSecret) {
        this.client = ClientBuilder.newClient().register(GZipEncoder.class).register(ObjectMapperProvider.class).register(JacksonFeature.class);
        this.apiUrl = apiUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Authenticate using connection parameters and store the access token
     * 
     * @throws ConnectionException
     *             When the authentication fails
     */
    public void authenticate() throws ConnectionException {
        Form payload = new Form();
        payload.param("grant_type", "client_credentials");

        validateConnectionParameters();

        webTarget = client.target(apiUrl);

        try {
            Response response = webTarget.path("/v2/auth/token").request().header("Authorization", "Basic " + getAuthorization()).post(Entity.form(payload));

            if (response.getStatus() == 200) {
                AuthentcationResponse authentcationResponse = response.readEntity(AuthentcationResponse.class);
                accesToken = authentcationResponse.getAccessToken();
            } else {
                logger.error("Error invoking auth path: " + String.valueOf(response.getStatus()));
                AuthenticationResponseError authenticationResponseError = response.readEntity(AuthenticationResponseError.class);
                throw new ConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, String.valueOf(response.getStatus()),
                        authenticationResponseError.getErrorDescription());
            }

        } catch (ProcessingException e) {
            logger.error("Error invoking auth path", e);
            throw new ConnectionException(ConnectionExceptionCode.UNKNOWN, "", "Error invoking auth path!", e);
        }
    }

    /**
     * Do the request to the API using POST
     * 
     * @param path
     *            The path to do the request
     * 
     * @param params
     *            Params headers to be sent to the API
     * 
     * @param request
     *            The request entity to be sent to the API
     * 
     * @param<T> entity
     *               instance Java type.
     *               
     * @param responseType
     *            The class to be used to convert the response
     * 
     * @return The response entity returned by the API
     * 
     * @throws SabreException
     *             When the request fails or have invalid input
     */
    public <T> T doRequest(final String path, final Map<String, Object> params, final Object request, Class<T> responseType) throws SabreException {
        if (webTarget == null) {
            throw new SabreException("Webtarget not initialized! You must call authenticate method firt!");
        }

        if (params != null && params.size() > 0) {
            for (Entry<String, Object> entry : params.entrySet()) {
                webTarget = webTarget.queryParam(entry.getKey(), entry.getValue());
            }
        }

        T responseValue = null;

        try {
            Response response = webTarget.path(path)
                    .request()
                    .accept(MediaType.APPLICATION_JSON)
                    .header("Authorization", "Bearer " + getAccesToken())
                    .header("Accept-Encoding", "gzip")
                    .post(Entity.entity(request, MediaType.APPLICATION_JSON));

            if (response.getStatus() == 200) {
                responseValue = response.readEntity(responseType);
            } else {
                logger.error("Error invoking path: " + path + " - " + String.valueOf(response.getStatus()));
                GenericErrorResponse genericErrorResponse = response.readEntity(GenericErrorResponse.class);
                String messageError = getMessageError(genericErrorResponse);
                throw new SabreException(messageError);
            }
        } catch (ProcessingException | IOException e) {
            logger.error("Error invoking path: " + path, e);
            throw new SabreException(e);
        }

        return responseValue;
    }

    /**
     * Validate connection parameters
     * 
     * @throws ConnectionException
     *             When one of the parameters has a invalid value
     */
    private void validateConnectionParameters() throws ConnectionException {
        String msg = null;
        if (StringUtils.isEmpty(apiUrl)) {
            msg = "ApiUrl is null or empty!";
            throw new ConnectionException(ConnectionExceptionCode.UNKNOWN_HOST, "", msg);
        } else if (StringUtils.isEmpty(clientId)) {
            msg = "ClientId is null or empty!";
            throw new ConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, "", msg);
        } else if (StringUtils.isEmpty(clientSecret)) {
            msg = "ClientSecret is null or empty!";
            throw new ConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, "", msg);
        }
    }

    /**
     * Get the message error from the response
     * 
     * @param genericErrorResponse
     *            The error entity returned by the API
     * 
     * @throws IOException
     *             When the parse fail
     */
    private String getMessageError(GenericErrorResponse genericErrorResponse) throws IOException {
        String msgError = "Invalid request!";

        JsonNode jsonMessageNode = ObjectMapperProvider.getObjectMapper().readTree(genericErrorResponse.getMessage());
        // try to extract the first error message from the returned json
        JsonNode error = jsonMessageNode.findValue("Error");
        if (error != null) {
            List<JsonNode> errors = jsonMessageNode.findParents("Code");
            if (errors != null && errors.size() > 0) {
                JsonNode firstError = errors.stream().filter(j -> j.get("Code").asText().equals("INVALIDREQ") || j.get("Code").asText().equals("MSG")).findFirst().orElse(null);
                if (firstError != null) {
                    if (firstError.get("ShortText") != null) {
                        msgError = firstError.get("ShortText").asText();
                    }
                    if (firstError.get("content") != null && !StringUtils.isEmpty(firstError.get("content").asText())) {
                        msgError = msgError + " - " + firstError.get("content").asText();
                    }
                }
            }
        }

        return msgError;
    }

    /**
     * @return Authorization header
     */
    private String getAuthorization() {
        return base64(base64(clientId) + ":" + base64(clientSecret));
    }

    /**
     * @param toEncode
     *            The string to be encoded
     * 
     * @return Encoded string
     */
    private String base64(String toEncode) {
        return Base64.getEncoder().encodeToString(toEncode.getBytes());
    }

    /**
     * @return The accesToken stored after the authenticate call
     */
    public String getAccesToken() {
        return accesToken;
    }

}

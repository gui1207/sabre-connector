/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.sabre.config;

import org.mule.api.ConnectionException;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.Required;
import org.mule.api.annotations.TestConnectivity;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.components.ConnectionManagement;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.annotations.param.Default;
import org.mule.modules.sabre.client.SabreClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class handles the API connection as well the reconnections.
 *
 * @author Guilherme Pereira.
 */
@ConnectionManagement(friendlyName = "Configuration")
public class SabreConfig {

    private SabreClient sabreClient;

    private static final Logger logger = LoggerFactory.getLogger(SabreConfig.class);

    @Configurable
    @Default(value = "https://api.havail.sabre.com")
    @Required
    private String apiUrl;;

    /**
     * Connects to Sabre API
     *
     * @param clientId
     *            A Client ID from Sabre API Key
     * @param clientSecret
     *            A Client Secret from Sabre API Key
     * @throws ConnectionException
     *             When the connection fails
     */
    @Connect
    @TestConnectivity
    public void connect(@ConnectionKey String clientId, @ConnectionKey String clientSecret) throws ConnectionException {
        logger.debug("Connecting to Sabre...");
        try {
            sabreClient = new SabreClient(apiUrl, clientId, clientSecret);
            sabreClient.authenticate();
        } catch (ConnectionException e) {
            logger.error(String.format("Failed to connect to Sabre! %s - %s - %s", e.getCode(), e.getThirdPartyCode(), e.getMessage()));
            throw e;
        }
        logger.debug("Connection successful!");
    }

    /**
     * Disconnect
     */
    @Disconnect
    public void disconnect() {
        sabreClient = null;
    }

    /**
     * @return Returns the status of the connection.
     */
    @ValidateConnection
    public boolean isConnected() {
        return sabreClient != null;
    }

    /**
     * @return Return the access token.
     */
    @ConnectionIdentifier
    public String connectionId() {
        return sabreClient.getAccesToken();
    }

    /**
     * @return the apiUrl
     */
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     * @param apiUrl
     *            the apiUrl to set
     */
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    /**
     * @return the sabreClient
     */
    public SabreClient getSabreClient() {
        return sabreClient;
    }

}
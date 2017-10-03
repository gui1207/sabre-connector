/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.sabre;

import java.util.HashMap;
import java.util.Map;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Mime;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Default;
import org.mule.modules.sabre.client.SabreClient;
import org.mule.modules.sabre.config.SabreConfig;
import org.mule.modules.sabre.exception.SabreException;
import org.mule.modules.sabre.model.bargainfindermax.rq.OTAAirLowFareSearchRequest;
import org.mule.modules.sabre.model.bargainfindermax.rs.OTAAirLowFareSearchResponse;

/**
 * <p>
 * Sabre Travel Network is a global business-to-business travel marketplace, with the Sabre® global distribution system (GDS) at its core, and a broad set of solutions that
 * integrate with the marketplace connects travel buyers and sellers through the world. This marketplace is used by travel suppliers including approximately 400 airlines, 125,000
 * hotel properties, 200 tour operators, 50 rail carriers, 27 car rental brands and 16 cruise lines to promote, personalize and sell their products through travel management
 * companies, corporate travel departments, and to hundreds of millions of consumers using online travel sites and the services of approximately 400,000 Sabre Connected travel
 * agents around the world. Sabre Dev Studio is a comprehensive collection of tools and services designed to take your business to the next level. Dev Studio includes a powerful
 * portfolio of over 100 APIs, Informational Services, Notification Services, and a variety of tools and resources.
 * </p>
 * 
 * @author Guilherme Pererira
 */
@Connector(name = "sabre", friendlyName = "Sabre", description = "Sabre Integration", minMuleVersion = "3.8")
public class SabreConnector {

    @Config
    private SabreConfig sabreConfig;

    /**
     * Bargain Finder Max (BFM), is used to search for the lowest available priced itineraries based upon a specific date. A wide range of user-specified criteria can be applied to
     * the search.
     *
     * @api.doc <a href="https://developer.sabre.com/docs/read/rest_apis/air/search/bargain_finder_max">Bargain Finder Max API Doc</a>
     *
     * @param bargainFinderMaxRequest
     *            The Low Fare Search Request message requests priced itinerary options for flights between specific city pairs on specific dates for specific numbers and types of
     *            passengers. Optional request information can include: - Time / Time Window - Connecting cities. - Client Preferences (airlines, cabin, flight types etc.) The Low
     *            Fare Search request contains similar information to a Low Fare Search entry on an airline CRS or GDS.
     * 
     * @return The Low Fare Search Response message contains a number of .Priced Itinerary. options. Each includes: - A set of available flights matching the client.s request. -
     *         Pricing information including taxes and full fare breakdown for each passenger type - Ticketing information - Fare Basis Codes and the information necessary to make
     *         a rules entry. This message contains similar information to a standard airline CRS or GDS Low Fare Search Response message.
     * 
     * @throws SabreException
     *             If any fail occurs
     */
    @Processor(friendlyName = "BargainFinderMax")
    @Mime("application/java")
    public OTAAirLowFareSearchResponse bargainFinderMax(@Default("#[payload]") OTAAirLowFareSearchRequest bargainFinderMaxRequest) throws SabreException {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("mode", "live");

        OTAAirLowFareSearchResponse otaAirLowFareSearchResponse = getSabreClient().doRequest("/v3.2.0/shop/flights", params, bargainFinderMaxRequest,
                OTAAirLowFareSearchResponse.class);

        return otaAirLowFareSearchResponse;
    }

    /**
     * @return the sabreConfig
     */
    public SabreConfig getSabreConfig() {
        return sabreConfig;
    }

    /**
     * @param sabreConfig
     *            the sabreConfig to set
     */
    public void setSabreConfig(SabreConfig sabreConfig) {
        this.sabreConfig = sabreConfig;
    }

    /**
     * @return the sabreConfig
     */
    public SabreClient getSabreClient() {
        return sabreConfig.getSabreClient();
    }

}
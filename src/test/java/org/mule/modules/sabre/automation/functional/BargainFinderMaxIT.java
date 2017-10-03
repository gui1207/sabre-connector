/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.sabre.automation.functional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.modules.sabre.SabreConnector;
import org.mule.modules.sabre.exception.SabreException;
import org.mule.modules.sabre.model.bargainfindermax.rs.OTAAirLowFareSearchResponse;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class BargainFinderMaxIT extends AbstractTestCase<SabreConnector> {

	public BargainFinderMaxIT() {
		super(SabreConnector.class);
	}

	@Before
	public void setup() {
	}

	@After
	public void tearDown() {
	}
	    
	@Test
	public void testTrips() throws SabreException {
		OTAAirLowFareSearchResponse otaAirLowFareSearchRSRoot = getConnector().bargainFinderMax(TestDataBuilder.createOTAAirLowFareSearchRQ());
		assertThat(otaAirLowFareSearchRSRoot.getOTAAirLowFareSearchRS(), notNullValue());
		assertThat(otaAirLowFareSearchRSRoot.getOTAAirLowFareSearchRS().getPricedItineraries(), notNullValue());
		assertThat(otaAirLowFareSearchRSRoot.getOTAAirLowFareSearchRS().getPricedItineraries().getPricedItinerary(), hasSize(greaterThan(0)));
	}
	
	@Test
	public void testTripsWithEmptyResponse() throws SabreException {
	    try {
            getConnector().bargainFinderMax(TestDataBuilder.createOTAAirLowFareSearchRQToEmptyResponse());
            fail();
        } catch (SabreException e) {
            assertThat(e.getMessage(), containsString("NO FLIGHT SCHEDULES FOR QUALIFIERS USED"));
        }	    
	}
	
	@Test
	public void testTripsWithEmptyInvalidRequestData() {
		try {
		    getConnector().bargainFinderMax(TestDataBuilder.createOTAAirLowFareSearchRQToInvalidRequest());
			fail();
		} catch (SabreException e) {
			assertThat(e.getMessage(), containsString("Schema Validation Failed"));
		}
	}

}
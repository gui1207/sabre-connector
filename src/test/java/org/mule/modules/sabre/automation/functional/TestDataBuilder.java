/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.sabre.automation.functional;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.mule.modules.sabre.model.bargainfindermax.rq.AirTravelerAvail;
import org.mule.modules.sabre.model.bargainfindermax.rq.CabinPref;
import org.mule.modules.sabre.model.bargainfindermax.rq.DestinationLocation;
import org.mule.modules.sabre.model.bargainfindermax.rq.ExcludeCallDirectCarriers;
import org.mule.modules.sabre.model.bargainfindermax.rq.IntelliSellTransaction;
import org.mule.modules.sabre.model.bargainfindermax.rq.OTAAirLowFareSearchRQ;
import org.mule.modules.sabre.model.bargainfindermax.rq.OTAAirLowFareSearchRequest;
import org.mule.modules.sabre.model.bargainfindermax.rq.OriginDestinationInformation;
import org.mule.modules.sabre.model.bargainfindermax.rq.OriginLocation;
import org.mule.modules.sabre.model.bargainfindermax.rq.POS;
import org.mule.modules.sabre.model.bargainfindermax.rq.PassengerTypeQuantity;
import org.mule.modules.sabre.model.bargainfindermax.rq.PriceRequestInformation;
import org.mule.modules.sabre.model.bargainfindermax.rq.RequestType;
import org.mule.modules.sabre.model.bargainfindermax.rq.RequestorID;
import org.mule.modules.sabre.model.bargainfindermax.rq.Source;
import org.mule.modules.sabre.model.bargainfindermax.rq.TPAExtensions_;
import org.mule.modules.sabre.model.bargainfindermax.rq.TPAExtensions_____;
import org.mule.modules.sabre.model.bargainfindermax.rq.TravelPreferences;
import org.mule.modules.sabre.model.bargainfindermax.rq.TravelerInfoSummary;
import org.mule.modules.sabre.model.bargainfindermax.rq.TripType;

public class TestDataBuilder {
	
	private TestDataBuilder() {
        // No instances of this class allowed
    }
	
	public static OTAAirLowFareSearchRequest createOTAAirLowFareSearchRQ() {	    
	    OTAAirLowFareSearchRequest otaAirLowFareSearchRQRoot = createDefaultOTAAirLowFareSearchRQ();
	    otaAirLowFareSearchRQRoot.getOTAAirLowFareSearchRQ().getOriginDestinationInformation().add(createOriginDestinationInformation("CGH", "SDU"));    
		
		return otaAirLowFareSearchRQRoot;	
	}
	
	public static OTAAirLowFareSearchRequest createOTAAirLowFareSearchRQToEmptyResponse() {
	    OTAAirLowFareSearchRequest otaAirLowFareSearchRQRoot = createDefaultOTAAirLowFareSearchRQ();
	    otaAirLowFareSearchRQRoot.getOTAAirLowFareSearchRQ().getOriginDestinationInformation().add(createOriginDestinationInformation("XXX", "YYY"));       
	    
		return otaAirLowFareSearchRQRoot;	
	}
	
	public static OTAAirLowFareSearchRequest createOTAAirLowFareSearchRQToInvalidRequest() {	    
	    OTAAirLowFareSearchRequest otaAirLowFareSearchRQRoot = createDefaultOTAAirLowFareSearchRQ();
	    otaAirLowFareSearchRQRoot.getOTAAirLowFareSearchRQ().getOriginDestinationInformation().add(createOriginDestinationInformation("CGH", "SDU"));
	    otaAirLowFareSearchRQRoot.getOTAAirLowFareSearchRQ().getTravelPreferences().getTPAExtensions().getTripType().setValue("");
	    
		return otaAirLowFareSearchRQRoot;	
	}
	
	private static OTAAirLowFareSearchRequest createDefaultOTAAirLowFareSearchRQ() {	     
	    OTAAirLowFareSearchRQ otaAirLowFareSearchRQ = new OTAAirLowFareSearchRQ();
        
        otaAirLowFareSearchRQ.setPOS(new POS());
        otaAirLowFareSearchRQ.getPOS().setSource(new ArrayList<Source>());
        otaAirLowFareSearchRQ.getPOS().getSource().add(new Source());
        otaAirLowFareSearchRQ.getPOS().getSource().get(0).setPseudoCityCode("F9CE");
        otaAirLowFareSearchRQ.getPOS().getSource().get(0).setRequestorID(new RequestorID());
        otaAirLowFareSearchRQ.getPOS().getSource().get(0).getRequestorID().setID("1");
        otaAirLowFareSearchRQ.getPOS().getSource().get(0).getRequestorID().setType("1");
        
        otaAirLowFareSearchRQ.setTPAExtensions(new TPAExtensions_____());
        otaAirLowFareSearchRQ.getTPAExtensions().setIntelliSellTransaction(new IntelliSellTransaction());
        otaAirLowFareSearchRQ.getTPAExtensions().getIntelliSellTransaction().setRequestType(new RequestType());
        otaAirLowFareSearchRQ.getTPAExtensions().getIntelliSellTransaction().getRequestType().setName("50ITINS");
        
        otaAirLowFareSearchRQ.setTravelPreferences(new TravelPreferences());
        otaAirLowFareSearchRQ.getTravelPreferences().setCabinPref(new ArrayList<CabinPref>());
        otaAirLowFareSearchRQ.getTravelPreferences().getCabinPref().add(new CabinPref());
        otaAirLowFareSearchRQ.getTravelPreferences().getCabinPref().get(0).setCabin("Y");
        otaAirLowFareSearchRQ.getTravelPreferences().getCabinPref().get(0).setPreferLevel("Preferred");
        otaAirLowFareSearchRQ.getTravelPreferences().setETicketDesired(true);
        otaAirLowFareSearchRQ.getTravelPreferences().setValidInterlineTicket(true);
        otaAirLowFareSearchRQ.getTravelPreferences().setTPAExtensions(new TPAExtensions_());
        otaAirLowFareSearchRQ.getTravelPreferences().getTPAExtensions().setExcludeCallDirectCarriers(new ExcludeCallDirectCarriers());
        otaAirLowFareSearchRQ.getTravelPreferences().getTPAExtensions().getExcludeCallDirectCarriers().setEnabled(true);
        otaAirLowFareSearchRQ.getTravelPreferences().getTPAExtensions().setTripType(new TripType());
        otaAirLowFareSearchRQ.getTravelPreferences().getTPAExtensions().getTripType().setValue("OneWay");
        
        otaAirLowFareSearchRQ.setTravelerInfoSummary(new TravelerInfoSummary());
        otaAirLowFareSearchRQ.getTravelerInfoSummary().setAirTravelerAvail(new ArrayList<AirTravelerAvail>());
        otaAirLowFareSearchRQ.getTravelerInfoSummary().getAirTravelerAvail().add(new AirTravelerAvail());
        otaAirLowFareSearchRQ.getTravelerInfoSummary().getAirTravelerAvail().get(0).setPassengerTypeQuantity(new ArrayList<PassengerTypeQuantity>());
        otaAirLowFareSearchRQ.getTravelerInfoSummary().getAirTravelerAvail().get(0).getPassengerTypeQuantity().add(new PassengerTypeQuantity());
        otaAirLowFareSearchRQ.getTravelerInfoSummary().getAirTravelerAvail().get(0).getPassengerTypeQuantity().get(0).setCode("ADT");
        otaAirLowFareSearchRQ.getTravelerInfoSummary().getAirTravelerAvail().get(0).getPassengerTypeQuantity().get(0).setQuantity(Integer.valueOf(1));
        otaAirLowFareSearchRQ.getTravelerInfoSummary().setSeatsRequested(new ArrayList<Integer>());
        otaAirLowFareSearchRQ.getTravelerInfoSummary().getSeatsRequested().add(Integer.valueOf(1));
        otaAirLowFareSearchRQ.getTravelerInfoSummary().setPriceRequestInformation(new PriceRequestInformation());
        otaAirLowFareSearchRQ.getTravelerInfoSummary().getPriceRequestInformation().setCurrencyCode("BRL");
        
        otaAirLowFareSearchRQ.setOriginDestinationInformation(new ArrayList<OriginDestinationInformation>());
        
        OTAAirLowFareSearchRequest otaAirLowFareSearchRQRoot = new OTAAirLowFareSearchRequest();        
        otaAirLowFareSearchRQRoot.setOTAAirLowFareSearchRQ(otaAirLowFareSearchRQ);
        
        return otaAirLowFareSearchRQRoot;
	}
	
	private static OriginDestinationInformation createOriginDestinationInformation(String origin, String destination) {
	    OriginDestinationInformation originDestinationInformation = new OriginDestinationInformation();
	    originDestinationInformation.setOriginLocation(new OriginLocation());
	    originDestinationInformation.getOriginLocation().setLocationCode(origin);	    
	    
	    originDestinationInformation.setDestinationLocation(new DestinationLocation());
	    originDestinationInformation.getDestinationLocation().setLocationCode(destination);    
	   
	    LocalDateTime localDateTime = LocalDateTime.now()
	                                                .plusDays(1)
	                                                .with(LocalTime.MIN);  
	    
	    originDestinationInformation.setDepartureDateTime(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));    
	    
	    return originDestinationInformation;
	}

}

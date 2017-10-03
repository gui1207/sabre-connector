/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AirItinerary",
    "AirItineraryPricingInfo",
    "Notes",
    "TicketingInfo",
    "TPA_Extensions",
    "isFromCustomPath",
    "SequenceNumber",
    "OriginDestinationRPH",
    "CampaignID",
    "AlternateAirport",
    "MultipleTickets"
})
public class PricedItinerary {

    @JsonProperty("AirItinerary")
    private AirItinerary airItinerary;
    @JsonProperty("AirItineraryPricingInfo")
    private List<AirItineraryPricingInfo> airItineraryPricingInfo = new ArrayList<AirItineraryPricingInfo>();
    @JsonProperty("Notes")
    private List<Note> notes = new ArrayList<Note>();
    @JsonProperty("TicketingInfo")
    private TicketingInfo ticketingInfo;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions_________ tPAExtensions;
    @JsonProperty("isFromCustomPath")
    private Boolean isFromCustomPath;
    @JsonProperty("SequenceNumber")
    private Integer sequenceNumber;
    @JsonProperty("OriginDestinationRPH")
    private String originDestinationRPH;
    @JsonProperty("CampaignID")
    private String campaignID;
    @JsonProperty("AlternateAirport")
    private Boolean alternateAirport;
    @JsonProperty("MultipleTickets")
    private Boolean multipleTickets;

    @JsonProperty("AirItinerary")
    public AirItinerary getAirItinerary() {
        return airItinerary;
    }

    @JsonProperty("AirItinerary")
    public void setAirItinerary(AirItinerary airItinerary) {
        this.airItinerary = airItinerary;
    }

    @JsonProperty("AirItineraryPricingInfo")
    public List<AirItineraryPricingInfo> getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    @JsonProperty("AirItineraryPricingInfo")
    public void setAirItineraryPricingInfo(List<AirItineraryPricingInfo> airItineraryPricingInfo) {
        this.airItineraryPricingInfo = airItineraryPricingInfo;
    }

    @JsonProperty("Notes")
    public List<Note> getNotes() {
        return notes;
    }

    @JsonProperty("Notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @JsonProperty("TicketingInfo")
    public TicketingInfo getTicketingInfo() {
        return ticketingInfo;
    }

    @JsonProperty("TicketingInfo")
    public void setTicketingInfo(TicketingInfo ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions_________ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_________ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("isFromCustomPath")
    public Boolean getIsFromCustomPath() {
        return isFromCustomPath;
    }

    @JsonProperty("isFromCustomPath")
    public void setIsFromCustomPath(Boolean isFromCustomPath) {
        this.isFromCustomPath = isFromCustomPath;
    }

    @JsonProperty("SequenceNumber")
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("SequenceNumber")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @JsonProperty("OriginDestinationRPH")
    public String getOriginDestinationRPH() {
        return originDestinationRPH;
    }

    @JsonProperty("OriginDestinationRPH")
    public void setOriginDestinationRPH(String originDestinationRPH) {
        this.originDestinationRPH = originDestinationRPH;
    }

    @JsonProperty("CampaignID")
    public String getCampaignID() {
        return campaignID;
    }

    @JsonProperty("CampaignID")
    public void setCampaignID(String campaignID) {
        this.campaignID = campaignID;
    }

    @JsonProperty("AlternateAirport")
    public Boolean getAlternateAirport() {
        return alternateAirport;
    }

    @JsonProperty("AlternateAirport")
    public void setAlternateAirport(Boolean alternateAirport) {
        this.alternateAirport = alternateAirport;
    }

    @JsonProperty("MultipleTickets")
    public Boolean getMultipleTickets() {
        return multipleTickets;
    }

    @JsonProperty("MultipleTickets")
    public void setMultipleTickets(Boolean multipleTickets) {
        this.multipleTickets = multipleTickets;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("airItinerary", airItinerary).append("airItineraryPricingInfo", airItineraryPricingInfo).append("notes", notes).append("ticketingInfo", ticketingInfo).append("tPAExtensions", tPAExtensions).append("isFromCustomPath", isFromCustomPath).append("sequenceNumber", sequenceNumber).append("originDestinationRPH", originDestinationRPH).append("campaignID", campaignID).append("alternateAirport", alternateAirport).append("multipleTickets", multipleTickets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alternateAirport).append(sequenceNumber).append(notes).append(airItinerary).append(originDestinationRPH).append(tPAExtensions).append(campaignID).append(multipleTickets).append(isFromCustomPath).append(ticketingInfo).append(airItineraryPricingInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PricedItinerary) == false) {
            return false;
        }
        PricedItinerary rhs = ((PricedItinerary) other);
        return new EqualsBuilder().append(alternateAirport, rhs.alternateAirport).append(sequenceNumber, rhs.sequenceNumber).append(notes, rhs.notes).append(airItinerary, rhs.airItinerary).append(originDestinationRPH, rhs.originDestinationRPH).append(tPAExtensions, rhs.tPAExtensions).append(campaignID, rhs.campaignID).append(multipleTickets, rhs.multipleTickets).append(isFromCustomPath, rhs.isFromCustomPath).append(ticketingInfo, rhs.ticketingInfo).append(airItineraryPricingInfo, rhs.airItineraryPricingInfo).isEquals();
    }

}

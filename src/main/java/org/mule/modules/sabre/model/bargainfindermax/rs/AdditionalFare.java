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
    "AirItineraryPricingInfo",
    "Notes",
    "TicketingInfo",
    "MultipleTickets"
})
public class AdditionalFare {

    @JsonProperty("AirItineraryPricingInfo")
    private AirItineraryPricingInfo__ airItineraryPricingInfo;
    @JsonProperty("Notes")
    private List<Note> notes = new ArrayList<Note>();
    @JsonProperty("TicketingInfo")
    private TicketingInfo ticketingInfo;
    @JsonProperty("MultipleTickets")
    private Boolean multipleTickets;

    @JsonProperty("AirItineraryPricingInfo")
    public AirItineraryPricingInfo__ getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    @JsonProperty("AirItineraryPricingInfo")
    public void setAirItineraryPricingInfo(AirItineraryPricingInfo__ airItineraryPricingInfo) {
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
        return new ToStringBuilder(this).append("airItineraryPricingInfo", airItineraryPricingInfo).append("notes", notes).append("ticketingInfo", ticketingInfo).append("multipleTickets", multipleTickets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notes).append(ticketingInfo).append(airItineraryPricingInfo).append(multipleTickets).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalFare) == false) {
            return false;
        }
        AdditionalFare rhs = ((AdditionalFare) other);
        return new EqualsBuilder().append(notes, rhs.notes).append(ticketingInfo, rhs.ticketingInfo).append(airItineraryPricingInfo, rhs.airItineraryPricingInfo).append(multipleTickets, rhs.multipleTickets).isEquals();
    }

}

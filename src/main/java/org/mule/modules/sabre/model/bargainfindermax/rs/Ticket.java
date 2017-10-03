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
    "OriginDestinationOptions",
    "AirItineraryPricingInfo",
    "Notes",
    "TicketingInfo",
    "TPA_Extensions",
    "Number"
})
public class Ticket {

    @JsonProperty("OriginDestinationOptions")
    private OriginDestinationOptions_ originDestinationOptions;
    @JsonProperty("AirItineraryPricingInfo")
    private AirItineraryPricingInfo_ airItineraryPricingInfo;
    @JsonProperty("Notes")
    private List<Note> notes = new ArrayList<Note>();
    @JsonProperty("TicketingInfo")
    private TicketingInfo ticketingInfo;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions________ tPAExtensions;
    @JsonProperty("Number")
    private Integer number;

    @JsonProperty("OriginDestinationOptions")
    public OriginDestinationOptions_ getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    @JsonProperty("OriginDestinationOptions")
    public void setOriginDestinationOptions(OriginDestinationOptions_ originDestinationOptions) {
        this.originDestinationOptions = originDestinationOptions;
    }

    @JsonProperty("AirItineraryPricingInfo")
    public AirItineraryPricingInfo_ getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    @JsonProperty("AirItineraryPricingInfo")
    public void setAirItineraryPricingInfo(AirItineraryPricingInfo_ airItineraryPricingInfo) {
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
    public TPAExtensions________ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions________ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("Number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("originDestinationOptions", originDestinationOptions).append("airItineraryPricingInfo", airItineraryPricingInfo).append("notes", notes).append("ticketingInfo", ticketingInfo).append("tPAExtensions", tPAExtensions).append("number", number).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(originDestinationOptions).append(number).append(notes).append(tPAExtensions).append(ticketingInfo).append(airItineraryPricingInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ticket) == false) {
            return false;
        }
        Ticket rhs = ((Ticket) other);
        return new EqualsBuilder().append(originDestinationOptions, rhs.originDestinationOptions).append(number, rhs.number).append(notes, rhs.notes).append(tPAExtensions, rhs.tPAExtensions).append(ticketingInfo, rhs.ticketingInfo).append(airItineraryPricingInfo, rhs.airItineraryPricingInfo).isEquals();
    }

}

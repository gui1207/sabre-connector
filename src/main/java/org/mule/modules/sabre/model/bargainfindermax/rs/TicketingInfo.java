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
    "TicketAdvisory",
    "TPA_Extensions",
    "eTicketNumber",
    "TicketTimeLimit",
    "TicketType",
    "ValidInterline"
})
public class TicketingInfo {

    @JsonProperty("TicketAdvisory")
    private List<Note> ticketAdvisory = new ArrayList<Note>();
    @JsonProperty("TPA_Extensions")
    private String tPAExtensions;
    @JsonProperty("eTicketNumber")
    private String eTicketNumber;
    @JsonProperty("TicketTimeLimit")
    private String ticketTimeLimit;
    @JsonProperty("TicketType")
    private String ticketType;
    @JsonProperty("ValidInterline")
    private String validInterline;

    @JsonProperty("TicketAdvisory")
    public List<Note> getTicketAdvisory() {
        return ticketAdvisory;
    }

    @JsonProperty("TicketAdvisory")
    public void setTicketAdvisory(List<Note> ticketAdvisory) {
        this.ticketAdvisory = ticketAdvisory;
    }

    @JsonProperty("TPA_Extensions")
    public String getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(String tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("eTicketNumber")
    public String getETicketNumber() {
        return eTicketNumber;
    }

    @JsonProperty("eTicketNumber")
    public void setETicketNumber(String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
    }

    @JsonProperty("TicketTimeLimit")
    public String getTicketTimeLimit() {
        return ticketTimeLimit;
    }

    @JsonProperty("TicketTimeLimit")
    public void setTicketTimeLimit(String ticketTimeLimit) {
        this.ticketTimeLimit = ticketTimeLimit;
    }

    @JsonProperty("TicketType")
    public String getTicketType() {
        return ticketType;
    }

    @JsonProperty("TicketType")
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @JsonProperty("ValidInterline")
    public String getValidInterline() {
        return validInterline;
    }

    @JsonProperty("ValidInterline")
    public void setValidInterline(String validInterline) {
        this.validInterline = validInterline;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ticketAdvisory", ticketAdvisory).append("tPAExtensions", tPAExtensions).append("eTicketNumber", eTicketNumber).append("ticketTimeLimit", ticketTimeLimit).append("ticketType", ticketType).append("validInterline", validInterline).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ticketTimeLimit).append(ticketAdvisory).append(tPAExtensions).append(ticketType).append(eTicketNumber).append(validInterline).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TicketingInfo) == false) {
            return false;
        }
        TicketingInfo rhs = ((TicketingInfo) other);
        return new EqualsBuilder().append(ticketTimeLimit, rhs.ticketTimeLimit).append(ticketAdvisory, rhs.ticketAdvisory).append(tPAExtensions, rhs.tPAExtensions).append(ticketType, rhs.ticketType).append(eTicketNumber, rhs.eTicketNumber).append(validInterline, rhs.validInterline).isEquals();
    }

}

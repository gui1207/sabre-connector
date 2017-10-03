/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

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
    "SeatsRequested",
    "AirTravelerAvail",
    "PriceRequestInformation",
    "TPA_Extensions",
    "SpecificPTC_Indicator"
})
public class TravelerInfoSummary {

    @JsonProperty("SeatsRequested")
    private List<Integer> seatsRequested = new ArrayList<Integer>();
    @JsonProperty("AirTravelerAvail")
    private List<AirTravelerAvail> airTravelerAvail = new ArrayList<AirTravelerAvail>();
    @JsonProperty("PriceRequestInformation")
    private PriceRequestInformation priceRequestInformation;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions____ tPAExtensions;
    @JsonProperty("SpecificPTC_Indicator")
    private Boolean specificPTCIndicator;

    @JsonProperty("SeatsRequested")
    public List<Integer> getSeatsRequested() {
        return seatsRequested;
    }

    @JsonProperty("SeatsRequested")
    public void setSeatsRequested(List<Integer> seatsRequested) {
        this.seatsRequested = seatsRequested;
    }

    @JsonProperty("AirTravelerAvail")
    public List<AirTravelerAvail> getAirTravelerAvail() {
        return airTravelerAvail;
    }

    @JsonProperty("AirTravelerAvail")
    public void setAirTravelerAvail(List<AirTravelerAvail> airTravelerAvail) {
        this.airTravelerAvail = airTravelerAvail;
    }

    @JsonProperty("PriceRequestInformation")
    public PriceRequestInformation getPriceRequestInformation() {
        return priceRequestInformation;
    }

    @JsonProperty("PriceRequestInformation")
    public void setPriceRequestInformation(PriceRequestInformation priceRequestInformation) {
        this.priceRequestInformation = priceRequestInformation;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions____ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions____ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("SpecificPTC_Indicator")
    public Boolean getSpecificPTCIndicator() {
        return specificPTCIndicator;
    }

    @JsonProperty("SpecificPTC_Indicator")
    public void setSpecificPTCIndicator(Boolean specificPTCIndicator) {
        this.specificPTCIndicator = specificPTCIndicator;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("seatsRequested", seatsRequested).append("airTravelerAvail", airTravelerAvail).append("priceRequestInformation", priceRequestInformation).append("tPAExtensions", tPAExtensions).append("specificPTCIndicator", specificPTCIndicator).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(seatsRequested).append(specificPTCIndicator).append(airTravelerAvail).append(tPAExtensions).append(priceRequestInformation).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TravelerInfoSummary) == false) {
            return false;
        }
        TravelerInfoSummary rhs = ((TravelerInfoSummary) other);
        return new EqualsBuilder().append(seatsRequested, rhs.seatsRequested).append(specificPTCIndicator, rhs.specificPTCIndicator).append(airTravelerAvail, rhs.airTravelerAvail).append(tPAExtensions, rhs.tPAExtensions).append(priceRequestInformation, rhs.priceRequestInformation).isEquals();
    }

}

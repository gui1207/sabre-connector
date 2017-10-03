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
    "Segment",
    "Allowance",
    "Charge",
    "ProvisionType",
    "AirlineCode"
})
public class BaggageInformation {

    @JsonProperty("Segment")
    private List<Segment_> segment = new ArrayList<Segment_>();
    @JsonProperty("Allowance")
    private List<Allowance> allowance = new ArrayList<Allowance>();
    @JsonProperty("Charge")
    private List<Charge> charge = new ArrayList<Charge>();
    @JsonProperty("ProvisionType")
    private String provisionType;
    @JsonProperty("AirlineCode")
    private String airlineCode;

    @JsonProperty("Segment")
    public List<Segment_> getSegment() {
        return segment;
    }

    @JsonProperty("Segment")
    public void setSegment(List<Segment_> segment) {
        this.segment = segment;
    }

    @JsonProperty("Allowance")
    public List<Allowance> getAllowance() {
        return allowance;
    }

    @JsonProperty("Allowance")
    public void setAllowance(List<Allowance> allowance) {
        this.allowance = allowance;
    }

    @JsonProperty("Charge")
    public List<Charge> getCharge() {
        return charge;
    }

    @JsonProperty("Charge")
    public void setCharge(List<Charge> charge) {
        this.charge = charge;
    }

    @JsonProperty("ProvisionType")
    public String getProvisionType() {
        return provisionType;
    }

    @JsonProperty("ProvisionType")
    public void setProvisionType(String provisionType) {
        this.provisionType = provisionType;
    }

    @JsonProperty("AirlineCode")
    public String getAirlineCode() {
        return airlineCode;
    }

    @JsonProperty("AirlineCode")
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("segment", segment).append("allowance", allowance).append("charge", charge).append("provisionType", provisionType).append("airlineCode", airlineCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(airlineCode).append(allowance).append(charge).append(provisionType).append(segment).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaggageInformation) == false) {
            return false;
        }
        BaggageInformation rhs = ((BaggageInformation) other);
        return new EqualsBuilder().append(airlineCode, rhs.airlineCode).append(allowance, rhs.allowance).append(charge, rhs.charge).append(provisionType, rhs.provisionType).append(segment, rhs.segment).isEquals();
    }

}

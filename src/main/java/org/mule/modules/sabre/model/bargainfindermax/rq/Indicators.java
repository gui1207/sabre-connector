/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RetainFare",
    "MinMaxStay",
    "RefundPenalty",
    "ResTicketing",
    "TravelPolicy"
})
public class Indicators {

    @JsonProperty("RetainFare")
    private RetainFare retainFare;
    @JsonProperty("MinMaxStay")
    private MinMaxStay_ minMaxStay;
    @JsonProperty("RefundPenalty")
    private RefundPenalty_ refundPenalty;
    @JsonProperty("ResTicketing")
    private ResTicketing_ resTicketing;
    @JsonProperty("TravelPolicy")
    private TravelPolicy travelPolicy;

    @JsonProperty("RetainFare")
    public RetainFare getRetainFare() {
        return retainFare;
    }

    @JsonProperty("RetainFare")
    public void setRetainFare(RetainFare retainFare) {
        this.retainFare = retainFare;
    }

    @JsonProperty("MinMaxStay")
    public MinMaxStay_ getMinMaxStay() {
        return minMaxStay;
    }

    @JsonProperty("MinMaxStay")
    public void setMinMaxStay(MinMaxStay_ minMaxStay) {
        this.minMaxStay = minMaxStay;
    }

    @JsonProperty("RefundPenalty")
    public RefundPenalty_ getRefundPenalty() {
        return refundPenalty;
    }

    @JsonProperty("RefundPenalty")
    public void setRefundPenalty(RefundPenalty_ refundPenalty) {
        this.refundPenalty = refundPenalty;
    }

    @JsonProperty("ResTicketing")
    public ResTicketing_ getResTicketing() {
        return resTicketing;
    }

    @JsonProperty("ResTicketing")
    public void setResTicketing(ResTicketing_ resTicketing) {
        this.resTicketing = resTicketing;
    }

    @JsonProperty("TravelPolicy")
    public TravelPolicy getTravelPolicy() {
        return travelPolicy;
    }

    @JsonProperty("TravelPolicy")
    public void setTravelPolicy(TravelPolicy travelPolicy) {
        this.travelPolicy = travelPolicy;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("retainFare", retainFare).append("minMaxStay", minMaxStay).append("refundPenalty", refundPenalty).append("resTicketing", resTicketing).append("travelPolicy", travelPolicy).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(minMaxStay).append(travelPolicy).append(refundPenalty).append(retainFare).append(resTicketing).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Indicators) == false) {
            return false;
        }
        Indicators rhs = ((Indicators) other);
        return new EqualsBuilder().append(minMaxStay, rhs.minMaxStay).append(travelPolicy, rhs.travelPolicy).append(refundPenalty, rhs.refundPenalty).append(retainFare, rhs.retainFare).append(resTicketing, rhs.resTicketing).isEquals();
    }

}

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
    "BaseFareAmount",
    "NonRefundableAmount",
    "BaseFareCurrency",
    "FareCalcCurrency",
    "ValidatingCarrier",
    "ROE"
})
public class Fare_ {

    @JsonProperty("BaseFareAmount")
    private Double baseFareAmount;
    @JsonProperty("NonRefundableAmount")
    private Double nonRefundableAmount;
    @JsonProperty("BaseFareCurrency")
    private String baseFareCurrency;
    @JsonProperty("FareCalcCurrency")
    private String fareCalcCurrency;
    @JsonProperty("ValidatingCarrier")
    private String validatingCarrier;
    @JsonProperty("ROE")
    private Double rOE;

    @JsonProperty("BaseFareAmount")
    public Double getBaseFareAmount() {
        return baseFareAmount;
    }

    @JsonProperty("BaseFareAmount")
    public void setBaseFareAmount(Double baseFareAmount) {
        this.baseFareAmount = baseFareAmount;
    }

    @JsonProperty("NonRefundableAmount")
    public Double getNonRefundableAmount() {
        return nonRefundableAmount;
    }

    @JsonProperty("NonRefundableAmount")
    public void setNonRefundableAmount(Double nonRefundableAmount) {
        this.nonRefundableAmount = nonRefundableAmount;
    }

    @JsonProperty("BaseFareCurrency")
    public String getBaseFareCurrency() {
        return baseFareCurrency;
    }

    @JsonProperty("BaseFareCurrency")
    public void setBaseFareCurrency(String baseFareCurrency) {
        this.baseFareCurrency = baseFareCurrency;
    }

    @JsonProperty("FareCalcCurrency")
    public String getFareCalcCurrency() {
        return fareCalcCurrency;
    }

    @JsonProperty("FareCalcCurrency")
    public void setFareCalcCurrency(String fareCalcCurrency) {
        this.fareCalcCurrency = fareCalcCurrency;
    }

    @JsonProperty("ValidatingCarrier")
    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    @JsonProperty("ValidatingCarrier")
    public void setValidatingCarrier(String validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    @JsonProperty("ROE")
    public Double getROE() {
        return rOE;
    }

    @JsonProperty("ROE")
    public void setROE(Double rOE) {
        this.rOE = rOE;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("baseFareAmount", baseFareAmount).append("nonRefundableAmount", nonRefundableAmount).append("baseFareCurrency", baseFareCurrency).append("fareCalcCurrency", fareCalcCurrency).append("validatingCarrier", validatingCarrier).append("rOE", rOE).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(baseFareCurrency).append(fareCalcCurrency).append(nonRefundableAmount).append(baseFareAmount).append(validatingCarrier).append(rOE).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fare_) == false) {
            return false;
        }
        Fare_ rhs = ((Fare_) other);
        return new EqualsBuilder().append(baseFareCurrency, rhs.baseFareCurrency).append(fareCalcCurrency, rhs.fareCalcCurrency).append(nonRefundableAmount, rhs.nonRefundableAmount).append(baseFareAmount, rhs.baseFareAmount).append(validatingCarrier, rhs.validatingCarrier).append(rOE, rhs.rOE).isEquals();
    }

}

/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Amount",
    "CurrencyCode",
    "DecimalPlaces",
    "EffectivePriceDeviation"
})
public class EquivFare_ {

    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("DecimalPlaces")
    private Integer decimalPlaces;
    @JsonProperty("EffectivePriceDeviation")
    private Double effectivePriceDeviation;

    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("DecimalPlaces")
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    @JsonProperty("DecimalPlaces")
    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @JsonProperty("EffectivePriceDeviation")
    public Double getEffectivePriceDeviation() {
        return effectivePriceDeviation;
    }

    @JsonProperty("EffectivePriceDeviation")
    public void setEffectivePriceDeviation(Double effectivePriceDeviation) {
        this.effectivePriceDeviation = effectivePriceDeviation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("currencyCode", currencyCode).append("decimalPlaces", decimalPlaces).append("effectivePriceDeviation", effectivePriceDeviation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(decimalPlaces).append(currencyCode).append(effectivePriceDeviation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EquivFare_) == false) {
            return false;
        }
        EquivFare_ rhs = ((EquivFare_) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(decimalPlaces, rhs.decimalPlaces).append(currencyCode, rhs.currencyCode).append(effectivePriceDeviation, rhs.effectivePriceDeviation).isEquals();
    }

}

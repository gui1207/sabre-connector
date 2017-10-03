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
    "PenaltyType",
    "DepartureStatus",
    "Percent",
    "Amount",
    "CurrencyCode",
    "DecimalPlaces"
})
public class Penalty {

    @JsonProperty("PenaltyType")
    private String penaltyType;
    @JsonProperty("DepartureStatus")
    private String departureStatus;
    @JsonProperty("Percent")
    private Double percent;
    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("DecimalPlaces")
    private Integer decimalPlaces;

    @JsonProperty("PenaltyType")
    public String getPenaltyType() {
        return penaltyType;
    }

    @JsonProperty("PenaltyType")
    public void setPenaltyType(String penaltyType) {
        this.penaltyType = penaltyType;
    }

    @JsonProperty("DepartureStatus")
    public String getDepartureStatus() {
        return departureStatus;
    }

    @JsonProperty("DepartureStatus")
    public void setDepartureStatus(String departureStatus) {
        this.departureStatus = departureStatus;
    }

    @JsonProperty("Percent")
    public Double getPercent() {
        return percent;
    }

    @JsonProperty("Percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

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

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("penaltyType", penaltyType).append("departureStatus", departureStatus).append("percent", percent).append("amount", amount).append("currencyCode", currencyCode).append("decimalPlaces", decimalPlaces).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(decimalPlaces).append(penaltyType).append(departureStatus).append(percent).append(currencyCode).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Penalty) == false) {
            return false;
        }
        Penalty rhs = ((Penalty) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(decimalPlaces, rhs.decimalPlaces).append(penaltyType, rhs.penaltyType).append(departureStatus, rhs.departureStatus).append(percent, rhs.percent).append(currencyCode, rhs.currencyCode).isEquals();
    }

}

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
    "Number",
    "PerDateMin",
    "PerDateMax",
    "PerMarket",
    "PerMonth"
})
public class NumTrips {

    @JsonProperty("Number")
    private Double number;
    @JsonProperty("PerDateMin")
    private Integer perDateMin;
    @JsonProperty("PerDateMax")
    private Integer perDateMax;
    @JsonProperty("PerMarket")
    private Integer perMarket;
    @JsonProperty("PerMonth")
    private Integer perMonth;

    @JsonProperty("Number")
    public Double getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(Double number) {
        this.number = number;
    }

    @JsonProperty("PerDateMin")
    public Integer getPerDateMin() {
        return perDateMin;
    }

    @JsonProperty("PerDateMin")
    public void setPerDateMin(Integer perDateMin) {
        this.perDateMin = perDateMin;
    }

    @JsonProperty("PerDateMax")
    public Integer getPerDateMax() {
        return perDateMax;
    }

    @JsonProperty("PerDateMax")
    public void setPerDateMax(Integer perDateMax) {
        this.perDateMax = perDateMax;
    }

    @JsonProperty("PerMarket")
    public Integer getPerMarket() {
        return perMarket;
    }

    @JsonProperty("PerMarket")
    public void setPerMarket(Integer perMarket) {
        this.perMarket = perMarket;
    }

    @JsonProperty("PerMonth")
    public Integer getPerMonth() {
        return perMonth;
    }

    @JsonProperty("PerMonth")
    public void setPerMonth(Integer perMonth) {
        this.perMonth = perMonth;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("number", number).append("perDateMin", perDateMin).append("perDateMax", perDateMax).append("perMarket", perMarket).append("perMonth", perMonth).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(number).append(perDateMin).append(perMonth).append(perMarket).append(perDateMax).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NumTrips) == false) {
            return false;
        }
        NumTrips rhs = ((NumTrips) other);
        return new EqualsBuilder().append(number, rhs.number).append(perDateMin, rhs.perDateMin).append(perMonth, rhs.perMonth).append(perMarket, rhs.perMarket).append(perDateMax, rhs.perDateMax).isEquals();
    }

}

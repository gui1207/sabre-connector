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
    "Type",
    "Exclude",
    "Application",
    "Amount",
    "CurrencyCode",
    "DecimalPlaces"
})
public class Penalty_ {

    @JsonProperty("Type")
    private String type;
    @JsonProperty("Exclude")
    private Boolean exclude;
    @JsonProperty("Application")
    private String application;
    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("DecimalPlaces")
    private Integer decimalPlaces;

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Exclude")
    public Boolean getExclude() {
        return exclude;
    }

    @JsonProperty("Exclude")
    public void setExclude(Boolean exclude) {
        this.exclude = exclude;
    }

    @JsonProperty("Application")
    public String getApplication() {
        return application;
    }

    @JsonProperty("Application")
    public void setApplication(String application) {
        this.application = application;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("exclude", exclude).append("application", application).append("amount", amount).append("currencyCode", currencyCode).append("decimalPlaces", decimalPlaces).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(decimalPlaces).append(application).append(exclude).append(type).append(currencyCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Penalty_) == false) {
            return false;
        }
        Penalty_ rhs = ((Penalty_) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(decimalPlaces, rhs.decimalPlaces).append(application, rhs.application).append(exclude, rhs.exclude).append(type, rhs.type).append(currencyCode, rhs.currencyCode).isEquals();
    }

}

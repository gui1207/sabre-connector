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
    "Type",
    "Amount",
    "Currency"
})
public class Surcharge {

    @JsonProperty("Type")
    private String type;
    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("amount", amount).append("currency", currency).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(currency).append(type).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Surcharge) == false) {
            return false;
        }
        Surcharge rhs = ((Surcharge) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(currency, rhs.currency).append(type, rhs.type).isEquals();
    }

}

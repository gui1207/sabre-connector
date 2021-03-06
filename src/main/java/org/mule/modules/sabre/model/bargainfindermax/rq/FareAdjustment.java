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
    "Value",
    "Currency"
})
public class FareAdjustment {

    @JsonProperty("Value")
    private String value;
    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
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
        return new ToStringBuilder(this).append("value", value).append("currency", currency).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(currency).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareAdjustment) == false) {
            return false;
        }
        FareAdjustment rhs = ((FareAdjustment) other);
        return new EqualsBuilder().append(value, rhs.value).append(currency, rhs.currency).isEquals();
    }

}

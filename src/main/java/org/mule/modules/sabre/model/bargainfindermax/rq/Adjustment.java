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
    "Currency",
    "Group"
})
public class Adjustment {

    @JsonProperty("Value")
    private String value;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("Group")
    private Double group;

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

    @JsonProperty("Group")
    public Double getGroup() {
        return group;
    }

    @JsonProperty("Group")
    public void setGroup(Double group) {
        this.group = group;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("currency", currency).append("group", group).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(currency).append(value).append(group).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Adjustment) == false) {
            return false;
        }
        Adjustment rhs = ((Adjustment) other);
        return new EqualsBuilder().append(currency, rhs.currency).append(value, rhs.value).append(group, rhs.group).isEquals();
    }

}

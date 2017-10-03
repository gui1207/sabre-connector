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
    "Amount"
})
public class Mileage {

    @JsonProperty("Amount")
    private Integer amount;

    @JsonProperty("Amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mileage) == false) {
            return false;
        }
        Mileage rhs = ((Mileage) other);
        return new EqualsBuilder().append(amount, rhs.amount).isEquals();
    }

}

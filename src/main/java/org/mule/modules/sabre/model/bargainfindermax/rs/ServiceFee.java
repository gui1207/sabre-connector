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
    "TaxAmount"
})
public class ServiceFee {

    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("TaxAmount")
    private Double taxAmount;

    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("TaxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("TaxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("taxAmount", taxAmount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(taxAmount).append(amount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceFee) == false) {
            return false;
        }
        ServiceFee rhs = ((ServiceFee) other);
        return new EqualsBuilder().append(taxAmount, rhs.taxAmount).append(amount, rhs.amount).isEquals();
    }

}

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
    "TaxCode",
    "Amount"
})
public class Tax {

    @JsonProperty("TaxCode")
    private String taxCode;
    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("TaxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("TaxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("taxCode", taxCode).append("amount", amount).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(taxCode).append(amount).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tax) == false) {
            return false;
        }
        Tax rhs = ((Tax) other);
        return new EqualsBuilder().append(taxCode, rhs.taxCode).append(amount, rhs.amount).isEquals();
    }

}

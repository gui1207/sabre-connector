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
    "Tax"
})
public class Taxes_ {

    @JsonProperty("Tax")
    private Tax tax;

    @JsonProperty("Tax")
    public Tax getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tax", tax).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tax).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Taxes_) == false) {
            return false;
        }
        Taxes_ rhs = ((Taxes_) other);
        return new EqualsBuilder().append(tax, rhs.tax).isEquals();
    }

}

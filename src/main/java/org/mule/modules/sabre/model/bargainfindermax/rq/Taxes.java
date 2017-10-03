/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Tax",
    "IsRefundable"
})
public class Taxes {

    @JsonProperty("Tax")
    private List<Tax> tax = new ArrayList<Tax>();
    @JsonProperty("IsRefundable")
    private List<IsRefundable> isRefundable = new ArrayList<IsRefundable>();

    @JsonProperty("Tax")
    public List<Tax> getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(List<Tax> tax) {
        this.tax = tax;
    }

    @JsonProperty("IsRefundable")
    public List<IsRefundable> getIsRefundable() {
        return isRefundable;
    }

    @JsonProperty("IsRefundable")
    public void setIsRefundable(List<IsRefundable> isRefundable) {
        this.isRefundable = isRefundable;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("tax", tax).append("isRefundable", isRefundable).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(tax).append(isRefundable).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Taxes) == false) {
            return false;
        }
        Taxes rhs = ((Taxes) other);
        return new EqualsBuilder().append(tax, rhs.tax).append(isRefundable, rhs.isRefundable).isEquals();
    }

}

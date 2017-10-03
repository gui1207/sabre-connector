/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

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
    "PassengerIndex"
})
public class Tax_ {

    @JsonProperty("Tax")
    private List<Tax__> tax = new ArrayList<Tax__>();
    @JsonProperty("PassengerIndex")
    private Integer passengerIndex;

    @JsonProperty("Tax")
    public List<Tax__> getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(List<Tax__> tax) {
        this.tax = tax;
    }

    @JsonProperty("PassengerIndex")
    public Integer getPassengerIndex() {
        return passengerIndex;
    }

    @JsonProperty("PassengerIndex")
    public void setPassengerIndex(Integer passengerIndex) {
        this.passengerIndex = passengerIndex;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tax", tax).append("passengerIndex", passengerIndex).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tax).append(passengerIndex).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tax_) == false) {
            return false;
        }
        Tax_ rhs = ((Tax_) other);
        return new EqualsBuilder().append(tax, rhs.tax).append(passengerIndex, rhs.passengerIndex).isEquals();
    }

}

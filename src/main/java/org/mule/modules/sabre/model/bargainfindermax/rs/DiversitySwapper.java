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
    "WeighedPriceAmount"
})
public class DiversitySwapper {

    @JsonProperty("WeighedPriceAmount")
    private Double weighedPriceAmount;

    @JsonProperty("WeighedPriceAmount")
    public Double getWeighedPriceAmount() {
        return weighedPriceAmount;
    }

    @JsonProperty("WeighedPriceAmount")
    public void setWeighedPriceAmount(Double weighedPriceAmount) {
        this.weighedPriceAmount = weighedPriceAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("weighedPriceAmount", weighedPriceAmount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(weighedPriceAmount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiversitySwapper) == false) {
            return false;
        }
        DiversitySwapper rhs = ((DiversitySwapper) other);
        return new EqualsBuilder().append(weighedPriceAmount, rhs.weighedPriceAmount).isEquals();
    }

}

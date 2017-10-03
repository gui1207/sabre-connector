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
    "PriceWeight",
    "TravelTimeWeight"
})
public class Weightings {

    @JsonProperty("PriceWeight")
    private Integer priceWeight;
    @JsonProperty("TravelTimeWeight")
    private Integer travelTimeWeight;

    @JsonProperty("PriceWeight")
    public Integer getPriceWeight() {
        return priceWeight;
    }

    @JsonProperty("PriceWeight")
    public void setPriceWeight(Integer priceWeight) {
        this.priceWeight = priceWeight;
    }

    @JsonProperty("TravelTimeWeight")
    public Integer getTravelTimeWeight() {
        return travelTimeWeight;
    }

    @JsonProperty("TravelTimeWeight")
    public void setTravelTimeWeight(Integer travelTimeWeight) {
        this.travelTimeWeight = travelTimeWeight;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("priceWeight", priceWeight).append("travelTimeWeight", travelTimeWeight).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(priceWeight).append(travelTimeWeight).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Weightings) == false) {
            return false;
        }
        Weightings rhs = ((Weightings) other);
        return new EqualsBuilder().append(priceWeight, rhs.priceWeight).append(travelTimeWeight, rhs.travelTimeWeight).isEquals();
    }

}

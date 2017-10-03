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
    "PricedItineraries",
    "OneWayItineraries"
})
public class DepartedItineraries {

    @JsonProperty("PricedItineraries")
    private PricedItineraries_ pricedItineraries;
    @JsonProperty("OneWayItineraries")
    private OneWayItineraries_ oneWayItineraries;

    @JsonProperty("PricedItineraries")
    public PricedItineraries_ getPricedItineraries() {
        return pricedItineraries;
    }

    @JsonProperty("PricedItineraries")
    public void setPricedItineraries(PricedItineraries_ pricedItineraries) {
        this.pricedItineraries = pricedItineraries;
    }

    @JsonProperty("OneWayItineraries")
    public OneWayItineraries_ getOneWayItineraries() {
        return oneWayItineraries;
    }

    @JsonProperty("OneWayItineraries")
    public void setOneWayItineraries(OneWayItineraries_ oneWayItineraries) {
        this.oneWayItineraries = oneWayItineraries;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pricedItineraries", pricedItineraries).append("oneWayItineraries", oneWayItineraries).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pricedItineraries).append(oneWayItineraries).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepartedItineraries) == false) {
            return false;
        }
        DepartedItineraries rhs = ((DepartedItineraries) other);
        return new EqualsBuilder().append(pricedItineraries, rhs.pricedItineraries).append(oneWayItineraries, rhs.oneWayItineraries).isEquals();
    }

}

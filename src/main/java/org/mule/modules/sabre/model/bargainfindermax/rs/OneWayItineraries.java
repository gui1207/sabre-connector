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
    "BrandedOneWayItineraries",
    "SimpleOneWayItineraries"
})
public class OneWayItineraries {

    @JsonProperty("BrandedOneWayItineraries")
    private List<BrandedOneWayItinerary> brandedOneWayItineraries = new ArrayList<BrandedOneWayItinerary>();
    @JsonProperty("SimpleOneWayItineraries")
    private List<SimpleOneWayItinerary> simpleOneWayItineraries = new ArrayList<SimpleOneWayItinerary>();

    @JsonProperty("BrandedOneWayItineraries")
    public List<BrandedOneWayItinerary> getBrandedOneWayItineraries() {
        return brandedOneWayItineraries;
    }

    @JsonProperty("BrandedOneWayItineraries")
    public void setBrandedOneWayItineraries(List<BrandedOneWayItinerary> brandedOneWayItineraries) {
        this.brandedOneWayItineraries = brandedOneWayItineraries;
    }

    @JsonProperty("SimpleOneWayItineraries")
    public List<SimpleOneWayItinerary> getSimpleOneWayItineraries() {
        return simpleOneWayItineraries;
    }

    @JsonProperty("SimpleOneWayItineraries")
    public void setSimpleOneWayItineraries(List<SimpleOneWayItinerary> simpleOneWayItineraries) {
        this.simpleOneWayItineraries = simpleOneWayItineraries;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("brandedOneWayItineraries", brandedOneWayItineraries).append("simpleOneWayItineraries", simpleOneWayItineraries).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(simpleOneWayItineraries).append(brandedOneWayItineraries).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OneWayItineraries) == false) {
            return false;
        }
        OneWayItineraries rhs = ((OneWayItineraries) other);
        return new EqualsBuilder().append(simpleOneWayItineraries, rhs.simpleOneWayItineraries).append(brandedOneWayItineraries, rhs.brandedOneWayItineraries).isEquals();
    }

}

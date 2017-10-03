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
    "SpecifiedLocation",
    "AlternateLocation"
})
public class AlternateAirportCity {

    @JsonProperty("SpecifiedLocation")
    private SpecifiedLocation specifiedLocation;
    @JsonProperty("AlternateLocation")
    private List<AlternateLocation> alternateLocation = new ArrayList<AlternateLocation>();

    @JsonProperty("SpecifiedLocation")
    public SpecifiedLocation getSpecifiedLocation() {
        return specifiedLocation;
    }

    @JsonProperty("SpecifiedLocation")
    public void setSpecifiedLocation(SpecifiedLocation specifiedLocation) {
        this.specifiedLocation = specifiedLocation;
    }

    @JsonProperty("AlternateLocation")
    public List<AlternateLocation> getAlternateLocation() {
        return alternateLocation;
    }

    @JsonProperty("AlternateLocation")
    public void setAlternateLocation(List<AlternateLocation> alternateLocation) {
        this.alternateLocation = alternateLocation;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("specifiedLocation", specifiedLocation).append("alternateLocation", alternateLocation).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(alternateLocation).append(specifiedLocation).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlternateAirportCity) == false) {
            return false;
        }
        AlternateAirportCity rhs = ((AlternateAirportCity) other);
        return new EqualsBuilder().append(alternateLocation, rhs.alternateLocation).append(specifiedLocation, rhs.specifiedLocation).isEquals();
    }

}

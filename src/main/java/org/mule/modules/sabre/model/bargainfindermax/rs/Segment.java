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
    "LegIndex",
    "FlightIndex"
})
public class Segment {

    @JsonProperty("LegIndex")
    private Integer legIndex;
    @JsonProperty("FlightIndex")
    private Integer flightIndex;

    @JsonProperty("LegIndex")
    public Integer getLegIndex() {
        return legIndex;
    }

    @JsonProperty("LegIndex")
    public void setLegIndex(Integer legIndex) {
        this.legIndex = legIndex;
    }

    @JsonProperty("FlightIndex")
    public Integer getFlightIndex() {
        return flightIndex;
    }

    @JsonProperty("FlightIndex")
    public void setFlightIndex(Integer flightIndex) {
        this.flightIndex = flightIndex;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("legIndex", legIndex).append("flightIndex", flightIndex).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flightIndex).append(legIndex).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Segment) == false) {
            return false;
        }
        Segment rhs = ((Segment) other);
        return new EqualsBuilder().append(flightIndex, rhs.flightIndex).append(legIndex, rhs.legIndex).isEquals();
    }

}

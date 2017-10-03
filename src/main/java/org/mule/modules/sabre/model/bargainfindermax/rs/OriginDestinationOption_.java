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
    "FlightSegment"
})
public class OriginDestinationOption_ {

    @JsonProperty("FlightSegment")
    private List<FlightSegment__> flightSegment = new ArrayList<FlightSegment__>();

    @JsonProperty("FlightSegment")
    public List<FlightSegment__> getFlightSegment() {
        return flightSegment;
    }

    @JsonProperty("FlightSegment")
    public void setFlightSegment(List<FlightSegment__> flightSegment) {
        this.flightSegment = flightSegment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("flightSegment", flightSegment).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flightSegment).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginDestinationOption_) == false) {
            return false;
        }
        OriginDestinationOption_ rhs = ((OriginDestinationOption_) other);
        return new EqualsBuilder().append(flightSegment, rhs.flightSegment).isEquals();
    }

}

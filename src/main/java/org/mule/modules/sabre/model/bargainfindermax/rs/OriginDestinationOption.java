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
    "FlightSegment",
    "ElapsedTime"
})
public class OriginDestinationOption {

    @JsonProperty("FlightSegment")
    private List<FlightSegment> flightSegment = new ArrayList<FlightSegment>();
    @JsonProperty("ElapsedTime")
    private Integer elapsedTime;

    @JsonProperty("FlightSegment")
    public List<FlightSegment> getFlightSegment() {
        return flightSegment;
    }

    @JsonProperty("FlightSegment")
    public void setFlightSegment(List<FlightSegment> flightSegment) {
        this.flightSegment = flightSegment;
    }

    @JsonProperty("ElapsedTime")
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("ElapsedTime")
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("flightSegment", flightSegment).append("elapsedTime", elapsedTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flightSegment).append(elapsedTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginDestinationOption) == false) {
            return false;
        }
        OriginDestinationOption rhs = ((OriginDestinationOption) other);
        return new EqualsBuilder().append(flightSegment, rhs.flightSegment).append(elapsedTime, rhs.elapsedTime).isEquals();
    }

}

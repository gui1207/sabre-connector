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
    "FlightSegmentRPH"
})
public class FlightSegmentRPHs {

    @JsonProperty("FlightSegmentRPH")
    private List<String> flightSegmentRPH = new ArrayList<String>();

    @JsonProperty("FlightSegmentRPH")
    public List<String> getFlightSegmentRPH() {
        return flightSegmentRPH;
    }

    @JsonProperty("FlightSegmentRPH")
    public void setFlightSegmentRPH(List<String> flightSegmentRPH) {
        this.flightSegmentRPH = flightSegmentRPH;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("flightSegmentRPH", flightSegmentRPH).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(flightSegmentRPH).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightSegmentRPHs) == false) {
            return false;
        }
        FlightSegmentRPHs rhs = ((FlightSegmentRPHs) other);
        return new EqualsBuilder().append(flightSegmentRPH, rhs.flightSegmentRPH).isEquals();
    }

}

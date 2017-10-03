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
    "DepartureAirport",
    "ArrivalAirport",
    "DepartureDateTime"
})
public class FlightSegment__ {

    @JsonProperty("DepartureAirport")
    private DepartureAirport_ departureAirport;
    @JsonProperty("ArrivalAirport")
    private DepartureAirport_ arrivalAirport;
    @JsonProperty("DepartureDateTime")
    private String departureDateTime;

    @JsonProperty("DepartureAirport")
    public DepartureAirport_ getDepartureAirport() {
        return departureAirport;
    }

    @JsonProperty("DepartureAirport")
    public void setDepartureAirport(DepartureAirport_ departureAirport) {
        this.departureAirport = departureAirport;
    }

    @JsonProperty("ArrivalAirport")
    public DepartureAirport_ getArrivalAirport() {
        return arrivalAirport;
    }

    @JsonProperty("ArrivalAirport")
    public void setArrivalAirport(DepartureAirport_ arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @JsonProperty("DepartureDateTime")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    @JsonProperty("DepartureDateTime")
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("departureAirport", departureAirport).append("arrivalAirport", arrivalAirport).append("departureDateTime", departureDateTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(departureDateTime).append(departureAirport).append(arrivalAirport).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightSegment__) == false) {
            return false;
        }
        FlightSegment__ rhs = ((FlightSegment__) other);
        return new EqualsBuilder().append(departureDateTime, rhs.departureDateTime).append(departureAirport, rhs.departureAirport).append(arrivalAirport, rhs.arrivalAirport).isEquals();
    }

}

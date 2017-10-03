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
    "AirportCode",
    "AirportsGroup"
})
public class Origin {

    @JsonProperty("AirportCode")
    private String airportCode;
    @JsonProperty("AirportsGroup")
    private String airportsGroup;

    @JsonProperty("AirportCode")
    public String getAirportCode() {
        return airportCode;
    }

    @JsonProperty("AirportCode")
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    @JsonProperty("AirportsGroup")
    public String getAirportsGroup() {
        return airportsGroup;
    }

    @JsonProperty("AirportsGroup")
    public void setAirportsGroup(String airportsGroup) {
        this.airportsGroup = airportsGroup;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("airportCode", airportCode).append("airportsGroup", airportsGroup).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(airportsGroup).append(airportCode).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Origin) == false) {
            return false;
        }
        Origin rhs = ((Origin) other);
        return new EqualsBuilder().append(airportsGroup, rhs.airportsGroup).append(airportCode, rhs.airportCode).isEquals();
    }

}

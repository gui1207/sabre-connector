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
    "FlightType",
    "MaxConnections",
    "PreferLevel"
})
public class FlightTypePref {

    @JsonProperty("FlightType")
    private String flightType;
    @JsonProperty("MaxConnections")
    private String maxConnections;
    @JsonProperty("PreferLevel")
    private String preferLevel;

    @JsonProperty("FlightType")
    public String getFlightType() {
        return flightType;
    }

    @JsonProperty("FlightType")
    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    @JsonProperty("MaxConnections")
    public String getMaxConnections() {
        return maxConnections;
    }

    @JsonProperty("MaxConnections")
    public void setMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
    }

    @JsonProperty("PreferLevel")
    public String getPreferLevel() {
        return preferLevel;
    }

    @JsonProperty("PreferLevel")
    public void setPreferLevel(String preferLevel) {
        this.preferLevel = preferLevel;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("flightType", flightType).append("maxConnections", maxConnections).append("preferLevel", preferLevel).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(preferLevel).append(flightType).append(maxConnections).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightTypePref) == false) {
            return false;
        }
        FlightTypePref rhs = ((FlightTypePref) other);
        return new EqualsBuilder().append(preferLevel, rhs.preferLevel).append(flightType, rhs.flightType).append(maxConnections, rhs.maxConnections).isEquals();
    }

}

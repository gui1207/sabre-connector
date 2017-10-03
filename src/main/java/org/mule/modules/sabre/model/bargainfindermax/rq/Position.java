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
    "Latitude",
    "Longitude",
    "Altitude"
})
public class Position {

    @JsonProperty("Latitude")
    private String latitude;
    @JsonProperty("Longitude")
    private String longitude;
    @JsonProperty("Altitude")
    private String altitude;

    @JsonProperty("Latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("Latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("Longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("Longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("Altitude")
    public String getAltitude() {
        return altitude;
    }

    @JsonProperty("Altitude")
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("latitude", latitude).append("longitude", longitude).append("altitude", altitude).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(altitude).append(latitude).append(longitude).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Position) == false) {
            return false;
        }
        Position rhs = ((Position) other);
        return new EqualsBuilder().append(altitude, rhs.altitude).append(latitude, rhs.latitude).append(longitude, rhs.longitude).isEquals();
    }

}

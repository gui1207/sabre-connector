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
    "OriginLocation",
    "DestinationLocation",
    "SideTrip"
})
public class Arunk {

    @JsonProperty("OriginLocation")
    private OriginLocation_ originLocation;
    @JsonProperty("DestinationLocation")
    private OriginLocation_ destinationLocation;
    @JsonProperty("SideTrip")
    private SideTrip sideTrip;

    @JsonProperty("OriginLocation")
    public OriginLocation_ getOriginLocation() {
        return originLocation;
    }

    @JsonProperty("OriginLocation")
    public void setOriginLocation(OriginLocation_ originLocation) {
        this.originLocation = originLocation;
    }

    @JsonProperty("DestinationLocation")
    public OriginLocation_ getDestinationLocation() {
        return destinationLocation;
    }

    @JsonProperty("DestinationLocation")
    public void setDestinationLocation(OriginLocation_ destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    @JsonProperty("SideTrip")
    public SideTrip getSideTrip() {
        return sideTrip;
    }

    @JsonProperty("SideTrip")
    public void setSideTrip(SideTrip sideTrip) {
        this.sideTrip = sideTrip;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("originLocation", originLocation).append("destinationLocation", destinationLocation).append("sideTrip", sideTrip).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationLocation).append(sideTrip).append(originLocation).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Arunk) == false) {
            return false;
        }
        Arunk rhs = ((Arunk) other);
        return new EqualsBuilder().append(destinationLocation, rhs.destinationLocation).append(sideTrip, rhs.sideTrip).append(originLocation, rhs.originLocation).isEquals();
    }

}

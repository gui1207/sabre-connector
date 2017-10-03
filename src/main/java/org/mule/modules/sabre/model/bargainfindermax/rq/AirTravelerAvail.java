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
    "PassengerTypeQuantity",
    "AirTraveler"
})
public class AirTravelerAvail {

    @JsonProperty("PassengerTypeQuantity")
    private List<PassengerTypeQuantity> passengerTypeQuantity = new ArrayList<PassengerTypeQuantity>();
    @JsonProperty("AirTraveler")
    private AirTraveler airTraveler;

    @JsonProperty("PassengerTypeQuantity")
    public List<PassengerTypeQuantity> getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    @JsonProperty("PassengerTypeQuantity")
    public void setPassengerTypeQuantity(List<PassengerTypeQuantity> passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    @JsonProperty("AirTraveler")
    public AirTraveler getAirTraveler() {
        return airTraveler;
    }

    @JsonProperty("AirTraveler")
    public void setAirTraveler(AirTraveler airTraveler) {
        this.airTraveler = airTraveler;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("passengerTypeQuantity", passengerTypeQuantity).append("airTraveler", airTraveler).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(passengerTypeQuantity).append(airTraveler).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirTravelerAvail) == false) {
            return false;
        }
        AirTravelerAvail rhs = ((AirTravelerAvail) other);
        return new EqualsBuilder().append(passengerTypeQuantity, rhs.passengerTypeQuantity).append(airTraveler, rhs.airTraveler).isEquals();
    }

}

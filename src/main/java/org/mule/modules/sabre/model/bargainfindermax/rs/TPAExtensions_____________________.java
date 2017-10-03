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
    "AirlineOrderList",
    "OriginalItinerary"
})
public class TPAExtensions_____________________ {

    @JsonProperty("AirlineOrderList")
    private AirlineOrderList airlineOrderList;
    @JsonProperty("OriginalItinerary")
    private OriginalItinerary originalItinerary;

    @JsonProperty("AirlineOrderList")
    public AirlineOrderList getAirlineOrderList() {
        return airlineOrderList;
    }

    @JsonProperty("AirlineOrderList")
    public void setAirlineOrderList(AirlineOrderList airlineOrderList) {
        this.airlineOrderList = airlineOrderList;
    }

    @JsonProperty("OriginalItinerary")
    public OriginalItinerary getOriginalItinerary() {
        return originalItinerary;
    }

    @JsonProperty("OriginalItinerary")
    public void setOriginalItinerary(OriginalItinerary originalItinerary) {
        this.originalItinerary = originalItinerary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("airlineOrderList", airlineOrderList).append("originalItinerary", originalItinerary).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(airlineOrderList).append(originalItinerary).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions_____________________) == false) {
            return false;
        }
        TPAExtensions_____________________ rhs = ((TPAExtensions_____________________) other);
        return new EqualsBuilder().append(airlineOrderList, rhs.airlineOrderList).append(originalItinerary, rhs.originalItinerary).isEquals();
    }

}

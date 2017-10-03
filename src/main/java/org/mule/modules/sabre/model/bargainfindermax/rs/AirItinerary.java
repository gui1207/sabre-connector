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
    "OriginDestinationOptions",
    "DirectionInd",
    "DepartureDate"
})
public class AirItinerary {

    @JsonProperty("OriginDestinationOptions")
    private OriginDestinationOptions originDestinationOptions;
    @JsonProperty("DirectionInd")
    private String directionInd;
    @JsonProperty("DepartureDate")
    private String departureDate;

    @JsonProperty("OriginDestinationOptions")
    public OriginDestinationOptions getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    @JsonProperty("OriginDestinationOptions")
    public void setOriginDestinationOptions(OriginDestinationOptions originDestinationOptions) {
        this.originDestinationOptions = originDestinationOptions;
    }

    @JsonProperty("DirectionInd")
    public String getDirectionInd() {
        return directionInd;
    }

    @JsonProperty("DirectionInd")
    public void setDirectionInd(String directionInd) {
        this.directionInd = directionInd;
    }

    @JsonProperty("DepartureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("DepartureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("originDestinationOptions", originDestinationOptions).append("directionInd", directionInd).append("departureDate", departureDate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(originDestinationOptions).append(directionInd).append(departureDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirItinerary) == false) {
            return false;
        }
        AirItinerary rhs = ((AirItinerary) other);
        return new EqualsBuilder().append(originDestinationOptions, rhs.originDestinationOptions).append(directionInd, rhs.directionInd).append(departureDate, rhs.departureDate).isEquals();
    }

}

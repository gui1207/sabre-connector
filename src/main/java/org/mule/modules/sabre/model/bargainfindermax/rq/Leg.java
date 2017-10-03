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
    "DepartureDateTime",
    "ArrivalDateTime",
    "Origins",
    "Destinations",
    "ConnectionLocations",
    "Carriers",
    "Cabin",
    "RPH",
    "MaxOptions"
})
public class Leg {

    @JsonProperty("DepartureDateTime")
    private DepartureDateTime departureDateTime;
    @JsonProperty("ArrivalDateTime")
    private ArrivalDateTime arrivalDateTime;
    @JsonProperty("Origins")
    private Origins origins;
    @JsonProperty("Destinations")
    private Destinations destinations;
    @JsonProperty("ConnectionLocations")
    private ConnectionLocations connectionLocations;
    @JsonProperty("Carriers")
    private Carriers carriers;
    @JsonProperty("Cabin")
    private Cabin cabin;
    @JsonProperty("RPH")
    private String rPH;
    @JsonProperty("MaxOptions")
    private Integer maxOptions;

    @JsonProperty("DepartureDateTime")
    public DepartureDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    @JsonProperty("DepartureDateTime")
    public void setDepartureDateTime(DepartureDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @JsonProperty("ArrivalDateTime")
    public ArrivalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    @JsonProperty("ArrivalDateTime")
    public void setArrivalDateTime(ArrivalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    @JsonProperty("Origins")
    public Origins getOrigins() {
        return origins;
    }

    @JsonProperty("Origins")
    public void setOrigins(Origins origins) {
        this.origins = origins;
    }

    @JsonProperty("Destinations")
    public Destinations getDestinations() {
        return destinations;
    }

    @JsonProperty("Destinations")
    public void setDestinations(Destinations destinations) {
        this.destinations = destinations;
    }

    @JsonProperty("ConnectionLocations")
    public ConnectionLocations getConnectionLocations() {
        return connectionLocations;
    }

    @JsonProperty("ConnectionLocations")
    public void setConnectionLocations(ConnectionLocations connectionLocations) {
        this.connectionLocations = connectionLocations;
    }

    @JsonProperty("Carriers")
    public Carriers getCarriers() {
        return carriers;
    }

    @JsonProperty("Carriers")
    public void setCarriers(Carriers carriers) {
        this.carriers = carriers;
    }

    @JsonProperty("Cabin")
    public Cabin getCabin() {
        return cabin;
    }

    @JsonProperty("Cabin")
    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("RPH")
    public String getRPH() {
        return rPH;
    }

    @JsonProperty("RPH")
    public void setRPH(String rPH) {
        this.rPH = rPH;
    }

    @JsonProperty("MaxOptions")
    public Integer getMaxOptions() {
        return maxOptions;
    }

    @JsonProperty("MaxOptions")
    public void setMaxOptions(Integer maxOptions) {
        this.maxOptions = maxOptions;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("departureDateTime", departureDateTime).append("arrivalDateTime", arrivalDateTime).append("origins", origins).append("destinations", destinations).append("connectionLocations", connectionLocations).append("carriers", carriers).append("cabin", cabin).append("rPH", rPH).append("maxOptions", maxOptions).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxOptions).append(destinations).append(departureDateTime).append(origins).append(cabin).append(carriers).append(arrivalDateTime).append(rPH).append(connectionLocations).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Leg) == false) {
            return false;
        }
        Leg rhs = ((Leg) other);
        return new EqualsBuilder().append(maxOptions, rhs.maxOptions).append(destinations, rhs.destinations).append(departureDateTime, rhs.departureDateTime).append(origins, rhs.origins).append(cabin, rhs.cabin).append(carriers, rhs.carriers).append(arrivalDateTime, rhs.arrivalDateTime).append(rPH, rhs.rPH).append(connectionLocations, rhs.connectionLocations).isEquals();
    }

}

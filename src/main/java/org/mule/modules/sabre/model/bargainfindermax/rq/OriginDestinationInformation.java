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
    "DepartureDates",
    "ArrivalDates",
    "DepartureWindow",
    "ArrivalWindow",
    "OriginLocation",
    "DestinationLocation",
    "ConnectionLocations",
    "TPA_Extensions",
    "RPH",
    "Fixed",
    "FullDiversity"
})
public class OriginDestinationInformation {

    @JsonProperty("DepartureDateTime")
    private String departureDateTime;
    @JsonProperty("ArrivalDateTime")
    private String arrivalDateTime;
    @JsonProperty("DepartureDates")
    private DepartureDates departureDates;
    @JsonProperty("ArrivalDates")
    private ArrivalDates arrivalDates;
    @JsonProperty("DepartureWindow")
    private String departureWindow;
    @JsonProperty("ArrivalWindow")
    private String arrivalWindow;
    @JsonProperty("OriginLocation")
    private OriginLocation originLocation;
    @JsonProperty("DestinationLocation")
    private DestinationLocation destinationLocation;
    @JsonProperty("ConnectionLocations")
    private ConnectionLocations connectionLocations;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions tPAExtensions;
    @JsonProperty("RPH")
    private String rPH;
    @JsonProperty("Fixed")
    private Boolean fixed;
    @JsonProperty("FullDiversity")
    private Boolean fullDiversity;

    @JsonProperty("DepartureDateTime")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    @JsonProperty("DepartureDateTime")
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @JsonProperty("ArrivalDateTime")
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    @JsonProperty("ArrivalDateTime")
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    @JsonProperty("DepartureDates")
    public DepartureDates getDepartureDates() {
        return departureDates;
    }

    @JsonProperty("DepartureDates")
    public void setDepartureDates(DepartureDates departureDates) {
        this.departureDates = departureDates;
    }

    @JsonProperty("ArrivalDates")
    public ArrivalDates getArrivalDates() {
        return arrivalDates;
    }

    @JsonProperty("ArrivalDates")
    public void setArrivalDates(ArrivalDates arrivalDates) {
        this.arrivalDates = arrivalDates;
    }

    @JsonProperty("DepartureWindow")
    public String getDepartureWindow() {
        return departureWindow;
    }

    @JsonProperty("DepartureWindow")
    public void setDepartureWindow(String departureWindow) {
        this.departureWindow = departureWindow;
    }

    @JsonProperty("ArrivalWindow")
    public String getArrivalWindow() {
        return arrivalWindow;
    }

    @JsonProperty("ArrivalWindow")
    public void setArrivalWindow(String arrivalWindow) {
        this.arrivalWindow = arrivalWindow;
    }

    @JsonProperty("OriginLocation")
    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    @JsonProperty("OriginLocation")
    public void setOriginLocation(OriginLocation originLocation) {
        this.originLocation = originLocation;
    }

    @JsonProperty("DestinationLocation")
    public DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    @JsonProperty("DestinationLocation")
    public void setDestinationLocation(DestinationLocation destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    @JsonProperty("ConnectionLocations")
    public ConnectionLocations getConnectionLocations() {
        return connectionLocations;
    }

    @JsonProperty("ConnectionLocations")
    public void setConnectionLocations(ConnectionLocations connectionLocations) {
        this.connectionLocations = connectionLocations;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("RPH")
    public String getRPH() {
        return rPH;
    }

    @JsonProperty("RPH")
    public void setRPH(String rPH) {
        this.rPH = rPH;
    }

    @JsonProperty("Fixed")
    public Boolean getFixed() {
        return fixed;
    }

    @JsonProperty("Fixed")
    public void setFixed(Boolean fixed) {
        this.fixed = fixed;
    }

    @JsonProperty("FullDiversity")
    public Boolean getFullDiversity() {
        return fullDiversity;
    }

    @JsonProperty("FullDiversity")
    public void setFullDiversity(Boolean fullDiversity) {
        this.fullDiversity = fullDiversity;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("departureDateTime", departureDateTime).append("arrivalDateTime", arrivalDateTime).append("departureDates", departureDates).append("arrivalDates", arrivalDates).append("departureWindow", departureWindow).append("arrivalWindow", arrivalWindow).append("originLocation", originLocation).append("destinationLocation", destinationLocation).append("connectionLocations", connectionLocations).append("tPAExtensions", tPAExtensions).append("rPH", rPH).append("fixed", fixed).append("fullDiversity", fullDiversity).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(arrivalDates).append(destinationLocation).append(rPH).append(departureWindow).append(arrivalWindow).append(originLocation).append(connectionLocations).append(fullDiversity).append(departureDates).append(tPAExtensions).append(departureDateTime).append(fixed).append(arrivalDateTime).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginDestinationInformation) == false) {
            return false;
        }
        OriginDestinationInformation rhs = ((OriginDestinationInformation) other);
        return new EqualsBuilder().append(arrivalDates, rhs.arrivalDates).append(destinationLocation, rhs.destinationLocation).append(rPH, rhs.rPH).append(departureWindow, rhs.departureWindow).append(arrivalWindow, rhs.arrivalWindow).append(originLocation, rhs.originLocation).append(connectionLocations, rhs.connectionLocations).append(fullDiversity, rhs.fullDiversity).append(departureDates, rhs.departureDates).append(tPAExtensions, rhs.tPAExtensions).append(departureDateTime, rhs.departureDateTime).append(fixed, rhs.fixed).append(arrivalDateTime, rhs.arrivalDateTime).isEquals();
    }

}

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
    "DepartureDateTime",
    "ArrivalDateTime",
    "DepartureDates",
    "ArrivalDates",
    "DepartureWindow",
    "ArrivalWindow",
    "OriginLocation",
    "DestinationLocation",
    "ConnectionLocations",
    "Flight",
    "DateFlexibility",
    "SisterDestinationLocation",
    "SisterDestinationMileage",
    "SisterOriginLocation",
    "SisterOriginMileage",
    "SegmentType",
    "AlternateTime",
    "MaxOneWayOptions",
    "NumOneWayOptions",
    "CabinPref",
    "ConnectionTime",
    "TotalTravelTime"
})
public class OriginDestinationInformation_ {

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
    @JsonProperty("Flight")
    private List<Flight_> flight = new ArrayList<Flight_>();
    @JsonProperty("DateFlexibility")
    private List<DateFlexibility> dateFlexibility = new ArrayList<DateFlexibility>();
    @JsonProperty("SisterDestinationLocation")
    private List<SisterDestinationLocation> sisterDestinationLocation = new ArrayList<SisterDestinationLocation>();
    @JsonProperty("SisterDestinationMileage")
    private SisterDestinationMileage sisterDestinationMileage;
    @JsonProperty("SisterOriginLocation")
    private List<SisterDestinationLocation> sisterOriginLocation = new ArrayList<SisterDestinationLocation>();
    @JsonProperty("SisterOriginMileage")
    private SisterOriginMileage sisterOriginMileage;
    @JsonProperty("SegmentType")
    private SegmentType segmentType;
    @JsonProperty("AlternateTime")
    private AlternateTime alternateTime;
    @JsonProperty("MaxOneWayOptions")
    private MaxOneWayOptions maxOneWayOptions;
    @JsonProperty("NumOneWayOptions")
    private NumOneWayOptions numOneWayOptions;
    @JsonProperty("CabinPref")
    private CabinPref cabinPref;
    @JsonProperty("ConnectionTime")
    private ConnectionTime connectionTime;
    @JsonProperty("TotalTravelTime")
    private TotalTravelTime totalTravelTime;

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

    @JsonProperty("Flight")
    public List<Flight_> getFlight() {
        return flight;
    }

    @JsonProperty("Flight")
    public void setFlight(List<Flight_> flight) {
        this.flight = flight;
    }

    @JsonProperty("DateFlexibility")
    public List<DateFlexibility> getDateFlexibility() {
        return dateFlexibility;
    }

    @JsonProperty("DateFlexibility")
    public void setDateFlexibility(List<DateFlexibility> dateFlexibility) {
        this.dateFlexibility = dateFlexibility;
    }

    @JsonProperty("SisterDestinationLocation")
    public List<SisterDestinationLocation> getSisterDestinationLocation() {
        return sisterDestinationLocation;
    }

    @JsonProperty("SisterDestinationLocation")
    public void setSisterDestinationLocation(List<SisterDestinationLocation> sisterDestinationLocation) {
        this.sisterDestinationLocation = sisterDestinationLocation;
    }

    @JsonProperty("SisterDestinationMileage")
    public SisterDestinationMileage getSisterDestinationMileage() {
        return sisterDestinationMileage;
    }

    @JsonProperty("SisterDestinationMileage")
    public void setSisterDestinationMileage(SisterDestinationMileage sisterDestinationMileage) {
        this.sisterDestinationMileage = sisterDestinationMileage;
    }

    @JsonProperty("SisterOriginLocation")
    public List<SisterDestinationLocation> getSisterOriginLocation() {
        return sisterOriginLocation;
    }

    @JsonProperty("SisterOriginLocation")
    public void setSisterOriginLocation(List<SisterDestinationLocation> sisterOriginLocation) {
        this.sisterOriginLocation = sisterOriginLocation;
    }

    @JsonProperty("SisterOriginMileage")
    public SisterOriginMileage getSisterOriginMileage() {
        return sisterOriginMileage;
    }

    @JsonProperty("SisterOriginMileage")
    public void setSisterOriginMileage(SisterOriginMileage sisterOriginMileage) {
        this.sisterOriginMileage = sisterOriginMileage;
    }

    @JsonProperty("SegmentType")
    public SegmentType getSegmentType() {
        return segmentType;
    }

    @JsonProperty("SegmentType")
    public void setSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType;
    }

    @JsonProperty("AlternateTime")
    public AlternateTime getAlternateTime() {
        return alternateTime;
    }

    @JsonProperty("AlternateTime")
    public void setAlternateTime(AlternateTime alternateTime) {
        this.alternateTime = alternateTime;
    }

    @JsonProperty("MaxOneWayOptions")
    public MaxOneWayOptions getMaxOneWayOptions() {
        return maxOneWayOptions;
    }

    @JsonProperty("MaxOneWayOptions")
    public void setMaxOneWayOptions(MaxOneWayOptions maxOneWayOptions) {
        this.maxOneWayOptions = maxOneWayOptions;
    }

    @JsonProperty("NumOneWayOptions")
    public NumOneWayOptions getNumOneWayOptions() {
        return numOneWayOptions;
    }

    @JsonProperty("NumOneWayOptions")
    public void setNumOneWayOptions(NumOneWayOptions numOneWayOptions) {
        this.numOneWayOptions = numOneWayOptions;
    }

    @JsonProperty("CabinPref")
    public CabinPref getCabinPref() {
        return cabinPref;
    }

    @JsonProperty("CabinPref")
    public void setCabinPref(CabinPref cabinPref) {
        this.cabinPref = cabinPref;
    }

    @JsonProperty("ConnectionTime")
    public ConnectionTime getConnectionTime() {
        return connectionTime;
    }

    @JsonProperty("ConnectionTime")
    public void setConnectionTime(ConnectionTime connectionTime) {
        this.connectionTime = connectionTime;
    }

    @JsonProperty("TotalTravelTime")
    public TotalTravelTime getTotalTravelTime() {
        return totalTravelTime;
    }

    @JsonProperty("TotalTravelTime")
    public void setTotalTravelTime(TotalTravelTime totalTravelTime) {
        this.totalTravelTime = totalTravelTime;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("departureDateTime", departureDateTime).append("arrivalDateTime", arrivalDateTime).append("departureDates", departureDates).append("arrivalDates", arrivalDates).append("departureWindow", departureWindow).append("arrivalWindow", arrivalWindow).append("originLocation", originLocation).append("destinationLocation", destinationLocation).append("connectionLocations", connectionLocations).append("flight", flight).append("dateFlexibility", dateFlexibility).append("sisterDestinationLocation", sisterDestinationLocation).append("sisterDestinationMileage", sisterDestinationMileage).append("sisterOriginLocation", sisterOriginLocation).append("sisterOriginMileage", sisterOriginMileage).append("segmentType", segmentType).append("alternateTime", alternateTime).append("maxOneWayOptions", maxOneWayOptions).append("numOneWayOptions", numOneWayOptions).append("cabinPref", cabinPref).append("connectionTime", connectionTime).append("totalTravelTime", totalTravelTime).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(sisterDestinationLocation).append(sisterOriginMileage).append(cabinPref).append(flight).append(dateFlexibility).append(arrivalDates).append(destinationLocation).append(sisterOriginLocation).append(sisterDestinationMileage).append(departureWindow).append(arrivalWindow).append(originLocation).append(connectionLocations).append(departureDates).append(alternateTime).append(maxOneWayOptions).append(departureDateTime).append(arrivalDateTime).append(numOneWayOptions).append(totalTravelTime).append(segmentType).append(connectionTime).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginDestinationInformation_) == false) {
            return false;
        }
        OriginDestinationInformation_ rhs = ((OriginDestinationInformation_) other);
        return new EqualsBuilder().append(sisterDestinationLocation, rhs.sisterDestinationLocation).append(sisterOriginMileage, rhs.sisterOriginMileage).append(cabinPref, rhs.cabinPref).append(flight, rhs.flight).append(dateFlexibility, rhs.dateFlexibility).append(arrivalDates, rhs.arrivalDates).append(destinationLocation, rhs.destinationLocation).append(sisterOriginLocation, rhs.sisterOriginLocation).append(sisterDestinationMileage, rhs.sisterDestinationMileage).append(departureWindow, rhs.departureWindow).append(arrivalWindow, rhs.arrivalWindow).append(originLocation, rhs.originLocation).append(connectionLocations, rhs.connectionLocations).append(departureDates, rhs.departureDates).append(alternateTime, rhs.alternateTime).append(maxOneWayOptions, rhs.maxOneWayOptions).append(departureDateTime, rhs.departureDateTime).append(arrivalDateTime, rhs.arrivalDateTime).append(numOneWayOptions, rhs.numOneWayOptions).append(totalTravelTime, rhs.totalTravelTime).append(segmentType, rhs.segmentType).append(connectionTime, rhs.connectionTime).isEquals();
    }

}

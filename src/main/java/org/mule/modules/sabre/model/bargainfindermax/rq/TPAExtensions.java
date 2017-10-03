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
    "Flight",
    "Routing",
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
    "TotalTravelTime",
    "IncludeVendorPref",
    "IncludeAlliancePref",
    "DepartureDays",
    "Baggage"
})
public class TPAExtensions {

    @JsonProperty("Flight")
    private List<Flight> flight = new ArrayList<Flight>();
    @JsonProperty("Routing")
    private List<Routing> routing = new ArrayList<Routing>();
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
    @JsonProperty("IncludeVendorPref")
    private List<IncludeVendorPref> includeVendorPref = new ArrayList<IncludeVendorPref>();
    @JsonProperty("IncludeAlliancePref")
    private List<IncludeAlliancePref> includeAlliancePref = new ArrayList<IncludeAlliancePref>();
    @JsonProperty("DepartureDays")
    private DepartureDays departureDays;
    @JsonProperty("Baggage")
    private Baggage baggage;

    @JsonProperty("Flight")
    public List<Flight> getFlight() {
        return flight;
    }

    @JsonProperty("Flight")
    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }

    @JsonProperty("Routing")
    public List<Routing> getRouting() {
        return routing;
    }

    @JsonProperty("Routing")
    public void setRouting(List<Routing> routing) {
        this.routing = routing;
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

    @JsonProperty("IncludeVendorPref")
    public List<IncludeVendorPref> getIncludeVendorPref() {
        return includeVendorPref;
    }

    @JsonProperty("IncludeVendorPref")
    public void setIncludeVendorPref(List<IncludeVendorPref> includeVendorPref) {
        this.includeVendorPref = includeVendorPref;
    }

    @JsonProperty("IncludeAlliancePref")
    public List<IncludeAlliancePref> getIncludeAlliancePref() {
        return includeAlliancePref;
    }

    @JsonProperty("IncludeAlliancePref")
    public void setIncludeAlliancePref(List<IncludeAlliancePref> includeAlliancePref) {
        this.includeAlliancePref = includeAlliancePref;
    }

    @JsonProperty("DepartureDays")
    public DepartureDays getDepartureDays() {
        return departureDays;
    }

    @JsonProperty("DepartureDays")
    public void setDepartureDays(DepartureDays departureDays) {
        this.departureDays = departureDays;
    }

    @JsonProperty("Baggage")
    public Baggage getBaggage() {
        return baggage;
    }

    @JsonProperty("Baggage")
    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("flight", flight).append("routing", routing).append("dateFlexibility", dateFlexibility).append("sisterDestinationLocation", sisterDestinationLocation).append("sisterDestinationMileage", sisterDestinationMileage).append("sisterOriginLocation", sisterOriginLocation).append("sisterOriginMileage", sisterOriginMileage).append("segmentType", segmentType).append("alternateTime", alternateTime).append("maxOneWayOptions", maxOneWayOptions).append("numOneWayOptions", numOneWayOptions).append("cabinPref", cabinPref).append("connectionTime", connectionTime).append("totalTravelTime", totalTravelTime).append("includeVendorPref", includeVendorPref).append("includeAlliancePref", includeAlliancePref).append("departureDays", departureDays).append("baggage", baggage).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(sisterDestinationLocation).append(sisterOriginMileage).append(cabinPref).append(flight).append(dateFlexibility).append(baggage).append(sisterOriginLocation).append(includeVendorPref).append(sisterDestinationMileage).append(includeAlliancePref).append(routing).append(departureDays).append(alternateTime).append(maxOneWayOptions).append(numOneWayOptions).append(totalTravelTime).append(segmentType).append(connectionTime).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions) == false) {
            return false;
        }
        TPAExtensions rhs = ((TPAExtensions) other);
        return new EqualsBuilder().append(sisterDestinationLocation, rhs.sisterDestinationLocation).append(sisterOriginMileage, rhs.sisterOriginMileage).append(cabinPref, rhs.cabinPref).append(flight, rhs.flight).append(dateFlexibility, rhs.dateFlexibility).append(baggage, rhs.baggage).append(sisterOriginLocation, rhs.sisterOriginLocation).append(includeVendorPref, rhs.includeVendorPref).append(sisterDestinationMileage, rhs.sisterDestinationMileage).append(includeAlliancePref, rhs.includeAlliancePref).append(routing, rhs.routing).append(departureDays, rhs.departureDays).append(alternateTime, rhs.alternateTime).append(maxOneWayOptions, rhs.maxOneWayOptions).append(numOneWayOptions, rhs.numOneWayOptions).append(totalTravelTime, rhs.totalTravelTime).append(segmentType, rhs.segmentType).append(connectionTime, rhs.connectionTime).isEquals();
    }

}

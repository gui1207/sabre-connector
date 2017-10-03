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
    "OriginLocation",
    "DestinationLocation",
    "Airline",
    "SideTrip",
    "Reservation",
    "MileageDisplay",
    "BookingDateTime",
    "Fare",
    "PlusUp",
    "Number",
    "DepartureDateTime",
    "ArrivalDateTime",
    "MarriageStatus",
    "Type",
    "Flown",
    "ClassOfService",
    "Shopped"
})
public class Flight {

    @JsonProperty("OriginLocation")
    private OriginLocation_ originLocation;
    @JsonProperty("DestinationLocation")
    private OriginLocation_ destinationLocation;
    @JsonProperty("Airline")
    private Airline airline;
    @JsonProperty("SideTrip")
    private SideTrip sideTrip;
    @JsonProperty("Reservation")
    private Reservation reservation;
    @JsonProperty("MileageDisplay")
    private List<MileageDisplay> mileageDisplay = new ArrayList<MileageDisplay>();
    @JsonProperty("BookingDateTime")
    private String bookingDateTime;
    @JsonProperty("Fare")
    private Fare fare;
    @JsonProperty("PlusUp")
    private List<PlusUp> plusUp = new ArrayList<PlusUp>();
    @JsonProperty("Number")
    private Double number;
    @JsonProperty("DepartureDateTime")
    private String departureDateTime;
    @JsonProperty("ArrivalDateTime")
    private String arrivalDateTime;
    @JsonProperty("MarriageStatus")
    private String marriageStatus;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Flown")
    private Boolean flown;
    @JsonProperty("ClassOfService")
    private String classOfService;
    @JsonProperty("Shopped")
    private Boolean shopped;

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

    @JsonProperty("Airline")
    public Airline getAirline() {
        return airline;
    }

    @JsonProperty("Airline")
    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    @JsonProperty("SideTrip")
    public SideTrip getSideTrip() {
        return sideTrip;
    }

    @JsonProperty("SideTrip")
    public void setSideTrip(SideTrip sideTrip) {
        this.sideTrip = sideTrip;
    }

    @JsonProperty("Reservation")
    public Reservation getReservation() {
        return reservation;
    }

    @JsonProperty("Reservation")
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @JsonProperty("MileageDisplay")
    public List<MileageDisplay> getMileageDisplay() {
        return mileageDisplay;
    }

    @JsonProperty("MileageDisplay")
    public void setMileageDisplay(List<MileageDisplay> mileageDisplay) {
        this.mileageDisplay = mileageDisplay;
    }

    @JsonProperty("BookingDateTime")
    public String getBookingDateTime() {
        return bookingDateTime;
    }

    @JsonProperty("BookingDateTime")
    public void setBookingDateTime(String bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    @JsonProperty("Fare")
    public Fare getFare() {
        return fare;
    }

    @JsonProperty("Fare")
    public void setFare(Fare fare) {
        this.fare = fare;
    }

    @JsonProperty("PlusUp")
    public List<PlusUp> getPlusUp() {
        return plusUp;
    }

    @JsonProperty("PlusUp")
    public void setPlusUp(List<PlusUp> plusUp) {
        this.plusUp = plusUp;
    }

    @JsonProperty("Number")
    public Double getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(Double number) {
        this.number = number;
    }

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

    @JsonProperty("MarriageStatus")
    public String getMarriageStatus() {
        return marriageStatus;
    }

    @JsonProperty("MarriageStatus")
    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Flown")
    public Boolean getFlown() {
        return flown;
    }

    @JsonProperty("Flown")
    public void setFlown(Boolean flown) {
        this.flown = flown;
    }

    @JsonProperty("ClassOfService")
    public String getClassOfService() {
        return classOfService;
    }

    @JsonProperty("ClassOfService")
    public void setClassOfService(String classOfService) {
        this.classOfService = classOfService;
    }

    @JsonProperty("Shopped")
    public Boolean getShopped() {
        return shopped;
    }

    @JsonProperty("Shopped")
    public void setShopped(Boolean shopped) {
        this.shopped = shopped;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("originLocation", originLocation).append("destinationLocation", destinationLocation).append("airline", airline).append("sideTrip", sideTrip).append("reservation", reservation).append("mileageDisplay", mileageDisplay).append("bookingDateTime", bookingDateTime).append("fare", fare).append("plusUp", plusUp).append("number", number).append("departureDateTime", departureDateTime).append("arrivalDateTime", arrivalDateTime).append("marriageStatus", marriageStatus).append("type", type).append("flown", flown).append("classOfService", classOfService).append("shopped", shopped).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(fare).append(classOfService).append(bookingDateTime).append(destinationLocation).append(marriageStatus).append(type).append(shopped).append(sideTrip).append(originLocation).append(flown).append(mileageDisplay).append(number).append(plusUp).append(reservation).append(departureDateTime).append(arrivalDateTime).append(airline).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flight) == false) {
            return false;
        }
        Flight rhs = ((Flight) other);
        return new EqualsBuilder().append(fare, rhs.fare).append(classOfService, rhs.classOfService).append(bookingDateTime, rhs.bookingDateTime).append(destinationLocation, rhs.destinationLocation).append(marriageStatus, rhs.marriageStatus).append(type, rhs.type).append(shopped, rhs.shopped).append(sideTrip, rhs.sideTrip).append(originLocation, rhs.originLocation).append(flown, rhs.flown).append(mileageDisplay, rhs.mileageDisplay).append(number, rhs.number).append(plusUp, rhs.plusUp).append(reservation, rhs.reservation).append(departureDateTime, rhs.departureDateTime).append(arrivalDateTime, rhs.arrivalDateTime).append(airline, rhs.airline).isEquals();
    }

}

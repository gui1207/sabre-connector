/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

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
    "DepartureAirport",
    "ArrivalAirport",
    "OperatingAirline",
    "Equipment",
    "MarketingAirline",
    "DisclosureAirline",
    "MarriageGrp",
    "StopAirports",
    "DepartureTimeZone",
    "ArrivalTimeZone",
    "OnTimePerformance",
    "TPA_Extensions",
    "DepartureDateTime",
    "ArrivalDateTime",
    "StopQuantity",
    "RPH",
    "InfoSource",
    "FlightNumber",
    "TourOperatorFlightID",
    "ResBookDesigCode",
    "ActionCode",
    "NumberInParty",
    "ElapsedTime"
})
public class FlightSegment {

    @JsonProperty("DepartureAirport")
    private DepartureAirport departureAirport;
    @JsonProperty("ArrivalAirport")
    private DepartureAirport arrivalAirport;
    @JsonProperty("OperatingAirline")
    private OperatingAirline operatingAirline;
    @JsonProperty("Equipment")
    private List<Equipment> equipment = new ArrayList<Equipment>();
    @JsonProperty("MarketingAirline")
    private MarketingAirline marketingAirline;
    @JsonProperty("DisclosureAirline")
    private MarketingAirline disclosureAirline;
    @JsonProperty("MarriageGrp")
    private String marriageGrp;
    @JsonProperty("StopAirports")
    private StopAirports stopAirports;
    @JsonProperty("DepartureTimeZone")
    private DepartureTimeZone departureTimeZone;
    @JsonProperty("ArrivalTimeZone")
    private ArrivalTimeZone arrivalTimeZone;
    @JsonProperty("OnTimePerformance")
    private OnTimePerformance onTimePerformance;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions_ tPAExtensions;
    @JsonProperty("DepartureDateTime")
    private String departureDateTime;
    @JsonProperty("ArrivalDateTime")
    private String arrivalDateTime;
    @JsonProperty("StopQuantity")
    private Integer stopQuantity;
    @JsonProperty("RPH")
    private String rPH;
    @JsonProperty("InfoSource")
    private String infoSource;
    @JsonProperty("FlightNumber")
    private String flightNumber;
    @JsonProperty("TourOperatorFlightID")
    private String tourOperatorFlightID;
    @JsonProperty("ResBookDesigCode")
    private String resBookDesigCode;
    @JsonProperty("ActionCode")
    private String actionCode;
    @JsonProperty("NumberInParty")
    private Integer numberInParty;
    @JsonProperty("ElapsedTime")
    private Double elapsedTime;

    @JsonProperty("DepartureAirport")
    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    @JsonProperty("DepartureAirport")
    public void setDepartureAirport(DepartureAirport departureAirport) {
        this.departureAirport = departureAirport;
    }

    @JsonProperty("ArrivalAirport")
    public DepartureAirport getArrivalAirport() {
        return arrivalAirport;
    }

    @JsonProperty("ArrivalAirport")
    public void setArrivalAirport(DepartureAirport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @JsonProperty("OperatingAirline")
    public OperatingAirline getOperatingAirline() {
        return operatingAirline;
    }

    @JsonProperty("OperatingAirline")
    public void setOperatingAirline(OperatingAirline operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    @JsonProperty("Equipment")
    public List<Equipment> getEquipment() {
        return equipment;
    }

    @JsonProperty("Equipment")
    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    @JsonProperty("MarketingAirline")
    public MarketingAirline getMarketingAirline() {
        return marketingAirline;
    }

    @JsonProperty("MarketingAirline")
    public void setMarketingAirline(MarketingAirline marketingAirline) {
        this.marketingAirline = marketingAirline;
    }

    @JsonProperty("DisclosureAirline")
    public MarketingAirline getDisclosureAirline() {
        return disclosureAirline;
    }

    @JsonProperty("DisclosureAirline")
    public void setDisclosureAirline(MarketingAirline disclosureAirline) {
        this.disclosureAirline = disclosureAirline;
    }

    @JsonProperty("MarriageGrp")
    public String getMarriageGrp() {
        return marriageGrp;
    }

    @JsonProperty("MarriageGrp")
    public void setMarriageGrp(String marriageGrp) {
        this.marriageGrp = marriageGrp;
    }

    @JsonProperty("StopAirports")
    public StopAirports getStopAirports() {
        return stopAirports;
    }

    @JsonProperty("StopAirports")
    public void setStopAirports(StopAirports stopAirports) {
        this.stopAirports = stopAirports;
    }

    @JsonProperty("DepartureTimeZone")
    public DepartureTimeZone getDepartureTimeZone() {
        return departureTimeZone;
    }

    @JsonProperty("DepartureTimeZone")
    public void setDepartureTimeZone(DepartureTimeZone departureTimeZone) {
        this.departureTimeZone = departureTimeZone;
    }

    @JsonProperty("ArrivalTimeZone")
    public ArrivalTimeZone getArrivalTimeZone() {
        return arrivalTimeZone;
    }

    @JsonProperty("ArrivalTimeZone")
    public void setArrivalTimeZone(ArrivalTimeZone arrivalTimeZone) {
        this.arrivalTimeZone = arrivalTimeZone;
    }

    @JsonProperty("OnTimePerformance")
    public OnTimePerformance getOnTimePerformance() {
        return onTimePerformance;
    }

    @JsonProperty("OnTimePerformance")
    public void setOnTimePerformance(OnTimePerformance onTimePerformance) {
        this.onTimePerformance = onTimePerformance;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions_ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
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

    @JsonProperty("StopQuantity")
    public Integer getStopQuantity() {
        return stopQuantity;
    }

    @JsonProperty("StopQuantity")
    public void setStopQuantity(Integer stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

    @JsonProperty("RPH")
    public String getRPH() {
        return rPH;
    }

    @JsonProperty("RPH")
    public void setRPH(String rPH) {
        this.rPH = rPH;
    }

    @JsonProperty("InfoSource")
    public String getInfoSource() {
        return infoSource;
    }

    @JsonProperty("InfoSource")
    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource;
    }

    @JsonProperty("FlightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("FlightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("TourOperatorFlightID")
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    @JsonProperty("TourOperatorFlightID")
    public void setTourOperatorFlightID(String tourOperatorFlightID) {
        this.tourOperatorFlightID = tourOperatorFlightID;
    }

    @JsonProperty("ResBookDesigCode")
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    @JsonProperty("ResBookDesigCode")
    public void setResBookDesigCode(String resBookDesigCode) {
        this.resBookDesigCode = resBookDesigCode;
    }

    @JsonProperty("ActionCode")
    public String getActionCode() {
        return actionCode;
    }

    @JsonProperty("ActionCode")
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    @JsonProperty("NumberInParty")
    public Integer getNumberInParty() {
        return numberInParty;
    }

    @JsonProperty("NumberInParty")
    public void setNumberInParty(Integer numberInParty) {
        this.numberInParty = numberInParty;
    }

    @JsonProperty("ElapsedTime")
    public Double getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("ElapsedTime")
    public void setElapsedTime(Double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("departureAirport", departureAirport).append("arrivalAirport", arrivalAirport).append("operatingAirline", operatingAirline).append("equipment", equipment).append("marketingAirline", marketingAirline).append("disclosureAirline", disclosureAirline).append("marriageGrp", marriageGrp).append("stopAirports", stopAirports).append("departureTimeZone", departureTimeZone).append("arrivalTimeZone", arrivalTimeZone).append("onTimePerformance", onTimePerformance).append("tPAExtensions", tPAExtensions).append("departureDateTime", departureDateTime).append("arrivalDateTime", arrivalDateTime).append("stopQuantity", stopQuantity).append("rPH", rPH).append("infoSource", infoSource).append("flightNumber", flightNumber).append("tourOperatorFlightID", tourOperatorFlightID).append("resBookDesigCode", resBookDesigCode).append("actionCode", actionCode).append("numberInParty", numberInParty).append("elapsedTime", elapsedTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(marketingAirline).append(departureAirport).append(departureTimeZone).append(tourOperatorFlightID).append(equipment).append(numberInParty).append(rPH).append(infoSource).append(resBookDesigCode).append(flightNumber).append(stopAirports).append(onTimePerformance).append(stopQuantity).append(tPAExtensions).append(arrivalTimeZone).append(marriageGrp).append(departureDateTime).append(actionCode).append(disclosureAirline).append(arrivalDateTime).append(arrivalAirport).append(operatingAirline).append(elapsedTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightSegment) == false) {
            return false;
        }
        FlightSegment rhs = ((FlightSegment) other);
        return new EqualsBuilder().append(marketingAirline, rhs.marketingAirline).append(departureAirport, rhs.departureAirport).append(departureTimeZone, rhs.departureTimeZone).append(tourOperatorFlightID, rhs.tourOperatorFlightID).append(equipment, rhs.equipment).append(numberInParty, rhs.numberInParty).append(rPH, rhs.rPH).append(infoSource, rhs.infoSource).append(resBookDesigCode, rhs.resBookDesigCode).append(flightNumber, rhs.flightNumber).append(stopAirports, rhs.stopAirports).append(onTimePerformance, rhs.onTimePerformance).append(stopQuantity, rhs.stopQuantity).append(tPAExtensions, rhs.tPAExtensions).append(arrivalTimeZone, rhs.arrivalTimeZone).append(marriageGrp, rhs.marriageGrp).append(departureDateTime, rhs.departureDateTime).append(actionCode, rhs.actionCode).append(disclosureAirline, rhs.disclosureAirline).append(arrivalDateTime, rhs.arrivalDateTime).append(arrivalAirport, rhs.arrivalAirport).append(operatingAirline, rhs.operatingAirline).append(elapsedTime, rhs.elapsedTime).isEquals();
    }

}

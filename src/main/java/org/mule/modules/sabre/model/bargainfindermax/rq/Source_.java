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
    "BookingChannel",
    "AgentSine",
    "PseudoCityCode",
    "ISOCountry",
    "ISOCurrency",
    "AgentDutyCode",
    "AirlineVendorID",
    "AirportCode",
    "FirstDepartPoint",
    "ERSP_UserID",
    "PersonalCityCode",
    "AccountingCode",
    "OfficeCode",
    "DefaultTicketingCarrier",
    "AirlineChannelCode",
    "AgentDepartmentCode",
    "AgentFunction",
    "TravelAgencyIATA",
    "HomeAgencyIATA",
    "AgentIATA",
    "VendorCRSCode",
    "AgentDuty",
    "AbacusUser",
    "AgentCity",
    "MainTravelAgencyPCC",
    "Carrier",
    "HostCarrier",
    "ETicketCapable",
    "CoHostID"
})
public class Source_ {

    @JsonProperty("BookingChannel")
    private BookingChannel bookingChannel;
    @JsonProperty("AgentSine")
    private String agentSine;
    @JsonProperty("PseudoCityCode")
    private String pseudoCityCode;
    @JsonProperty("ISOCountry")
    private String iSOCountry;
    @JsonProperty("ISOCurrency")
    private String iSOCurrency;
    @JsonProperty("AgentDutyCode")
    private String agentDutyCode;
    @JsonProperty("AirlineVendorID")
    private String airlineVendorID;
    @JsonProperty("AirportCode")
    private String airportCode;
    @JsonProperty("FirstDepartPoint")
    private String firstDepartPoint;
    @JsonProperty("ERSP_UserID")
    private String eRSPUserID;
    @JsonProperty("PersonalCityCode")
    private String personalCityCode;
    @JsonProperty("AccountingCode")
    private String accountingCode;
    @JsonProperty("OfficeCode")
    private String officeCode;
    @JsonProperty("DefaultTicketingCarrier")
    private String defaultTicketingCarrier;
    @JsonProperty("AirlineChannelCode")
    private String airlineChannelCode;
    @JsonProperty("AgentDepartmentCode")
    private String agentDepartmentCode;
    @JsonProperty("AgentFunction")
    private String agentFunction;
    @JsonProperty("TravelAgencyIATA")
    private String travelAgencyIATA;
    @JsonProperty("HomeAgencyIATA")
    private String homeAgencyIATA;
    @JsonProperty("AgentIATA")
    private String agentIATA;
    @JsonProperty("VendorCRSCode")
    private String vendorCRSCode;
    @JsonProperty("AgentDuty")
    private String agentDuty;
    @JsonProperty("AbacusUser")
    private Boolean abacusUser;
    @JsonProperty("AgentCity")
    private String agentCity;
    @JsonProperty("MainTravelAgencyPCC")
    private String mainTravelAgencyPCC;
    @JsonProperty("Carrier")
    private String carrier;
    @JsonProperty("HostCarrier")
    private String hostCarrier;
    @JsonProperty("ETicketCapable")
    private Boolean eTicketCapable;
    @JsonProperty("CoHostID")
    private Double coHostID;

    @JsonProperty("BookingChannel")
    public BookingChannel getBookingChannel() {
        return bookingChannel;
    }

    @JsonProperty("BookingChannel")
    public void setBookingChannel(BookingChannel bookingChannel) {
        this.bookingChannel = bookingChannel;
    }

    @JsonProperty("AgentSine")
    public String getAgentSine() {
        return agentSine;
    }

    @JsonProperty("AgentSine")
    public void setAgentSine(String agentSine) {
        this.agentSine = agentSine;
    }

    @JsonProperty("PseudoCityCode")
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    @JsonProperty("PseudoCityCode")
    public void setPseudoCityCode(String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }

    @JsonProperty("ISOCountry")
    public String getISOCountry() {
        return iSOCountry;
    }

    @JsonProperty("ISOCountry")
    public void setISOCountry(String iSOCountry) {
        this.iSOCountry = iSOCountry;
    }

    @JsonProperty("ISOCurrency")
    public String getISOCurrency() {
        return iSOCurrency;
    }

    @JsonProperty("ISOCurrency")
    public void setISOCurrency(String iSOCurrency) {
        this.iSOCurrency = iSOCurrency;
    }

    @JsonProperty("AgentDutyCode")
    public String getAgentDutyCode() {
        return agentDutyCode;
    }

    @JsonProperty("AgentDutyCode")
    public void setAgentDutyCode(String agentDutyCode) {
        this.agentDutyCode = agentDutyCode;
    }

    @JsonProperty("AirlineVendorID")
    public String getAirlineVendorID() {
        return airlineVendorID;
    }

    @JsonProperty("AirlineVendorID")
    public void setAirlineVendorID(String airlineVendorID) {
        this.airlineVendorID = airlineVendorID;
    }

    @JsonProperty("AirportCode")
    public String getAirportCode() {
        return airportCode;
    }

    @JsonProperty("AirportCode")
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    @JsonProperty("FirstDepartPoint")
    public String getFirstDepartPoint() {
        return firstDepartPoint;
    }

    @JsonProperty("FirstDepartPoint")
    public void setFirstDepartPoint(String firstDepartPoint) {
        this.firstDepartPoint = firstDepartPoint;
    }

    @JsonProperty("ERSP_UserID")
    public String getERSPUserID() {
        return eRSPUserID;
    }

    @JsonProperty("ERSP_UserID")
    public void setERSPUserID(String eRSPUserID) {
        this.eRSPUserID = eRSPUserID;
    }

    @JsonProperty("PersonalCityCode")
    public String getPersonalCityCode() {
        return personalCityCode;
    }

    @JsonProperty("PersonalCityCode")
    public void setPersonalCityCode(String personalCityCode) {
        this.personalCityCode = personalCityCode;
    }

    @JsonProperty("AccountingCode")
    public String getAccountingCode() {
        return accountingCode;
    }

    @JsonProperty("AccountingCode")
    public void setAccountingCode(String accountingCode) {
        this.accountingCode = accountingCode;
    }

    @JsonProperty("OfficeCode")
    public String getOfficeCode() {
        return officeCode;
    }

    @JsonProperty("OfficeCode")
    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    @JsonProperty("DefaultTicketingCarrier")
    public String getDefaultTicketingCarrier() {
        return defaultTicketingCarrier;
    }

    @JsonProperty("DefaultTicketingCarrier")
    public void setDefaultTicketingCarrier(String defaultTicketingCarrier) {
        this.defaultTicketingCarrier = defaultTicketingCarrier;
    }

    @JsonProperty("AirlineChannelCode")
    public String getAirlineChannelCode() {
        return airlineChannelCode;
    }

    @JsonProperty("AirlineChannelCode")
    public void setAirlineChannelCode(String airlineChannelCode) {
        this.airlineChannelCode = airlineChannelCode;
    }

    @JsonProperty("AgentDepartmentCode")
    public String getAgentDepartmentCode() {
        return agentDepartmentCode;
    }

    @JsonProperty("AgentDepartmentCode")
    public void setAgentDepartmentCode(String agentDepartmentCode) {
        this.agentDepartmentCode = agentDepartmentCode;
    }

    @JsonProperty("AgentFunction")
    public String getAgentFunction() {
        return agentFunction;
    }

    @JsonProperty("AgentFunction")
    public void setAgentFunction(String agentFunction) {
        this.agentFunction = agentFunction;
    }

    @JsonProperty("TravelAgencyIATA")
    public String getTravelAgencyIATA() {
        return travelAgencyIATA;
    }

    @JsonProperty("TravelAgencyIATA")
    public void setTravelAgencyIATA(String travelAgencyIATA) {
        this.travelAgencyIATA = travelAgencyIATA;
    }

    @JsonProperty("HomeAgencyIATA")
    public String getHomeAgencyIATA() {
        return homeAgencyIATA;
    }

    @JsonProperty("HomeAgencyIATA")
    public void setHomeAgencyIATA(String homeAgencyIATA) {
        this.homeAgencyIATA = homeAgencyIATA;
    }

    @JsonProperty("AgentIATA")
    public String getAgentIATA() {
        return agentIATA;
    }

    @JsonProperty("AgentIATA")
    public void setAgentIATA(String agentIATA) {
        this.agentIATA = agentIATA;
    }

    @JsonProperty("VendorCRSCode")
    public String getVendorCRSCode() {
        return vendorCRSCode;
    }

    @JsonProperty("VendorCRSCode")
    public void setVendorCRSCode(String vendorCRSCode) {
        this.vendorCRSCode = vendorCRSCode;
    }

    @JsonProperty("AgentDuty")
    public String getAgentDuty() {
        return agentDuty;
    }

    @JsonProperty("AgentDuty")
    public void setAgentDuty(String agentDuty) {
        this.agentDuty = agentDuty;
    }

    @JsonProperty("AbacusUser")
    public Boolean getAbacusUser() {
        return abacusUser;
    }

    @JsonProperty("AbacusUser")
    public void setAbacusUser(Boolean abacusUser) {
        this.abacusUser = abacusUser;
    }

    @JsonProperty("AgentCity")
    public String getAgentCity() {
        return agentCity;
    }

    @JsonProperty("AgentCity")
    public void setAgentCity(String agentCity) {
        this.agentCity = agentCity;
    }

    @JsonProperty("MainTravelAgencyPCC")
    public String getMainTravelAgencyPCC() {
        return mainTravelAgencyPCC;
    }

    @JsonProperty("MainTravelAgencyPCC")
    public void setMainTravelAgencyPCC(String mainTravelAgencyPCC) {
        this.mainTravelAgencyPCC = mainTravelAgencyPCC;
    }

    @JsonProperty("Carrier")
    public String getCarrier() {
        return carrier;
    }

    @JsonProperty("Carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("HostCarrier")
    public String getHostCarrier() {
        return hostCarrier;
    }

    @JsonProperty("HostCarrier")
    public void setHostCarrier(String hostCarrier) {
        this.hostCarrier = hostCarrier;
    }

    @JsonProperty("ETicketCapable")
    public Boolean getETicketCapable() {
        return eTicketCapable;
    }

    @JsonProperty("ETicketCapable")
    public void setETicketCapable(Boolean eTicketCapable) {
        this.eTicketCapable = eTicketCapable;
    }

    @JsonProperty("CoHostID")
    public Double getCoHostID() {
        return coHostID;
    }

    @JsonProperty("CoHostID")
    public void setCoHostID(Double coHostID) {
        this.coHostID = coHostID;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("bookingChannel", bookingChannel).append("agentSine", agentSine).append("pseudoCityCode", pseudoCityCode).append("iSOCountry", iSOCountry).append("iSOCurrency", iSOCurrency).append("agentDutyCode", agentDutyCode).append("airlineVendorID", airlineVendorID).append("airportCode", airportCode).append("firstDepartPoint", firstDepartPoint).append("eRSPUserID", eRSPUserID).append("personalCityCode", personalCityCode).append("accountingCode", accountingCode).append("officeCode", officeCode).append("defaultTicketingCarrier", defaultTicketingCarrier).append("airlineChannelCode", airlineChannelCode).append("agentDepartmentCode", agentDepartmentCode).append("agentFunction", agentFunction).append("travelAgencyIATA", travelAgencyIATA).append("homeAgencyIATA", homeAgencyIATA).append("agentIATA", agentIATA).append("vendorCRSCode", vendorCRSCode).append("agentDuty", agentDuty).append("abacusUser", abacusUser).append("agentCity", agentCity).append("mainTravelAgencyPCC", mainTravelAgencyPCC).append("carrier", carrier).append("hostCarrier", hostCarrier).append("eTicketCapable", eTicketCapable).append("coHostID", coHostID).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(personalCityCode).append(mainTravelAgencyPCC).append(agentCity).append(abacusUser).append(vendorCRSCode).append(iSOCountry).append(bookingChannel).append(iSOCurrency).append(coHostID).append(eRSPUserID).append(agentIATA).append(pseudoCityCode).append(accountingCode).append(agentDutyCode).append(airlineVendorID).append(firstDepartPoint).append(officeCode).append(agentSine).append(agentFunction).append(defaultTicketingCarrier).append(agentDuty).append(carrier).append(agentDepartmentCode).append(hostCarrier).append(airportCode).append(homeAgencyIATA).append(eTicketCapable).append(airlineChannelCode).append(travelAgencyIATA).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source_) == false) {
            return false;
        }
        Source_ rhs = ((Source_) other);
        return new EqualsBuilder().append(personalCityCode, rhs.personalCityCode).append(mainTravelAgencyPCC, rhs.mainTravelAgencyPCC).append(agentCity, rhs.agentCity).append(abacusUser, rhs.abacusUser).append(vendorCRSCode, rhs.vendorCRSCode).append(iSOCountry, rhs.iSOCountry).append(bookingChannel, rhs.bookingChannel).append(iSOCurrency, rhs.iSOCurrency).append(coHostID, rhs.coHostID).append(eRSPUserID, rhs.eRSPUserID).append(agentIATA, rhs.agentIATA).append(pseudoCityCode, rhs.pseudoCityCode).append(accountingCode, rhs.accountingCode).append(agentDutyCode, rhs.agentDutyCode).append(airlineVendorID, rhs.airlineVendorID).append(firstDepartPoint, rhs.firstDepartPoint).append(officeCode, rhs.officeCode).append(agentSine, rhs.agentSine).append(agentFunction, rhs.agentFunction).append(defaultTicketingCarrier, rhs.defaultTicketingCarrier).append(agentDuty, rhs.agentDuty).append(carrier, rhs.carrier).append(agentDepartmentCode, rhs.agentDepartmentCode).append(hostCarrier, rhs.hostCarrier).append(airportCode, rhs.airportCode).append(homeAgencyIATA, rhs.homeAgencyIATA).append(eTicketCapable, rhs.eTicketCapable).append(airlineChannelCode, rhs.airlineChannelCode).append(travelAgencyIATA, rhs.travelAgencyIATA).isEquals();
    }

}

/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "content",
    "PrivateFareType",
    "FareComponentReferenceID",
    "AccountCode",
    "Mileage",
    "BookingCode",
    "AvailabilityBreak",
    "DepartureAirportCode",
    "ArrivalAirportCode",
    "FareComponentBeginAirport",
    "FareComponentEndAirport",
    "FareComponentDirectionality",
    "FareComponentVendorCode",
    "GovCarrier"
})
public class FareBasisCode {

    @JsonProperty("content")
    private String content;
    @JsonProperty("PrivateFareType")
    private String privateFareType;
    @JsonProperty("FareComponentReferenceID")
    private Integer fareComponentReferenceID;
    @JsonProperty("AccountCode")
    private String accountCode;
    @JsonProperty("Mileage")
    private Integer mileage;
    @JsonProperty("BookingCode")
    private String bookingCode;
    @JsonProperty("AvailabilityBreak")
    private Boolean availabilityBreak;
    @JsonProperty("DepartureAirportCode")
    private String departureAirportCode;
    @JsonProperty("ArrivalAirportCode")
    private String arrivalAirportCode;
    @JsonProperty("FareComponentBeginAirport")
    private String fareComponentBeginAirport;
    @JsonProperty("FareComponentEndAirport")
    private String fareComponentEndAirport;
    @JsonProperty("FareComponentDirectionality")
    private FareBasisCode.FareComponentDirectionality fareComponentDirectionality;
    @JsonProperty("FareComponentVendorCode")
    private String fareComponentVendorCode;
    @JsonProperty("GovCarrier")
    private String govCarrier;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("PrivateFareType")
    public String getPrivateFareType() {
        return privateFareType;
    }

    @JsonProperty("PrivateFareType")
    public void setPrivateFareType(String privateFareType) {
        this.privateFareType = privateFareType;
    }

    @JsonProperty("FareComponentReferenceID")
    public Integer getFareComponentReferenceID() {
        return fareComponentReferenceID;
    }

    @JsonProperty("FareComponentReferenceID")
    public void setFareComponentReferenceID(Integer fareComponentReferenceID) {
        this.fareComponentReferenceID = fareComponentReferenceID;
    }

    @JsonProperty("AccountCode")
    public String getAccountCode() {
        return accountCode;
    }

    @JsonProperty("AccountCode")
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    @JsonProperty("Mileage")
    public Integer getMileage() {
        return mileage;
    }

    @JsonProperty("Mileage")
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    @JsonProperty("BookingCode")
    public String getBookingCode() {
        return bookingCode;
    }

    @JsonProperty("BookingCode")
    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    @JsonProperty("AvailabilityBreak")
    public Boolean getAvailabilityBreak() {
        return availabilityBreak;
    }

    @JsonProperty("AvailabilityBreak")
    public void setAvailabilityBreak(Boolean availabilityBreak) {
        this.availabilityBreak = availabilityBreak;
    }

    @JsonProperty("DepartureAirportCode")
    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    @JsonProperty("DepartureAirportCode")
    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    @JsonProperty("ArrivalAirportCode")
    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    @JsonProperty("ArrivalAirportCode")
    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    @JsonProperty("FareComponentBeginAirport")
    public String getFareComponentBeginAirport() {
        return fareComponentBeginAirport;
    }

    @JsonProperty("FareComponentBeginAirport")
    public void setFareComponentBeginAirport(String fareComponentBeginAirport) {
        this.fareComponentBeginAirport = fareComponentBeginAirport;
    }

    @JsonProperty("FareComponentEndAirport")
    public String getFareComponentEndAirport() {
        return fareComponentEndAirport;
    }

    @JsonProperty("FareComponentEndAirport")
    public void setFareComponentEndAirport(String fareComponentEndAirport) {
        this.fareComponentEndAirport = fareComponentEndAirport;
    }

    @JsonProperty("FareComponentDirectionality")
    public FareBasisCode.FareComponentDirectionality getFareComponentDirectionality() {
        return fareComponentDirectionality;
    }

    @JsonProperty("FareComponentDirectionality")
    public void setFareComponentDirectionality(FareBasisCode.FareComponentDirectionality fareComponentDirectionality) {
        this.fareComponentDirectionality = fareComponentDirectionality;
    }

    @JsonProperty("FareComponentVendorCode")
    public String getFareComponentVendorCode() {
        return fareComponentVendorCode;
    }

    @JsonProperty("FareComponentVendorCode")
    public void setFareComponentVendorCode(String fareComponentVendorCode) {
        this.fareComponentVendorCode = fareComponentVendorCode;
    }

    @JsonProperty("GovCarrier")
    public String getGovCarrier() {
        return govCarrier;
    }

    @JsonProperty("GovCarrier")
    public void setGovCarrier(String govCarrier) {
        this.govCarrier = govCarrier;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("privateFareType", privateFareType).append("fareComponentReferenceID", fareComponentReferenceID).append("accountCode", accountCode).append("mileage", mileage).append("bookingCode", bookingCode).append("availabilityBreak", availabilityBreak).append("departureAirportCode", departureAirportCode).append("arrivalAirportCode", arrivalAirportCode).append("fareComponentBeginAirport", fareComponentBeginAirport).append("fareComponentEndAirport", fareComponentEndAirport).append("fareComponentDirectionality", fareComponentDirectionality).append("fareComponentVendorCode", fareComponentVendorCode).append("govCarrier", govCarrier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareComponentEndAirport).append(accountCode).append(arrivalAirportCode).append(fareComponentVendorCode).append(fareComponentBeginAirport).append(fareComponentReferenceID).append(govCarrier).append(content).append(availabilityBreak).append(privateFareType).append(fareComponentDirectionality).append(bookingCode).append(departureAirportCode).append(mileage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareBasisCode) == false) {
            return false;
        }
        FareBasisCode rhs = ((FareBasisCode) other);
        return new EqualsBuilder().append(fareComponentEndAirport, rhs.fareComponentEndAirport).append(accountCode, rhs.accountCode).append(arrivalAirportCode, rhs.arrivalAirportCode).append(fareComponentVendorCode, rhs.fareComponentVendorCode).append(fareComponentBeginAirport, rhs.fareComponentBeginAirport).append(fareComponentReferenceID, rhs.fareComponentReferenceID).append(govCarrier, rhs.govCarrier).append(content, rhs.content).append(availabilityBreak, rhs.availabilityBreak).append(privateFareType, rhs.privateFareType).append(fareComponentDirectionality, rhs.fareComponentDirectionality).append(bookingCode, rhs.bookingCode).append(departureAirportCode, rhs.departureAirportCode).append(mileage, rhs.mileage).isEquals();
    }

    public enum FareComponentDirectionality {

        FROM("FROM"),
        TO("TO");
        private final String value;
        private final static Map<String, FareBasisCode.FareComponentDirectionality> CONSTANTS = new HashMap<String, FareBasisCode.FareComponentDirectionality>();

        static {
            for (FareBasisCode.FareComponentDirectionality c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FareComponentDirectionality(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static FareBasisCode.FareComponentDirectionality fromValue(String value) {
            FareBasisCode.FareComponentDirectionality constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

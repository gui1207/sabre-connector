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
    "PricingSource",
    "Message",
    "DepartureDate",
    "DepartureAirport",
    "ArrivalAirport"
})
public class ProcessingMessage_ {

    @JsonProperty("PricingSource")
    private String pricingSource;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("DepartureDate")
    private String departureDate;
    @JsonProperty("DepartureAirport")
    private String departureAirport;
    @JsonProperty("ArrivalAirport")
    private String arrivalAirport;

    @JsonProperty("PricingSource")
    public String getPricingSource() {
        return pricingSource;
    }

    @JsonProperty("PricingSource")
    public void setPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
    }

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("DepartureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("DepartureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("DepartureAirport")
    public String getDepartureAirport() {
        return departureAirport;
    }

    @JsonProperty("DepartureAirport")
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    @JsonProperty("ArrivalAirport")
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @JsonProperty("ArrivalAirport")
    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pricingSource", pricingSource).append("message", message).append("departureDate", departureDate).append("departureAirport", departureAirport).append("arrivalAirport", arrivalAirport).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(departureDate).append(message).append(departureAirport).append(pricingSource).append(arrivalAirport).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessingMessage_) == false) {
            return false;
        }
        ProcessingMessage_ rhs = ((ProcessingMessage_) other);
        return new EqualsBuilder().append(departureDate, rhs.departureDate).append(message, rhs.message).append(departureAirport, rhs.departureAirport).append(pricingSource, rhs.pricingSource).append(arrivalAirport, rhs.arrivalAirport).isEquals();
    }

}

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
    "Amount",
    "Description",
    "OriginAirport",
    "DestinationAirport",
    "Carrier",
    "PassengerCode",
    "Date",
    "StartSegment",
    "EndSegment"
})
public class AncillaryFeeItem {

    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("OriginAirport")
    private String originAirport;
    @JsonProperty("DestinationAirport")
    private String destinationAirport;
    @JsonProperty("Carrier")
    private String carrier;
    @JsonProperty("PassengerCode")
    private String passengerCode;
    @JsonProperty("Date")
    private String date;
    @JsonProperty("StartSegment")
    private String startSegment;
    @JsonProperty("EndSegment")
    private String endSegment;

    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("OriginAirport")
    public String getOriginAirport() {
        return originAirport;
    }

    @JsonProperty("OriginAirport")
    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    @JsonProperty("DestinationAirport")
    public String getDestinationAirport() {
        return destinationAirport;
    }

    @JsonProperty("DestinationAirport")
    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    @JsonProperty("Carrier")
    public String getCarrier() {
        return carrier;
    }

    @JsonProperty("Carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("PassengerCode")
    public String getPassengerCode() {
        return passengerCode;
    }

    @JsonProperty("PassengerCode")
    public void setPassengerCode(String passengerCode) {
        this.passengerCode = passengerCode;
    }

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("StartSegment")
    public String getStartSegment() {
        return startSegment;
    }

    @JsonProperty("StartSegment")
    public void setStartSegment(String startSegment) {
        this.startSegment = startSegment;
    }

    @JsonProperty("EndSegment")
    public String getEndSegment() {
        return endSegment;
    }

    @JsonProperty("EndSegment")
    public void setEndSegment(String endSegment) {
        this.endSegment = endSegment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("description", description).append("originAirport", originAirport).append("destinationAirport", destinationAirport).append("carrier", carrier).append("passengerCode", passengerCode).append("date", date).append("startSegment", startSegment).append("endSegment", endSegment).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(originAirport).append(date).append(startSegment).append(amount).append(carrier).append(passengerCode).append(description).append(endSegment).append(destinationAirport).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AncillaryFeeItem) == false) {
            return false;
        }
        AncillaryFeeItem rhs = ((AncillaryFeeItem) other);
        return new EqualsBuilder().append(originAirport, rhs.originAirport).append(date, rhs.date).append(startSegment, rhs.startSegment).append(amount, rhs.amount).append(carrier, rhs.carrier).append(passengerCode, rhs.passengerCode).append(description, rhs.description).append(endSegment, rhs.endSegment).append(destinationAirport, rhs.destinationAirport).isEquals();
    }

}

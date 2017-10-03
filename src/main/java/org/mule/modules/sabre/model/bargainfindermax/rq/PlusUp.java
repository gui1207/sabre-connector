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
    "Amount",
    "OriginCity",
    "DestinationCity",
    "FareOriginCity",
    "FareDestinationCity",
    "ViaCity",
    "Message",
    "CountryOfPayment"
})
public class PlusUp {

    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("OriginCity")
    private String originCity;
    @JsonProperty("DestinationCity")
    private String destinationCity;
    @JsonProperty("FareOriginCity")
    private String fareOriginCity;
    @JsonProperty("FareDestinationCity")
    private String fareDestinationCity;
    @JsonProperty("ViaCity")
    private String viaCity;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("CountryOfPayment")
    private String countryOfPayment;

    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("OriginCity")
    public String getOriginCity() {
        return originCity;
    }

    @JsonProperty("OriginCity")
    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    @JsonProperty("DestinationCity")
    public String getDestinationCity() {
        return destinationCity;
    }

    @JsonProperty("DestinationCity")
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    @JsonProperty("FareOriginCity")
    public String getFareOriginCity() {
        return fareOriginCity;
    }

    @JsonProperty("FareOriginCity")
    public void setFareOriginCity(String fareOriginCity) {
        this.fareOriginCity = fareOriginCity;
    }

    @JsonProperty("FareDestinationCity")
    public String getFareDestinationCity() {
        return fareDestinationCity;
    }

    @JsonProperty("FareDestinationCity")
    public void setFareDestinationCity(String fareDestinationCity) {
        this.fareDestinationCity = fareDestinationCity;
    }

    @JsonProperty("ViaCity")
    public String getViaCity() {
        return viaCity;
    }

    @JsonProperty("ViaCity")
    public void setViaCity(String viaCity) {
        this.viaCity = viaCity;
    }

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("CountryOfPayment")
    public String getCountryOfPayment() {
        return countryOfPayment;
    }

    @JsonProperty("CountryOfPayment")
    public void setCountryOfPayment(String countryOfPayment) {
        this.countryOfPayment = countryOfPayment;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("originCity", originCity).append("destinationCity", destinationCity).append("fareOriginCity", fareOriginCity).append("fareDestinationCity", fareDestinationCity).append("viaCity", viaCity).append("message", message).append("countryOfPayment", countryOfPayment).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationCity).append(amount).append(countryOfPayment).append(originCity).append(fareOriginCity).append(viaCity).append(fareDestinationCity).append(message).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlusUp) == false) {
            return false;
        }
        PlusUp rhs = ((PlusUp) other);
        return new EqualsBuilder().append(destinationCity, rhs.destinationCity).append(amount, rhs.amount).append(countryOfPayment, rhs.countryOfPayment).append(originCity, rhs.originCity).append(fareOriginCity, rhs.fareOriginCity).append(viaCity, rhs.viaCity).append(fareDestinationCity, rhs.fareDestinationCity).append(message, rhs.message).isEquals();
    }

}

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
    "PassengerTypeQuantity",
    "FareBasisCodes",
    "PassengerFare",
    "Endorsements",
    "TPA_Extensions",
    "FareInfos",
    "PricingSource",
    "PrivateFareType",
    "LastTicketDate",
    "PreviousExchangeDate",
    "ReissueExchange"
})
public class PTCFareBreakdown {

    @JsonProperty("PassengerTypeQuantity")
    private PassengerTypeQuantity passengerTypeQuantity;
    @JsonProperty("FareBasisCodes")
    private FareBasisCodes fareBasisCodes;
    @JsonProperty("PassengerFare")
    private PassengerFare passengerFare;
    @JsonProperty("Endorsements")
    private Endorsements endorsements;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions____ tPAExtensions;
    @JsonProperty("FareInfos")
    private FareInfos fareInfos;
    @JsonProperty("PricingSource")
    private String pricingSource;
    @JsonProperty("PrivateFareType")
    private String privateFareType;
    @JsonProperty("LastTicketDate")
    private String lastTicketDate;
    @JsonProperty("PreviousExchangeDate")
    private String previousExchangeDate;
    @JsonProperty("ReissueExchange")
    private Integer reissueExchange;

    @JsonProperty("PassengerTypeQuantity")
    public PassengerTypeQuantity getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    @JsonProperty("PassengerTypeQuantity")
    public void setPassengerTypeQuantity(PassengerTypeQuantity passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    @JsonProperty("FareBasisCodes")
    public FareBasisCodes getFareBasisCodes() {
        return fareBasisCodes;
    }

    @JsonProperty("FareBasisCodes")
    public void setFareBasisCodes(FareBasisCodes fareBasisCodes) {
        this.fareBasisCodes = fareBasisCodes;
    }

    @JsonProperty("PassengerFare")
    public PassengerFare getPassengerFare() {
        return passengerFare;
    }

    @JsonProperty("PassengerFare")
    public void setPassengerFare(PassengerFare passengerFare) {
        this.passengerFare = passengerFare;
    }

    @JsonProperty("Endorsements")
    public Endorsements getEndorsements() {
        return endorsements;
    }

    @JsonProperty("Endorsements")
    public void setEndorsements(Endorsements endorsements) {
        this.endorsements = endorsements;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions____ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions____ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("FareInfos")
    public FareInfos getFareInfos() {
        return fareInfos;
    }

    @JsonProperty("FareInfos")
    public void setFareInfos(FareInfos fareInfos) {
        this.fareInfos = fareInfos;
    }

    @JsonProperty("PricingSource")
    public String getPricingSource() {
        return pricingSource;
    }

    @JsonProperty("PricingSource")
    public void setPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
    }

    @JsonProperty("PrivateFareType")
    public String getPrivateFareType() {
        return privateFareType;
    }

    @JsonProperty("PrivateFareType")
    public void setPrivateFareType(String privateFareType) {
        this.privateFareType = privateFareType;
    }

    @JsonProperty("LastTicketDate")
    public String getLastTicketDate() {
        return lastTicketDate;
    }

    @JsonProperty("LastTicketDate")
    public void setLastTicketDate(String lastTicketDate) {
        this.lastTicketDate = lastTicketDate;
    }

    @JsonProperty("PreviousExchangeDate")
    public String getPreviousExchangeDate() {
        return previousExchangeDate;
    }

    @JsonProperty("PreviousExchangeDate")
    public void setPreviousExchangeDate(String previousExchangeDate) {
        this.previousExchangeDate = previousExchangeDate;
    }

    @JsonProperty("ReissueExchange")
    public Integer getReissueExchange() {
        return reissueExchange;
    }

    @JsonProperty("ReissueExchange")
    public void setReissueExchange(Integer reissueExchange) {
        this.reissueExchange = reissueExchange;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("passengerTypeQuantity", passengerTypeQuantity).append("fareBasisCodes", fareBasisCodes).append("passengerFare", passengerFare).append("endorsements", endorsements).append("tPAExtensions", tPAExtensions).append("fareInfos", fareInfos).append("pricingSource", pricingSource).append("privateFareType", privateFareType).append("lastTicketDate", lastTicketDate).append("previousExchangeDate", previousExchangeDate).append("reissueExchange", reissueExchange).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(privateFareType).append(passengerTypeQuantity).append(tPAExtensions).append(endorsements).append(fareBasisCodes).append(passengerFare).append(reissueExchange).append(fareInfos).append(lastTicketDate).append(previousExchangeDate).append(pricingSource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PTCFareBreakdown) == false) {
            return false;
        }
        PTCFareBreakdown rhs = ((PTCFareBreakdown) other);
        return new EqualsBuilder().append(privateFareType, rhs.privateFareType).append(passengerTypeQuantity, rhs.passengerTypeQuantity).append(tPAExtensions, rhs.tPAExtensions).append(endorsements, rhs.endorsements).append(fareBasisCodes, rhs.fareBasisCodes).append(passengerFare, rhs.passengerFare).append(reissueExchange, rhs.reissueExchange).append(fareInfos, rhs.fareInfos).append(lastTicketDate, rhs.lastTicketDate).append(previousExchangeDate, rhs.previousExchangeDate).append(pricingSource, rhs.pricingSource).isEquals();
    }

}

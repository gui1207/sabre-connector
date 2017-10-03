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
    "DepartureDate",
    "FareReference",
    "RuleInfo",
    "MarketingAirline",
    "DepartureAirport",
    "ArrivalAirport",
    "TPA_Extensions",
    "NegotiatedFare",
    "NegotiatedFareCode"
})
public class FareInfo {

    @JsonProperty("DepartureDate")
    private String departureDate;
    @JsonProperty("FareReference")
    private String fareReference;
    @JsonProperty("RuleInfo")
    private RuleInfo ruleInfo;
    @JsonProperty("MarketingAirline")
    private List<MarketingAirline> marketingAirline = new ArrayList<MarketingAirline>();
    @JsonProperty("DepartureAirport")
    private DepartureAirport_ departureAirport;
    @JsonProperty("ArrivalAirport")
    private DepartureAirport_ arrivalAirport;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions_____ tPAExtensions;
    @JsonProperty("NegotiatedFare")
    private Boolean negotiatedFare;
    @JsonProperty("NegotiatedFareCode")
    private String negotiatedFareCode;

    @JsonProperty("DepartureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("DepartureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("FareReference")
    public String getFareReference() {
        return fareReference;
    }

    @JsonProperty("FareReference")
    public void setFareReference(String fareReference) {
        this.fareReference = fareReference;
    }

    @JsonProperty("RuleInfo")
    public RuleInfo getRuleInfo() {
        return ruleInfo;
    }

    @JsonProperty("RuleInfo")
    public void setRuleInfo(RuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
    }

    @JsonProperty("MarketingAirline")
    public List<MarketingAirline> getMarketingAirline() {
        return marketingAirline;
    }

    @JsonProperty("MarketingAirline")
    public void setMarketingAirline(List<MarketingAirline> marketingAirline) {
        this.marketingAirline = marketingAirline;
    }

    @JsonProperty("DepartureAirport")
    public DepartureAirport_ getDepartureAirport() {
        return departureAirport;
    }

    @JsonProperty("DepartureAirport")
    public void setDepartureAirport(DepartureAirport_ departureAirport) {
        this.departureAirport = departureAirport;
    }

    @JsonProperty("ArrivalAirport")
    public DepartureAirport_ getArrivalAirport() {
        return arrivalAirport;
    }

    @JsonProperty("ArrivalAirport")
    public void setArrivalAirport(DepartureAirport_ arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions_____ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_____ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("NegotiatedFare")
    public Boolean getNegotiatedFare() {
        return negotiatedFare;
    }

    @JsonProperty("NegotiatedFare")
    public void setNegotiatedFare(Boolean negotiatedFare) {
        this.negotiatedFare = negotiatedFare;
    }

    @JsonProperty("NegotiatedFareCode")
    public String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    @JsonProperty("NegotiatedFareCode")
    public void setNegotiatedFareCode(String negotiatedFareCode) {
        this.negotiatedFareCode = negotiatedFareCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("departureDate", departureDate).append("fareReference", fareReference).append("ruleInfo", ruleInfo).append("marketingAirline", marketingAirline).append("departureAirport", departureAirport).append("arrivalAirport", arrivalAirport).append("tPAExtensions", tPAExtensions).append("negotiatedFare", negotiatedFare).append("negotiatedFareCode", negotiatedFareCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(marketingAirline).append(negotiatedFareCode).append(departureAirport).append(tPAExtensions).append(ruleInfo).append(departureDate).append(arrivalAirport).append(negotiatedFare).append(fareReference).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareInfo) == false) {
            return false;
        }
        FareInfo rhs = ((FareInfo) other);
        return new EqualsBuilder().append(marketingAirline, rhs.marketingAirline).append(negotiatedFareCode, rhs.negotiatedFareCode).append(departureAirport, rhs.departureAirport).append(tPAExtensions, rhs.tPAExtensions).append(ruleInfo, rhs.ruleInfo).append(departureDate, rhs.departureDate).append(arrivalAirport, rhs.arrivalAirport).append(negotiatedFare, rhs.negotiatedFare).append(fareReference, rhs.fareReference).isEquals();
    }

}

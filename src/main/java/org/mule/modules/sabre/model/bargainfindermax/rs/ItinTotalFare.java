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
    "BaseFare",
    "NonRefundableBaseFare",
    "FareConstruction",
    "EquivFare",
    "Taxes",
    "Fees",
    "OBFees",
    "RateOfExchange",
    "CurrencyConversions",
    "TotalFare",
    "ReissueInfoList",
    "PenaltiesInfo",
    "TPA_Extensions",
    "NegotiatedFare",
    "NegotiatedFareCode",
    "Extras",
    "TotalWithExtras",
    "TotalMileage",
    "ServiceFee"
})
public class ItinTotalFare {

    @JsonProperty("BaseFare")
    private BaseFare baseFare;
    @JsonProperty("NonRefundableBaseFare")
    private BaseFare nonRefundableBaseFare;
    @JsonProperty("FareConstruction")
    private BaseFare fareConstruction;
    @JsonProperty("EquivFare")
    private EquivFare equivFare;
    @JsonProperty("Taxes")
    private Taxes taxes;
    @JsonProperty("Fees")
    private Fees fees;
    @JsonProperty("OBFees")
    private OBFees oBFees;
    @JsonProperty("RateOfExchange")
    private RateOfExchange rateOfExchange;
    @JsonProperty("CurrencyConversions")
    private CurrencyConversions currencyConversions;
    @JsonProperty("TotalFare")
    private BaseFare totalFare;
    @JsonProperty("ReissueInfoList")
    private ReissueInfoList reissueInfoList;
    @JsonProperty("PenaltiesInfo")
    private PenaltiesInfo penaltiesInfo;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions__ tPAExtensions;
    @JsonProperty("NegotiatedFare")
    private Boolean negotiatedFare;
    @JsonProperty("NegotiatedFareCode")
    private String negotiatedFareCode;
    @JsonProperty("Extras")
    private Extras extras;
    @JsonProperty("TotalWithExtras")
    private TotalWithExtras totalWithExtras;
    @JsonProperty("TotalMileage")
    private TotalMileage_ totalMileage;
    @JsonProperty("ServiceFee")
    private ServiceFee serviceFee;

    @JsonProperty("BaseFare")
    public BaseFare getBaseFare() {
        return baseFare;
    }

    @JsonProperty("BaseFare")
    public void setBaseFare(BaseFare baseFare) {
        this.baseFare = baseFare;
    }

    @JsonProperty("NonRefundableBaseFare")
    public BaseFare getNonRefundableBaseFare() {
        return nonRefundableBaseFare;
    }

    @JsonProperty("NonRefundableBaseFare")
    public void setNonRefundableBaseFare(BaseFare nonRefundableBaseFare) {
        this.nonRefundableBaseFare = nonRefundableBaseFare;
    }

    @JsonProperty("FareConstruction")
    public BaseFare getFareConstruction() {
        return fareConstruction;
    }

    @JsonProperty("FareConstruction")
    public void setFareConstruction(BaseFare fareConstruction) {
        this.fareConstruction = fareConstruction;
    }

    @JsonProperty("EquivFare")
    public EquivFare getEquivFare() {
        return equivFare;
    }

    @JsonProperty("EquivFare")
    public void setEquivFare(EquivFare equivFare) {
        this.equivFare = equivFare;
    }

    @JsonProperty("Taxes")
    public Taxes getTaxes() {
        return taxes;
    }

    @JsonProperty("Taxes")
    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("Fees")
    public Fees getFees() {
        return fees;
    }

    @JsonProperty("Fees")
    public void setFees(Fees fees) {
        this.fees = fees;
    }

    @JsonProperty("OBFees")
    public OBFees getOBFees() {
        return oBFees;
    }

    @JsonProperty("OBFees")
    public void setOBFees(OBFees oBFees) {
        this.oBFees = oBFees;
    }

    @JsonProperty("RateOfExchange")
    public RateOfExchange getRateOfExchange() {
        return rateOfExchange;
    }

    @JsonProperty("RateOfExchange")
    public void setRateOfExchange(RateOfExchange rateOfExchange) {
        this.rateOfExchange = rateOfExchange;
    }

    @JsonProperty("CurrencyConversions")
    public CurrencyConversions getCurrencyConversions() {
        return currencyConversions;
    }

    @JsonProperty("CurrencyConversions")
    public void setCurrencyConversions(CurrencyConversions currencyConversions) {
        this.currencyConversions = currencyConversions;
    }

    @JsonProperty("TotalFare")
    public BaseFare getTotalFare() {
        return totalFare;
    }

    @JsonProperty("TotalFare")
    public void setTotalFare(BaseFare totalFare) {
        this.totalFare = totalFare;
    }

    @JsonProperty("ReissueInfoList")
    public ReissueInfoList getReissueInfoList() {
        return reissueInfoList;
    }

    @JsonProperty("ReissueInfoList")
    public void setReissueInfoList(ReissueInfoList reissueInfoList) {
        this.reissueInfoList = reissueInfoList;
    }

    @JsonProperty("PenaltiesInfo")
    public PenaltiesInfo getPenaltiesInfo() {
        return penaltiesInfo;
    }

    @JsonProperty("PenaltiesInfo")
    public void setPenaltiesInfo(PenaltiesInfo penaltiesInfo) {
        this.penaltiesInfo = penaltiesInfo;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions__ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions__ tPAExtensions) {
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

    @JsonProperty("Extras")
    public Extras getExtras() {
        return extras;
    }

    @JsonProperty("Extras")
    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    @JsonProperty("TotalWithExtras")
    public TotalWithExtras getTotalWithExtras() {
        return totalWithExtras;
    }

    @JsonProperty("TotalWithExtras")
    public void setTotalWithExtras(TotalWithExtras totalWithExtras) {
        this.totalWithExtras = totalWithExtras;
    }

    @JsonProperty("TotalMileage")
    public TotalMileage_ getTotalMileage() {
        return totalMileage;
    }

    @JsonProperty("TotalMileage")
    public void setTotalMileage(TotalMileage_ totalMileage) {
        this.totalMileage = totalMileage;
    }

    @JsonProperty("ServiceFee")
    public ServiceFee getServiceFee() {
        return serviceFee;
    }

    @JsonProperty("ServiceFee")
    public void setServiceFee(ServiceFee serviceFee) {
        this.serviceFee = serviceFee;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baseFare", baseFare).append("nonRefundableBaseFare", nonRefundableBaseFare).append("fareConstruction", fareConstruction).append("equivFare", equivFare).append("taxes", taxes).append("fees", fees).append("oBFees", oBFees).append("rateOfExchange", rateOfExchange).append("currencyConversions", currencyConversions).append("totalFare", totalFare).append("reissueInfoList", reissueInfoList).append("penaltiesInfo", penaltiesInfo).append("tPAExtensions", tPAExtensions).append("negotiatedFare", negotiatedFare).append("negotiatedFareCode", negotiatedFareCode).append("extras", extras).append("totalWithExtras", totalWithExtras).append("totalMileage", totalMileage).append("serviceFee", serviceFee).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceFee).append(baseFare).append(fees).append(totalFare).append(taxes).append(extras).append(totalWithExtras).append(totalMileage).append(oBFees).append(reissueInfoList).append(equivFare).append(negotiatedFare).append(negotiatedFareCode).append(nonRefundableBaseFare).append(fareConstruction).append(tPAExtensions).append(penaltiesInfo).append(rateOfExchange).append(currencyConversions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItinTotalFare) == false) {
            return false;
        }
        ItinTotalFare rhs = ((ItinTotalFare) other);
        return new EqualsBuilder().append(serviceFee, rhs.serviceFee).append(baseFare, rhs.baseFare).append(fees, rhs.fees).append(totalFare, rhs.totalFare).append(taxes, rhs.taxes).append(extras, rhs.extras).append(totalWithExtras, rhs.totalWithExtras).append(totalMileage, rhs.totalMileage).append(oBFees, rhs.oBFees).append(reissueInfoList, rhs.reissueInfoList).append(equivFare, rhs.equivFare).append(negotiatedFare, rhs.negotiatedFare).append(negotiatedFareCode, rhs.negotiatedFareCode).append(nonRefundableBaseFare, rhs.nonRefundableBaseFare).append(fareConstruction, rhs.fareConstruction).append(tPAExtensions, rhs.tPAExtensions).append(penaltiesInfo, rhs.penaltiesInfo).append(rateOfExchange, rhs.rateOfExchange).append(currencyConversions, rhs.currencyConversions).isEquals();
    }

}

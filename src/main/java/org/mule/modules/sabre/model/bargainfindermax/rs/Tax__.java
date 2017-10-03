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
    "content",
    "TaxCode",
    "CarrierCode",
    "RateUsed",
    "StationCode",
    "CountryCode",
    "TaxOnChangeFee",
    "Refundable",
    "Amount",
    "CurrencyCode",
    "DecimalPlaces",
    "ReissueTaxType",
    "ReissueRestrictionApplies",
    "ReissueTaxRefundable",
    "ApplyToReissue",
    "ReissueMaxAmount",
    "ReissueCurrency",
    "PublishedAmount",
    "PublishedCurrency",
    "MinAmount",
    "MaxAmount",
    "MinMaxCurrency"
})
public class Tax__ {

    @JsonProperty("content")
    private String content;
    @JsonProperty("TaxCode")
    private String taxCode;
    @JsonProperty("CarrierCode")
    private String carrierCode;
    @JsonProperty("RateUsed")
    private Double rateUsed;
    @JsonProperty("StationCode")
    private String stationCode;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("TaxOnChangeFee")
    private Boolean taxOnChangeFee;
    @JsonProperty("Refundable")
    private Boolean refundable;
    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("DecimalPlaces")
    private Integer decimalPlaces;
    @JsonProperty("ReissueTaxType")
    private String reissueTaxType;
    @JsonProperty("ReissueRestrictionApplies")
    private Boolean reissueRestrictionApplies;
    @JsonProperty("ReissueTaxRefundable")
    private Boolean reissueTaxRefundable;
    @JsonProperty("ApplyToReissue")
    private Boolean applyToReissue;
    @JsonProperty("ReissueMaxAmount")
    private Double reissueMaxAmount;
    @JsonProperty("ReissueCurrency")
    private String reissueCurrency;
    @JsonProperty("PublishedAmount")
    private Double publishedAmount;
    @JsonProperty("PublishedCurrency")
    private String publishedCurrency;
    @JsonProperty("MinAmount")
    private Double minAmount;
    @JsonProperty("MaxAmount")
    private Double maxAmount;
    @JsonProperty("MinMaxCurrency")
    private String minMaxCurrency;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("TaxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("TaxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("CarrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("CarrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("RateUsed")
    public Double getRateUsed() {
        return rateUsed;
    }

    @JsonProperty("RateUsed")
    public void setRateUsed(Double rateUsed) {
        this.rateUsed = rateUsed;
    }

    @JsonProperty("StationCode")
    public String getStationCode() {
        return stationCode;
    }

    @JsonProperty("StationCode")
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("TaxOnChangeFee")
    public Boolean getTaxOnChangeFee() {
        return taxOnChangeFee;
    }

    @JsonProperty("TaxOnChangeFee")
    public void setTaxOnChangeFee(Boolean taxOnChangeFee) {
        this.taxOnChangeFee = taxOnChangeFee;
    }

    @JsonProperty("Refundable")
    public Boolean getRefundable() {
        return refundable;
    }

    @JsonProperty("Refundable")
    public void setRefundable(Boolean refundable) {
        this.refundable = refundable;
    }

    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("DecimalPlaces")
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    @JsonProperty("DecimalPlaces")
    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @JsonProperty("ReissueTaxType")
    public String getReissueTaxType() {
        return reissueTaxType;
    }

    @JsonProperty("ReissueTaxType")
    public void setReissueTaxType(String reissueTaxType) {
        this.reissueTaxType = reissueTaxType;
    }

    @JsonProperty("ReissueRestrictionApplies")
    public Boolean getReissueRestrictionApplies() {
        return reissueRestrictionApplies;
    }

    @JsonProperty("ReissueRestrictionApplies")
    public void setReissueRestrictionApplies(Boolean reissueRestrictionApplies) {
        this.reissueRestrictionApplies = reissueRestrictionApplies;
    }

    @JsonProperty("ReissueTaxRefundable")
    public Boolean getReissueTaxRefundable() {
        return reissueTaxRefundable;
    }

    @JsonProperty("ReissueTaxRefundable")
    public void setReissueTaxRefundable(Boolean reissueTaxRefundable) {
        this.reissueTaxRefundable = reissueTaxRefundable;
    }

    @JsonProperty("ApplyToReissue")
    public Boolean getApplyToReissue() {
        return applyToReissue;
    }

    @JsonProperty("ApplyToReissue")
    public void setApplyToReissue(Boolean applyToReissue) {
        this.applyToReissue = applyToReissue;
    }

    @JsonProperty("ReissueMaxAmount")
    public Double getReissueMaxAmount() {
        return reissueMaxAmount;
    }

    @JsonProperty("ReissueMaxAmount")
    public void setReissueMaxAmount(Double reissueMaxAmount) {
        this.reissueMaxAmount = reissueMaxAmount;
    }

    @JsonProperty("ReissueCurrency")
    public String getReissueCurrency() {
        return reissueCurrency;
    }

    @JsonProperty("ReissueCurrency")
    public void setReissueCurrency(String reissueCurrency) {
        this.reissueCurrency = reissueCurrency;
    }

    @JsonProperty("PublishedAmount")
    public Double getPublishedAmount() {
        return publishedAmount;
    }

    @JsonProperty("PublishedAmount")
    public void setPublishedAmount(Double publishedAmount) {
        this.publishedAmount = publishedAmount;
    }

    @JsonProperty("PublishedCurrency")
    public String getPublishedCurrency() {
        return publishedCurrency;
    }

    @JsonProperty("PublishedCurrency")
    public void setPublishedCurrency(String publishedCurrency) {
        this.publishedCurrency = publishedCurrency;
    }

    @JsonProperty("MinAmount")
    public Double getMinAmount() {
        return minAmount;
    }

    @JsonProperty("MinAmount")
    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    @JsonProperty("MaxAmount")
    public Double getMaxAmount() {
        return maxAmount;
    }

    @JsonProperty("MaxAmount")
    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    @JsonProperty("MinMaxCurrency")
    public String getMinMaxCurrency() {
        return minMaxCurrency;
    }

    @JsonProperty("MinMaxCurrency")
    public void setMinMaxCurrency(String minMaxCurrency) {
        this.minMaxCurrency = minMaxCurrency;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("taxCode", taxCode).append("carrierCode", carrierCode).append("rateUsed", rateUsed).append("stationCode", stationCode).append("countryCode", countryCode).append("taxOnChangeFee", taxOnChangeFee).append("refundable", refundable).append("amount", amount).append("currencyCode", currencyCode).append("decimalPlaces", decimalPlaces).append("reissueTaxType", reissueTaxType).append("reissueRestrictionApplies", reissueRestrictionApplies).append("reissueTaxRefundable", reissueTaxRefundable).append("applyToReissue", applyToReissue).append("reissueMaxAmount", reissueMaxAmount).append("reissueCurrency", reissueCurrency).append("publishedAmount", publishedAmount).append("publishedCurrency", publishedCurrency).append("minAmount", minAmount).append("maxAmount", maxAmount).append("minMaxCurrency", minMaxCurrency).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stationCode).append(reissueTaxType).append(minAmount).append(amount).append(reissueCurrency).append(publishedCurrency).append(taxCode).append(content).append(reissueTaxRefundable).append(applyToReissue).append(reissueMaxAmount).append(rateUsed).append(decimalPlaces).append(reissueRestrictionApplies).append(publishedAmount).append(countryCode).append(carrierCode).append(taxOnChangeFee).append(refundable).append(minMaxCurrency).append(maxAmount).append(currencyCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tax__) == false) {
            return false;
        }
        Tax__ rhs = ((Tax__) other);
        return new EqualsBuilder().append(stationCode, rhs.stationCode).append(reissueTaxType, rhs.reissueTaxType).append(minAmount, rhs.minAmount).append(amount, rhs.amount).append(reissueCurrency, rhs.reissueCurrency).append(publishedCurrency, rhs.publishedCurrency).append(taxCode, rhs.taxCode).append(content, rhs.content).append(reissueTaxRefundable, rhs.reissueTaxRefundable).append(applyToReissue, rhs.applyToReissue).append(reissueMaxAmount, rhs.reissueMaxAmount).append(rateUsed, rhs.rateUsed).append(decimalPlaces, rhs.decimalPlaces).append(reissueRestrictionApplies, rhs.reissueRestrictionApplies).append(publishedAmount, rhs.publishedAmount).append(countryCode, rhs.countryCode).append(carrierCode, rhs.carrierCode).append(taxOnChangeFee, rhs.taxOnChangeFee).append(refundable, rhs.refundable).append(minMaxCurrency, rhs.minMaxCurrency).append(maxAmount, rhs.maxAmount).append(currencyCode, rhs.currencyCode).isEquals();
    }

}

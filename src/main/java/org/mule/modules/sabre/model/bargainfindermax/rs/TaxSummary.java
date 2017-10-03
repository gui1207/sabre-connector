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
    "StationCode",
    "CountryCode",
    "PublishedAmount",
    "PublishedCurrency",
    "Amount",
    "CurrencyCode",
    "DecimalPlaces"
})
public class TaxSummary {

    @JsonProperty("content")
    private String content;
    @JsonProperty("TaxCode")
    private String taxCode;
    @JsonProperty("StationCode")
    private String stationCode;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("PublishedAmount")
    private Double publishedAmount;
    @JsonProperty("PublishedCurrency")
    private String publishedCurrency;
    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("DecimalPlaces")
    private Integer decimalPlaces;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("taxCode", taxCode).append("stationCode", stationCode).append("countryCode", countryCode).append("publishedAmount", publishedAmount).append("publishedCurrency", publishedCurrency).append("amount", amount).append("currencyCode", currencyCode).append("decimalPlaces", decimalPlaces).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stationCode).append(amount).append(decimalPlaces).append(publishedAmount).append(publishedCurrency).append(countryCode).append(taxCode).append(currencyCode).append(content).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxSummary) == false) {
            return false;
        }
        TaxSummary rhs = ((TaxSummary) other);
        return new EqualsBuilder().append(stationCode, rhs.stationCode).append(amount, rhs.amount).append(decimalPlaces, rhs.decimalPlaces).append(publishedAmount, rhs.publishedAmount).append(publishedCurrency, rhs.publishedCurrency).append(countryCode, rhs.countryCode).append(taxCode, rhs.taxCode).append(currencyCode, rhs.currencyCode).append(content, rhs.content).isEquals();
    }

}

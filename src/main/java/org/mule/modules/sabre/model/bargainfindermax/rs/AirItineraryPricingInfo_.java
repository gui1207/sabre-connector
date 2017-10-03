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
    "ItinTotalFare",
    "PTC_FareBreakdowns",
    "FareInfos",
    "TPA_Extensions",
    "LastTicketDate",
    "PrivateFareType",
    "SpanishFamilyDiscountIndicator",
    "FlexibleFareID",
    "PreviousExchangeDate",
    "ReissueExchange",
    "AdvancedPurchaseDate",
    "PurchaseByDate",
    "PricingSource",
    "PricingSubSource",
    "PseudoCityCode",
    "BrandID",
    "FareReturned",
    "FareStatus",
    "CachedItin",
    "CachePartition",
    "CachePartitionPriority",
    "CacheVersion",
    "TimeToLive",
    "HoursSinceCreation",
    "AlternateCityOption",
    "BrandsOnAnyMarket",
    "Repriced"
})
public class AirItineraryPricingInfo_ {

    @JsonProperty("ItinTotalFare")
    private ItinTotalFare itinTotalFare;
    @JsonProperty("PTC_FareBreakdowns")
    private PTCFareBreakdowns pTCFareBreakdowns;
    @JsonProperty("FareInfos")
    private FareInfos_ fareInfos;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions_______ tPAExtensions;
    @JsonProperty("LastTicketDate")
    private String lastTicketDate;
    @JsonProperty("PrivateFareType")
    private String privateFareType;
    @JsonProperty("SpanishFamilyDiscountIndicator")
    private String spanishFamilyDiscountIndicator;
    @JsonProperty("FlexibleFareID")
    private Integer flexibleFareID;
    @JsonProperty("PreviousExchangeDate")
    private String previousExchangeDate;
    @JsonProperty("ReissueExchange")
    private Integer reissueExchange;
    @JsonProperty("AdvancedPurchaseDate")
    private String advancedPurchaseDate;
    @JsonProperty("PurchaseByDate")
    private String purchaseByDate;
    @JsonProperty("PricingSource")
    private String pricingSource;
    @JsonProperty("PricingSubSource")
    private String pricingSubSource;
    @JsonProperty("PseudoCityCode")
    private String pseudoCityCode;
    @JsonProperty("BrandID")
    private String brandID;
    @JsonProperty("FareReturned")
    private Boolean fareReturned;
    @JsonProperty("FareStatus")
    private String fareStatus;
    @JsonProperty("CachedItin")
    private Boolean cachedItin;
    @JsonProperty("CachePartition")
    private String cachePartition;
    @JsonProperty("CachePartitionPriority")
    private Integer cachePartitionPriority;
    @JsonProperty("CacheVersion")
    private String cacheVersion;
    @JsonProperty("TimeToLive")
    private Integer timeToLive;
    @JsonProperty("HoursSinceCreation")
    private Integer hoursSinceCreation;
    @JsonProperty("AlternateCityOption")
    private Boolean alternateCityOption;
    @JsonProperty("BrandsOnAnyMarket")
    private Boolean brandsOnAnyMarket;
    @JsonProperty("Repriced")
    private Boolean repriced;

    @JsonProperty("ItinTotalFare")
    public ItinTotalFare getItinTotalFare() {
        return itinTotalFare;
    }

    @JsonProperty("ItinTotalFare")
    public void setItinTotalFare(ItinTotalFare itinTotalFare) {
        this.itinTotalFare = itinTotalFare;
    }

    @JsonProperty("PTC_FareBreakdowns")
    public PTCFareBreakdowns getPTCFareBreakdowns() {
        return pTCFareBreakdowns;
    }

    @JsonProperty("PTC_FareBreakdowns")
    public void setPTCFareBreakdowns(PTCFareBreakdowns pTCFareBreakdowns) {
        this.pTCFareBreakdowns = pTCFareBreakdowns;
    }

    @JsonProperty("FareInfos")
    public FareInfos_ getFareInfos() {
        return fareInfos;
    }

    @JsonProperty("FareInfos")
    public void setFareInfos(FareInfos_ fareInfos) {
        this.fareInfos = fareInfos;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions_______ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_______ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("LastTicketDate")
    public String getLastTicketDate() {
        return lastTicketDate;
    }

    @JsonProperty("LastTicketDate")
    public void setLastTicketDate(String lastTicketDate) {
        this.lastTicketDate = lastTicketDate;
    }

    @JsonProperty("PrivateFareType")
    public String getPrivateFareType() {
        return privateFareType;
    }

    @JsonProperty("PrivateFareType")
    public void setPrivateFareType(String privateFareType) {
        this.privateFareType = privateFareType;
    }

    @JsonProperty("SpanishFamilyDiscountIndicator")
    public String getSpanishFamilyDiscountIndicator() {
        return spanishFamilyDiscountIndicator;
    }

    @JsonProperty("SpanishFamilyDiscountIndicator")
    public void setSpanishFamilyDiscountIndicator(String spanishFamilyDiscountIndicator) {
        this.spanishFamilyDiscountIndicator = spanishFamilyDiscountIndicator;
    }

    @JsonProperty("FlexibleFareID")
    public Integer getFlexibleFareID() {
        return flexibleFareID;
    }

    @JsonProperty("FlexibleFareID")
    public void setFlexibleFareID(Integer flexibleFareID) {
        this.flexibleFareID = flexibleFareID;
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

    @JsonProperty("AdvancedPurchaseDate")
    public String getAdvancedPurchaseDate() {
        return advancedPurchaseDate;
    }

    @JsonProperty("AdvancedPurchaseDate")
    public void setAdvancedPurchaseDate(String advancedPurchaseDate) {
        this.advancedPurchaseDate = advancedPurchaseDate;
    }

    @JsonProperty("PurchaseByDate")
    public String getPurchaseByDate() {
        return purchaseByDate;
    }

    @JsonProperty("PurchaseByDate")
    public void setPurchaseByDate(String purchaseByDate) {
        this.purchaseByDate = purchaseByDate;
    }

    @JsonProperty("PricingSource")
    public String getPricingSource() {
        return pricingSource;
    }

    @JsonProperty("PricingSource")
    public void setPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
    }

    @JsonProperty("PricingSubSource")
    public String getPricingSubSource() {
        return pricingSubSource;
    }

    @JsonProperty("PricingSubSource")
    public void setPricingSubSource(String pricingSubSource) {
        this.pricingSubSource = pricingSubSource;
    }

    @JsonProperty("PseudoCityCode")
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    @JsonProperty("PseudoCityCode")
    public void setPseudoCityCode(String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }

    @JsonProperty("BrandID")
    public String getBrandID() {
        return brandID;
    }

    @JsonProperty("BrandID")
    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    @JsonProperty("FareReturned")
    public Boolean getFareReturned() {
        return fareReturned;
    }

    @JsonProperty("FareReturned")
    public void setFareReturned(Boolean fareReturned) {
        this.fareReturned = fareReturned;
    }

    @JsonProperty("FareStatus")
    public String getFareStatus() {
        return fareStatus;
    }

    @JsonProperty("FareStatus")
    public void setFareStatus(String fareStatus) {
        this.fareStatus = fareStatus;
    }

    @JsonProperty("CachedItin")
    public Boolean getCachedItin() {
        return cachedItin;
    }

    @JsonProperty("CachedItin")
    public void setCachedItin(Boolean cachedItin) {
        this.cachedItin = cachedItin;
    }

    @JsonProperty("CachePartition")
    public String getCachePartition() {
        return cachePartition;
    }

    @JsonProperty("CachePartition")
    public void setCachePartition(String cachePartition) {
        this.cachePartition = cachePartition;
    }

    @JsonProperty("CachePartitionPriority")
    public Integer getCachePartitionPriority() {
        return cachePartitionPriority;
    }

    @JsonProperty("CachePartitionPriority")
    public void setCachePartitionPriority(Integer cachePartitionPriority) {
        this.cachePartitionPriority = cachePartitionPriority;
    }

    @JsonProperty("CacheVersion")
    public String getCacheVersion() {
        return cacheVersion;
    }

    @JsonProperty("CacheVersion")
    public void setCacheVersion(String cacheVersion) {
        this.cacheVersion = cacheVersion;
    }

    @JsonProperty("TimeToLive")
    public Integer getTimeToLive() {
        return timeToLive;
    }

    @JsonProperty("TimeToLive")
    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    @JsonProperty("HoursSinceCreation")
    public Integer getHoursSinceCreation() {
        return hoursSinceCreation;
    }

    @JsonProperty("HoursSinceCreation")
    public void setHoursSinceCreation(Integer hoursSinceCreation) {
        this.hoursSinceCreation = hoursSinceCreation;
    }

    @JsonProperty("AlternateCityOption")
    public Boolean getAlternateCityOption() {
        return alternateCityOption;
    }

    @JsonProperty("AlternateCityOption")
    public void setAlternateCityOption(Boolean alternateCityOption) {
        this.alternateCityOption = alternateCityOption;
    }

    @JsonProperty("BrandsOnAnyMarket")
    public Boolean getBrandsOnAnyMarket() {
        return brandsOnAnyMarket;
    }

    @JsonProperty("BrandsOnAnyMarket")
    public void setBrandsOnAnyMarket(Boolean brandsOnAnyMarket) {
        this.brandsOnAnyMarket = brandsOnAnyMarket;
    }

    @JsonProperty("Repriced")
    public Boolean getRepriced() {
        return repriced;
    }

    @JsonProperty("Repriced")
    public void setRepriced(Boolean repriced) {
        this.repriced = repriced;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("itinTotalFare", itinTotalFare).append("pTCFareBreakdowns", pTCFareBreakdowns).append("fareInfos", fareInfos).append("tPAExtensions", tPAExtensions).append("lastTicketDate", lastTicketDate).append("privateFareType", privateFareType).append("spanishFamilyDiscountIndicator", spanishFamilyDiscountIndicator).append("flexibleFareID", flexibleFareID).append("previousExchangeDate", previousExchangeDate).append("reissueExchange", reissueExchange).append("advancedPurchaseDate", advancedPurchaseDate).append("purchaseByDate", purchaseByDate).append("pricingSource", pricingSource).append("pricingSubSource", pricingSubSource).append("pseudoCityCode", pseudoCityCode).append("brandID", brandID).append("fareReturned", fareReturned).append("fareStatus", fareStatus).append("cachedItin", cachedItin).append("cachePartition", cachePartition).append("cachePartitionPriority", cachePartitionPriority).append("cacheVersion", cacheVersion).append("timeToLive", timeToLive).append("hoursSinceCreation", hoursSinceCreation).append("alternateCityOption", alternateCityOption).append("brandsOnAnyMarket", brandsOnAnyMarket).append("repriced", repriced).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(reissueExchange).append(pricingSource).append(alternateCityOption).append(cachePartitionPriority).append(timeToLive).append(brandsOnAnyMarket).append(brandID).append(spanishFamilyDiscountIndicator).append(fareInfos).append(advancedPurchaseDate).append(pricingSubSource).append(repriced).append(flexibleFareID).append(hoursSinceCreation).append(pseudoCityCode).append(cachePartition).append(cacheVersion).append(purchaseByDate).append(lastTicketDate).append(fareReturned).append(privateFareType).append(tPAExtensions).append(itinTotalFare).append(previousExchangeDate).append(pTCFareBreakdowns).append(cachedItin).append(fareStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirItineraryPricingInfo_) == false) {
            return false;
        }
        AirItineraryPricingInfo_ rhs = ((AirItineraryPricingInfo_) other);
        return new EqualsBuilder().append(reissueExchange, rhs.reissueExchange).append(pricingSource, rhs.pricingSource).append(alternateCityOption, rhs.alternateCityOption).append(cachePartitionPriority, rhs.cachePartitionPriority).append(timeToLive, rhs.timeToLive).append(brandsOnAnyMarket, rhs.brandsOnAnyMarket).append(brandID, rhs.brandID).append(spanishFamilyDiscountIndicator, rhs.spanishFamilyDiscountIndicator).append(fareInfos, rhs.fareInfos).append(advancedPurchaseDate, rhs.advancedPurchaseDate).append(pricingSubSource, rhs.pricingSubSource).append(repriced, rhs.repriced).append(flexibleFareID, rhs.flexibleFareID).append(hoursSinceCreation, rhs.hoursSinceCreation).append(pseudoCityCode, rhs.pseudoCityCode).append(cachePartition, rhs.cachePartition).append(cacheVersion, rhs.cacheVersion).append(purchaseByDate, rhs.purchaseByDate).append(lastTicketDate, rhs.lastTicketDate).append(fareReturned, rhs.fareReturned).append(privateFareType, rhs.privateFareType).append(tPAExtensions, rhs.tPAExtensions).append(itinTotalFare, rhs.itinTotalFare).append(previousExchangeDate, rhs.previousExchangeDate).append(pTCFareBreakdowns, rhs.pTCFareBreakdowns).append(cachedItin, rhs.cachedItin).append(fareStatus, rhs.fareStatus).isEquals();
    }

}

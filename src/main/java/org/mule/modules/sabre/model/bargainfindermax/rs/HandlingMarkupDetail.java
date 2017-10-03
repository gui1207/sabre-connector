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
    "MarkupHandlingFeeAppID",
    "MarkupTypeCode",
    "FareAmountAfterMarkup",
    "MarkupAmount",
    "AmountCurrency",
    "MarkupRuleSourcePCC",
    "MarkupRuleItemNumber",
    "RetailerRuleQualifier"
})
public class HandlingMarkupDetail {

    @JsonProperty("MarkupHandlingFeeAppID")
    private String markupHandlingFeeAppID;
    @JsonProperty("MarkupTypeCode")
    private String markupTypeCode;
    @JsonProperty("FareAmountAfterMarkup")
    private Double fareAmountAfterMarkup;
    @JsonProperty("MarkupAmount")
    private Double markupAmount;
    @JsonProperty("AmountCurrency")
    private String amountCurrency;
    @JsonProperty("MarkupRuleSourcePCC")
    private String markupRuleSourcePCC;
    @JsonProperty("MarkupRuleItemNumber")
    private Integer markupRuleItemNumber;
    @JsonProperty("RetailerRuleQualifier")
    private String retailerRuleQualifier;

    @JsonProperty("MarkupHandlingFeeAppID")
    public String getMarkupHandlingFeeAppID() {
        return markupHandlingFeeAppID;
    }

    @JsonProperty("MarkupHandlingFeeAppID")
    public void setMarkupHandlingFeeAppID(String markupHandlingFeeAppID) {
        this.markupHandlingFeeAppID = markupHandlingFeeAppID;
    }

    @JsonProperty("MarkupTypeCode")
    public String getMarkupTypeCode() {
        return markupTypeCode;
    }

    @JsonProperty("MarkupTypeCode")
    public void setMarkupTypeCode(String markupTypeCode) {
        this.markupTypeCode = markupTypeCode;
    }

    @JsonProperty("FareAmountAfterMarkup")
    public Double getFareAmountAfterMarkup() {
        return fareAmountAfterMarkup;
    }

    @JsonProperty("FareAmountAfterMarkup")
    public void setFareAmountAfterMarkup(Double fareAmountAfterMarkup) {
        this.fareAmountAfterMarkup = fareAmountAfterMarkup;
    }

    @JsonProperty("MarkupAmount")
    public Double getMarkupAmount() {
        return markupAmount;
    }

    @JsonProperty("MarkupAmount")
    public void setMarkupAmount(Double markupAmount) {
        this.markupAmount = markupAmount;
    }

    @JsonProperty("AmountCurrency")
    public String getAmountCurrency() {
        return amountCurrency;
    }

    @JsonProperty("AmountCurrency")
    public void setAmountCurrency(String amountCurrency) {
        this.amountCurrency = amountCurrency;
    }

    @JsonProperty("MarkupRuleSourcePCC")
    public String getMarkupRuleSourcePCC() {
        return markupRuleSourcePCC;
    }

    @JsonProperty("MarkupRuleSourcePCC")
    public void setMarkupRuleSourcePCC(String markupRuleSourcePCC) {
        this.markupRuleSourcePCC = markupRuleSourcePCC;
    }

    @JsonProperty("MarkupRuleItemNumber")
    public Integer getMarkupRuleItemNumber() {
        return markupRuleItemNumber;
    }

    @JsonProperty("MarkupRuleItemNumber")
    public void setMarkupRuleItemNumber(Integer markupRuleItemNumber) {
        this.markupRuleItemNumber = markupRuleItemNumber;
    }

    @JsonProperty("RetailerRuleQualifier")
    public String getRetailerRuleQualifier() {
        return retailerRuleQualifier;
    }

    @JsonProperty("RetailerRuleQualifier")
    public void setRetailerRuleQualifier(String retailerRuleQualifier) {
        this.retailerRuleQualifier = retailerRuleQualifier;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("markupHandlingFeeAppID", markupHandlingFeeAppID).append("markupTypeCode", markupTypeCode).append("fareAmountAfterMarkup", fareAmountAfterMarkup).append("markupAmount", markupAmount).append("amountCurrency", amountCurrency).append("markupRuleSourcePCC", markupRuleSourcePCC).append("markupRuleItemNumber", markupRuleItemNumber).append("retailerRuleQualifier", retailerRuleQualifier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareAmountAfterMarkup).append(markupHandlingFeeAppID).append(markupRuleSourcePCC).append(retailerRuleQualifier).append(markupTypeCode).append(markupAmount).append(markupRuleItemNumber).append(amountCurrency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HandlingMarkupDetail) == false) {
            return false;
        }
        HandlingMarkupDetail rhs = ((HandlingMarkupDetail) other);
        return new EqualsBuilder().append(fareAmountAfterMarkup, rhs.fareAmountAfterMarkup).append(markupHandlingFeeAppID, rhs.markupHandlingFeeAppID).append(markupRuleSourcePCC, rhs.markupRuleSourcePCC).append(retailerRuleQualifier, rhs.retailerRuleQualifier).append(markupTypeCode, rhs.markupTypeCode).append(markupAmount, rhs.markupAmount).append(markupRuleItemNumber, rhs.markupRuleItemNumber).append(amountCurrency, rhs.amountCurrency).isEquals();
    }

}

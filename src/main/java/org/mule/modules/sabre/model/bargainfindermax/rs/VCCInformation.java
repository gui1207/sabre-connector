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
    "FareComponentBreakdown",
    "ValidatingCarrier",
    "CommissionAmount",
    "EarnedCommissionAmount",
    "TotalAmountIncludingMarkUp",
    "CommissionPercent",
    "CommissionContractQualifier"
})
public class VCCInformation {

    @JsonProperty("FareComponentBreakdown")
    private List<FareComponentBreakdown> fareComponentBreakdown = new ArrayList<FareComponentBreakdown>();
    @JsonProperty("ValidatingCarrier")
    private String validatingCarrier;
    @JsonProperty("CommissionAmount")
    private Double commissionAmount;
    @JsonProperty("EarnedCommissionAmount")
    private Double earnedCommissionAmount;
    @JsonProperty("TotalAmountIncludingMarkUp")
    private Double totalAmountIncludingMarkUp;
    @JsonProperty("CommissionPercent")
    private Double commissionPercent;
    @JsonProperty("CommissionContractQualifier")
    private String commissionContractQualifier;

    @JsonProperty("FareComponentBreakdown")
    public List<FareComponentBreakdown> getFareComponentBreakdown() {
        return fareComponentBreakdown;
    }

    @JsonProperty("FareComponentBreakdown")
    public void setFareComponentBreakdown(List<FareComponentBreakdown> fareComponentBreakdown) {
        this.fareComponentBreakdown = fareComponentBreakdown;
    }

    @JsonProperty("ValidatingCarrier")
    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    @JsonProperty("ValidatingCarrier")
    public void setValidatingCarrier(String validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    @JsonProperty("CommissionAmount")
    public Double getCommissionAmount() {
        return commissionAmount;
    }

    @JsonProperty("CommissionAmount")
    public void setCommissionAmount(Double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    @JsonProperty("EarnedCommissionAmount")
    public Double getEarnedCommissionAmount() {
        return earnedCommissionAmount;
    }

    @JsonProperty("EarnedCommissionAmount")
    public void setEarnedCommissionAmount(Double earnedCommissionAmount) {
        this.earnedCommissionAmount = earnedCommissionAmount;
    }

    @JsonProperty("TotalAmountIncludingMarkUp")
    public Double getTotalAmountIncludingMarkUp() {
        return totalAmountIncludingMarkUp;
    }

    @JsonProperty("TotalAmountIncludingMarkUp")
    public void setTotalAmountIncludingMarkUp(Double totalAmountIncludingMarkUp) {
        this.totalAmountIncludingMarkUp = totalAmountIncludingMarkUp;
    }

    @JsonProperty("CommissionPercent")
    public Double getCommissionPercent() {
        return commissionPercent;
    }

    @JsonProperty("CommissionPercent")
    public void setCommissionPercent(Double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    @JsonProperty("CommissionContractQualifier")
    public String getCommissionContractQualifier() {
        return commissionContractQualifier;
    }

    @JsonProperty("CommissionContractQualifier")
    public void setCommissionContractQualifier(String commissionContractQualifier) {
        this.commissionContractQualifier = commissionContractQualifier;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareComponentBreakdown", fareComponentBreakdown).append("validatingCarrier", validatingCarrier).append("commissionAmount", commissionAmount).append("earnedCommissionAmount", earnedCommissionAmount).append("totalAmountIncludingMarkUp", totalAmountIncludingMarkUp).append("commissionPercent", commissionPercent).append("commissionContractQualifier", commissionContractQualifier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(commissionContractQualifier).append(earnedCommissionAmount).append(validatingCarrier).append(commissionPercent).append(fareComponentBreakdown).append(commissionAmount).append(totalAmountIncludingMarkUp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VCCInformation) == false) {
            return false;
        }
        VCCInformation rhs = ((VCCInformation) other);
        return new EqualsBuilder().append(commissionContractQualifier, rhs.commissionContractQualifier).append(earnedCommissionAmount, rhs.earnedCommissionAmount).append(validatingCarrier, rhs.validatingCarrier).append(commissionPercent, rhs.commissionPercent).append(fareComponentBreakdown, rhs.fareComponentBreakdown).append(commissionAmount, rhs.commissionAmount).append(totalAmountIncludingMarkUp, rhs.totalAmountIncludingMarkUp).isEquals();
    }

}

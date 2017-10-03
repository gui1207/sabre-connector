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
    "FareComponentReferenceID",
    "FareComponentCommission",
    "EarnedFareComponentCommission",
    "MethodID",
    "RuleID",
    "RuleFamilyID",
    "ContractID",
    "ContractFamilyID"
})
public class FareComponentBreakdown {

    @JsonProperty("FareComponentReferenceID")
    private Integer fareComponentReferenceID;
    @JsonProperty("FareComponentCommission")
    private Double fareComponentCommission;
    @JsonProperty("EarnedFareComponentCommission")
    private Double earnedFareComponentCommission;
    @JsonProperty("MethodID")
    private Integer methodID;
    @JsonProperty("RuleID")
    private Integer ruleID;
    @JsonProperty("RuleFamilyID")
    private Integer ruleFamilyID;
    @JsonProperty("ContractID")
    private Integer contractID;
    @JsonProperty("ContractFamilyID")
    private Integer contractFamilyID;

    @JsonProperty("FareComponentReferenceID")
    public Integer getFareComponentReferenceID() {
        return fareComponentReferenceID;
    }

    @JsonProperty("FareComponentReferenceID")
    public void setFareComponentReferenceID(Integer fareComponentReferenceID) {
        this.fareComponentReferenceID = fareComponentReferenceID;
    }

    @JsonProperty("FareComponentCommission")
    public Double getFareComponentCommission() {
        return fareComponentCommission;
    }

    @JsonProperty("FareComponentCommission")
    public void setFareComponentCommission(Double fareComponentCommission) {
        this.fareComponentCommission = fareComponentCommission;
    }

    @JsonProperty("EarnedFareComponentCommission")
    public Double getEarnedFareComponentCommission() {
        return earnedFareComponentCommission;
    }

    @JsonProperty("EarnedFareComponentCommission")
    public void setEarnedFareComponentCommission(Double earnedFareComponentCommission) {
        this.earnedFareComponentCommission = earnedFareComponentCommission;
    }

    @JsonProperty("MethodID")
    public Integer getMethodID() {
        return methodID;
    }

    @JsonProperty("MethodID")
    public void setMethodID(Integer methodID) {
        this.methodID = methodID;
    }

    @JsonProperty("RuleID")
    public Integer getRuleID() {
        return ruleID;
    }

    @JsonProperty("RuleID")
    public void setRuleID(Integer ruleID) {
        this.ruleID = ruleID;
    }

    @JsonProperty("RuleFamilyID")
    public Integer getRuleFamilyID() {
        return ruleFamilyID;
    }

    @JsonProperty("RuleFamilyID")
    public void setRuleFamilyID(Integer ruleFamilyID) {
        this.ruleFamilyID = ruleFamilyID;
    }

    @JsonProperty("ContractID")
    public Integer getContractID() {
        return contractID;
    }

    @JsonProperty("ContractID")
    public void setContractID(Integer contractID) {
        this.contractID = contractID;
    }

    @JsonProperty("ContractFamilyID")
    public Integer getContractFamilyID() {
        return contractFamilyID;
    }

    @JsonProperty("ContractFamilyID")
    public void setContractFamilyID(Integer contractFamilyID) {
        this.contractFamilyID = contractFamilyID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareComponentReferenceID", fareComponentReferenceID).append("fareComponentCommission", fareComponentCommission).append("earnedFareComponentCommission", earnedFareComponentCommission).append("methodID", methodID).append("ruleID", ruleID).append("ruleFamilyID", ruleFamilyID).append("contractID", contractID).append("contractFamilyID", contractFamilyID).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareComponentCommission).append(fareComponentReferenceID).append(contractID).append(methodID).append(earnedFareComponentCommission).append(ruleID).append(contractFamilyID).append(ruleFamilyID).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareComponentBreakdown) == false) {
            return false;
        }
        FareComponentBreakdown rhs = ((FareComponentBreakdown) other);
        return new EqualsBuilder().append(fareComponentCommission, rhs.fareComponentCommission).append(fareComponentReferenceID, rhs.fareComponentReferenceID).append(contractID, rhs.contractID).append(methodID, rhs.methodID).append(earnedFareComponentCommission, rhs.earnedFareComponentCommission).append(ruleID, rhs.ruleID).append(contractFamilyID, rhs.contractFamilyID).append(ruleFamilyID, rhs.ruleFamilyID).isEquals();
    }

}

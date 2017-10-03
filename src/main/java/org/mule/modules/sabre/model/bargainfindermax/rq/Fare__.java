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
    "ComponentNo",
    "BasisCode",
    "Amount",
    "Vendor",
    "SourceVendor",
    "Tariff",
    "RuleNumber",
    "BrandID",
    "ProgramID",
    "Adjustment"
})
public class Fare__ {

    @JsonProperty("ComponentNo")
    private Double componentNo;
    @JsonProperty("BasisCode")
    private String basisCode;
    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("Vendor")
    private String vendor;
    @JsonProperty("SourceVendor")
    private String sourceVendor;
    @JsonProperty("Tariff")
    private String tariff;
    @JsonProperty("RuleNumber")
    private String ruleNumber;
    @JsonProperty("BrandID")
    private String brandID;
    @JsonProperty("ProgramID")
    private Integer programID;
    @JsonProperty("Adjustment")
    private Adjustment adjustment;

    @JsonProperty("ComponentNo")
    public Double getComponentNo() {
        return componentNo;
    }

    @JsonProperty("ComponentNo")
    public void setComponentNo(Double componentNo) {
        this.componentNo = componentNo;
    }

    @JsonProperty("BasisCode")
    public String getBasisCode() {
        return basisCode;
    }

    @JsonProperty("BasisCode")
    public void setBasisCode(String basisCode) {
        this.basisCode = basisCode;
    }

    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("Vendor")
    public String getVendor() {
        return vendor;
    }

    @JsonProperty("Vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @JsonProperty("SourceVendor")
    public String getSourceVendor() {
        return sourceVendor;
    }

    @JsonProperty("SourceVendor")
    public void setSourceVendor(String sourceVendor) {
        this.sourceVendor = sourceVendor;
    }

    @JsonProperty("Tariff")
    public String getTariff() {
        return tariff;
    }

    @JsonProperty("Tariff")
    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    @JsonProperty("RuleNumber")
    public String getRuleNumber() {
        return ruleNumber;
    }

    @JsonProperty("RuleNumber")
    public void setRuleNumber(String ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    @JsonProperty("BrandID")
    public String getBrandID() {
        return brandID;
    }

    @JsonProperty("BrandID")
    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    @JsonProperty("ProgramID")
    public Integer getProgramID() {
        return programID;
    }

    @JsonProperty("ProgramID")
    public void setProgramID(Integer programID) {
        this.programID = programID;
    }

    @JsonProperty("Adjustment")
    public Adjustment getAdjustment() {
        return adjustment;
    }

    @JsonProperty("Adjustment")
    public void setAdjustment(Adjustment adjustment) {
        this.adjustment = adjustment;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("componentNo", componentNo).append("basisCode", basisCode).append("amount", amount).append("vendor", vendor).append("sourceVendor", sourceVendor).append("tariff", tariff).append("ruleNumber", ruleNumber).append("brandID", brandID).append("programID", programID).append("adjustment", adjustment).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(componentNo).append(vendor).append(brandID).append(ruleNumber).append(basisCode).append(tariff).append(adjustment).append(sourceVendor).append(programID).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fare__) == false) {
            return false;
        }
        Fare__ rhs = ((Fare__) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(componentNo, rhs.componentNo).append(vendor, rhs.vendor).append(brandID, rhs.brandID).append(ruleNumber, rhs.ruleNumber).append(basisCode, rhs.basisCode).append(tariff, rhs.tariff).append(adjustment, rhs.adjustment).append(sourceVendor, rhs.sourceVendor).append(programID, rhs.programID).isEquals();
    }

}

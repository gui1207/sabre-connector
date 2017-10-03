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
    "VCCInformation",
    "Cat35CommissionPercentage",
    "Cat35CommissionAmount",
    "Cat35MarkupAmount",
    "CommissionAmountInEquivalent",
    "CommissionSource"
})
public class CommissionData {

    @JsonProperty("VCCInformation")
    private List<VCCInformation> vCCInformation = new ArrayList<VCCInformation>();
    @JsonProperty("Cat35CommissionPercentage")
    private Double cat35CommissionPercentage;
    @JsonProperty("Cat35CommissionAmount")
    private Double cat35CommissionAmount;
    @JsonProperty("Cat35MarkupAmount")
    private Double cat35MarkupAmount;
    @JsonProperty("CommissionAmountInEquivalent")
    private Double commissionAmountInEquivalent;
    @JsonProperty("CommissionSource")
    private String commissionSource;

    @JsonProperty("VCCInformation")
    public List<VCCInformation> getVCCInformation() {
        return vCCInformation;
    }

    @JsonProperty("VCCInformation")
    public void setVCCInformation(List<VCCInformation> vCCInformation) {
        this.vCCInformation = vCCInformation;
    }

    @JsonProperty("Cat35CommissionPercentage")
    public Double getCat35CommissionPercentage() {
        return cat35CommissionPercentage;
    }

    @JsonProperty("Cat35CommissionPercentage")
    public void setCat35CommissionPercentage(Double cat35CommissionPercentage) {
        this.cat35CommissionPercentage = cat35CommissionPercentage;
    }

    @JsonProperty("Cat35CommissionAmount")
    public Double getCat35CommissionAmount() {
        return cat35CommissionAmount;
    }

    @JsonProperty("Cat35CommissionAmount")
    public void setCat35CommissionAmount(Double cat35CommissionAmount) {
        this.cat35CommissionAmount = cat35CommissionAmount;
    }

    @JsonProperty("Cat35MarkupAmount")
    public Double getCat35MarkupAmount() {
        return cat35MarkupAmount;
    }

    @JsonProperty("Cat35MarkupAmount")
    public void setCat35MarkupAmount(Double cat35MarkupAmount) {
        this.cat35MarkupAmount = cat35MarkupAmount;
    }

    @JsonProperty("CommissionAmountInEquivalent")
    public Double getCommissionAmountInEquivalent() {
        return commissionAmountInEquivalent;
    }

    @JsonProperty("CommissionAmountInEquivalent")
    public void setCommissionAmountInEquivalent(Double commissionAmountInEquivalent) {
        this.commissionAmountInEquivalent = commissionAmountInEquivalent;
    }

    @JsonProperty("CommissionSource")
    public String getCommissionSource() {
        return commissionSource;
    }

    @JsonProperty("CommissionSource")
    public void setCommissionSource(String commissionSource) {
        this.commissionSource = commissionSource;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vCCInformation", vCCInformation).append("cat35CommissionPercentage", cat35CommissionPercentage).append("cat35CommissionAmount", cat35CommissionAmount).append("cat35MarkupAmount", cat35MarkupAmount).append("commissionAmountInEquivalent", commissionAmountInEquivalent).append("commissionSource", commissionSource).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cat35MarkupAmount).append(vCCInformation).append(cat35CommissionAmount).append(commissionSource).append(cat35CommissionPercentage).append(commissionAmountInEquivalent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommissionData) == false) {
            return false;
        }
        CommissionData rhs = ((CommissionData) other);
        return new EqualsBuilder().append(cat35MarkupAmount, rhs.cat35MarkupAmount).append(vCCInformation, rhs.vCCInformation).append(cat35CommissionAmount, rhs.cat35CommissionAmount).append(commissionSource, rhs.commissionSource).append(cat35CommissionPercentage, rhs.cat35CommissionPercentage).append(commissionAmountInEquivalent, rhs.commissionAmountInEquivalent).isEquals();
    }

}

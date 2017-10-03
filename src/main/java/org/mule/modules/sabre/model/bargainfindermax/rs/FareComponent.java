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
    "BaseFare",
    "EquivFare",
    "Taxes",
    "TotalFare",
    "Segment",
    "HandlingMarkupDetail",
    "FareRetailerRule",
    "BrandFeatureRef",
    "ProgramID",
    "ProgramCode",
    "ProgramDescription",
    "ProgramSystemCode",
    "BrandID",
    "BrandName"
})
public class FareComponent {

    @JsonProperty("BaseFare")
    private BaseFare baseFare;
    @JsonProperty("EquivFare")
    private EquivFare__ equivFare;
    @JsonProperty("Taxes")
    private Taxes__ taxes;
    @JsonProperty("TotalFare")
    private BaseFare totalFare;
    @JsonProperty("Segment")
    private List<Segment> segment = new ArrayList<Segment>();
    @JsonProperty("HandlingMarkupDetail")
    private List<HandlingMarkupDetail> handlingMarkupDetail = new ArrayList<HandlingMarkupDetail>();
    @JsonProperty("FareRetailerRule")
    private List<FareRetailerRule> fareRetailerRule = new ArrayList<FareRetailerRule>();
    @JsonProperty("BrandFeatureRef")
    private List<BrandFeatureRef> brandFeatureRef = new ArrayList<BrandFeatureRef>();
    @JsonProperty("ProgramID")
    private String programID;
    @JsonProperty("ProgramCode")
    private String programCode;
    @JsonProperty("ProgramDescription")
    private String programDescription;
    @JsonProperty("ProgramSystemCode")
    private String programSystemCode;
    @JsonProperty("BrandID")
    private String brandID;
    @JsonProperty("BrandName")
    private String brandName;

    @JsonProperty("BaseFare")
    public BaseFare getBaseFare() {
        return baseFare;
    }

    @JsonProperty("BaseFare")
    public void setBaseFare(BaseFare baseFare) {
        this.baseFare = baseFare;
    }

    @JsonProperty("EquivFare")
    public EquivFare__ getEquivFare() {
        return equivFare;
    }

    @JsonProperty("EquivFare")
    public void setEquivFare(EquivFare__ equivFare) {
        this.equivFare = equivFare;
    }

    @JsonProperty("Taxes")
    public Taxes__ getTaxes() {
        return taxes;
    }

    @JsonProperty("Taxes")
    public void setTaxes(Taxes__ taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("TotalFare")
    public BaseFare getTotalFare() {
        return totalFare;
    }

    @JsonProperty("TotalFare")
    public void setTotalFare(BaseFare totalFare) {
        this.totalFare = totalFare;
    }

    @JsonProperty("Segment")
    public List<Segment> getSegment() {
        return segment;
    }

    @JsonProperty("Segment")
    public void setSegment(List<Segment> segment) {
        this.segment = segment;
    }

    @JsonProperty("HandlingMarkupDetail")
    public List<HandlingMarkupDetail> getHandlingMarkupDetail() {
        return handlingMarkupDetail;
    }

    @JsonProperty("HandlingMarkupDetail")
    public void setHandlingMarkupDetail(List<HandlingMarkupDetail> handlingMarkupDetail) {
        this.handlingMarkupDetail = handlingMarkupDetail;
    }

    @JsonProperty("FareRetailerRule")
    public List<FareRetailerRule> getFareRetailerRule() {
        return fareRetailerRule;
    }

    @JsonProperty("FareRetailerRule")
    public void setFareRetailerRule(List<FareRetailerRule> fareRetailerRule) {
        this.fareRetailerRule = fareRetailerRule;
    }

    @JsonProperty("BrandFeatureRef")
    public List<BrandFeatureRef> getBrandFeatureRef() {
        return brandFeatureRef;
    }

    @JsonProperty("BrandFeatureRef")
    public void setBrandFeatureRef(List<BrandFeatureRef> brandFeatureRef) {
        this.brandFeatureRef = brandFeatureRef;
    }

    @JsonProperty("ProgramID")
    public String getProgramID() {
        return programID;
    }

    @JsonProperty("ProgramID")
    public void setProgramID(String programID) {
        this.programID = programID;
    }

    @JsonProperty("ProgramCode")
    public String getProgramCode() {
        return programCode;
    }

    @JsonProperty("ProgramCode")
    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    @JsonProperty("ProgramDescription")
    public String getProgramDescription() {
        return programDescription;
    }

    @JsonProperty("ProgramDescription")
    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    @JsonProperty("ProgramSystemCode")
    public String getProgramSystemCode() {
        return programSystemCode;
    }

    @JsonProperty("ProgramSystemCode")
    public void setProgramSystemCode(String programSystemCode) {
        this.programSystemCode = programSystemCode;
    }

    @JsonProperty("BrandID")
    public String getBrandID() {
        return brandID;
    }

    @JsonProperty("BrandID")
    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    @JsonProperty("BrandName")
    public String getBrandName() {
        return brandName;
    }

    @JsonProperty("BrandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baseFare", baseFare).append("equivFare", equivFare).append("taxes", taxes).append("totalFare", totalFare).append("segment", segment).append("handlingMarkupDetail", handlingMarkupDetail).append("fareRetailerRule", fareRetailerRule).append("brandFeatureRef", brandFeatureRef).append("programID", programID).append("programCode", programCode).append("programDescription", programDescription).append("programSystemCode", programSystemCode).append("brandID", brandID).append("brandName", brandName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(baseFare).append(totalFare).append(handlingMarkupDetail).append(brandName).append(programCode).append(taxes).append(programSystemCode).append(fareRetailerRule).append(brandFeatureRef).append(equivFare).append(programDescription).append(segment).append(brandID).append(programID).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareComponent) == false) {
            return false;
        }
        FareComponent rhs = ((FareComponent) other);
        return new EqualsBuilder().append(baseFare, rhs.baseFare).append(totalFare, rhs.totalFare).append(handlingMarkupDetail, rhs.handlingMarkupDetail).append(brandName, rhs.brandName).append(programCode, rhs.programCode).append(taxes, rhs.taxes).append(programSystemCode, rhs.programSystemCode).append(fareRetailerRule, rhs.fareRetailerRule).append(brandFeatureRef, rhs.brandFeatureRef).append(equivFare, rhs.equivFare).append(programDescription, rhs.programDescription).append(segment, rhs.segment).append(brandID, rhs.brandID).append(programID, rhs.programID).isEquals();
    }

}

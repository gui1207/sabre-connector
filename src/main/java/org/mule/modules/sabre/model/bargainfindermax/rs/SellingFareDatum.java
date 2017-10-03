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
    "HandlingMarkupSummary",
    "Tax",
    "TaxSummary",
    "LayerTypeName",
    "BaseFareAmount",
    "ConstructedTotalAmount",
    "EquivalentAmount",
    "TotalTaxes",
    "TotalPerPassenger",
    "FareCalculation"
})
public class SellingFareDatum {

    @JsonProperty("HandlingMarkupSummary")
    private List<HandlingMarkupSummary> handlingMarkupSummary = new ArrayList<HandlingMarkupSummary>();
    @JsonProperty("Tax")
    private List<Tax> tax = new ArrayList<Tax>();
    @JsonProperty("TaxSummary")
    private List<TaxSummary> taxSummary = new ArrayList<TaxSummary>();
    @JsonProperty("LayerTypeName")
    private String layerTypeName;
    @JsonProperty("BaseFareAmount")
    private Double baseFareAmount;
    @JsonProperty("ConstructedTotalAmount")
    private Double constructedTotalAmount;
    @JsonProperty("EquivalentAmount")
    private Double equivalentAmount;
    @JsonProperty("TotalTaxes")
    private Double totalTaxes;
    @JsonProperty("TotalPerPassenger")
    private Double totalPerPassenger;
    @JsonProperty("FareCalculation")
    private String fareCalculation;

    @JsonProperty("HandlingMarkupSummary")
    public List<HandlingMarkupSummary> getHandlingMarkupSummary() {
        return handlingMarkupSummary;
    }

    @JsonProperty("HandlingMarkupSummary")
    public void setHandlingMarkupSummary(List<HandlingMarkupSummary> handlingMarkupSummary) {
        this.handlingMarkupSummary = handlingMarkupSummary;
    }

    @JsonProperty("Tax")
    public List<Tax> getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(List<Tax> tax) {
        this.tax = tax;
    }

    @JsonProperty("TaxSummary")
    public List<TaxSummary> getTaxSummary() {
        return taxSummary;
    }

    @JsonProperty("TaxSummary")
    public void setTaxSummary(List<TaxSummary> taxSummary) {
        this.taxSummary = taxSummary;
    }

    @JsonProperty("LayerTypeName")
    public String getLayerTypeName() {
        return layerTypeName;
    }

    @JsonProperty("LayerTypeName")
    public void setLayerTypeName(String layerTypeName) {
        this.layerTypeName = layerTypeName;
    }

    @JsonProperty("BaseFareAmount")
    public Double getBaseFareAmount() {
        return baseFareAmount;
    }

    @JsonProperty("BaseFareAmount")
    public void setBaseFareAmount(Double baseFareAmount) {
        this.baseFareAmount = baseFareAmount;
    }

    @JsonProperty("ConstructedTotalAmount")
    public Double getConstructedTotalAmount() {
        return constructedTotalAmount;
    }

    @JsonProperty("ConstructedTotalAmount")
    public void setConstructedTotalAmount(Double constructedTotalAmount) {
        this.constructedTotalAmount = constructedTotalAmount;
    }

    @JsonProperty("EquivalentAmount")
    public Double getEquivalentAmount() {
        return equivalentAmount;
    }

    @JsonProperty("EquivalentAmount")
    public void setEquivalentAmount(Double equivalentAmount) {
        this.equivalentAmount = equivalentAmount;
    }

    @JsonProperty("TotalTaxes")
    public Double getTotalTaxes() {
        return totalTaxes;
    }

    @JsonProperty("TotalTaxes")
    public void setTotalTaxes(Double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    @JsonProperty("TotalPerPassenger")
    public Double getTotalPerPassenger() {
        return totalPerPassenger;
    }

    @JsonProperty("TotalPerPassenger")
    public void setTotalPerPassenger(Double totalPerPassenger) {
        this.totalPerPassenger = totalPerPassenger;
    }

    @JsonProperty("FareCalculation")
    public String getFareCalculation() {
        return fareCalculation;
    }

    @JsonProperty("FareCalculation")
    public void setFareCalculation(String fareCalculation) {
        this.fareCalculation = fareCalculation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("handlingMarkupSummary", handlingMarkupSummary).append("tax", tax).append("taxSummary", taxSummary).append("layerTypeName", layerTypeName).append("baseFareAmount", baseFareAmount).append("constructedTotalAmount", constructedTotalAmount).append("equivalentAmount", equivalentAmount).append("totalTaxes", totalTaxes).append("totalPerPassenger", totalPerPassenger).append("fareCalculation", fareCalculation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareCalculation).append(totalTaxes).append(baseFareAmount).append(constructedTotalAmount).append(equivalentAmount).append(totalPerPassenger).append(tax).append(taxSummary).append(handlingMarkupSummary).append(layerTypeName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SellingFareDatum) == false) {
            return false;
        }
        SellingFareDatum rhs = ((SellingFareDatum) other);
        return new EqualsBuilder().append(fareCalculation, rhs.fareCalculation).append(totalTaxes, rhs.totalTaxes).append(baseFareAmount, rhs.baseFareAmount).append(constructedTotalAmount, rhs.constructedTotalAmount).append(equivalentAmount, rhs.equivalentAmount).append(totalPerPassenger, rhs.totalPerPassenger).append(tax, rhs.tax).append(taxSummary, rhs.taxSummary).append(handlingMarkupSummary, rhs.handlingMarkupSummary).append(layerTypeName, rhs.layerTypeName).isEquals();
    }

}

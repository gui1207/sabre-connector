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
    "FareComponentsTaxes",
    "LegsTaxes",
    "Tax",
    "TaxSummary",
    "TotalTax"
})
public class Taxes {

    @JsonProperty("FareComponentsTaxes")
    private FareComponentsTaxes fareComponentsTaxes;
    @JsonProperty("LegsTaxes")
    private LegsTaxes legsTaxes;
    @JsonProperty("Tax")
    private List<Tax> tax = new ArrayList<Tax>();
    @JsonProperty("TaxSummary")
    private List<TaxSummary> taxSummary = new ArrayList<TaxSummary>();
    @JsonProperty("TotalTax")
    private BaseFare totalTax;

    @JsonProperty("FareComponentsTaxes")
    public FareComponentsTaxes getFareComponentsTaxes() {
        return fareComponentsTaxes;
    }

    @JsonProperty("FareComponentsTaxes")
    public void setFareComponentsTaxes(FareComponentsTaxes fareComponentsTaxes) {
        this.fareComponentsTaxes = fareComponentsTaxes;
    }

    @JsonProperty("LegsTaxes")
    public LegsTaxes getLegsTaxes() {
        return legsTaxes;
    }

    @JsonProperty("LegsTaxes")
    public void setLegsTaxes(LegsTaxes legsTaxes) {
        this.legsTaxes = legsTaxes;
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

    @JsonProperty("TotalTax")
    public BaseFare getTotalTax() {
        return totalTax;
    }

    @JsonProperty("TotalTax")
    public void setTotalTax(BaseFare totalTax) {
        this.totalTax = totalTax;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareComponentsTaxes", fareComponentsTaxes).append("legsTaxes", legsTaxes).append("tax", tax).append("taxSummary", taxSummary).append("totalTax", totalTax).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalTax).append(tax).append(taxSummary).append(fareComponentsTaxes).append(legsTaxes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Taxes) == false) {
            return false;
        }
        Taxes rhs = ((Taxes) other);
        return new EqualsBuilder().append(totalTax, rhs.totalTax).append(tax, rhs.tax).append(taxSummary, rhs.taxSummary).append(fareComponentsTaxes, rhs.fareComponentsTaxes).append(legsTaxes, rhs.legsTaxes).isEquals();
    }

}

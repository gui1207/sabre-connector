/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

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
    "ExemptAllTaxes",
    "ExemptAllTaxesAndFees",
    "Taxes",
    "ExemptTax",
    "SettlementMethod"
})
public class TPAExtensions______ {

    @JsonProperty("ExemptAllTaxes")
    private ExemptAllTaxes exemptAllTaxes;
    @JsonProperty("ExemptAllTaxesAndFees")
    private ExemptAllTaxesAndFees exemptAllTaxesAndFees;
    @JsonProperty("Taxes")
    private Taxes taxes;
    @JsonProperty("ExemptTax")
    private List<IsRefundable> exemptTax = new ArrayList<IsRefundable>();
    @JsonProperty("SettlementMethod")
    private String settlementMethod;

    @JsonProperty("ExemptAllTaxes")
    public ExemptAllTaxes getExemptAllTaxes() {
        return exemptAllTaxes;
    }

    @JsonProperty("ExemptAllTaxes")
    public void setExemptAllTaxes(ExemptAllTaxes exemptAllTaxes) {
        this.exemptAllTaxes = exemptAllTaxes;
    }

    @JsonProperty("ExemptAllTaxesAndFees")
    public ExemptAllTaxesAndFees getExemptAllTaxesAndFees() {
        return exemptAllTaxesAndFees;
    }

    @JsonProperty("ExemptAllTaxesAndFees")
    public void setExemptAllTaxesAndFees(ExemptAllTaxesAndFees exemptAllTaxesAndFees) {
        this.exemptAllTaxesAndFees = exemptAllTaxesAndFees;
    }

    @JsonProperty("Taxes")
    public Taxes getTaxes() {
        return taxes;
    }

    @JsonProperty("Taxes")
    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("ExemptTax")
    public List<IsRefundable> getExemptTax() {
        return exemptTax;
    }

    @JsonProperty("ExemptTax")
    public void setExemptTax(List<IsRefundable> exemptTax) {
        this.exemptTax = exemptTax;
    }

    @JsonProperty("SettlementMethod")
    public String getSettlementMethod() {
        return settlementMethod;
    }

    @JsonProperty("SettlementMethod")
    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("exemptAllTaxes", exemptAllTaxes).append("exemptAllTaxesAndFees", exemptAllTaxesAndFees).append("taxes", taxes).append("exemptTax", exemptTax).append("settlementMethod", settlementMethod).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(exemptAllTaxesAndFees).append(taxes).append(exemptAllTaxes).append(settlementMethod).append(exemptTax).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions______) == false) {
            return false;
        }
        TPAExtensions______ rhs = ((TPAExtensions______) other);
        return new EqualsBuilder().append(exemptAllTaxesAndFees, rhs.exemptAllTaxesAndFees).append(taxes, rhs.taxes).append(exemptAllTaxes, rhs.exemptAllTaxes).append(settlementMethod, rhs.settlementMethod).append(exemptTax, rhs.exemptTax).isEquals();
    }

}

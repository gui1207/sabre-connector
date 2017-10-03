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
    "FareComponentTaxes"
})
public class FareComponentsTaxes {

    @JsonProperty("FareComponentTaxes")
    private List<FareComponentTax> fareComponentTaxes = new ArrayList<FareComponentTax>();

    @JsonProperty("FareComponentTaxes")
    public List<FareComponentTax> getFareComponentTaxes() {
        return fareComponentTaxes;
    }

    @JsonProperty("FareComponentTaxes")
    public void setFareComponentTaxes(List<FareComponentTax> fareComponentTaxes) {
        this.fareComponentTaxes = fareComponentTaxes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareComponentTaxes", fareComponentTaxes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareComponentTaxes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareComponentsTaxes) == false) {
            return false;
        }
        FareComponentsTaxes rhs = ((FareComponentsTaxes) other);
        return new EqualsBuilder().append(fareComponentTaxes, rhs.fareComponentTaxes).isEquals();
    }

}

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
    "LegTaxes"
})
public class LegsTaxes {

    @JsonProperty("LegTaxes")
    private List<LegTax> legTaxes = new ArrayList<LegTax>();

    @JsonProperty("LegTaxes")
    public List<LegTax> getLegTaxes() {
        return legTaxes;
    }

    @JsonProperty("LegTaxes")
    public void setLegTaxes(List<LegTax> legTaxes) {
        this.legTaxes = legTaxes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("legTaxes", legTaxes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(legTaxes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LegsTaxes) == false) {
            return false;
        }
        LegsTaxes rhs = ((LegsTaxes) other);
        return new EqualsBuilder().append(legTaxes, rhs.legTaxes).isEquals();
    }

}

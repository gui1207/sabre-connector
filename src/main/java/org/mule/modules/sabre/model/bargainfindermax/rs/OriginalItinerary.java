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
    "Taxes"
})
public class OriginalItinerary {

    @JsonProperty("Taxes")
    private List<Tax_> taxes = new ArrayList<Tax_>();

    @JsonProperty("Taxes")
    public List<Tax_> getTaxes() {
        return taxes;
    }

    @JsonProperty("Taxes")
    public void setTaxes(List<Tax_> taxes) {
        this.taxes = taxes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("taxes", taxes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(taxes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginalItinerary) == false) {
            return false;
        }
        OriginalItinerary rhs = ((OriginalItinerary) other);
        return new EqualsBuilder().append(taxes, rhs.taxes).isEquals();
    }

}

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
    "Indicator"
})
public class DivideInParty {

    @JsonProperty("Indicator")
    private Boolean indicator;

    @JsonProperty("Indicator")
    public Boolean getIndicator() {
        return indicator;
    }

    @JsonProperty("Indicator")
    public void setIndicator(Boolean indicator) {
        this.indicator = indicator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("indicator", indicator).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(indicator).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DivideInParty) == false) {
            return false;
        }
        DivideInParty rhs = ((DivideInParty) other);
        return new EqualsBuilder().append(indicator, rhs.indicator).isEquals();
    }

}

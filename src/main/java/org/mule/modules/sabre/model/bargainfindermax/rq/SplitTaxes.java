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
    "ByLeg",
    "ByFareComponent"
})
public class SplitTaxes {

    @JsonProperty("ByLeg")
    private Boolean byLeg;
    @JsonProperty("ByFareComponent")
    private Boolean byFareComponent;

    @JsonProperty("ByLeg")
    public Boolean getByLeg() {
        return byLeg;
    }

    @JsonProperty("ByLeg")
    public void setByLeg(Boolean byLeg) {
        this.byLeg = byLeg;
    }

    @JsonProperty("ByFareComponent")
    public Boolean getByFareComponent() {
        return byFareComponent;
    }

    @JsonProperty("ByFareComponent")
    public void setByFareComponent(Boolean byFareComponent) {
        this.byFareComponent = byFareComponent;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("byLeg", byLeg).append("byFareComponent", byFareComponent).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(byFareComponent).append(byLeg).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SplitTaxes) == false) {
            return false;
        }
        SplitTaxes rhs = ((SplitTaxes) other);
        return new EqualsBuilder().append(byFareComponent, rhs.byFareComponent).append(byLeg, rhs.byLeg).isEquals();
    }

}

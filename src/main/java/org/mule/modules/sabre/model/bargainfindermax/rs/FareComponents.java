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
    "FareComponent"
})
public class FareComponents {

    @JsonProperty("FareComponent")
    private List<FareComponent> fareComponent = new ArrayList<FareComponent>();

    @JsonProperty("FareComponent")
    public List<FareComponent> getFareComponent() {
        return fareComponent;
    }

    @JsonProperty("FareComponent")
    public void setFareComponent(List<FareComponent> fareComponent) {
        this.fareComponent = fareComponent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareComponent", fareComponent).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareComponent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareComponents) == false) {
            return false;
        }
        FareComponents rhs = ((FareComponents) other);
        return new EqualsBuilder().append(fareComponent, rhs.fareComponent).isEquals();
    }

}

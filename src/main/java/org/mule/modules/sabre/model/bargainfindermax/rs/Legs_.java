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
    "Leg"
})
public class Legs_ {

    @JsonProperty("Leg")
    private List<Leg__> leg = new ArrayList<Leg__>();

    @JsonProperty("Leg")
    public List<Leg__> getLeg() {
        return leg;
    }

    @JsonProperty("Leg")
    public void setLeg(List<Leg__> leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("leg", leg).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(leg).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Legs_) == false) {
            return false;
        }
        Legs_ rhs = ((Legs_) other);
        return new EqualsBuilder().append(leg, rhs.leg).isEquals();
    }

}

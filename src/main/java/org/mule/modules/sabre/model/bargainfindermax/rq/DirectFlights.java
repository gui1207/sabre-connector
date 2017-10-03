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
    "Priority",
    "Leg"
})
public class DirectFlights {

    @JsonProperty("Priority")
    private Integer priority;
    @JsonProperty("Leg")
    private Integer leg;

    @JsonProperty("Priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("Priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("Leg")
    public Integer getLeg() {
        return leg;
    }

    @JsonProperty("Leg")
    public void setLeg(Integer leg) {
        this.leg = leg;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("priority", priority).append("leg", leg).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(priority).append(leg).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectFlights) == false) {
            return false;
        }
        DirectFlights rhs = ((DirectFlights) other);
        return new EqualsBuilder().append(priority, rhs.priority).append(leg, rhs.leg).isEquals();
    }

}

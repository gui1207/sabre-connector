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
    "Weight"
})
public class TravelTime {

    @JsonProperty("Weight")
    private Double weight;

    @JsonProperty("Weight")
    public Double getWeight() {
        return weight;
    }

    @JsonProperty("Weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("weight", weight).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(weight).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TravelTime) == false) {
            return false;
        }
        TravelTime rhs = ((TravelTime) other);
        return new EqualsBuilder().append(weight, rhs.weight).isEquals();
    }

}

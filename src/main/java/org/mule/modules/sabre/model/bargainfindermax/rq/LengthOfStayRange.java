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
    "MinDays",
    "MaxDays"
})
public class LengthOfStayRange {

    @JsonProperty("MinDays")
    private Integer minDays;
    @JsonProperty("MaxDays")
    private Integer maxDays;

    @JsonProperty("MinDays")
    public Integer getMinDays() {
        return minDays;
    }

    @JsonProperty("MinDays")
    public void setMinDays(Integer minDays) {
        this.minDays = minDays;
    }

    @JsonProperty("MaxDays")
    public Integer getMaxDays() {
        return maxDays;
    }

    @JsonProperty("MaxDays")
    public void setMaxDays(Integer maxDays) {
        this.maxDays = maxDays;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("minDays", minDays).append("maxDays", maxDays).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(minDays).append(maxDays).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LengthOfStayRange) == false) {
            return false;
        }
        LengthOfStayRange rhs = ((LengthOfStayRange) other);
        return new EqualsBuilder().append(minDays, rhs.minDays).append(maxDays, rhs.maxDays).isEquals();
    }

}

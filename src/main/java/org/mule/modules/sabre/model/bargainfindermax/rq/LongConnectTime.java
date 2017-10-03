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
    "Min",
    "Max",
    "Enable"
})
public class LongConnectTime {

    @JsonProperty("Min")
    private Double min;
    @JsonProperty("Max")
    private Double max;
    @JsonProperty("Enable")
    private Boolean enable;

    @JsonProperty("Min")
    public Double getMin() {
        return min;
    }

    @JsonProperty("Min")
    public void setMin(Double min) {
        this.min = min;
    }

    @JsonProperty("Max")
    public Double getMax() {
        return max;
    }

    @JsonProperty("Max")
    public void setMax(Double max) {
        this.max = max;
    }

    @JsonProperty("Enable")
    public Boolean getEnable() {
        return enable;
    }

    @JsonProperty("Enable")
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("min", min).append("max", max).append("enable", enable).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(min).append(max).append(enable).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LongConnectTime) == false) {
            return false;
        }
        LongConnectTime rhs = ((LongConnectTime) other);
        return new EqualsBuilder().append(min, rhs.min).append(max, rhs.max).append(enable, rhs.enable).isEquals();
    }

}

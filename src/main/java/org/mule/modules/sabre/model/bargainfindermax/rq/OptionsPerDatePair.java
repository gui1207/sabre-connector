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
    "Departure",
    "Return",
    "Min",
    "Max"
})
public class OptionsPerDatePair {

    @JsonProperty("Departure")
    private String departure;
    @JsonProperty("Return")
    private String _return;
    @JsonProperty("Min")
    private Integer min;
    @JsonProperty("Max")
    private Integer max;

    @JsonProperty("Departure")
    public String getDeparture() {
        return departure;
    }

    @JsonProperty("Departure")
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @JsonProperty("Return")
    public String getReturn() {
        return _return;
    }

    @JsonProperty("Return")
    public void setReturn(String _return) {
        this._return = _return;
    }

    @JsonProperty("Min")
    public Integer getMin() {
        return min;
    }

    @JsonProperty("Min")
    public void setMin(Integer min) {
        this.min = min;
    }

    @JsonProperty("Max")
    public Integer getMax() {
        return max;
    }

    @JsonProperty("Max")
    public void setMax(Integer max) {
        this.max = max;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("departure", departure).append("_return", _return).append("min", min).append("max", max).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(_return).append(departure).append(min).append(max).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OptionsPerDatePair) == false) {
            return false;
        }
        OptionsPerDatePair rhs = ((OptionsPerDatePair) other);
        return new EqualsBuilder().append(_return, rhs._return).append(departure, rhs.departure).append(min, rhs.min).append(max, rhs.max).isEquals();
    }

}

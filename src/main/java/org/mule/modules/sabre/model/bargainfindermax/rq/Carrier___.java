/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

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
    "Default",
    "Override",
    "Weight",
    "OnlineIndicator"
})
public class Carrier___ {

    @JsonProperty("Default")
    private Default _default;
    @JsonProperty("Override")
    private List<org.mule.modules.sabre.model.bargainfindermax.rq.Override> override = new ArrayList<org.mule.modules.sabre.model.bargainfindermax.rq.Override>();
    @JsonProperty("Weight")
    private Double weight;
    @JsonProperty("OnlineIndicator")
    private Boolean onlineIndicator;

    @JsonProperty("Default")
    public Default getDefault() {
        return _default;
    }

    @JsonProperty("Default")
    public void setDefault(Default _default) {
        this._default = _default;
    }

    @JsonProperty("Override")
    public List<org.mule.modules.sabre.model.bargainfindermax.rq.Override> getOverride() {
        return override;
    }

    @JsonProperty("Override")
    public void setOverride(List<org.mule.modules.sabre.model.bargainfindermax.rq.Override> override) {
        this.override = override;
    }

    @JsonProperty("Weight")
    public Double getWeight() {
        return weight;
    }

    @JsonProperty("Weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @JsonProperty("OnlineIndicator")
    public Boolean getOnlineIndicator() {
        return onlineIndicator;
    }

    @JsonProperty("OnlineIndicator")
    public void setOnlineIndicator(Boolean onlineIndicator) {
        this.onlineIndicator = onlineIndicator;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("_default", _default).append("override", override).append("weight", weight).append("onlineIndicator", onlineIndicator).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(_default).append(weight).append(override).append(onlineIndicator).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Carrier___) == false) {
            return false;
        }
        Carrier___ rhs = ((Carrier___) other);
        return new EqualsBuilder().append(_default, rhs._default).append(weight, rhs.weight).append(override, rhs.override).append(onlineIndicator, rhs.onlineIndicator).isEquals();
    }

}

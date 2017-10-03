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
    "Range",
    "Direction",
    "Leg",
    "Endpoint"
})
public class Distribution {

    @JsonProperty("Range")
    private List<Range> range = new ArrayList<Range>();
    @JsonProperty("Direction")
    private String direction;
    @JsonProperty("Leg")
    private Integer leg;
    @JsonProperty("Endpoint")
    private String endpoint;

    @JsonProperty("Range")
    public List<Range> getRange() {
        return range;
    }

    @JsonProperty("Range")
    public void setRange(List<Range> range) {
        this.range = range;
    }

    @JsonProperty("Direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("Direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("Leg")
    public Integer getLeg() {
        return leg;
    }

    @JsonProperty("Leg")
    public void setLeg(Integer leg) {
        this.leg = leg;
    }

    @JsonProperty("Endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    @JsonProperty("Endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("range", range).append("direction", direction).append("leg", leg).append("endpoint", endpoint).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(range).append(endpoint).append(direction).append(leg).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Distribution) == false) {
            return false;
        }
        Distribution rhs = ((Distribution) other);
        return new EqualsBuilder().append(range, rhs.range).append(endpoint, rhs.endpoint).append(direction, rhs.direction).append(leg, rhs.leg).isEquals();
    }

}

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
    "ExcludedConnectionBegin",
    "ExcludedConnectionEnd",
    "EnableExcludedConnection"
})
public class ConnectionTime {

    @JsonProperty("Min")
    private Integer min;
    @JsonProperty("Max")
    private Integer max;
    @JsonProperty("ExcludedConnectionBegin")
    private String excludedConnectionBegin;
    @JsonProperty("ExcludedConnectionEnd")
    private String excludedConnectionEnd;
    @JsonProperty("EnableExcludedConnection")
    private Boolean enableExcludedConnection;

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

    @JsonProperty("ExcludedConnectionBegin")
    public String getExcludedConnectionBegin() {
        return excludedConnectionBegin;
    }

    @JsonProperty("ExcludedConnectionBegin")
    public void setExcludedConnectionBegin(String excludedConnectionBegin) {
        this.excludedConnectionBegin = excludedConnectionBegin;
    }

    @JsonProperty("ExcludedConnectionEnd")
    public String getExcludedConnectionEnd() {
        return excludedConnectionEnd;
    }

    @JsonProperty("ExcludedConnectionEnd")
    public void setExcludedConnectionEnd(String excludedConnectionEnd) {
        this.excludedConnectionEnd = excludedConnectionEnd;
    }

    @JsonProperty("EnableExcludedConnection")
    public Boolean getEnableExcludedConnection() {
        return enableExcludedConnection;
    }

    @JsonProperty("EnableExcludedConnection")
    public void setEnableExcludedConnection(Boolean enableExcludedConnection) {
        this.enableExcludedConnection = enableExcludedConnection;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("min", min).append("max", max).append("excludedConnectionBegin", excludedConnectionBegin).append("excludedConnectionEnd", excludedConnectionEnd).append("enableExcludedConnection", enableExcludedConnection).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(min).append(excludedConnectionBegin).append(enableExcludedConnection).append(max).append(excludedConnectionEnd).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionTime) == false) {
            return false;
        }
        ConnectionTime rhs = ((ConnectionTime) other);
        return new EqualsBuilder().append(min, rhs.min).append(excludedConnectionBegin, rhs.excludedConnectionBegin).append(enableExcludedConnection, rhs.enableExcludedConnection).append(max, rhs.max).append(excludedConnectionEnd, rhs.excludedConnectionEnd).isEquals();
    }

}

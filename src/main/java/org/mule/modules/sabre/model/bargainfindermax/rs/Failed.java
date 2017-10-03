/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MinimumConnectTime"
})
public class Failed {

    @JsonProperty("MinimumConnectTime")
    private Boolean minimumConnectTime;

    @JsonProperty("MinimumConnectTime")
    public Boolean getMinimumConnectTime() {
        return minimumConnectTime;
    }

    @JsonProperty("MinimumConnectTime")
    public void setMinimumConnectTime(Boolean minimumConnectTime) {
        this.minimumConnectTime = minimumConnectTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minimumConnectTime", minimumConnectTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minimumConnectTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Failed) == false) {
            return false;
        }
        Failed rhs = ((Failed) other);
        return new EqualsBuilder().append(minimumConnectTime, rhs.minimumConnectTime).isEquals();
    }

}

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
    "ConnectionLocation"
})
public class ConnectionLocations {

    @JsonProperty("ConnectionLocation")
    private List<ConnectionLocation> connectionLocation = new ArrayList<ConnectionLocation>();

    @JsonProperty("ConnectionLocation")
    public List<ConnectionLocation> getConnectionLocation() {
        return connectionLocation;
    }

    @JsonProperty("ConnectionLocation")
    public void setConnectionLocation(List<ConnectionLocation> connectionLocation) {
        this.connectionLocation = connectionLocation;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("connectionLocation", connectionLocation).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectionLocation).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionLocations) == false) {
            return false;
        }
        ConnectionLocations rhs = ((ConnectionLocations) other);
        return new EqualsBuilder().append(connectionLocation, rhs.connectionLocation).isEquals();
    }

}

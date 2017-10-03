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
    "Status",
    "RealStatus"
})
public class Reservation {

    @JsonProperty("Status")
    private String status;
    @JsonProperty("RealStatus")
    private String realStatus;

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("RealStatus")
    public String getRealStatus() {
        return realStatus;
    }

    @JsonProperty("RealStatus")
    public void setRealStatus(String realStatus) {
        this.realStatus = realStatus;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("realStatus", realStatus).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(realStatus).append(status).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reservation) == false) {
            return false;
        }
        Reservation rhs = ((Reservation) other);
        return new EqualsBuilder().append(realStatus, rhs.realStatus).append(status, rhs.status).isEquals();
    }

}

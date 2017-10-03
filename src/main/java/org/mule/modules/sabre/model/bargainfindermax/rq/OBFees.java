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
    "RType",
    "TType"
})
public class OBFees {

    @JsonProperty("RType")
    private Boolean rType;
    @JsonProperty("TType")
    private Boolean tType;

    @JsonProperty("RType")
    public Boolean getRType() {
        return rType;
    }

    @JsonProperty("RType")
    public void setRType(Boolean rType) {
        this.rType = rType;
    }

    @JsonProperty("TType")
    public Boolean getTType() {
        return tType;
    }

    @JsonProperty("TType")
    public void setTType(Boolean tType) {
        this.tType = tType;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("rType", rType).append("tType", tType).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(tType).append(rType).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OBFees) == false) {
            return false;
        }
        OBFees rhs = ((OBFees) other);
        return new EqualsBuilder().append(tType, rhs.tType).append(rType, rhs.rType).isEquals();
    }

}

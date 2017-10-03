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
    "FareOverride"
})
public class FareOverrides {

    @JsonProperty("FareOverride")
    private List<FareOverride> fareOverride = new ArrayList<FareOverride>();

    @JsonProperty("FareOverride")
    public List<FareOverride> getFareOverride() {
        return fareOverride;
    }

    @JsonProperty("FareOverride")
    public void setFareOverride(List<FareOverride> fareOverride) {
        this.fareOverride = fareOverride;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("fareOverride", fareOverride).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareOverride).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareOverrides) == false) {
            return false;
        }
        FareOverrides rhs = ((FareOverrides) other);
        return new EqualsBuilder().append(fareOverride, rhs.fareOverride).isEquals();
    }

}

/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

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
    "FareInfo"
})
public class FareInfos_ {

    @JsonProperty("FareInfo")
    private List<FareInfo_> fareInfo = new ArrayList<FareInfo_>();

    @JsonProperty("FareInfo")
    public List<FareInfo_> getFareInfo() {
        return fareInfo;
    }

    @JsonProperty("FareInfo")
    public void setFareInfo(List<FareInfo_> fareInfo) {
        this.fareInfo = fareInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareInfo", fareInfo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareInfos_) == false) {
            return false;
        }
        FareInfos_ rhs = ((FareInfos_) other);
        return new EqualsBuilder().append(fareInfo, rhs.fareInfo).isEquals();
    }

}

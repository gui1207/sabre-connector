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
    "ReissueInfo"
})
public class ReissueInfoList {

    @JsonProperty("ReissueInfo")
    private List<ReissueInfo> reissueInfo = new ArrayList<ReissueInfo>();

    @JsonProperty("ReissueInfo")
    public List<ReissueInfo> getReissueInfo() {
        return reissueInfo;
    }

    @JsonProperty("ReissueInfo")
    public void setReissueInfo(List<ReissueInfo> reissueInfo) {
        this.reissueInfo = reissueInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("reissueInfo", reissueInfo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(reissueInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReissueInfoList) == false) {
            return false;
        }
        ReissueInfoList rhs = ((ReissueInfoList) other);
        return new EqualsBuilder().append(reissueInfo, rhs.reissueInfo).isEquals();
    }

}

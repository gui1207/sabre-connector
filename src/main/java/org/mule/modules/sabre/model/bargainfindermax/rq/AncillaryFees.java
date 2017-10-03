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
    "AncillaryFeeGroup",
    "Enable",
    "Summary"
})
public class AncillaryFees {

    @JsonProperty("AncillaryFeeGroup")
    private List<AncillaryFeeGroup> ancillaryFeeGroup = new ArrayList<AncillaryFeeGroup>();
    @JsonProperty("Enable")
    private Boolean enable;
    @JsonProperty("Summary")
    private Boolean summary;

    @JsonProperty("AncillaryFeeGroup")
    public List<AncillaryFeeGroup> getAncillaryFeeGroup() {
        return ancillaryFeeGroup;
    }

    @JsonProperty("AncillaryFeeGroup")
    public void setAncillaryFeeGroup(List<AncillaryFeeGroup> ancillaryFeeGroup) {
        this.ancillaryFeeGroup = ancillaryFeeGroup;
    }

    @JsonProperty("Enable")
    public Boolean getEnable() {
        return enable;
    }

    @JsonProperty("Enable")
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @JsonProperty("Summary")
    public Boolean getSummary() {
        return summary;
    }

    @JsonProperty("Summary")
    public void setSummary(Boolean summary) {
        this.summary = summary;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("ancillaryFeeGroup", ancillaryFeeGroup).append("enable", enable).append("summary", summary).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(summary).append(ancillaryFeeGroup).append(enable).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AncillaryFees) == false) {
            return false;
        }
        AncillaryFees rhs = ((AncillaryFees) other);
        return new EqualsBuilder().append(summary, rhs.summary).append(ancillaryFeeGroup, rhs.ancillaryFeeGroup).append(enable, rhs.enable).isEquals();
    }

}

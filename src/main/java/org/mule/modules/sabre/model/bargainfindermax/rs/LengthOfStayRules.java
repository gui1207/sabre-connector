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
    "MinimumStay",
    "MaximumStay",
    "StayRestrictionsInd"
})
public class LengthOfStayRules {

    @JsonProperty("MinimumStay")
    private MinimumStay minimumStay;
    @JsonProperty("MaximumStay")
    private MaximumStay maximumStay;
    @JsonProperty("StayRestrictionsInd")
    private Boolean stayRestrictionsInd;

    @JsonProperty("MinimumStay")
    public MinimumStay getMinimumStay() {
        return minimumStay;
    }

    @JsonProperty("MinimumStay")
    public void setMinimumStay(MinimumStay minimumStay) {
        this.minimumStay = minimumStay;
    }

    @JsonProperty("MaximumStay")
    public MaximumStay getMaximumStay() {
        return maximumStay;
    }

    @JsonProperty("MaximumStay")
    public void setMaximumStay(MaximumStay maximumStay) {
        this.maximumStay = maximumStay;
    }

    @JsonProperty("StayRestrictionsInd")
    public Boolean getStayRestrictionsInd() {
        return stayRestrictionsInd;
    }

    @JsonProperty("StayRestrictionsInd")
    public void setStayRestrictionsInd(Boolean stayRestrictionsInd) {
        this.stayRestrictionsInd = stayRestrictionsInd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minimumStay", minimumStay).append("maximumStay", maximumStay).append("stayRestrictionsInd", stayRestrictionsInd).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maximumStay).append(minimumStay).append(stayRestrictionsInd).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LengthOfStayRules) == false) {
            return false;
        }
        LengthOfStayRules rhs = ((LengthOfStayRules) other);
        return new EqualsBuilder().append(maximumStay, rhs.maximumStay).append(minimumStay, rhs.minimumStay).append(stayRestrictionsInd, rhs.stayRestrictionsInd).isEquals();
    }

}

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
    "SellingLevelRules",
    "ShowFareAmounts"
})
public class SellingLevels {

    @JsonProperty("SellingLevelRules")
    private SellingLevelRules sellingLevelRules;
    @JsonProperty("ShowFareAmounts")
    private ShowFareAmounts showFareAmounts;

    @JsonProperty("SellingLevelRules")
    public SellingLevelRules getSellingLevelRules() {
        return sellingLevelRules;
    }

    @JsonProperty("SellingLevelRules")
    public void setSellingLevelRules(SellingLevelRules sellingLevelRules) {
        this.sellingLevelRules = sellingLevelRules;
    }

    @JsonProperty("ShowFareAmounts")
    public ShowFareAmounts getShowFareAmounts() {
        return showFareAmounts;
    }

    @JsonProperty("ShowFareAmounts")
    public void setShowFareAmounts(ShowFareAmounts showFareAmounts) {
        this.showFareAmounts = showFareAmounts;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("sellingLevelRules", sellingLevelRules).append("showFareAmounts", showFareAmounts).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(sellingLevelRules).append(showFareAmounts).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SellingLevels) == false) {
            return false;
        }
        SellingLevels rhs = ((SellingLevels) other);
        return new EqualsBuilder().append(sellingLevelRules, rhs.sellingLevelRules).append(showFareAmounts, rhs.showFareAmounts).isEquals();
    }

}

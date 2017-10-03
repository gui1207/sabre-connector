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
    "RetailerRule",
    "Force"
})
public class RetailerRules {

    @JsonProperty("RetailerRule")
    private List<RetailerRule> retailerRule = new ArrayList<RetailerRule>();
    @JsonProperty("Force")
    private Boolean force;

    @JsonProperty("RetailerRule")
    public List<RetailerRule> getRetailerRule() {
        return retailerRule;
    }

    @JsonProperty("RetailerRule")
    public void setRetailerRule(List<RetailerRule> retailerRule) {
        this.retailerRule = retailerRule;
    }

    @JsonProperty("Force")
    public Boolean getForce() {
        return force;
    }

    @JsonProperty("Force")
    public void setForce(Boolean force) {
        this.force = force;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("retailerRule", retailerRule).append("force", force).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(retailerRule).append(force).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RetailerRules) == false) {
            return false;
        }
        RetailerRules rhs = ((RetailerRules) other);
        return new EqualsBuilder().append(retailerRule, rhs.retailerRule).append(force, rhs.force).isEquals();
    }

}

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
    "ResTicketingRules",
    "LengthOfStayRules"
})
public class RuleInfo {

    @JsonProperty("ResTicketingRules")
    private ResTicketingRules resTicketingRules;
    @JsonProperty("LengthOfStayRules")
    private LengthOfStayRules lengthOfStayRules;

    @JsonProperty("ResTicketingRules")
    public ResTicketingRules getResTicketingRules() {
        return resTicketingRules;
    }

    @JsonProperty("ResTicketingRules")
    public void setResTicketingRules(ResTicketingRules resTicketingRules) {
        this.resTicketingRules = resTicketingRules;
    }

    @JsonProperty("LengthOfStayRules")
    public LengthOfStayRules getLengthOfStayRules() {
        return lengthOfStayRules;
    }

    @JsonProperty("LengthOfStayRules")
    public void setLengthOfStayRules(LengthOfStayRules lengthOfStayRules) {
        this.lengthOfStayRules = lengthOfStayRules;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("resTicketingRules", resTicketingRules).append("lengthOfStayRules", lengthOfStayRules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(resTicketingRules).append(lengthOfStayRules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleInfo) == false) {
            return false;
        }
        RuleInfo rhs = ((RuleInfo) other);
        return new EqualsBuilder().append(resTicketingRules, rhs.resTicketingRules).append(lengthOfStayRules, rhs.lengthOfStayRules).isEquals();
    }

}

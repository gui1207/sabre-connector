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
    "CommissionCodeQualifier"
})
public class CommissionCodeQualifiers {

    @JsonProperty("CommissionCodeQualifier")
    private List<CommissionCodeQualifier> commissionCodeQualifier = new ArrayList<CommissionCodeQualifier>();

    @JsonProperty("CommissionCodeQualifier")
    public List<CommissionCodeQualifier> getCommissionCodeQualifier() {
        return commissionCodeQualifier;
    }

    @JsonProperty("CommissionCodeQualifier")
    public void setCommissionCodeQualifier(List<CommissionCodeQualifier> commissionCodeQualifier) {
        this.commissionCodeQualifier = commissionCodeQualifier;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("commissionCodeQualifier", commissionCodeQualifier).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(commissionCodeQualifier).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommissionCodeQualifiers) == false) {
            return false;
        }
        CommissionCodeQualifiers rhs = ((CommissionCodeQualifiers) other);
        return new EqualsBuilder().append(commissionCodeQualifier, rhs.commissionCodeQualifier).isEquals();
    }

}

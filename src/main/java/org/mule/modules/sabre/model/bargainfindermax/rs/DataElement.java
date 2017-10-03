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
    "SubjectToGovernmentApproval"
})
public class DataElement {

    @JsonProperty("SubjectToGovernmentApproval")
    private Boolean subjectToGovernmentApproval;

    @JsonProperty("SubjectToGovernmentApproval")
    public Boolean getSubjectToGovernmentApproval() {
        return subjectToGovernmentApproval;
    }

    @JsonProperty("SubjectToGovernmentApproval")
    public void setSubjectToGovernmentApproval(Boolean subjectToGovernmentApproval) {
        this.subjectToGovernmentApproval = subjectToGovernmentApproval;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("subjectToGovernmentApproval", subjectToGovernmentApproval).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subjectToGovernmentApproval).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataElement) == false) {
            return false;
        }
        DataElement rhs = ((DataElement) other);
        return new EqualsBuilder().append(subjectToGovernmentApproval, rhs.subjectToGovernmentApproval).isEquals();
    }

}

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
    "GroupNumber",
    "PrimaryGroup"
})
public class MultipleTravelerGroups {

    @JsonProperty("GroupNumber")
    private Integer groupNumber;
    @JsonProperty("PrimaryGroup")
    private Boolean primaryGroup;

    @JsonProperty("GroupNumber")
    public Integer getGroupNumber() {
        return groupNumber;
    }

    @JsonProperty("GroupNumber")
    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    @JsonProperty("PrimaryGroup")
    public Boolean getPrimaryGroup() {
        return primaryGroup;
    }

    @JsonProperty("PrimaryGroup")
    public void setPrimaryGroup(Boolean primaryGroup) {
        this.primaryGroup = primaryGroup;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupNumber", groupNumber).append("primaryGroup", primaryGroup).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupNumber).append(primaryGroup).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MultipleTravelerGroups) == false) {
            return false;
        }
        MultipleTravelerGroups rhs = ((MultipleTravelerGroups) other);
        return new EqualsBuilder().append(groupNumber, rhs.groupNumber).append(primaryGroup, rhs.primaryGroup).isEquals();
    }

}

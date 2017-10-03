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
    "Partition",
    "Group"
})
public class Partitions {

    @JsonProperty("Partition")
    private List<Partition> partition = new ArrayList<Partition>();
    @JsonProperty("Group")
    private List<Group> group = new ArrayList<Group>();

    @JsonProperty("Partition")
    public List<Partition> getPartition() {
        return partition;
    }

    @JsonProperty("Partition")
    public void setPartition(List<Partition> partition) {
        this.partition = partition;
    }

    @JsonProperty("Group")
    public List<Group> getGroup() {
        return group;
    }

    @JsonProperty("Group")
    public void setGroup(List<Group> group) {
        this.group = group;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("partition", partition).append("group", group).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(partition).append(group).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Partitions) == false) {
            return false;
        }
        Partitions rhs = ((Partitions) other);
        return new EqualsBuilder().append(partition, rhs.partition).append(group, rhs.group).isEquals();
    }

}

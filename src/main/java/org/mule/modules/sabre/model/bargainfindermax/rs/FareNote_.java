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
    "FareTypeName",
    "PriorityLevel",
    "ContentID"
})
public class FareNote_ {

    @JsonProperty("FareTypeName")
    private String fareTypeName;
    @JsonProperty("PriorityLevel")
    private Integer priorityLevel;
    @JsonProperty("ContentID")
    private String contentID;

    @JsonProperty("FareTypeName")
    public String getFareTypeName() {
        return fareTypeName;
    }

    @JsonProperty("FareTypeName")
    public void setFareTypeName(String fareTypeName) {
        this.fareTypeName = fareTypeName;
    }

    @JsonProperty("PriorityLevel")
    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    @JsonProperty("PriorityLevel")
    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @JsonProperty("ContentID")
    public String getContentID() {
        return contentID;
    }

    @JsonProperty("ContentID")
    public void setContentID(String contentID) {
        this.contentID = contentID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareTypeName", fareTypeName).append("priorityLevel", priorityLevel).append("contentID", contentID).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareTypeName).append(contentID).append(priorityLevel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareNote_) == false) {
            return false;
        }
        FareNote_ rhs = ((FareNote_) other);
        return new EqualsBuilder().append(fareTypeName, rhs.fareTypeName).append(contentID, rhs.contentID).append(priorityLevel, rhs.priorityLevel).isEquals();
    }

}

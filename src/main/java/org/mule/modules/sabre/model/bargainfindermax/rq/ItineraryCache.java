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
    "PublicTimeToLive",
    "RemovePreviousOnUpdate"
})
public class ItineraryCache {

    @JsonProperty("PublicTimeToLive")
    private Double publicTimeToLive;
    @JsonProperty("RemovePreviousOnUpdate")
    private Boolean removePreviousOnUpdate;

    @JsonProperty("PublicTimeToLive")
    public Double getPublicTimeToLive() {
        return publicTimeToLive;
    }

    @JsonProperty("PublicTimeToLive")
    public void setPublicTimeToLive(Double publicTimeToLive) {
        this.publicTimeToLive = publicTimeToLive;
    }

    @JsonProperty("RemovePreviousOnUpdate")
    public Boolean getRemovePreviousOnUpdate() {
        return removePreviousOnUpdate;
    }

    @JsonProperty("RemovePreviousOnUpdate")
    public void setRemovePreviousOnUpdate(Boolean removePreviousOnUpdate) {
        this.removePreviousOnUpdate = removePreviousOnUpdate;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("publicTimeToLive", publicTimeToLive).append("removePreviousOnUpdate", removePreviousOnUpdate).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(publicTimeToLive).append(removePreviousOnUpdate).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItineraryCache) == false) {
            return false;
        }
        ItineraryCache rhs = ((ItineraryCache) other);
        return new EqualsBuilder().append(publicTimeToLive, rhs.publicTimeToLive).append(removePreviousOnUpdate, rhs.removePreviousOnUpdate).isEquals();
    }

}

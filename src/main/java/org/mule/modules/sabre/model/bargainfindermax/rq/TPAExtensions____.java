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
    "TravelerRating"
})
public class TPAExtensions____ {

    @JsonProperty("TravelerRating")
    private List<TravelerRating> travelerRating = new ArrayList<TravelerRating>();

    @JsonProperty("TravelerRating")
    public List<TravelerRating> getTravelerRating() {
        return travelerRating;
    }

    @JsonProperty("TravelerRating")
    public void setTravelerRating(List<TravelerRating> travelerRating) {
        this.travelerRating = travelerRating;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("travelerRating", travelerRating).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(travelerRating).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions____) == false) {
            return false;
        }
        TPAExtensions____ rhs = ((TPAExtensions____) other);
        return new EqualsBuilder().append(travelerRating, rhs.travelerRating).isEquals();
    }

}

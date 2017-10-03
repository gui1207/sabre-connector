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
    "LowFareBucket",
    "Dimensions"
})
public class DiversityControl {

    @JsonProperty("LowFareBucket")
    private LowFareBucket lowFareBucket;
    @JsonProperty("Dimensions")
    private Dimensions dimensions;

    @JsonProperty("LowFareBucket")
    public LowFareBucket getLowFareBucket() {
        return lowFareBucket;
    }

    @JsonProperty("LowFareBucket")
    public void setLowFareBucket(LowFareBucket lowFareBucket) {
        this.lowFareBucket = lowFareBucket;
    }

    @JsonProperty("Dimensions")
    public Dimensions getDimensions() {
        return dimensions;
    }

    @JsonProperty("Dimensions")
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("lowFareBucket", lowFareBucket).append("dimensions", dimensions).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(lowFareBucket).append(dimensions).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiversityControl) == false) {
            return false;
        }
        DiversityControl rhs = ((DiversityControl) other);
        return new EqualsBuilder().append(lowFareBucket, rhs.lowFareBucket).append(dimensions, rhs.dimensions).isEquals();
    }

}

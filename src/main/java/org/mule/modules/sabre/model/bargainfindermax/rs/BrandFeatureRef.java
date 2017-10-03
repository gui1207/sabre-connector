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
    "FeatureId"
})
public class BrandFeatureRef {

    @JsonProperty("FeatureId")
    private Integer featureId;

    @JsonProperty("FeatureId")
    public Integer getFeatureId() {
        return featureId;
    }

    @JsonProperty("FeatureId")
    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("featureId", featureId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(featureId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BrandFeatureRef) == false) {
            return false;
        }
        BrandFeatureRef rhs = ((BrandFeatureRef) other);
        return new EqualsBuilder().append(featureId, rhs.featureId).isEquals();
    }

}

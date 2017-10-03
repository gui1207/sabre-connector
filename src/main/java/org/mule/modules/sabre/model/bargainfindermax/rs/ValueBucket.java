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
    "PriceTimeValueRank",
    "ValueBucketNumber"
})
public class ValueBucket {

    @JsonProperty("PriceTimeValueRank")
    private Double priceTimeValueRank;
    @JsonProperty("ValueBucketNumber")
    private Integer valueBucketNumber;

    @JsonProperty("PriceTimeValueRank")
    public Double getPriceTimeValueRank() {
        return priceTimeValueRank;
    }

    @JsonProperty("PriceTimeValueRank")
    public void setPriceTimeValueRank(Double priceTimeValueRank) {
        this.priceTimeValueRank = priceTimeValueRank;
    }

    @JsonProperty("ValueBucketNumber")
    public Integer getValueBucketNumber() {
        return valueBucketNumber;
    }

    @JsonProperty("ValueBucketNumber")
    public void setValueBucketNumber(Integer valueBucketNumber) {
        this.valueBucketNumber = valueBucketNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("priceTimeValueRank", priceTimeValueRank).append("valueBucketNumber", valueBucketNumber).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(priceTimeValueRank).append(valueBucketNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValueBucket) == false) {
            return false;
        }
        ValueBucket rhs = ((ValueBucket) other);
        return new EqualsBuilder().append(priceTimeValueRank, rhs.priceTimeValueRank).append(valueBucketNumber, rhs.valueBucketNumber).isEquals();
    }

}

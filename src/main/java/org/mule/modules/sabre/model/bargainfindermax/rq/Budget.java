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
    "MinimumPrice",
    "MaximumPrice",
    "RelativePriceThreshold"
})
public class Budget {

    @JsonProperty("MinimumPrice")
    private String minimumPrice;
    @JsonProperty("MaximumPrice")
    private String maximumPrice;
    @JsonProperty("RelativePriceThreshold")
    private String relativePriceThreshold;

    @JsonProperty("MinimumPrice")
    public String getMinimumPrice() {
        return minimumPrice;
    }

    @JsonProperty("MinimumPrice")
    public void setMinimumPrice(String minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    @JsonProperty("MaximumPrice")
    public String getMaximumPrice() {
        return maximumPrice;
    }

    @JsonProperty("MaximumPrice")
    public void setMaximumPrice(String maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    @JsonProperty("RelativePriceThreshold")
    public String getRelativePriceThreshold() {
        return relativePriceThreshold;
    }

    @JsonProperty("RelativePriceThreshold")
    public void setRelativePriceThreshold(String relativePriceThreshold) {
        this.relativePriceThreshold = relativePriceThreshold;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("minimumPrice", minimumPrice).append("maximumPrice", maximumPrice).append("relativePriceThreshold", relativePriceThreshold).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(minimumPrice).append(relativePriceThreshold).append(maximumPrice).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Budget) == false) {
            return false;
        }
        Budget rhs = ((Budget) other);
        return new EqualsBuilder().append(minimumPrice, rhs.minimumPrice).append(relativePriceThreshold, rhs.relativePriceThreshold).append(maximumPrice, rhs.maximumPrice).isEquals();
    }

}

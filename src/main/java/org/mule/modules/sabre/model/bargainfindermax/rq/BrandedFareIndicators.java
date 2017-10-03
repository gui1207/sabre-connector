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
    "ReturnCheapestUnbrandedFare",
    "SingleBrandedFare",
    "MultipleBrandedFares",
    "ReturnBrandAncillaries"
})
public class BrandedFareIndicators {

    @JsonProperty("ReturnCheapestUnbrandedFare")
    private ReturnCheapestUnbrandedFare returnCheapestUnbrandedFare;
    @JsonProperty("SingleBrandedFare")
    private Boolean singleBrandedFare;
    @JsonProperty("MultipleBrandedFares")
    private Boolean multipleBrandedFares;
    @JsonProperty("ReturnBrandAncillaries")
    private Boolean returnBrandAncillaries;

    @JsonProperty("ReturnCheapestUnbrandedFare")
    public ReturnCheapestUnbrandedFare getReturnCheapestUnbrandedFare() {
        return returnCheapestUnbrandedFare;
    }

    @JsonProperty("ReturnCheapestUnbrandedFare")
    public void setReturnCheapestUnbrandedFare(ReturnCheapestUnbrandedFare returnCheapestUnbrandedFare) {
        this.returnCheapestUnbrandedFare = returnCheapestUnbrandedFare;
    }

    @JsonProperty("SingleBrandedFare")
    public Boolean getSingleBrandedFare() {
        return singleBrandedFare;
    }

    @JsonProperty("SingleBrandedFare")
    public void setSingleBrandedFare(Boolean singleBrandedFare) {
        this.singleBrandedFare = singleBrandedFare;
    }

    @JsonProperty("MultipleBrandedFares")
    public Boolean getMultipleBrandedFares() {
        return multipleBrandedFares;
    }

    @JsonProperty("MultipleBrandedFares")
    public void setMultipleBrandedFares(Boolean multipleBrandedFares) {
        this.multipleBrandedFares = multipleBrandedFares;
    }

    @JsonProperty("ReturnBrandAncillaries")
    public Boolean getReturnBrandAncillaries() {
        return returnBrandAncillaries;
    }

    @JsonProperty("ReturnBrandAncillaries")
    public void setReturnBrandAncillaries(Boolean returnBrandAncillaries) {
        this.returnBrandAncillaries = returnBrandAncillaries;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("returnCheapestUnbrandedFare", returnCheapestUnbrandedFare).append("singleBrandedFare", singleBrandedFare).append("multipleBrandedFares", multipleBrandedFares).append("returnBrandAncillaries", returnBrandAncillaries).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(multipleBrandedFares).append(returnBrandAncillaries).append(singleBrandedFare).append(returnCheapestUnbrandedFare).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BrandedFareIndicators) == false) {
            return false;
        }
        BrandedFareIndicators rhs = ((BrandedFareIndicators) other);
        return new EqualsBuilder().append(multipleBrandedFares, rhs.multipleBrandedFares).append(returnBrandAncillaries, rhs.returnBrandAncillaries).append(singleBrandedFare, rhs.singleBrandedFare).append(returnCheapestUnbrandedFare, rhs.returnCheapestUnbrandedFare).isEquals();
    }

}

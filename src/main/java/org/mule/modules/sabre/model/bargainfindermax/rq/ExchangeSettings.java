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
    "RepriceCurrentItin",
    "AttachExchangeInfo",
    "ReissueExchange",
    "BrandedResults",
    "MIPTimeoutThreshold",
    "RequestType"
})
public class ExchangeSettings {

    @JsonProperty("RepriceCurrentItin")
    private Boolean repriceCurrentItin;
    @JsonProperty("AttachExchangeInfo")
    private Boolean attachExchangeInfo;
    @JsonProperty("ReissueExchange")
    private String reissueExchange;
    @JsonProperty("BrandedResults")
    private Boolean brandedResults;
    @JsonProperty("MIPTimeoutThreshold")
    private Double mIPTimeoutThreshold;
    @JsonProperty("RequestType")
    private String requestType;

    @JsonProperty("RepriceCurrentItin")
    public Boolean getRepriceCurrentItin() {
        return repriceCurrentItin;
    }

    @JsonProperty("RepriceCurrentItin")
    public void setRepriceCurrentItin(Boolean repriceCurrentItin) {
        this.repriceCurrentItin = repriceCurrentItin;
    }

    @JsonProperty("AttachExchangeInfo")
    public Boolean getAttachExchangeInfo() {
        return attachExchangeInfo;
    }

    @JsonProperty("AttachExchangeInfo")
    public void setAttachExchangeInfo(Boolean attachExchangeInfo) {
        this.attachExchangeInfo = attachExchangeInfo;
    }

    @JsonProperty("ReissueExchange")
    public String getReissueExchange() {
        return reissueExchange;
    }

    @JsonProperty("ReissueExchange")
    public void setReissueExchange(String reissueExchange) {
        this.reissueExchange = reissueExchange;
    }

    @JsonProperty("BrandedResults")
    public Boolean getBrandedResults() {
        return brandedResults;
    }

    @JsonProperty("BrandedResults")
    public void setBrandedResults(Boolean brandedResults) {
        this.brandedResults = brandedResults;
    }

    @JsonProperty("MIPTimeoutThreshold")
    public Double getMIPTimeoutThreshold() {
        return mIPTimeoutThreshold;
    }

    @JsonProperty("MIPTimeoutThreshold")
    public void setMIPTimeoutThreshold(Double mIPTimeoutThreshold) {
        this.mIPTimeoutThreshold = mIPTimeoutThreshold;
    }

    @JsonProperty("RequestType")
    public String getRequestType() {
        return requestType;
    }

    @JsonProperty("RequestType")
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("repriceCurrentItin", repriceCurrentItin).append("attachExchangeInfo", attachExchangeInfo).append("reissueExchange", reissueExchange).append("brandedResults", brandedResults).append("mIPTimeoutThreshold", mIPTimeoutThreshold).append("requestType", requestType).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(mIPTimeoutThreshold).append(requestType).append(repriceCurrentItin).append(reissueExchange).append(brandedResults).append(attachExchangeInfo).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExchangeSettings) == false) {
            return false;
        }
        ExchangeSettings rhs = ((ExchangeSettings) other);
        return new EqualsBuilder().append(mIPTimeoutThreshold, rhs.mIPTimeoutThreshold).append(requestType, rhs.requestType).append(repriceCurrentItin, rhs.repriceCurrentItin).append(reissueExchange, rhs.reissueExchange).append(brandedResults, rhs.brandedResults).append(attachExchangeInfo, rhs.attachExchangeInfo).isEquals();
    }

}

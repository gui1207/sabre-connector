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
    "Code",
    "Count"
})
public class AncillaryFeeGroup {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Count")
    private String count;

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("Count")
    public String getCount() {
        return count;
    }

    @JsonProperty("Count")
    public void setCount(String count) {
        this.count = count;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("count", count).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(code).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AncillaryFeeGroup) == false) {
            return false;
        }
        AncillaryFeeGroup rhs = ((AncillaryFeeGroup) other);
        return new EqualsBuilder().append(count, rhs.count).append(code, rhs.code).isEquals();
    }

}

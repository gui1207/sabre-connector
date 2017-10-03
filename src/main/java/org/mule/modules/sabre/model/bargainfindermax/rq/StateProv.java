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
    "content",
    "StateCode"
})
public class StateProv {

    @JsonProperty("content")
    private String content;
    @JsonProperty("StateCode")
    private String stateCode;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("StateCode")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("StateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("stateCode", stateCode).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(content).append(stateCode).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StateProv) == false) {
            return false;
        }
        StateProv rhs = ((StateProv) other);
        return new EqualsBuilder().append(content, rhs.content).append(stateCode, rhs.stateCode).isEquals();
    }

}

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
    "Options"
})
public class Override {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Options")
    private String options;

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("Options")
    public String getOptions() {
        return options;
    }

    @JsonProperty("Options")
    public void setOptions(String options) {
        this.options = options;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("options", options).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(options).append(code).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Override) == false) {
            return false;
        }
        Override rhs = ((Override) other);
        return new EqualsBuilder().append(options, rhs.options).append(code, rhs.code).isEquals();
    }

}

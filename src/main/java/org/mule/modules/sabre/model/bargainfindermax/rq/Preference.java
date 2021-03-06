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
    "Level"
})
public class Preference {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Level")
    private String level;

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("Level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("Level")
    public void setLevel(String level) {
        this.level = level;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("level", level).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(level).append(code).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Preference) == false) {
            return false;
        }
        Preference rhs = ((Preference) other);
        return new EqualsBuilder().append(level, rhs.level).append(code, rhs.code).isEquals();
    }

}

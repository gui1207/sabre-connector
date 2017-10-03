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
    "Level"
})
public class SpanishFamilyDiscount {

    @JsonProperty("Level")
    private Double level;

    @JsonProperty("Level")
    public Double getLevel() {
        return level;
    }

    @JsonProperty("Level")
    public void setLevel(Double level) {
        this.level = level;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("level", level).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(level).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpanishFamilyDiscount) == false) {
            return false;
        }
        SpanishFamilyDiscount rhs = ((SpanishFamilyDiscount) other);
        return new EqualsBuilder().append(level, rhs.level).isEquals();
    }

}

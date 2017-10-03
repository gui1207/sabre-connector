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
    "Number",
    "BelowMin"
})
public class SeatsRemaining_ {

    @JsonProperty("Number")
    private Integer number;
    @JsonProperty("BelowMin")
    private Boolean belowMin;

    @JsonProperty("Number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("BelowMin")
    public Boolean getBelowMin() {
        return belowMin;
    }

    @JsonProperty("BelowMin")
    public void setBelowMin(Boolean belowMin) {
        this.belowMin = belowMin;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("number", number).append("belowMin", belowMin).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(number).append(belowMin).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeatsRemaining_) == false) {
            return false;
        }
        SeatsRemaining_ rhs = ((SeatsRemaining_) other);
        return new EqualsBuilder().append(number, rhs.number).append(belowMin, rhs.belowMin).isEquals();
    }

}

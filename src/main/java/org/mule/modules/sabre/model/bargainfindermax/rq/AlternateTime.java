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
    "PlusMinus",
    "Plus",
    "Minus"
})
public class AlternateTime {

    @JsonProperty("PlusMinus")
    private Integer plusMinus;
    @JsonProperty("Plus")
    private Integer plus;
    @JsonProperty("Minus")
    private Integer minus;

    @JsonProperty("PlusMinus")
    public Integer getPlusMinus() {
        return plusMinus;
    }

    @JsonProperty("PlusMinus")
    public void setPlusMinus(Integer plusMinus) {
        this.plusMinus = plusMinus;
    }

    @JsonProperty("Plus")
    public Integer getPlus() {
        return plus;
    }

    @JsonProperty("Plus")
    public void setPlus(Integer plus) {
        this.plus = plus;
    }

    @JsonProperty("Minus")
    public Integer getMinus() {
        return minus;
    }

    @JsonProperty("Minus")
    public void setMinus(Integer minus) {
        this.minus = minus;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("plusMinus", plusMinus).append("plus", plus).append("minus", minus).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(minus).append(plusMinus).append(plus).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlternateTime) == false) {
            return false;
        }
        AlternateTime rhs = ((AlternateTime) other);
        return new EqualsBuilder().append(minus, rhs.minus).append(plusMinus, rhs.plusMinus).append(plus, rhs.plus).isEquals();
    }

}

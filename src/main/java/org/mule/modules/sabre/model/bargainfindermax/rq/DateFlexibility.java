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
    "NbrOfDays",
    "Plus",
    "Minus",
    "Validate"
})
public class DateFlexibility {

    @JsonProperty("NbrOfDays")
    private Integer nbrOfDays;
    @JsonProperty("Plus")
    private Integer plus;
    @JsonProperty("Minus")
    private Integer minus;
    @JsonProperty("Validate")
    private Boolean validate;

    @JsonProperty("NbrOfDays")
    public Integer getNbrOfDays() {
        return nbrOfDays;
    }

    @JsonProperty("NbrOfDays")
    public void setNbrOfDays(Integer nbrOfDays) {
        this.nbrOfDays = nbrOfDays;
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

    @JsonProperty("Validate")
    public Boolean getValidate() {
        return validate;
    }

    @JsonProperty("Validate")
    public void setValidate(Boolean validate) {
        this.validate = validate;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("nbrOfDays", nbrOfDays).append("plus", plus).append("minus", minus).append("validate", validate).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(nbrOfDays).append(minus).append(plus).append(validate).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DateFlexibility) == false) {
            return false;
        }
        DateFlexibility rhs = ((DateFlexibility) other);
        return new EqualsBuilder().append(nbrOfDays, rhs.nbrOfDays).append(minus, rhs.minus).append(plus, rhs.plus).append(validate, rhs.validate).isEquals();
    }

}

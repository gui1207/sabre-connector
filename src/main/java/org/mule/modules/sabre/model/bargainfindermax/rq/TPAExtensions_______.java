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
    "AwardShopping"
})
public class TPAExtensions_______ {

    @JsonProperty("AwardShopping")
    private AwardShopping awardShopping;

    @JsonProperty("AwardShopping")
    public AwardShopping getAwardShopping() {
        return awardShopping;
    }

    @JsonProperty("AwardShopping")
    public void setAwardShopping(AwardShopping awardShopping) {
        this.awardShopping = awardShopping;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("awardShopping", awardShopping).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(awardShopping).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions_______) == false) {
            return false;
        }
        TPAExtensions_______ rhs = ((TPAExtensions_______) other);
        return new EqualsBuilder().append(awardShopping, rhs.awardShopping).isEquals();
    }

}

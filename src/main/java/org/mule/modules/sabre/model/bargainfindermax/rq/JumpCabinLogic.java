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
    "Disabled"
})
public class JumpCabinLogic {

    @JsonProperty("Disabled")
    private Boolean disabled;

    @JsonProperty("Disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    @JsonProperty("Disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("disabled", disabled).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(disabled).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JumpCabinLogic) == false) {
            return false;
        }
        JumpCabinLogic rhs = ((JumpCabinLogic) other);
        return new EqualsBuilder().append(disabled, rhs.disabled).isEquals();
    }

}

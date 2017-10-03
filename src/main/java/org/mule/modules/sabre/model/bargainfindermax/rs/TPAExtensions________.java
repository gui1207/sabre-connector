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
    "ValidatingCarrier"
})
public class TPAExtensions________ {

    @JsonProperty("ValidatingCarrier")
    private ValidatingCarrier_ validatingCarrier;

    @JsonProperty("ValidatingCarrier")
    public ValidatingCarrier_ getValidatingCarrier() {
        return validatingCarrier;
    }

    @JsonProperty("ValidatingCarrier")
    public void setValidatingCarrier(ValidatingCarrier_ validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("validatingCarrier", validatingCarrier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(validatingCarrier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions________) == false) {
            return false;
        }
        TPAExtensions________ rhs = ((TPAExtensions________) other);
        return new EqualsBuilder().append(validatingCarrier, rhs.validatingCarrier).isEquals();
    }

}

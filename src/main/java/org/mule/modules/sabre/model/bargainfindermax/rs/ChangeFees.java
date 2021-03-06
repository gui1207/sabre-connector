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
    "ChangeFee"
})
public class ChangeFees {

    @JsonProperty("ChangeFee")
    private ChangeFee changeFee;

    @JsonProperty("ChangeFee")
    public ChangeFee getChangeFee() {
        return changeFee;
    }

    @JsonProperty("ChangeFee")
    public void setChangeFee(ChangeFee changeFee) {
        this.changeFee = changeFee;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("changeFee", changeFee).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(changeFee).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeFees) == false) {
            return false;
        }
        ChangeFees rhs = ((ChangeFees) other);
        return new EqualsBuilder().append(changeFee, rhs.changeFee).isEquals();
    }

}

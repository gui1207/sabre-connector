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
    "Enable",
    "UseRAS"
})
public class AwardShopping {

    @JsonProperty("Enable")
    private Boolean enable;
    @JsonProperty("UseRAS")
    private Boolean useRAS;

    @JsonProperty("Enable")
    public Boolean getEnable() {
        return enable;
    }

    @JsonProperty("Enable")
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @JsonProperty("UseRAS")
    public Boolean getUseRAS() {
        return useRAS;
    }

    @JsonProperty("UseRAS")
    public void setUseRAS(Boolean useRAS) {
        this.useRAS = useRAS;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("enable", enable).append("useRAS", useRAS).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(enable).append(useRAS).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwardShopping) == false) {
            return false;
        }
        AwardShopping rhs = ((AwardShopping) other);
        return new EqualsBuilder().append(enable, rhs.enable).append(useRAS, rhs.useRAS).isEquals();
    }

}

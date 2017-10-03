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
    "Info"
})
public class FareCalcLine {

    @JsonProperty("Info")
    private String info;

    @JsonProperty("Info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("Info")
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("info", info).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(info).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareCalcLine) == false) {
            return false;
        }
        FareCalcLine rhs = ((FareCalcLine) other);
        return new EqualsBuilder().append(info, rhs.info).isEquals();
    }

}

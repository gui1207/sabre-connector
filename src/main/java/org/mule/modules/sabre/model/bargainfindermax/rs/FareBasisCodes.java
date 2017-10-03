/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FareBasisCode"
})
public class FareBasisCodes {

    @JsonProperty("FareBasisCode")
    private List<FareBasisCode> fareBasisCode = new ArrayList<FareBasisCode>();

    @JsonProperty("FareBasisCode")
    public List<FareBasisCode> getFareBasisCode() {
        return fareBasisCode;
    }

    @JsonProperty("FareBasisCode")
    public void setFareBasisCode(List<FareBasisCode> fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareBasisCode", fareBasisCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareBasisCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareBasisCodes) == false) {
            return false;
        }
        FareBasisCodes rhs = ((FareBasisCodes) other);
        return new EqualsBuilder().append(fareBasisCode, rhs.fareBasisCode).isEquals();
    }

}

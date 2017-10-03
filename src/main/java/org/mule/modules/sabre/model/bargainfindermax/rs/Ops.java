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
    "FareTypes",
    "ActionCode"
})
public class Ops {

    @JsonProperty("FareTypes")
    private FareTypes fareTypes;
    @JsonProperty("ActionCode")
    private Integer actionCode;

    @JsonProperty("FareTypes")
    public FareTypes getFareTypes() {
        return fareTypes;
    }

    @JsonProperty("FareTypes")
    public void setFareTypes(FareTypes fareTypes) {
        this.fareTypes = fareTypes;
    }

    @JsonProperty("ActionCode")
    public Integer getActionCode() {
        return actionCode;
    }

    @JsonProperty("ActionCode")
    public void setActionCode(Integer actionCode) {
        this.actionCode = actionCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareTypes", fareTypes).append("actionCode", actionCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareTypes).append(actionCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ops) == false) {
            return false;
        }
        Ops rhs = ((Ops) other);
        return new EqualsBuilder().append(fareTypes, rhs.fareTypes).append(actionCode, rhs.actionCode).isEquals();
    }

}

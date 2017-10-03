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
    "FareType"
})
public class FareTypes {

    @JsonProperty("FareType")
    private List<FareType_> fareType = new ArrayList<FareType_>();

    @JsonProperty("FareType")
    public List<FareType_> getFareType() {
        return fareType;
    }

    @JsonProperty("FareType")
    public void setFareType(List<FareType_> fareType) {
        this.fareType = fareType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareType", fareType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareTypes) == false) {
            return false;
        }
        FareTypes rhs = ((FareTypes) other);
        return new EqualsBuilder().append(fareType, rhs.fareType).isEquals();
    }

}

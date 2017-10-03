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
    "FareCalcLine",
    "FareType"
})
public class TPAExtensions____ {

    @JsonProperty("FareCalcLine")
    private FareCalcLine fareCalcLine;
    @JsonProperty("FareType")
    private FareType fareType;

    @JsonProperty("FareCalcLine")
    public FareCalcLine getFareCalcLine() {
        return fareCalcLine;
    }

    @JsonProperty("FareCalcLine")
    public void setFareCalcLine(FareCalcLine fareCalcLine) {
        this.fareCalcLine = fareCalcLine;
    }

    @JsonProperty("FareType")
    public FareType getFareType() {
        return fareType;
    }

    @JsonProperty("FareType")
    public void setFareType(FareType fareType) {
        this.fareType = fareType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareCalcLine", fareCalcLine).append("fareType", fareType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareType).append(fareCalcLine).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions____) == false) {
            return false;
        }
        TPAExtensions____ rhs = ((TPAExtensions____) other);
        return new EqualsBuilder().append(fareType, rhs.fareType).append(fareCalcLine, rhs.fareCalcLine).isEquals();
    }

}

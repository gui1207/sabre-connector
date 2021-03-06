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
    "OriginDestinationOption"
})
public class OriginDestinationOptions_ {

    @JsonProperty("OriginDestinationOption")
    private List<OriginDestinationOption_> originDestinationOption = new ArrayList<OriginDestinationOption_>();

    @JsonProperty("OriginDestinationOption")
    public List<OriginDestinationOption_> getOriginDestinationOption() {
        return originDestinationOption;
    }

    @JsonProperty("OriginDestinationOption")
    public void setOriginDestinationOption(List<OriginDestinationOption_> originDestinationOption) {
        this.originDestinationOption = originDestinationOption;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("originDestinationOption", originDestinationOption).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(originDestinationOption).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginDestinationOptions_) == false) {
            return false;
        }
        OriginDestinationOptions_ rhs = ((OriginDestinationOptions_) other);
        return new EqualsBuilder().append(originDestinationOption, rhs.originDestinationOption).isEquals();
    }

}

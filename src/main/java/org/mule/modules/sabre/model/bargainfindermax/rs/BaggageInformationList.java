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
    "BaggageInformation"
})
public class BaggageInformationList {

    @JsonProperty("BaggageInformation")
    private List<BaggageInformation> baggageInformation = new ArrayList<BaggageInformation>();

    @JsonProperty("BaggageInformation")
    public List<BaggageInformation> getBaggageInformation() {
        return baggageInformation;
    }

    @JsonProperty("BaggageInformation")
    public void setBaggageInformation(List<BaggageInformation> baggageInformation) {
        this.baggageInformation = baggageInformation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baggageInformation", baggageInformation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(baggageInformation).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaggageInformationList) == false) {
            return false;
        }
        BaggageInformationList rhs = ((BaggageInformationList) other);
        return new EqualsBuilder().append(baggageInformation, rhs.baggageInformation).isEquals();
    }

}

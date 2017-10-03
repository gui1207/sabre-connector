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
    "TravelPreferences",
    "PseudoCityCode"
})
public class AlternatePCC {

    @JsonProperty("TravelPreferences")
    private TravelPreferences__ travelPreferences;
    @JsonProperty("PseudoCityCode")
    private String pseudoCityCode;

    @JsonProperty("TravelPreferences")
    public TravelPreferences__ getTravelPreferences() {
        return travelPreferences;
    }

    @JsonProperty("TravelPreferences")
    public void setTravelPreferences(TravelPreferences__ travelPreferences) {
        this.travelPreferences = travelPreferences;
    }

    @JsonProperty("PseudoCityCode")
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    @JsonProperty("PseudoCityCode")
    public void setPseudoCityCode(String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("travelPreferences", travelPreferences).append("pseudoCityCode", pseudoCityCode).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(travelPreferences).append(pseudoCityCode).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlternatePCC) == false) {
            return false;
        }
        AlternatePCC rhs = ((AlternatePCC) other);
        return new EqualsBuilder().append(travelPreferences, rhs.travelPreferences).append(pseudoCityCode, rhs.pseudoCityCode).isEquals();
    }

}

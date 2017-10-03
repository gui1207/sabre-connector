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
    "StopAirport"
})
public class StopAirports {

    @JsonProperty("StopAirport")
    private List<StopAirport> stopAirport = new ArrayList<StopAirport>();

    @JsonProperty("StopAirport")
    public List<StopAirport> getStopAirport() {
        return stopAirport;
    }

    @JsonProperty("StopAirport")
    public void setStopAirport(List<StopAirport> stopAirport) {
        this.stopAirport = stopAirport;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("stopAirport", stopAirport).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stopAirport).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopAirports) == false) {
            return false;
        }
        StopAirports rhs = ((StopAirports) other);
        return new EqualsBuilder().append(stopAirport, rhs.stopAirport).isEquals();
    }

}

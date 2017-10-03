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
    "Origins",
    "Destinations"
})
public class AltCitiesCombinations {

    @JsonProperty("Origins")
    private String origins;
    @JsonProperty("Destinations")
    private String destinations;

    @JsonProperty("Origins")
    public String getOrigins() {
        return origins;
    }

    @JsonProperty("Origins")
    public void setOrigins(String origins) {
        this.origins = origins;
    }

    @JsonProperty("Destinations")
    public String getDestinations() {
        return destinations;
    }

    @JsonProperty("Destinations")
    public void setDestinations(String destinations) {
        this.destinations = destinations;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("origins", origins).append("destinations", destinations).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(origins).append(destinations).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AltCitiesCombinations) == false) {
            return false;
        }
        AltCitiesCombinations rhs = ((AltCitiesCombinations) other);
        return new EqualsBuilder().append(origins, rhs.origins).append(destinations, rhs.destinations).isEquals();
    }

}

/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

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
    "Destination"
})
public class Destinations {

    @JsonProperty("Destination")
    private List<Destination> destination = new ArrayList<Destination>();

    @JsonProperty("Destination")
    public List<Destination> getDestination() {
        return destination;
    }

    @JsonProperty("Destination")
    public void setDestination(List<Destination> destination) {
        this.destination = destination;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("destination", destination).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(destination).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Destinations) == false) {
            return false;
        }
        Destinations rhs = ((Destinations) other);
        return new EqualsBuilder().append(destination, rhs.destination).isEquals();
    }

}

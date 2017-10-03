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
    "RoutingLeg",
    "AddWildcards"
})
public class Routing {

    @JsonProperty("RoutingLeg")
    private List<RoutingLeg> routingLeg = new ArrayList<RoutingLeg>();
    @JsonProperty("AddWildcards")
    private Boolean addWildcards;

    @JsonProperty("RoutingLeg")
    public List<RoutingLeg> getRoutingLeg() {
        return routingLeg;
    }

    @JsonProperty("RoutingLeg")
    public void setRoutingLeg(List<RoutingLeg> routingLeg) {
        this.routingLeg = routingLeg;
    }

    @JsonProperty("AddWildcards")
    public Boolean getAddWildcards() {
        return addWildcards;
    }

    @JsonProperty("AddWildcards")
    public void setAddWildcards(Boolean addWildcards) {
        this.addWildcards = addWildcards;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("routingLeg", routingLeg).append("addWildcards", addWildcards).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(addWildcards).append(routingLeg).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Routing) == false) {
            return false;
        }
        Routing rhs = ((Routing) other);
        return new EqualsBuilder().append(addWildcards, rhs.addWildcards).append(routingLeg, rhs.routingLeg).isEquals();
    }

}

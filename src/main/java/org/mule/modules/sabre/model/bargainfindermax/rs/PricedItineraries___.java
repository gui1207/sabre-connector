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
    "TPA_Extensions",
    "PricedItinerary"
})
public class PricedItineraries___ {

    @JsonProperty("TPA_Extensions")
    private TPAExtensions__________________ tPAExtensions;
    @JsonProperty("PricedItinerary")
    private List<PricedItinerary> pricedItinerary = new ArrayList<PricedItinerary>();

    @JsonProperty("TPA_Extensions")
    public TPAExtensions__________________ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions__________________ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("PricedItinerary")
    public List<PricedItinerary> getPricedItinerary() {
        return pricedItinerary;
    }

    @JsonProperty("PricedItinerary")
    public void setPricedItinerary(List<PricedItinerary> pricedItinerary) {
        this.pricedItinerary = pricedItinerary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tPAExtensions", tPAExtensions).append("pricedItinerary", pricedItinerary).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tPAExtensions).append(pricedItinerary).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PricedItineraries___) == false) {
            return false;
        }
        PricedItineraries___ rhs = ((PricedItineraries___) other);
        return new EqualsBuilder().append(tPAExtensions, rhs.tPAExtensions).append(pricedItinerary, rhs.pricedItinerary).isEquals();
    }

}

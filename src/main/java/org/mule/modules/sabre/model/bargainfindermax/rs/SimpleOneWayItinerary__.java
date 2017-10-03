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
    "PricedItinerary",
    "RPH"
})
public class SimpleOneWayItinerary__ {

    @JsonProperty("TPA_Extensions")
    private TPAExtensions_________________ tPAExtensions;
    @JsonProperty("PricedItinerary")
    private List<PricedItinerary> pricedItinerary = new ArrayList<PricedItinerary>();
    @JsonProperty("RPH")
    private String rPH;

    @JsonProperty("TPA_Extensions")
    public TPAExtensions_________________ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_________________ tPAExtensions) {
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

    @JsonProperty("RPH")
    public String getRPH() {
        return rPH;
    }

    @JsonProperty("RPH")
    public void setRPH(String rPH) {
        this.rPH = rPH;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tPAExtensions", tPAExtensions).append("pricedItinerary", pricedItinerary).append("rPH", rPH).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pricedItinerary).append(rPH).append(tPAExtensions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimpleOneWayItinerary__) == false) {
            return false;
        }
        SimpleOneWayItinerary__ rhs = ((SimpleOneWayItinerary__) other);
        return new EqualsBuilder().append(pricedItinerary, rhs.pricedItinerary).append(rPH, rhs.rPH).append(tPAExtensions, rhs.tPAExtensions).isEquals();
    }

}

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
    "VendorPref",
    "TPA_Extensions"
})
public class TravelPreferences__ {

    @JsonProperty("VendorPref")
    private List<VendorPref_> vendorPref = new ArrayList<VendorPref_>();
    @JsonProperty("TPA_Extensions")
    private TPAExtensions________ tPAExtensions;

    @JsonProperty("VendorPref")
    public List<VendorPref_> getVendorPref() {
        return vendorPref;
    }

    @JsonProperty("VendorPref")
    public void setVendorPref(List<VendorPref_> vendorPref) {
        this.vendorPref = vendorPref;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions________ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions________ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("vendorPref", vendorPref).append("tPAExtensions", tPAExtensions).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(tPAExtensions).append(vendorPref).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TravelPreferences__) == false) {
            return false;
        }
        TravelPreferences__ rhs = ((TravelPreferences__) other);
        return new EqualsBuilder().append(tPAExtensions, rhs.tPAExtensions).append(vendorPref, rhs.vendorPref).isEquals();
    }

}

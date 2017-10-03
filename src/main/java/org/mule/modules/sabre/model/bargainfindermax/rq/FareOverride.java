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
    "TPA_Extensions",
    "FareType",
    "PseudoCityCode",
    "CorporateID",
    "Callable"
})
public class FareOverride {

    @JsonProperty("VendorPref")
    private List<VendorPref> vendorPref = new ArrayList<VendorPref>();
    @JsonProperty("TPA_Extensions")
    private String tPAExtensions;
    @JsonProperty("FareType")
    private String fareType;
    @JsonProperty("PseudoCityCode")
    private String pseudoCityCode;
    @JsonProperty("CorporateID")
    private String corporateID;
    @JsonProperty("Callable")
    private String callable;

    @JsonProperty("VendorPref")
    public List<VendorPref> getVendorPref() {
        return vendorPref;
    }

    @JsonProperty("VendorPref")
    public void setVendorPref(List<VendorPref> vendorPref) {
        this.vendorPref = vendorPref;
    }

    @JsonProperty("TPA_Extensions")
    public String getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(String tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("FareType")
    public String getFareType() {
        return fareType;
    }

    @JsonProperty("FareType")
    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    @JsonProperty("PseudoCityCode")
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    @JsonProperty("PseudoCityCode")
    public void setPseudoCityCode(String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }

    @JsonProperty("CorporateID")
    public String getCorporateID() {
        return corporateID;
    }

    @JsonProperty("CorporateID")
    public void setCorporateID(String corporateID) {
        this.corporateID = corporateID;
    }

    @JsonProperty("Callable")
    public String getCallable() {
        return callable;
    }

    @JsonProperty("Callable")
    public void setCallable(String callable) {
        this.callable = callable;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("vendorPref", vendorPref).append("tPAExtensions", tPAExtensions).append("fareType", fareType).append("pseudoCityCode", pseudoCityCode).append("corporateID", corporateID).append("callable", callable).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(pseudoCityCode).append(callable).append(tPAExtensions).append(vendorPref).append(fareType).append(corporateID).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareOverride) == false) {
            return false;
        }
        FareOverride rhs = ((FareOverride) other);
        return new EqualsBuilder().append(pseudoCityCode, rhs.pseudoCityCode).append(callable, rhs.callable).append(tPAExtensions, rhs.tPAExtensions).append(vendorPref, rhs.vendorPref).append(fareType, rhs.fareType).append(corporateID, rhs.corporateID).isEquals();
    }

}

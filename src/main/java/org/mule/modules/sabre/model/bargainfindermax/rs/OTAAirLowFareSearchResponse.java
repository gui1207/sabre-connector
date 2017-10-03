/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * org.opentravel.ota._2003._05.OTAAirLowFareSearchRS
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OTA_AirLowFareSearchRS"
})
public class OTAAirLowFareSearchResponse {

    @JsonProperty("OTA_AirLowFareSearchRS")
    private OTAAirLowFareSearchRS oTAAirLowFareSearchRS;

    @JsonProperty("OTA_AirLowFareSearchRS")
    public OTAAirLowFareSearchRS getOTAAirLowFareSearchRS() {
        return oTAAirLowFareSearchRS;
    }

    @JsonProperty("OTA_AirLowFareSearchRS")
    public void setOTAAirLowFareSearchRS(OTAAirLowFareSearchRS oTAAirLowFareSearchRS) {
        this.oTAAirLowFareSearchRS = oTAAirLowFareSearchRS;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("oTAAirLowFareSearchRS", oTAAirLowFareSearchRS).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(oTAAirLowFareSearchRS).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OTAAirLowFareSearchResponse) == false) {
            return false;
        }
        OTAAirLowFareSearchResponse rhs = ((OTAAirLowFareSearchResponse) other);
        return new EqualsBuilder().append(oTAAirLowFareSearchRS, rhs.oTAAirLowFareSearchRS).isEquals();
    }

}

/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FareBasisCode",
    "FareComponentID"
})
public class Cat16TextOnly {

    @JsonProperty("FareBasisCode")
    private String fareBasisCode;
    @JsonProperty("FareComponentID")
    private Integer fareComponentID;

    @JsonProperty("FareBasisCode")
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    @JsonProperty("FareBasisCode")
    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    @JsonProperty("FareComponentID")
    public Integer getFareComponentID() {
        return fareComponentID;
    }

    @JsonProperty("FareComponentID")
    public void setFareComponentID(Integer fareComponentID) {
        this.fareComponentID = fareComponentID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fareBasisCode", fareBasisCode).append("fareComponentID", fareComponentID).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fareComponentID).append(fareBasisCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cat16TextOnly) == false) {
            return false;
        }
        Cat16TextOnly rhs = ((Cat16TextOnly) other);
        return new EqualsBuilder().append(fareComponentID, rhs.fareComponentID).append(fareBasisCode, rhs.fareBasisCode).isEquals();
    }

}

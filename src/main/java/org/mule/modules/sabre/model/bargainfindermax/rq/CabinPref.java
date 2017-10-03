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
    "Cabin",
    "PreferLevel"
})
public class CabinPref {

    @JsonProperty("Cabin")
    private String cabin;
    @JsonProperty("PreferLevel")
    private String preferLevel;

    @JsonProperty("Cabin")
    public String getCabin() {
        return cabin;
    }

    @JsonProperty("Cabin")
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("PreferLevel")
    public String getPreferLevel() {
        return preferLevel;
    }

    @JsonProperty("PreferLevel")
    public void setPreferLevel(String preferLevel) {
        this.preferLevel = preferLevel;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("cabin", cabin).append("preferLevel", preferLevel).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(cabin).append(preferLevel).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CabinPref) == false) {
            return false;
        }
        CabinPref rhs = ((CabinPref) other);
        return new EqualsBuilder().append(cabin, rhs.cabin).append(preferLevel, rhs.preferLevel).isEquals();
    }

}

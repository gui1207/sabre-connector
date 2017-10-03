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
    "IncludeVendorPref",
    "ExcludeVendorPref"
})
public class Carriers {

    @JsonProperty("IncludeVendorPref")
    private List<IncludeVendorPref> includeVendorPref = new ArrayList<IncludeVendorPref>();
    @JsonProperty("ExcludeVendorPref")
    private List<ExcludeVendorPref> excludeVendorPref = new ArrayList<ExcludeVendorPref>();

    @JsonProperty("IncludeVendorPref")
    public List<IncludeVendorPref> getIncludeVendorPref() {
        return includeVendorPref;
    }

    @JsonProperty("IncludeVendorPref")
    public void setIncludeVendorPref(List<IncludeVendorPref> includeVendorPref) {
        this.includeVendorPref = includeVendorPref;
    }

    @JsonProperty("ExcludeVendorPref")
    public List<ExcludeVendorPref> getExcludeVendorPref() {
        return excludeVendorPref;
    }

    @JsonProperty("ExcludeVendorPref")
    public void setExcludeVendorPref(List<ExcludeVendorPref> excludeVendorPref) {
        this.excludeVendorPref = excludeVendorPref;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("includeVendorPref", includeVendorPref).append("excludeVendorPref", excludeVendorPref).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(excludeVendorPref).append(includeVendorPref).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Carriers) == false) {
            return false;
        }
        Carriers rhs = ((Carriers) other);
        return new EqualsBuilder().append(excludeVendorPref, rhs.excludeVendorPref).append(includeVendorPref, rhs.includeVendorPref).isEquals();
    }

}

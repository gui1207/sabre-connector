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
    "IncludeAlliancePref",
    "ExcludeAlliancePref"
})
public class TPAExtensions________ {

    @JsonProperty("IncludeAlliancePref")
    private List<IncludeAlliancePref> includeAlliancePref = new ArrayList<IncludeAlliancePref>();
    @JsonProperty("ExcludeAlliancePref")
    private List<IncludeAlliancePref> excludeAlliancePref = new ArrayList<IncludeAlliancePref>();

    @JsonProperty("IncludeAlliancePref")
    public List<IncludeAlliancePref> getIncludeAlliancePref() {
        return includeAlliancePref;
    }

    @JsonProperty("IncludeAlliancePref")
    public void setIncludeAlliancePref(List<IncludeAlliancePref> includeAlliancePref) {
        this.includeAlliancePref = includeAlliancePref;
    }

    @JsonProperty("ExcludeAlliancePref")
    public List<IncludeAlliancePref> getExcludeAlliancePref() {
        return excludeAlliancePref;
    }

    @JsonProperty("ExcludeAlliancePref")
    public void setExcludeAlliancePref(List<IncludeAlliancePref> excludeAlliancePref) {
        this.excludeAlliancePref = excludeAlliancePref;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("includeAlliancePref", includeAlliancePref).append("excludeAlliancePref", excludeAlliancePref).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(includeAlliancePref).append(excludeAlliancePref).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions________) == false) {
            return false;
        }
        TPAExtensions________ rhs = ((TPAExtensions________) other);
        return new EqualsBuilder().append(includeAlliancePref, rhs.includeAlliancePref).append(excludeAlliancePref, rhs.excludeAlliancePref).isEquals();
    }

}

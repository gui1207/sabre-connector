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
    "EnableChronologicalSorting",
    "SortFaresInsideItin"
})
public class ResponseSorting {

    @JsonProperty("EnableChronologicalSorting")
    private Boolean enableChronologicalSorting;
    @JsonProperty("SortFaresInsideItin")
    private Boolean sortFaresInsideItin;

    @JsonProperty("EnableChronologicalSorting")
    public Boolean getEnableChronologicalSorting() {
        return enableChronologicalSorting;
    }

    @JsonProperty("EnableChronologicalSorting")
    public void setEnableChronologicalSorting(Boolean enableChronologicalSorting) {
        this.enableChronologicalSorting = enableChronologicalSorting;
    }

    @JsonProperty("SortFaresInsideItin")
    public Boolean getSortFaresInsideItin() {
        return sortFaresInsideItin;
    }

    @JsonProperty("SortFaresInsideItin")
    public void setSortFaresInsideItin(Boolean sortFaresInsideItin) {
        this.sortFaresInsideItin = sortFaresInsideItin;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("enableChronologicalSorting", enableChronologicalSorting).append("sortFaresInsideItin", sortFaresInsideItin).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(sortFaresInsideItin).append(enableChronologicalSorting).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseSorting) == false) {
            return false;
        }
        ResponseSorting rhs = ((ResponseSorting) other);
        return new EqualsBuilder().append(sortFaresInsideItin, rhs.sortFaresInsideItin).append(enableChronologicalSorting, rhs.enableChronologicalSorting).isEquals();
    }

}

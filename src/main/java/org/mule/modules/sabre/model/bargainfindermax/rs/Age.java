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
    "Years"
})
public class Age {

    @JsonProperty("Years")
    private Double years;

    @JsonProperty("Years")
    public Double getYears() {
        return years;
    }

    @JsonProperty("Years")
    public void setYears(Double years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("years", years).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(years).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Age) == false) {
            return false;
        }
        Age rhs = ((Age) other);
        return new EqualsBuilder().append(years, rhs.years).isEquals();
    }

}

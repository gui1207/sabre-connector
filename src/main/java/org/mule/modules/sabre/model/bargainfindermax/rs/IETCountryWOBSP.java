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
    "Country"
})
public class IETCountryWOBSP {

    @JsonProperty("Country")
    private List<Country> country = new ArrayList<Country>();

    @JsonProperty("Country")
    public List<Country> getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(List<Country> country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("country", country).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IETCountryWOBSP) == false) {
            return false;
        }
        IETCountryWOBSP rhs = ((IETCountryWOBSP) other);
        return new EqualsBuilder().append(country, rhs.country).isEquals();
    }

}

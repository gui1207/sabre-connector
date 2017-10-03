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
    "Type",
    "Primary",
    "CompanyName"
})
public class BookingChannel {

    @JsonProperty("Type")
    private String type;
    @JsonProperty("Primary")
    private Boolean primary;
    @JsonProperty("CompanyName")
    private CompanyName companyName;

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("Primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @JsonProperty("CompanyName")
    public CompanyName getCompanyName() {
        return companyName;
    }

    @JsonProperty("CompanyName")
    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("primary", primary).append("companyName", companyName).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(primary).append(companyName).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BookingChannel) == false) {
            return false;
        }
        BookingChannel rhs = ((BookingChannel) other);
        return new EqualsBuilder().append(type, rhs.type).append(primary, rhs.primary).append(companyName, rhs.companyName).isEquals();
    }

}

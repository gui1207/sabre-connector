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
    "TypeCode",
    "Description",
    "MonetaryAmountValue"
})
public class HandlingMarkupSummary {

    @JsonProperty("TypeCode")
    private String typeCode;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("MonetaryAmountValue")
    private Double monetaryAmountValue;

    @JsonProperty("TypeCode")
    public String getTypeCode() {
        return typeCode;
    }

    @JsonProperty("TypeCode")
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("MonetaryAmountValue")
    public Double getMonetaryAmountValue() {
        return monetaryAmountValue;
    }

    @JsonProperty("MonetaryAmountValue")
    public void setMonetaryAmountValue(Double monetaryAmountValue) {
        this.monetaryAmountValue = monetaryAmountValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("typeCode", typeCode).append("description", description).append("monetaryAmountValue", monetaryAmountValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(monetaryAmountValue).append(typeCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HandlingMarkupSummary) == false) {
            return false;
        }
        HandlingMarkupSummary rhs = ((HandlingMarkupSummary) other);
        return new EqualsBuilder().append(description, rhs.description).append(monetaryAmountValue, rhs.monetaryAmountValue).append(typeCode, rhs.typeCode).isEquals();
    }

}

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
    "Pieces",
    "Weight",
    "Unit",
    "Description1",
    "Description2"
})
public class Allowance {

    @JsonProperty("Pieces")
    private Integer pieces;
    @JsonProperty("Weight")
    private Double weight;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("Description1")
    private String description1;
    @JsonProperty("Description2")
    private String description2;

    @JsonProperty("Pieces")
    public Integer getPieces() {
        return pieces;
    }

    @JsonProperty("Pieces")
    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    @JsonProperty("Weight")
    public Double getWeight() {
        return weight;
    }

    @JsonProperty("Weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @JsonProperty("Unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("Unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("Description1")
    public String getDescription1() {
        return description1;
    }

    @JsonProperty("Description1")
    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    @JsonProperty("Description2")
    public String getDescription2() {
        return description2;
    }

    @JsonProperty("Description2")
    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pieces", pieces).append("weight", weight).append("unit", unit).append("description1", description1).append("description2", description2).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pieces).append(weight).append(unit).append(description2).append(description1).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Allowance) == false) {
            return false;
        }
        Allowance rhs = ((Allowance) other);
        return new EqualsBuilder().append(pieces, rhs.pieces).append(weight, rhs.weight).append(unit, rhs.unit).append(description2, rhs.description2).append(description1, rhs.description1).isEquals();
    }

}

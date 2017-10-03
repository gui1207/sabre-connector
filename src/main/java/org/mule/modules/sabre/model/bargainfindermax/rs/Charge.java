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
    "EquivalentAmount",
    "EquivalentCurrency",
    "FirstPiece",
    "LastPiece",
    "Description1",
    "Description2",
    "NoChargeNotAvailable"
})
public class Charge {

    @JsonProperty("EquivalentAmount")
    private Double equivalentAmount;
    @JsonProperty("EquivalentCurrency")
    private String equivalentCurrency;
    @JsonProperty("FirstPiece")
    private Double firstPiece;
    @JsonProperty("LastPiece")
    private Double lastPiece;
    @JsonProperty("Description1")
    private String description1;
    @JsonProperty("Description2")
    private String description2;
    @JsonProperty("NoChargeNotAvailable")
    private String noChargeNotAvailable;

    @JsonProperty("EquivalentAmount")
    public Double getEquivalentAmount() {
        return equivalentAmount;
    }

    @JsonProperty("EquivalentAmount")
    public void setEquivalentAmount(Double equivalentAmount) {
        this.equivalentAmount = equivalentAmount;
    }

    @JsonProperty("EquivalentCurrency")
    public String getEquivalentCurrency() {
        return equivalentCurrency;
    }

    @JsonProperty("EquivalentCurrency")
    public void setEquivalentCurrency(String equivalentCurrency) {
        this.equivalentCurrency = equivalentCurrency;
    }

    @JsonProperty("FirstPiece")
    public Double getFirstPiece() {
        return firstPiece;
    }

    @JsonProperty("FirstPiece")
    public void setFirstPiece(Double firstPiece) {
        this.firstPiece = firstPiece;
    }

    @JsonProperty("LastPiece")
    public Double getLastPiece() {
        return lastPiece;
    }

    @JsonProperty("LastPiece")
    public void setLastPiece(Double lastPiece) {
        this.lastPiece = lastPiece;
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

    @JsonProperty("NoChargeNotAvailable")
    public String getNoChargeNotAvailable() {
        return noChargeNotAvailable;
    }

    @JsonProperty("NoChargeNotAvailable")
    public void setNoChargeNotAvailable(String noChargeNotAvailable) {
        this.noChargeNotAvailable = noChargeNotAvailable;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("equivalentAmount", equivalentAmount).append("equivalentCurrency", equivalentCurrency).append("firstPiece", firstPiece).append("lastPiece", lastPiece).append("description1", description1).append("description2", description2).append("noChargeNotAvailable", noChargeNotAvailable).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lastPiece).append(equivalentAmount).append(description2).append(noChargeNotAvailable).append(equivalentCurrency).append(firstPiece).append(description1).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Charge) == false) {
            return false;
        }
        Charge rhs = ((Charge) other);
        return new EqualsBuilder().append(lastPiece, rhs.lastPiece).append(equivalentAmount, rhs.equivalentAmount).append(description2, rhs.description2).append(noChargeNotAvailable, rhs.noChargeNotAvailable).append(equivalentCurrency, rhs.equivalentCurrency).append(firstPiece, rhs.firstPiece).append(description1, rhs.description1).isEquals();
    }

}

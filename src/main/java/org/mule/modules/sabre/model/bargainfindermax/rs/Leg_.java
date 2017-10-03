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
    "BaseFare",
    "EquivFare",
    "Taxes",
    "TotalFare",
    "TotalMileage",
    "Number",
    "FareStatus"
})
public class Leg_ {

    @JsonProperty("BaseFare")
    private BaseFare baseFare;
    @JsonProperty("EquivFare")
    private EquivFare_ equivFare;
    @JsonProperty("Taxes")
    private Taxes_ taxes;
    @JsonProperty("TotalFare")
    private BaseFare totalFare;
    @JsonProperty("TotalMileage")
    private TotalMileage totalMileage;
    @JsonProperty("Number")
    private Integer number;
    @JsonProperty("FareStatus")
    private String fareStatus;

    @JsonProperty("BaseFare")
    public BaseFare getBaseFare() {
        return baseFare;
    }

    @JsonProperty("BaseFare")
    public void setBaseFare(BaseFare baseFare) {
        this.baseFare = baseFare;
    }

    @JsonProperty("EquivFare")
    public EquivFare_ getEquivFare() {
        return equivFare;
    }

    @JsonProperty("EquivFare")
    public void setEquivFare(EquivFare_ equivFare) {
        this.equivFare = equivFare;
    }

    @JsonProperty("Taxes")
    public Taxes_ getTaxes() {
        return taxes;
    }

    @JsonProperty("Taxes")
    public void setTaxes(Taxes_ taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("TotalFare")
    public BaseFare getTotalFare() {
        return totalFare;
    }

    @JsonProperty("TotalFare")
    public void setTotalFare(BaseFare totalFare) {
        this.totalFare = totalFare;
    }

    @JsonProperty("TotalMileage")
    public TotalMileage getTotalMileage() {
        return totalMileage;
    }

    @JsonProperty("TotalMileage")
    public void setTotalMileage(TotalMileage totalMileage) {
        this.totalMileage = totalMileage;
    }

    @JsonProperty("Number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("FareStatus")
    public String getFareStatus() {
        return fareStatus;
    }

    @JsonProperty("FareStatus")
    public void setFareStatus(String fareStatus) {
        this.fareStatus = fareStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baseFare", baseFare).append("equivFare", equivFare).append("taxes", taxes).append("totalFare", totalFare).append("totalMileage", totalMileage).append("number", number).append("fareStatus", fareStatus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(number).append(baseFare).append(totalFare).append(taxes).append(totalMileage).append(equivFare).append(fareStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Leg_) == false) {
            return false;
        }
        Leg_ rhs = ((Leg_) other);
        return new EqualsBuilder().append(number, rhs.number).append(baseFare, rhs.baseFare).append(totalFare, rhs.totalFare).append(taxes, rhs.taxes).append(totalMileage, rhs.totalMileage).append(equivFare, rhs.equivFare).append(fareStatus, rhs.fareStatus).isEquals();
    }

}

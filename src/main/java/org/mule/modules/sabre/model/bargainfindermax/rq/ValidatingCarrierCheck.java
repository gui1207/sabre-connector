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
    "SettlementValidation",
    "IETValidation",
    "Carrier",
    "Country"
})
public class ValidatingCarrierCheck {

    @JsonProperty("SettlementValidation")
    private SettlementValidation settlementValidation;
    @JsonProperty("IETValidation")
    private IETValidation iETValidation;
    @JsonProperty("Carrier")
    private List<Carrier> carrier = new ArrayList<Carrier>();
    @JsonProperty("Country")
    private List<Country> country = new ArrayList<Country>();

    @JsonProperty("SettlementValidation")
    public SettlementValidation getSettlementValidation() {
        return settlementValidation;
    }

    @JsonProperty("SettlementValidation")
    public void setSettlementValidation(SettlementValidation settlementValidation) {
        this.settlementValidation = settlementValidation;
    }

    @JsonProperty("IETValidation")
    public IETValidation getIETValidation() {
        return iETValidation;
    }

    @JsonProperty("IETValidation")
    public void setIETValidation(IETValidation iETValidation) {
        this.iETValidation = iETValidation;
    }

    @JsonProperty("Carrier")
    public List<Carrier> getCarrier() {
        return carrier;
    }

    @JsonProperty("Carrier")
    public void setCarrier(List<Carrier> carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("Country")
    public List<Country> getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(List<Country> country) {
        this.country = country;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("settlementValidation", settlementValidation).append("iETValidation", iETValidation).append("carrier", carrier).append("country", country).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(iETValidation).append(carrier).append(settlementValidation).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValidatingCarrierCheck) == false) {
            return false;
        }
        ValidatingCarrierCheck rhs = ((ValidatingCarrierCheck) other);
        return new EqualsBuilder().append(country, rhs.country).append(iETValidation, rhs.iETValidation).append(carrier, rhs.carrier).append(settlementValidation, rhs.settlementValidation).isEquals();
    }

}

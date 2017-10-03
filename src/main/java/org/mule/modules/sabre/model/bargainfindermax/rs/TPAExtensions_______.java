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
    "DivideInParty",
    "PromoOffer",
    "FareNote",
    "PromoRedemption",
    "Rule",
    "MultipleTravelerGroups",
    "AncillaryFeeGroups",
    "Legs",
    "UnflownPrice",
    "ValidatingCarrier"
})
public class TPAExtensions_______ {

    @JsonProperty("DivideInParty")
    private DivideInParty divideInParty;
    @JsonProperty("PromoOffer")
    private PromoOffer promoOffer;
    @JsonProperty("FareNote")
    private List<FareNote__> fareNote = new ArrayList<FareNote__>();
    @JsonProperty("PromoRedemption")
    private PromoRedemption promoRedemption;
    @JsonProperty("Rule")
    private List<Rule__> rule = new ArrayList<Rule__>();
    @JsonProperty("MultipleTravelerGroups")
    private MultipleTravelerGroups multipleTravelerGroups;
    @JsonProperty("AncillaryFeeGroups")
    private AncillaryFeeGroups ancillaryFeeGroups;
    @JsonProperty("Legs")
    private Legs_ legs;
    @JsonProperty("UnflownPrice")
    private UnflownPrice unflownPrice;
    @JsonProperty("ValidatingCarrier")
    private List<ValidatingCarrier> validatingCarrier = new ArrayList<ValidatingCarrier>();

    @JsonProperty("DivideInParty")
    public DivideInParty getDivideInParty() {
        return divideInParty;
    }

    @JsonProperty("DivideInParty")
    public void setDivideInParty(DivideInParty divideInParty) {
        this.divideInParty = divideInParty;
    }

    @JsonProperty("PromoOffer")
    public PromoOffer getPromoOffer() {
        return promoOffer;
    }

    @JsonProperty("PromoOffer")
    public void setPromoOffer(PromoOffer promoOffer) {
        this.promoOffer = promoOffer;
    }

    @JsonProperty("FareNote")
    public List<FareNote__> getFareNote() {
        return fareNote;
    }

    @JsonProperty("FareNote")
    public void setFareNote(List<FareNote__> fareNote) {
        this.fareNote = fareNote;
    }

    @JsonProperty("PromoRedemption")
    public PromoRedemption getPromoRedemption() {
        return promoRedemption;
    }

    @JsonProperty("PromoRedemption")
    public void setPromoRedemption(PromoRedemption promoRedemption) {
        this.promoRedemption = promoRedemption;
    }

    @JsonProperty("Rule")
    public List<Rule__> getRule() {
        return rule;
    }

    @JsonProperty("Rule")
    public void setRule(List<Rule__> rule) {
        this.rule = rule;
    }

    @JsonProperty("MultipleTravelerGroups")
    public MultipleTravelerGroups getMultipleTravelerGroups() {
        return multipleTravelerGroups;
    }

    @JsonProperty("MultipleTravelerGroups")
    public void setMultipleTravelerGroups(MultipleTravelerGroups multipleTravelerGroups) {
        this.multipleTravelerGroups = multipleTravelerGroups;
    }

    @JsonProperty("AncillaryFeeGroups")
    public AncillaryFeeGroups getAncillaryFeeGroups() {
        return ancillaryFeeGroups;
    }

    @JsonProperty("AncillaryFeeGroups")
    public void setAncillaryFeeGroups(AncillaryFeeGroups ancillaryFeeGroups) {
        this.ancillaryFeeGroups = ancillaryFeeGroups;
    }

    @JsonProperty("Legs")
    public Legs_ getLegs() {
        return legs;
    }

    @JsonProperty("Legs")
    public void setLegs(Legs_ legs) {
        this.legs = legs;
    }

    @JsonProperty("UnflownPrice")
    public UnflownPrice getUnflownPrice() {
        return unflownPrice;
    }

    @JsonProperty("UnflownPrice")
    public void setUnflownPrice(UnflownPrice unflownPrice) {
        this.unflownPrice = unflownPrice;
    }

    @JsonProperty("ValidatingCarrier")
    public List<ValidatingCarrier> getValidatingCarrier() {
        return validatingCarrier;
    }

    @JsonProperty("ValidatingCarrier")
    public void setValidatingCarrier(List<ValidatingCarrier> validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("divideInParty", divideInParty).append("promoOffer", promoOffer).append("fareNote", fareNote).append("promoRedemption", promoRedemption).append("rule", rule).append("multipleTravelerGroups", multipleTravelerGroups).append("ancillaryFeeGroups", ancillaryFeeGroups).append("legs", legs).append("unflownPrice", unflownPrice).append("validatingCarrier", validatingCarrier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(divideInParty).append(fareNote).append(ancillaryFeeGroups).append(unflownPrice).append(legs).append(rule).append(validatingCarrier).append(promoOffer).append(promoRedemption).append(multipleTravelerGroups).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions_______) == false) {
            return false;
        }
        TPAExtensions_______ rhs = ((TPAExtensions_______) other);
        return new EqualsBuilder().append(divideInParty, rhs.divideInParty).append(fareNote, rhs.fareNote).append(ancillaryFeeGroups, rhs.ancillaryFeeGroups).append(unflownPrice, rhs.unflownPrice).append(legs, rhs.legs).append(rule, rhs.rule).append(validatingCarrier, rhs.validatingCarrier).append(promoOffer, rhs.promoOffer).append(promoRedemption, rhs.promoRedemption).append(multipleTravelerGroups, rhs.multipleTravelerGroups).isEquals();
    }

}

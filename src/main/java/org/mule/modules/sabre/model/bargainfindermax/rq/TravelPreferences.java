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
    "VendorPref",
    "VendorPrefApplicability",
    "FlightTypePref",
    "FareRestrictPref",
    "EquipPref",
    "CabinPref",
    "TicketDistribPref",
    "TPA_Extensions",
    "AncillaryFees",
    "FrequentFlyer",
    "SpanishFamilyDiscount",
    "Baggage",
    "InterlineBrands",
    "CommissionCodeQualifiers",
    "OnTimeRate",
    "ETicketDesired",
    "ValidInterlineTicket",
    "MaxStopsQuantity",
    "UseAllFlights",
    "AllFlightsData",
    "Hybrid",
    "LookForAlternatives",
    "SmokingAllowed"
})
public class TravelPreferences {

    @JsonProperty("VendorPref")
    private List<VendorPref> vendorPref = new ArrayList<VendorPref>();
    @JsonProperty("VendorPrefApplicability")
    private List<VendorPrefApplicability> vendorPrefApplicability = new ArrayList<VendorPrefApplicability>();
    @JsonProperty("FlightTypePref")
    private FlightTypePref flightTypePref;
    @JsonProperty("FareRestrictPref")
    private List<FareRestrictPref> fareRestrictPref = new ArrayList<FareRestrictPref>();
    @JsonProperty("EquipPref")
    private List<EquipPref> equipPref = new ArrayList<EquipPref>();
    @JsonProperty("CabinPref")
    private List<CabinPref> cabinPref = new ArrayList<CabinPref>();
    @JsonProperty("TicketDistribPref")
    private List<TicketDistribPref> ticketDistribPref = new ArrayList<TicketDistribPref>();
    @JsonProperty("TPA_Extensions")
    private TPAExtensions_ tPAExtensions;
    @JsonProperty("AncillaryFees")
    private AncillaryFees ancillaryFees;
    @JsonProperty("FrequentFlyer")
    private List<FrequentFlyer> frequentFlyer = new ArrayList<FrequentFlyer>();
    @JsonProperty("SpanishFamilyDiscount")
    private SpanishFamilyDiscount spanishFamilyDiscount;
    @JsonProperty("Baggage")
    private Baggage_ baggage;
    @JsonProperty("InterlineBrands")
    private InterlineBrands interlineBrands;
    @JsonProperty("CommissionCodeQualifiers")
    private CommissionCodeQualifiers commissionCodeQualifiers;
    @JsonProperty("OnTimeRate")
    private Double onTimeRate;
    @JsonProperty("ETicketDesired")
    private Boolean eTicketDesired;
    @JsonProperty("ValidInterlineTicket")
    private Boolean validInterlineTicket;
    @JsonProperty("MaxStopsQuantity")
    private Integer maxStopsQuantity;
    @JsonProperty("UseAllFlights")
    private Boolean useAllFlights;
    @JsonProperty("AllFlightsData")
    private Boolean allFlightsData;
    @JsonProperty("Hybrid")
    private Boolean hybrid;
    @JsonProperty("LookForAlternatives")
    private Boolean lookForAlternatives;
    @JsonProperty("SmokingAllowed")
    private Boolean smokingAllowed;

    @JsonProperty("VendorPref")
    public List<VendorPref> getVendorPref() {
        return vendorPref;
    }

    @JsonProperty("VendorPref")
    public void setVendorPref(List<VendorPref> vendorPref) {
        this.vendorPref = vendorPref;
    }

    @JsonProperty("VendorPrefApplicability")
    public List<VendorPrefApplicability> getVendorPrefApplicability() {
        return vendorPrefApplicability;
    }

    @JsonProperty("VendorPrefApplicability")
    public void setVendorPrefApplicability(List<VendorPrefApplicability> vendorPrefApplicability) {
        this.vendorPrefApplicability = vendorPrefApplicability;
    }

    @JsonProperty("FlightTypePref")
    public FlightTypePref getFlightTypePref() {
        return flightTypePref;
    }

    @JsonProperty("FlightTypePref")
    public void setFlightTypePref(FlightTypePref flightTypePref) {
        this.flightTypePref = flightTypePref;
    }

    @JsonProperty("FareRestrictPref")
    public List<FareRestrictPref> getFareRestrictPref() {
        return fareRestrictPref;
    }

    @JsonProperty("FareRestrictPref")
    public void setFareRestrictPref(List<FareRestrictPref> fareRestrictPref) {
        this.fareRestrictPref = fareRestrictPref;
    }

    @JsonProperty("EquipPref")
    public List<EquipPref> getEquipPref() {
        return equipPref;
    }

    @JsonProperty("EquipPref")
    public void setEquipPref(List<EquipPref> equipPref) {
        this.equipPref = equipPref;
    }

    @JsonProperty("CabinPref")
    public List<CabinPref> getCabinPref() {
        return cabinPref;
    }

    @JsonProperty("CabinPref")
    public void setCabinPref(List<CabinPref> cabinPref) {
        this.cabinPref = cabinPref;
    }

    @JsonProperty("TicketDistribPref")
    public List<TicketDistribPref> getTicketDistribPref() {
        return ticketDistribPref;
    }

    @JsonProperty("TicketDistribPref")
    public void setTicketDistribPref(List<TicketDistribPref> ticketDistribPref) {
        this.ticketDistribPref = ticketDistribPref;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions_ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("AncillaryFees")
    public AncillaryFees getAncillaryFees() {
        return ancillaryFees;
    }

    @JsonProperty("AncillaryFees")
    public void setAncillaryFees(AncillaryFees ancillaryFees) {
        this.ancillaryFees = ancillaryFees;
    }

    @JsonProperty("FrequentFlyer")
    public List<FrequentFlyer> getFrequentFlyer() {
        return frequentFlyer;
    }

    @JsonProperty("FrequentFlyer")
    public void setFrequentFlyer(List<FrequentFlyer> frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    @JsonProperty("SpanishFamilyDiscount")
    public SpanishFamilyDiscount getSpanishFamilyDiscount() {
        return spanishFamilyDiscount;
    }

    @JsonProperty("SpanishFamilyDiscount")
    public void setSpanishFamilyDiscount(SpanishFamilyDiscount spanishFamilyDiscount) {
        this.spanishFamilyDiscount = spanishFamilyDiscount;
    }

    @JsonProperty("Baggage")
    public Baggage_ getBaggage() {
        return baggage;
    }

    @JsonProperty("Baggage")
    public void setBaggage(Baggage_ baggage) {
        this.baggage = baggage;
    }

    @JsonProperty("InterlineBrands")
    public InterlineBrands getInterlineBrands() {
        return interlineBrands;
    }

    @JsonProperty("InterlineBrands")
    public void setInterlineBrands(InterlineBrands interlineBrands) {
        this.interlineBrands = interlineBrands;
    }

    @JsonProperty("CommissionCodeQualifiers")
    public CommissionCodeQualifiers getCommissionCodeQualifiers() {
        return commissionCodeQualifiers;
    }

    @JsonProperty("CommissionCodeQualifiers")
    public void setCommissionCodeQualifiers(CommissionCodeQualifiers commissionCodeQualifiers) {
        this.commissionCodeQualifiers = commissionCodeQualifiers;
    }

    @JsonProperty("OnTimeRate")
    public Double getOnTimeRate() {
        return onTimeRate;
    }

    @JsonProperty("OnTimeRate")
    public void setOnTimeRate(Double onTimeRate) {
        this.onTimeRate = onTimeRate;
    }

    @JsonProperty("ETicketDesired")
    public Boolean getETicketDesired() {
        return eTicketDesired;
    }

    @JsonProperty("ETicketDesired")
    public void setETicketDesired(Boolean eTicketDesired) {
        this.eTicketDesired = eTicketDesired;
    }

    @JsonProperty("ValidInterlineTicket")
    public Boolean getValidInterlineTicket() {
        return validInterlineTicket;
    }

    @JsonProperty("ValidInterlineTicket")
    public void setValidInterlineTicket(Boolean validInterlineTicket) {
        this.validInterlineTicket = validInterlineTicket;
    }

    @JsonProperty("MaxStopsQuantity")
    public Integer getMaxStopsQuantity() {
        return maxStopsQuantity;
    }

    @JsonProperty("MaxStopsQuantity")
    public void setMaxStopsQuantity(Integer maxStopsQuantity) {
        this.maxStopsQuantity = maxStopsQuantity;
    }

    @JsonProperty("UseAllFlights")
    public Boolean getUseAllFlights() {
        return useAllFlights;
    }

    @JsonProperty("UseAllFlights")
    public void setUseAllFlights(Boolean useAllFlights) {
        this.useAllFlights = useAllFlights;
    }

    @JsonProperty("AllFlightsData")
    public Boolean getAllFlightsData() {
        return allFlightsData;
    }

    @JsonProperty("AllFlightsData")
    public void setAllFlightsData(Boolean allFlightsData) {
        this.allFlightsData = allFlightsData;
    }

    @JsonProperty("Hybrid")
    public Boolean getHybrid() {
        return hybrid;
    }

    @JsonProperty("Hybrid")
    public void setHybrid(Boolean hybrid) {
        this.hybrid = hybrid;
    }

    @JsonProperty("LookForAlternatives")
    public Boolean getLookForAlternatives() {
        return lookForAlternatives;
    }

    @JsonProperty("LookForAlternatives")
    public void setLookForAlternatives(Boolean lookForAlternatives) {
        this.lookForAlternatives = lookForAlternatives;
    }

    @JsonProperty("SmokingAllowed")
    public Boolean getSmokingAllowed() {
        return smokingAllowed;
    }

    @JsonProperty("SmokingAllowed")
    public void setSmokingAllowed(Boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("vendorPref", vendorPref).append("vendorPrefApplicability", vendorPrefApplicability).append("flightTypePref", flightTypePref).append("fareRestrictPref", fareRestrictPref).append("equipPref", equipPref).append("cabinPref", cabinPref).append("ticketDistribPref", ticketDistribPref).append("tPAExtensions", tPAExtensions).append("ancillaryFees", ancillaryFees).append("frequentFlyer", frequentFlyer).append("spanishFamilyDiscount", spanishFamilyDiscount).append("baggage", baggage).append("interlineBrands", interlineBrands).append("commissionCodeQualifiers", commissionCodeQualifiers).append("onTimeRate", onTimeRate).append("eTicketDesired", eTicketDesired).append("validInterlineTicket", validInterlineTicket).append("maxStopsQuantity", maxStopsQuantity).append("useAllFlights", useAllFlights).append("allFlightsData", allFlightsData).append("hybrid", hybrid).append("lookForAlternatives", lookForAlternatives).append("smokingAllowed", smokingAllowed).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(cabinPref).append(maxStopsQuantity).append(baggage).append(vendorPrefApplicability).append(eTicketDesired).append(fareRestrictPref).append(equipPref).append(vendorPref).append(flightTypePref).append(onTimeRate).append(allFlightsData).append(useAllFlights).append(ticketDistribPref).append(frequentFlyer).append(spanishFamilyDiscount).append(interlineBrands).append(hybrid).append(smokingAllowed).append(tPAExtensions).append(validInterlineTicket).append(ancillaryFees).append(commissionCodeQualifiers).append(lookForAlternatives).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TravelPreferences) == false) {
            return false;
        }
        TravelPreferences rhs = ((TravelPreferences) other);
        return new EqualsBuilder().append(cabinPref, rhs.cabinPref).append(maxStopsQuantity, rhs.maxStopsQuantity).append(baggage, rhs.baggage).append(vendorPrefApplicability, rhs.vendorPrefApplicability).append(eTicketDesired, rhs.eTicketDesired).append(fareRestrictPref, rhs.fareRestrictPref).append(equipPref, rhs.equipPref).append(vendorPref, rhs.vendorPref).append(flightTypePref, rhs.flightTypePref).append(onTimeRate, rhs.onTimeRate).append(allFlightsData, rhs.allFlightsData).append(useAllFlights, rhs.useAllFlights).append(ticketDistribPref, rhs.ticketDistribPref).append(frequentFlyer, rhs.frequentFlyer).append(spanishFamilyDiscount, rhs.spanishFamilyDiscount).append(interlineBrands, rhs.interlineBrands).append(hybrid, rhs.hybrid).append(smokingAllowed, rhs.smokingAllowed).append(tPAExtensions, rhs.tPAExtensions).append(validInterlineTicket, rhs.validInterlineTicket).append(ancillaryFees, rhs.ancillaryFees).append(commissionCodeQualifiers, rhs.commissionCodeQualifiers).append(lookForAlternatives, rhs.lookForAlternatives).isEquals();
    }

}

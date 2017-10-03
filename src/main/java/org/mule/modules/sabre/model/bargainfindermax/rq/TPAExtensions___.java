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
    "PublicFare",
    "PrivateFare",
    "IATAFare",
    "WebFare",
    "Priority",
    "Indicators",
    "PromoID",
    "CustomerType",
    "MultipleTravelerGroups",
    "BrandedFareIndicators",
    "PassengerStatus",
    "PointOfSaleOverride",
    "PointOfTicketingOverride",
    "ApplyResidentDiscount",
    "ETicketableOverride",
    "Currency",
    "UseReducedConstructions",
    "OBFees",
    "FareBreaksAtLegs",
    "FareAdjustment",
    "ForceCompanion",
    "UsePassengerFares",
    "UseNegotiatedFares"
})
public class TPAExtensions___ {

    @JsonProperty("PublicFare")
    private PublicFare_ publicFare;
    @JsonProperty("PrivateFare")
    private PrivateFare_ privateFare;
    @JsonProperty("IATAFare")
    private IATAFare iATAFare;
    @JsonProperty("WebFare")
    private WebFare webFare;
    @JsonProperty("Priority")
    private Priority priority;
    @JsonProperty("Indicators")
    private Indicators indicators;
    @JsonProperty("PromoID")
    private String promoID;
    @JsonProperty("CustomerType")
    private CustomerType customerType;
    @JsonProperty("MultipleTravelerGroups")
    private MultipleTravelerGroups multipleTravelerGroups;
    @JsonProperty("BrandedFareIndicators")
    private BrandedFareIndicators brandedFareIndicators;
    @JsonProperty("PassengerStatus")
    private PassengerStatus passengerStatus;
    @JsonProperty("PointOfSaleOverride")
    private PointOfSaleOverride pointOfSaleOverride;
    @JsonProperty("PointOfTicketingOverride")
    private PointOfTicketingOverride pointOfTicketingOverride;
    @JsonProperty("ApplyResidentDiscount")
    private ApplyResidentDiscount applyResidentDiscount;
    @JsonProperty("ETicketableOverride")
    private ETicketableOverride eTicketableOverride;
    @JsonProperty("Currency")
    private Currency currency;
    @JsonProperty("UseReducedConstructions")
    private UseReducedConstructions useReducedConstructions;
    @JsonProperty("OBFees")
    private OBFees oBFees;
    @JsonProperty("FareBreaksAtLegs")
    private FareBreaksAtLegs fareBreaksAtLegs;
    @JsonProperty("FareAdjustment")
    private List<FareAdjustment> fareAdjustment = new ArrayList<FareAdjustment>();
    @JsonProperty("ForceCompanion")
    private ForceCompanion forceCompanion;
    @JsonProperty("UsePassengerFares")
    private UsePassengerFares_ usePassengerFares;
    @JsonProperty("UseNegotiatedFares")
    private UseNegotiatedFares_ useNegotiatedFares;

    @JsonProperty("PublicFare")
    public PublicFare_ getPublicFare() {
        return publicFare;
    }

    @JsonProperty("PublicFare")
    public void setPublicFare(PublicFare_ publicFare) {
        this.publicFare = publicFare;
    }

    @JsonProperty("PrivateFare")
    public PrivateFare_ getPrivateFare() {
        return privateFare;
    }

    @JsonProperty("PrivateFare")
    public void setPrivateFare(PrivateFare_ privateFare) {
        this.privateFare = privateFare;
    }

    @JsonProperty("IATAFare")
    public IATAFare getIATAFare() {
        return iATAFare;
    }

    @JsonProperty("IATAFare")
    public void setIATAFare(IATAFare iATAFare) {
        this.iATAFare = iATAFare;
    }

    @JsonProperty("WebFare")
    public WebFare getWebFare() {
        return webFare;
    }

    @JsonProperty("WebFare")
    public void setWebFare(WebFare webFare) {
        this.webFare = webFare;
    }

    @JsonProperty("Priority")
    public Priority getPriority() {
        return priority;
    }

    @JsonProperty("Priority")
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @JsonProperty("Indicators")
    public Indicators getIndicators() {
        return indicators;
    }

    @JsonProperty("Indicators")
    public void setIndicators(Indicators indicators) {
        this.indicators = indicators;
    }

    @JsonProperty("PromoID")
    public String getPromoID() {
        return promoID;
    }

    @JsonProperty("PromoID")
    public void setPromoID(String promoID) {
        this.promoID = promoID;
    }

    @JsonProperty("CustomerType")
    public CustomerType getCustomerType() {
        return customerType;
    }

    @JsonProperty("CustomerType")
    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @JsonProperty("MultipleTravelerGroups")
    public MultipleTravelerGroups getMultipleTravelerGroups() {
        return multipleTravelerGroups;
    }

    @JsonProperty("MultipleTravelerGroups")
    public void setMultipleTravelerGroups(MultipleTravelerGroups multipleTravelerGroups) {
        this.multipleTravelerGroups = multipleTravelerGroups;
    }

    @JsonProperty("BrandedFareIndicators")
    public BrandedFareIndicators getBrandedFareIndicators() {
        return brandedFareIndicators;
    }

    @JsonProperty("BrandedFareIndicators")
    public void setBrandedFareIndicators(BrandedFareIndicators brandedFareIndicators) {
        this.brandedFareIndicators = brandedFareIndicators;
    }

    @JsonProperty("PassengerStatus")
    public PassengerStatus getPassengerStatus() {
        return passengerStatus;
    }

    @JsonProperty("PassengerStatus")
    public void setPassengerStatus(PassengerStatus passengerStatus) {
        this.passengerStatus = passengerStatus;
    }

    @JsonProperty("PointOfSaleOverride")
    public PointOfSaleOverride getPointOfSaleOverride() {
        return pointOfSaleOverride;
    }

    @JsonProperty("PointOfSaleOverride")
    public void setPointOfSaleOverride(PointOfSaleOverride pointOfSaleOverride) {
        this.pointOfSaleOverride = pointOfSaleOverride;
    }

    @JsonProperty("PointOfTicketingOverride")
    public PointOfTicketingOverride getPointOfTicketingOverride() {
        return pointOfTicketingOverride;
    }

    @JsonProperty("PointOfTicketingOverride")
    public void setPointOfTicketingOverride(PointOfTicketingOverride pointOfTicketingOverride) {
        this.pointOfTicketingOverride = pointOfTicketingOverride;
    }

    @JsonProperty("ApplyResidentDiscount")
    public ApplyResidentDiscount getApplyResidentDiscount() {
        return applyResidentDiscount;
    }

    @JsonProperty("ApplyResidentDiscount")
    public void setApplyResidentDiscount(ApplyResidentDiscount applyResidentDiscount) {
        this.applyResidentDiscount = applyResidentDiscount;
    }

    @JsonProperty("ETicketableOverride")
    public ETicketableOverride getETicketableOverride() {
        return eTicketableOverride;
    }

    @JsonProperty("ETicketableOverride")
    public void setETicketableOverride(ETicketableOverride eTicketableOverride) {
        this.eTicketableOverride = eTicketableOverride;
    }

    @JsonProperty("Currency")
    public Currency getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @JsonProperty("UseReducedConstructions")
    public UseReducedConstructions getUseReducedConstructions() {
        return useReducedConstructions;
    }

    @JsonProperty("UseReducedConstructions")
    public void setUseReducedConstructions(UseReducedConstructions useReducedConstructions) {
        this.useReducedConstructions = useReducedConstructions;
    }

    @JsonProperty("OBFees")
    public OBFees getOBFees() {
        return oBFees;
    }

    @JsonProperty("OBFees")
    public void setOBFees(OBFees oBFees) {
        this.oBFees = oBFees;
    }

    @JsonProperty("FareBreaksAtLegs")
    public FareBreaksAtLegs getFareBreaksAtLegs() {
        return fareBreaksAtLegs;
    }

    @JsonProperty("FareBreaksAtLegs")
    public void setFareBreaksAtLegs(FareBreaksAtLegs fareBreaksAtLegs) {
        this.fareBreaksAtLegs = fareBreaksAtLegs;
    }

    @JsonProperty("FareAdjustment")
    public List<FareAdjustment> getFareAdjustment() {
        return fareAdjustment;
    }

    @JsonProperty("FareAdjustment")
    public void setFareAdjustment(List<FareAdjustment> fareAdjustment) {
        this.fareAdjustment = fareAdjustment;
    }

    @JsonProperty("ForceCompanion")
    public ForceCompanion getForceCompanion() {
        return forceCompanion;
    }

    @JsonProperty("ForceCompanion")
    public void setForceCompanion(ForceCompanion forceCompanion) {
        this.forceCompanion = forceCompanion;
    }

    @JsonProperty("UsePassengerFares")
    public UsePassengerFares_ getUsePassengerFares() {
        return usePassengerFares;
    }

    @JsonProperty("UsePassengerFares")
    public void setUsePassengerFares(UsePassengerFares_ usePassengerFares) {
        this.usePassengerFares = usePassengerFares;
    }

    @JsonProperty("UseNegotiatedFares")
    public UseNegotiatedFares_ getUseNegotiatedFares() {
        return useNegotiatedFares;
    }

    @JsonProperty("UseNegotiatedFares")
    public void setUseNegotiatedFares(UseNegotiatedFares_ useNegotiatedFares) {
        this.useNegotiatedFares = useNegotiatedFares;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("publicFare", publicFare).append("privateFare", privateFare).append("iATAFare", iATAFare).append("webFare", webFare).append("priority", priority).append("indicators", indicators).append("promoID", promoID).append("customerType", customerType).append("multipleTravelerGroups", multipleTravelerGroups).append("brandedFareIndicators", brandedFareIndicators).append("passengerStatus", passengerStatus).append("pointOfSaleOverride", pointOfSaleOverride).append("pointOfTicketingOverride", pointOfTicketingOverride).append("applyResidentDiscount", applyResidentDiscount).append("eTicketableOverride", eTicketableOverride).append("currency", currency).append("useReducedConstructions", useReducedConstructions).append("oBFees", oBFees).append("fareBreaksAtLegs", fareBreaksAtLegs).append("fareAdjustment", fareAdjustment).append("forceCompanion", forceCompanion).append("usePassengerFares", usePassengerFares).append("useNegotiatedFares", useNegotiatedFares).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(applyResidentDiscount).append(useNegotiatedFares).append(fareBreaksAtLegs).append(webFare).append(publicFare).append(pointOfTicketingOverride).append(usePassengerFares).append(privateFare).append(priority).append(indicators).append(multipleTravelerGroups).append(brandedFareIndicators).append(oBFees).append(iATAFare).append(useReducedConstructions).append(forceCompanion).append(customerType).append(fareAdjustment).append(currency).append(promoID).append(passengerStatus).append(pointOfSaleOverride).append(eTicketableOverride).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions___) == false) {
            return false;
        }
        TPAExtensions___ rhs = ((TPAExtensions___) other);
        return new EqualsBuilder().append(applyResidentDiscount, rhs.applyResidentDiscount).append(useNegotiatedFares, rhs.useNegotiatedFares).append(fareBreaksAtLegs, rhs.fareBreaksAtLegs).append(webFare, rhs.webFare).append(publicFare, rhs.publicFare).append(pointOfTicketingOverride, rhs.pointOfTicketingOverride).append(usePassengerFares, rhs.usePassengerFares).append(privateFare, rhs.privateFare).append(priority, rhs.priority).append(indicators, rhs.indicators).append(multipleTravelerGroups, rhs.multipleTravelerGroups).append(brandedFareIndicators, rhs.brandedFareIndicators).append(oBFees, rhs.oBFees).append(iATAFare, rhs.iATAFare).append(useReducedConstructions, rhs.useReducedConstructions).append(forceCompanion, rhs.forceCompanion).append(customerType, rhs.customerType).append(fareAdjustment, rhs.fareAdjustment).append(currency, rhs.currency).append(promoID, rhs.promoID).append(passengerStatus, rhs.passengerStatus).append(pointOfSaleOverride, rhs.pointOfSaleOverride).append(eTicketableOverride, rhs.eTicketableOverride).isEquals();
    }

}

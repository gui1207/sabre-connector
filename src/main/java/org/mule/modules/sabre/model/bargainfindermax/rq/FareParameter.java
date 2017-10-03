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
    "ExcludeRestricted",
    "ResTicketing",
    "MinMaxStay",
    "RefundPenalty",
    "PublicFare",
    "PrivateFare",
    "Cabin",
    "PassengerType",
    "NegotiatedFaresOnly",
    "XOFares",
    "UsePassengerFares",
    "UseNegotiatedFares",
    "PassengerTypeQuantity",
    "JumpCabinLogic",
    "KeepSameCabin",
    "VoluntaryChanges",
    "CorporateID",
    "AccountCode"
})
public class FareParameter {

    @JsonProperty("ExcludeRestricted")
    private ExcludeRestricted excludeRestricted;
    @JsonProperty("ResTicketing")
    private ResTicketing resTicketing;
    @JsonProperty("MinMaxStay")
    private MinMaxStay minMaxStay;
    @JsonProperty("RefundPenalty")
    private RefundPenalty refundPenalty;
    @JsonProperty("PublicFare")
    private PublicFare publicFare;
    @JsonProperty("PrivateFare")
    private PrivateFare privateFare;
    @JsonProperty("Cabin")
    private Cabin_ cabin;
    @JsonProperty("PassengerType")
    private PassengerType passengerType;
    @JsonProperty("NegotiatedFaresOnly")
    private NegotiatedFaresOnly negotiatedFaresOnly;
    @JsonProperty("XOFares")
    private XOFares_ xOFares;
    @JsonProperty("UsePassengerFares")
    private UsePassengerFares usePassengerFares;
    @JsonProperty("UseNegotiatedFares")
    private UseNegotiatedFares useNegotiatedFares;
    @JsonProperty("PassengerTypeQuantity")
    private List<PassengerTypeQuantity> passengerTypeQuantity = new ArrayList<PassengerTypeQuantity>();
    @JsonProperty("JumpCabinLogic")
    private JumpCabinLogic jumpCabinLogic;
    @JsonProperty("KeepSameCabin")
    private KeepSameCabin keepSameCabin;
    @JsonProperty("VoluntaryChanges")
    private VoluntaryChanges_ voluntaryChanges;
    @JsonProperty("CorporateID")
    private List<CorporateID> corporateID = new ArrayList<CorporateID>();
    @JsonProperty("AccountCode")
    private List<AccountCode> accountCode = new ArrayList<AccountCode>();

    @JsonProperty("ExcludeRestricted")
    public ExcludeRestricted getExcludeRestricted() {
        return excludeRestricted;
    }

    @JsonProperty("ExcludeRestricted")
    public void setExcludeRestricted(ExcludeRestricted excludeRestricted) {
        this.excludeRestricted = excludeRestricted;
    }

    @JsonProperty("ResTicketing")
    public ResTicketing getResTicketing() {
        return resTicketing;
    }

    @JsonProperty("ResTicketing")
    public void setResTicketing(ResTicketing resTicketing) {
        this.resTicketing = resTicketing;
    }

    @JsonProperty("MinMaxStay")
    public MinMaxStay getMinMaxStay() {
        return minMaxStay;
    }

    @JsonProperty("MinMaxStay")
    public void setMinMaxStay(MinMaxStay minMaxStay) {
        this.minMaxStay = minMaxStay;
    }

    @JsonProperty("RefundPenalty")
    public RefundPenalty getRefundPenalty() {
        return refundPenalty;
    }

    @JsonProperty("RefundPenalty")
    public void setRefundPenalty(RefundPenalty refundPenalty) {
        this.refundPenalty = refundPenalty;
    }

    @JsonProperty("PublicFare")
    public PublicFare getPublicFare() {
        return publicFare;
    }

    @JsonProperty("PublicFare")
    public void setPublicFare(PublicFare publicFare) {
        this.publicFare = publicFare;
    }

    @JsonProperty("PrivateFare")
    public PrivateFare getPrivateFare() {
        return privateFare;
    }

    @JsonProperty("PrivateFare")
    public void setPrivateFare(PrivateFare privateFare) {
        this.privateFare = privateFare;
    }

    @JsonProperty("Cabin")
    public Cabin_ getCabin() {
        return cabin;
    }

    @JsonProperty("Cabin")
    public void setCabin(Cabin_ cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("PassengerType")
    public PassengerType getPassengerType() {
        return passengerType;
    }

    @JsonProperty("PassengerType")
    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    @JsonProperty("NegotiatedFaresOnly")
    public NegotiatedFaresOnly getNegotiatedFaresOnly() {
        return negotiatedFaresOnly;
    }

    @JsonProperty("NegotiatedFaresOnly")
    public void setNegotiatedFaresOnly(NegotiatedFaresOnly negotiatedFaresOnly) {
        this.negotiatedFaresOnly = negotiatedFaresOnly;
    }

    @JsonProperty("XOFares")
    public XOFares_ getXOFares() {
        return xOFares;
    }

    @JsonProperty("XOFares")
    public void setXOFares(XOFares_ xOFares) {
        this.xOFares = xOFares;
    }

    @JsonProperty("UsePassengerFares")
    public UsePassengerFares getUsePassengerFares() {
        return usePassengerFares;
    }

    @JsonProperty("UsePassengerFares")
    public void setUsePassengerFares(UsePassengerFares usePassengerFares) {
        this.usePassengerFares = usePassengerFares;
    }

    @JsonProperty("UseNegotiatedFares")
    public UseNegotiatedFares getUseNegotiatedFares() {
        return useNegotiatedFares;
    }

    @JsonProperty("UseNegotiatedFares")
    public void setUseNegotiatedFares(UseNegotiatedFares useNegotiatedFares) {
        this.useNegotiatedFares = useNegotiatedFares;
    }

    @JsonProperty("PassengerTypeQuantity")
    public List<PassengerTypeQuantity> getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    @JsonProperty("PassengerTypeQuantity")
    public void setPassengerTypeQuantity(List<PassengerTypeQuantity> passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    @JsonProperty("JumpCabinLogic")
    public JumpCabinLogic getJumpCabinLogic() {
        return jumpCabinLogic;
    }

    @JsonProperty("JumpCabinLogic")
    public void setJumpCabinLogic(JumpCabinLogic jumpCabinLogic) {
        this.jumpCabinLogic = jumpCabinLogic;
    }

    @JsonProperty("KeepSameCabin")
    public KeepSameCabin getKeepSameCabin() {
        return keepSameCabin;
    }

    @JsonProperty("KeepSameCabin")
    public void setKeepSameCabin(KeepSameCabin keepSameCabin) {
        this.keepSameCabin = keepSameCabin;
    }

    @JsonProperty("VoluntaryChanges")
    public VoluntaryChanges_ getVoluntaryChanges() {
        return voluntaryChanges;
    }

    @JsonProperty("VoluntaryChanges")
    public void setVoluntaryChanges(VoluntaryChanges_ voluntaryChanges) {
        this.voluntaryChanges = voluntaryChanges;
    }

    @JsonProperty("CorporateID")
    public List<CorporateID> getCorporateID() {
        return corporateID;
    }

    @JsonProperty("CorporateID")
    public void setCorporateID(List<CorporateID> corporateID) {
        this.corporateID = corporateID;
    }

    @JsonProperty("AccountCode")
    public List<AccountCode> getAccountCode() {
        return accountCode;
    }

    @JsonProperty("AccountCode")
    public void setAccountCode(List<AccountCode> accountCode) {
        this.accountCode = accountCode;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("excludeRestricted", excludeRestricted).append("resTicketing", resTicketing).append("minMaxStay", minMaxStay).append("refundPenalty", refundPenalty).append("publicFare", publicFare).append("privateFare", privateFare).append("cabin", cabin).append("passengerType", passengerType).append("negotiatedFaresOnly", negotiatedFaresOnly).append("xOFares", xOFares).append("usePassengerFares", usePassengerFares).append("useNegotiatedFares", useNegotiatedFares).append("passengerTypeQuantity", passengerTypeQuantity).append("jumpCabinLogic", jumpCabinLogic).append("keepSameCabin", keepSameCabin).append("voluntaryChanges", voluntaryChanges).append("corporateID", corporateID).append("accountCode", accountCode).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(useNegotiatedFares).append(accountCode).append(voluntaryChanges).append(keepSameCabin).append(cabin).append(publicFare).append(usePassengerFares).append(jumpCabinLogic).append(minMaxStay).append(privateFare).append(xOFares).append(corporateID).append(passengerType).append(refundPenalty).append(passengerTypeQuantity).append(excludeRestricted).append(negotiatedFaresOnly).append(resTicketing).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareParameter) == false) {
            return false;
        }
        FareParameter rhs = ((FareParameter) other);
        return new EqualsBuilder().append(useNegotiatedFares, rhs.useNegotiatedFares).append(accountCode, rhs.accountCode).append(voluntaryChanges, rhs.voluntaryChanges).append(keepSameCabin, rhs.keepSameCabin).append(cabin, rhs.cabin).append(publicFare, rhs.publicFare).append(usePassengerFares, rhs.usePassengerFares).append(jumpCabinLogic, rhs.jumpCabinLogic).append(minMaxStay, rhs.minMaxStay).append(privateFare, rhs.privateFare).append(xOFares, rhs.xOFares).append(corporateID, rhs.corporateID).append(passengerType, rhs.passengerType).append(refundPenalty, rhs.refundPenalty).append(passengerTypeQuantity, rhs.passengerTypeQuantity).append(excludeRestricted, rhs.excludeRestricted).append(negotiatedFaresOnly, rhs.negotiatedFaresOnly).append(resTicketing, rhs.resTicketing).isEquals();
    }

}

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
    "ProgramID",
    "MembershipID",
    "TravelSector",
    "RPH",
    "ShareSynchInd",
    "ShareMarketInd",
    "SingleVendorInd",
    "LoyalLevel",
    "SignupDate",
    "EffectiveDate",
    "ExpireDate"
})
public class CustLoyalty {

    @JsonProperty("ProgramID")
    private String programID;
    @JsonProperty("MembershipID")
    private String membershipID;
    @JsonProperty("TravelSector")
    private String travelSector;
    @JsonProperty("RPH")
    private String rPH;
    @JsonProperty("ShareSynchInd")
    private String shareSynchInd;
    @JsonProperty("ShareMarketInd")
    private String shareMarketInd;
    @JsonProperty("SingleVendorInd")
    private String singleVendorInd;
    @JsonProperty("LoyalLevel")
    private String loyalLevel;
    @JsonProperty("SignupDate")
    private String signupDate;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("ExpireDate")
    private String expireDate;

    @JsonProperty("ProgramID")
    public String getProgramID() {
        return programID;
    }

    @JsonProperty("ProgramID")
    public void setProgramID(String programID) {
        this.programID = programID;
    }

    @JsonProperty("MembershipID")
    public String getMembershipID() {
        return membershipID;
    }

    @JsonProperty("MembershipID")
    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    @JsonProperty("TravelSector")
    public String getTravelSector() {
        return travelSector;
    }

    @JsonProperty("TravelSector")
    public void setTravelSector(String travelSector) {
        this.travelSector = travelSector;
    }

    @JsonProperty("RPH")
    public String getRPH() {
        return rPH;
    }

    @JsonProperty("RPH")
    public void setRPH(String rPH) {
        this.rPH = rPH;
    }

    @JsonProperty("ShareSynchInd")
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    @JsonProperty("ShareSynchInd")
    public void setShareSynchInd(String shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }

    @JsonProperty("ShareMarketInd")
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    @JsonProperty("ShareMarketInd")
    public void setShareMarketInd(String shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }

    @JsonProperty("SingleVendorInd")
    public String getSingleVendorInd() {
        return singleVendorInd;
    }

    @JsonProperty("SingleVendorInd")
    public void setSingleVendorInd(String singleVendorInd) {
        this.singleVendorInd = singleVendorInd;
    }

    @JsonProperty("LoyalLevel")
    public String getLoyalLevel() {
        return loyalLevel;
    }

    @JsonProperty("LoyalLevel")
    public void setLoyalLevel(String loyalLevel) {
        this.loyalLevel = loyalLevel;
    }

    @JsonProperty("SignupDate")
    public String getSignupDate() {
        return signupDate;
    }

    @JsonProperty("SignupDate")
    public void setSignupDate(String signupDate) {
        this.signupDate = signupDate;
    }

    @JsonProperty("EffectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("ExpireDate")
    public String getExpireDate() {
        return expireDate;
    }

    @JsonProperty("ExpireDate")
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("programID", programID).append("membershipID", membershipID).append("travelSector", travelSector).append("rPH", rPH).append("shareSynchInd", shareSynchInd).append("shareMarketInd", shareMarketInd).append("singleVendorInd", singleVendorInd).append("loyalLevel", loyalLevel).append("signupDate", signupDate).append("effectiveDate", effectiveDate).append("expireDate", expireDate).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(signupDate).append(shareMarketInd).append(singleVendorInd).append(expireDate).append(membershipID).append(rPH).append(travelSector).append(programID).append(shareSynchInd).append(effectiveDate).append(loyalLevel).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustLoyalty) == false) {
            return false;
        }
        CustLoyalty rhs = ((CustLoyalty) other);
        return new EqualsBuilder().append(signupDate, rhs.signupDate).append(shareMarketInd, rhs.shareMarketInd).append(singleVendorInd, rhs.singleVendorInd).append(expireDate, rhs.expireDate).append(membershipID, rhs.membershipID).append(rPH, rhs.rPH).append(travelSector, rhs.travelSector).append(programID, rhs.programID).append(shareSynchInd, rhs.shareSynchInd).append(effectiveDate, rhs.effectiveDate).append(loyalLevel, rhs.loyalLevel).isEquals();
    }

}

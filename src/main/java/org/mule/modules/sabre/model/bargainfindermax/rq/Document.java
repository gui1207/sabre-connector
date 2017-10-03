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
    "DocHolderName",
    "DocLimitations",
    "DocIssueAuthority",
    "DocIssueLocation",
    "DocID",
    "DocType",
    "Gender",
    "BirthDate",
    "ShareSynchInd",
    "ShareMarketInd",
    "EffectiveDate",
    "ExpireDate"
})
public class Document {

    @JsonProperty("DocHolderName")
    private String docHolderName;
    @JsonProperty("DocLimitations")
    private List<String> docLimitations = new ArrayList<String>();
    @JsonProperty("DocIssueAuthority")
    private String docIssueAuthority;
    @JsonProperty("DocIssueLocation")
    private String docIssueLocation;
    @JsonProperty("DocID")
    private String docID;
    @JsonProperty("DocType")
    private String docType;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("BirthDate")
    private String birthDate;
    @JsonProperty("ShareSynchInd")
    private String shareSynchInd;
    @JsonProperty("ShareMarketInd")
    private String shareMarketInd;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("ExpireDate")
    private String expireDate;

    @JsonProperty("DocHolderName")
    public String getDocHolderName() {
        return docHolderName;
    }

    @JsonProperty("DocHolderName")
    public void setDocHolderName(String docHolderName) {
        this.docHolderName = docHolderName;
    }

    @JsonProperty("DocLimitations")
    public List<String> getDocLimitations() {
        return docLimitations;
    }

    @JsonProperty("DocLimitations")
    public void setDocLimitations(List<String> docLimitations) {
        this.docLimitations = docLimitations;
    }

    @JsonProperty("DocIssueAuthority")
    public String getDocIssueAuthority() {
        return docIssueAuthority;
    }

    @JsonProperty("DocIssueAuthority")
    public void setDocIssueAuthority(String docIssueAuthority) {
        this.docIssueAuthority = docIssueAuthority;
    }

    @JsonProperty("DocIssueLocation")
    public String getDocIssueLocation() {
        return docIssueLocation;
    }

    @JsonProperty("DocIssueLocation")
    public void setDocIssueLocation(String docIssueLocation) {
        this.docIssueLocation = docIssueLocation;
    }

    @JsonProperty("DocID")
    public String getDocID() {
        return docID;
    }

    @JsonProperty("DocID")
    public void setDocID(String docID) {
        this.docID = docID;
    }

    @JsonProperty("DocType")
    public String getDocType() {
        return docType;
    }

    @JsonProperty("DocType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    @JsonProperty("Gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("Gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("BirthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("BirthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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
        return new ToStringBuilder(this).append("docHolderName", docHolderName).append("docLimitations", docLimitations).append("docIssueAuthority", docIssueAuthority).append("docIssueLocation", docIssueLocation).append("docID", docID).append("docType", docType).append("gender", gender).append("birthDate", birthDate).append("shareSynchInd", shareSynchInd).append("shareMarketInd", shareMarketInd).append("effectiveDate", effectiveDate).append("expireDate", expireDate).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(docHolderName).append(shareMarketInd).append(docIssueAuthority).append(gender).append(docID).append(docType).append(birthDate).append(docLimitations).append(docIssueLocation).append(expireDate).append(shareSynchInd).append(effectiveDate).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Document) == false) {
            return false;
        }
        Document rhs = ((Document) other);
        return new EqualsBuilder().append(docHolderName, rhs.docHolderName).append(shareMarketInd, rhs.shareMarketInd).append(docIssueAuthority, rhs.docIssueAuthority).append(gender, rhs.gender).append(docID, rhs.docID).append(docType, rhs.docType).append(birthDate, rhs.birthDate).append(docLimitations, rhs.docLimitations).append(docIssueLocation, rhs.docIssueLocation).append(expireDate, rhs.expireDate).append(shareSynchInd, rhs.shareSynchInd).append(effectiveDate, rhs.effectiveDate).isEquals();
    }

}

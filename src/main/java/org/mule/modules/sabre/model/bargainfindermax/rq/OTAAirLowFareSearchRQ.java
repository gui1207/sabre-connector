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
    "POS",
    "OriginDestinationInformation",
    "Leg",
    "TravelPreferences",
    "TravelerInfoSummary",
    "TPA_Extensions",
    "DirectFlightsOnly",
    "AvailableFlightsOnly",
    "ResponseType",
    "ResponseVersion",
    "SeparateMessages",
    "TruncateMessages",
    "EchoToken",
    "TimeStamp",
    "Target",
    "Version",
    "TransactionIdentifier",
    "SequenceNmbr",
    "TransactionStatusCode",
    "PrimaryLangID",
    "AltLangID",
    "MaxResponses"
})
public class OTAAirLowFareSearchRQ {

    @JsonProperty("POS")
    private POS pOS;
    @JsonProperty("OriginDestinationInformation")
    private List<OriginDestinationInformation> originDestinationInformation = new ArrayList<OriginDestinationInformation>();
    @JsonProperty("Leg")
    private List<Leg> leg = new ArrayList<Leg>();
    @JsonProperty("TravelPreferences")
    private TravelPreferences travelPreferences;
    @JsonProperty("TravelerInfoSummary")
    private TravelerInfoSummary travelerInfoSummary;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions_____ tPAExtensions;
    @JsonProperty("DirectFlightsOnly")
    private Boolean directFlightsOnly;
    @JsonProperty("AvailableFlightsOnly")
    private Boolean availableFlightsOnly;
    @JsonProperty("ResponseType")
    private String responseType;
    @JsonProperty("ResponseVersion")
    private String responseVersion;
    @JsonProperty("SeparateMessages")
    private Boolean separateMessages;
    @JsonProperty("TruncateMessages")
    private Boolean truncateMessages;
    @JsonProperty("EchoToken")
    private String echoToken;
    @JsonProperty("TimeStamp")
    private String timeStamp;
    @JsonProperty("Target")
    private String target;
    @JsonProperty("Version")
    private String version;
    @JsonProperty("TransactionIdentifier")
    private String transactionIdentifier;
    @JsonProperty("SequenceNmbr")
    private String sequenceNmbr;
    @JsonProperty("TransactionStatusCode")
    private String transactionStatusCode;
    @JsonProperty("PrimaryLangID")
    private String primaryLangID;
    @JsonProperty("AltLangID")
    private String altLangID;
    @JsonProperty("MaxResponses")
    private String maxResponses;

    @JsonProperty("POS")
    public POS getPOS() {
        return pOS;
    }

    @JsonProperty("POS")
    public void setPOS(POS pOS) {
        this.pOS = pOS;
    }

    @JsonProperty("OriginDestinationInformation")
    public List<OriginDestinationInformation> getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    @JsonProperty("OriginDestinationInformation")
    public void setOriginDestinationInformation(List<OriginDestinationInformation> originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }

    @JsonProperty("Leg")
    public List<Leg> getLeg() {
        return leg;
    }

    @JsonProperty("Leg")
    public void setLeg(List<Leg> leg) {
        this.leg = leg;
    }

    @JsonProperty("TravelPreferences")
    public TravelPreferences getTravelPreferences() {
        return travelPreferences;
    }

    @JsonProperty("TravelPreferences")
    public void setTravelPreferences(TravelPreferences travelPreferences) {
        this.travelPreferences = travelPreferences;
    }

    @JsonProperty("TravelerInfoSummary")
    public TravelerInfoSummary getTravelerInfoSummary() {
        return travelerInfoSummary;
    }

    @JsonProperty("TravelerInfoSummary")
    public void setTravelerInfoSummary(TravelerInfoSummary travelerInfoSummary) {
        this.travelerInfoSummary = travelerInfoSummary;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions_____ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_____ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("DirectFlightsOnly")
    public Boolean getDirectFlightsOnly() {
        return directFlightsOnly;
    }

    @JsonProperty("DirectFlightsOnly")
    public void setDirectFlightsOnly(Boolean directFlightsOnly) {
        this.directFlightsOnly = directFlightsOnly;
    }

    @JsonProperty("AvailableFlightsOnly")
    public Boolean getAvailableFlightsOnly() {
        return availableFlightsOnly;
    }

    @JsonProperty("AvailableFlightsOnly")
    public void setAvailableFlightsOnly(Boolean availableFlightsOnly) {
        this.availableFlightsOnly = availableFlightsOnly;
    }

    @JsonProperty("ResponseType")
    public String getResponseType() {
        return responseType;
    }

    @JsonProperty("ResponseType")
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    @JsonProperty("ResponseVersion")
    public String getResponseVersion() {
        return responseVersion;
    }

    @JsonProperty("ResponseVersion")
    public void setResponseVersion(String responseVersion) {
        this.responseVersion = responseVersion;
    }

    @JsonProperty("SeparateMessages")
    public Boolean getSeparateMessages() {
        return separateMessages;
    }

    @JsonProperty("SeparateMessages")
    public void setSeparateMessages(Boolean separateMessages) {
        this.separateMessages = separateMessages;
    }

    @JsonProperty("TruncateMessages")
    public Boolean getTruncateMessages() {
        return truncateMessages;
    }

    @JsonProperty("TruncateMessages")
    public void setTruncateMessages(Boolean truncateMessages) {
        this.truncateMessages = truncateMessages;
    }

    @JsonProperty("EchoToken")
    public String getEchoToken() {
        return echoToken;
    }

    @JsonProperty("EchoToken")
    public void setEchoToken(String echoToken) {
        this.echoToken = echoToken;
    }

    @JsonProperty("TimeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("TimeStamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @JsonProperty("Target")
    public String getTarget() {
        return target;
    }

    @JsonProperty("Target")
    public void setTarget(String target) {
        this.target = target;
    }

    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("TransactionIdentifier")
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    @JsonProperty("TransactionIdentifier")
    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    @JsonProperty("SequenceNmbr")
    public String getSequenceNmbr() {
        return sequenceNmbr;
    }

    @JsonProperty("SequenceNmbr")
    public void setSequenceNmbr(String sequenceNmbr) {
        this.sequenceNmbr = sequenceNmbr;
    }

    @JsonProperty("TransactionStatusCode")
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    @JsonProperty("TransactionStatusCode")
    public void setTransactionStatusCode(String transactionStatusCode) {
        this.transactionStatusCode = transactionStatusCode;
    }

    @JsonProperty("PrimaryLangID")
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    @JsonProperty("PrimaryLangID")
    public void setPrimaryLangID(String primaryLangID) {
        this.primaryLangID = primaryLangID;
    }

    @JsonProperty("AltLangID")
    public String getAltLangID() {
        return altLangID;
    }

    @JsonProperty("AltLangID")
    public void setAltLangID(String altLangID) {
        this.altLangID = altLangID;
    }

    @JsonProperty("MaxResponses")
    public String getMaxResponses() {
        return maxResponses;
    }

    @JsonProperty("MaxResponses")
    public void setMaxResponses(String maxResponses) {
        this.maxResponses = maxResponses;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("pOS", pOS).append("originDestinationInformation", originDestinationInformation).append("leg", leg).append("travelPreferences", travelPreferences).append("travelerInfoSummary", travelerInfoSummary).append("tPAExtensions", tPAExtensions).append("directFlightsOnly", directFlightsOnly).append("availableFlightsOnly", availableFlightsOnly).append("responseType", responseType).append("responseVersion", responseVersion).append("separateMessages", separateMessages).append("truncateMessages", truncateMessages).append("echoToken", echoToken).append("timeStamp", timeStamp).append("target", target).append("version", version).append("transactionIdentifier", transactionIdentifier).append("sequenceNmbr", sequenceNmbr).append("transactionStatusCode", transactionStatusCode).append("primaryLangID", primaryLangID).append("altLangID", altLangID).append("maxResponses", maxResponses).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(availableFlightsOnly).append(transactionIdentifier).append(altLangID).append(primaryLangID).append(originDestinationInformation).append(travelPreferences).append(echoToken).append(version).append(travelerInfoSummary).append(leg).append(target).append(separateMessages).append(timeStamp).append(sequenceNmbr).append(responseType).append(responseVersion).append(directFlightsOnly).append(pOS).append(tPAExtensions).append(truncateMessages).append(transactionStatusCode).append(maxResponses).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OTAAirLowFareSearchRQ) == false) {
            return false;
        }
        OTAAirLowFareSearchRQ rhs = ((OTAAirLowFareSearchRQ) other);
        return new EqualsBuilder().append(availableFlightsOnly, rhs.availableFlightsOnly).append(transactionIdentifier, rhs.transactionIdentifier).append(altLangID, rhs.altLangID).append(primaryLangID, rhs.primaryLangID).append(originDestinationInformation, rhs.originDestinationInformation).append(travelPreferences, rhs.travelPreferences).append(echoToken, rhs.echoToken).append(version, rhs.version).append(travelerInfoSummary, rhs.travelerInfoSummary).append(leg, rhs.leg).append(target, rhs.target).append(separateMessages, rhs.separateMessages).append(timeStamp, rhs.timeStamp).append(sequenceNmbr, rhs.sequenceNmbr).append(responseType, rhs.responseType).append(responseVersion, rhs.responseVersion).append(directFlightsOnly, rhs.directFlightsOnly).append(pOS, rhs.pOS).append(tPAExtensions, rhs.tPAExtensions).append(truncateMessages, rhs.truncateMessages).append(transactionStatusCode, rhs.transactionStatusCode).append(maxResponses, rhs.maxResponses).isEquals();
    }

}

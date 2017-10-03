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
    "Errors",
    "Success",
    "Warnings",
    "BrandFeatures",
    "PricedItineraries",
    "OneWayItineraries",
    "DepartedItineraries",
    "SoldOutItineraries",
    "AvailableItineraries",
    "TPA_Extensions",
    "PricedItinCount",
    "BrandedOneWayItinCount",
    "SimpleOneWayItinCount",
    "DepartedItinCount",
    "SoldOutItinCount",
    "AvailableItinCount",
    "EchoToken",
    "TimeStamp",
    "Target",
    "Version",
    "TransactionIdentifier",
    "SequenceNmbr",
    "TransactionStatusCode",
    "PrimaryLangID",
    "AltLangID"
})
public class OTAAirLowFareSearchRS {

    @JsonProperty("Errors")
    private Errors errors;
    @JsonProperty("Success")
    private Success success;
    @JsonProperty("Warnings")
    private Warnings warnings;
    @JsonProperty("BrandFeatures")
    private BrandFeatures brandFeatures;
    @JsonProperty("PricedItineraries")
    private PricedItineraries pricedItineraries;
    @JsonProperty("OneWayItineraries")
    private OneWayItineraries oneWayItineraries;
    @JsonProperty("DepartedItineraries")
    private DepartedItineraries departedItineraries;
    @JsonProperty("SoldOutItineraries")
    private SoldOutItineraries soldOutItineraries;
    @JsonProperty("AvailableItineraries")
    private AvailableItineraries availableItineraries;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions_____________________ tPAExtensions;
    @JsonProperty("PricedItinCount")
    private Double pricedItinCount;
    @JsonProperty("BrandedOneWayItinCount")
    private Double brandedOneWayItinCount;
    @JsonProperty("SimpleOneWayItinCount")
    private Double simpleOneWayItinCount;
    @JsonProperty("DepartedItinCount")
    private Double departedItinCount;
    @JsonProperty("SoldOutItinCount")
    private Double soldOutItinCount;
    @JsonProperty("AvailableItinCount")
    private Double availableItinCount;
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

    @JsonProperty("Errors")
    public Errors getErrors() {
        return errors;
    }

    @JsonProperty("Errors")
    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    @JsonProperty("Success")
    public Success getSuccess() {
        return success;
    }

    @JsonProperty("Success")
    public void setSuccess(Success success) {
        this.success = success;
    }

    @JsonProperty("Warnings")
    public Warnings getWarnings() {
        return warnings;
    }

    @JsonProperty("Warnings")
    public void setWarnings(Warnings warnings) {
        this.warnings = warnings;
    }

    @JsonProperty("BrandFeatures")
    public BrandFeatures getBrandFeatures() {
        return brandFeatures;
    }

    @JsonProperty("BrandFeatures")
    public void setBrandFeatures(BrandFeatures brandFeatures) {
        this.brandFeatures = brandFeatures;
    }

    @JsonProperty("PricedItineraries")
    public PricedItineraries getPricedItineraries() {
        return pricedItineraries;
    }

    @JsonProperty("PricedItineraries")
    public void setPricedItineraries(PricedItineraries pricedItineraries) {
        this.pricedItineraries = pricedItineraries;
    }

    @JsonProperty("OneWayItineraries")
    public OneWayItineraries getOneWayItineraries() {
        return oneWayItineraries;
    }

    @JsonProperty("OneWayItineraries")
    public void setOneWayItineraries(OneWayItineraries oneWayItineraries) {
        this.oneWayItineraries = oneWayItineraries;
    }

    @JsonProperty("DepartedItineraries")
    public DepartedItineraries getDepartedItineraries() {
        return departedItineraries;
    }

    @JsonProperty("DepartedItineraries")
    public void setDepartedItineraries(DepartedItineraries departedItineraries) {
        this.departedItineraries = departedItineraries;
    }

    @JsonProperty("SoldOutItineraries")
    public SoldOutItineraries getSoldOutItineraries() {
        return soldOutItineraries;
    }

    @JsonProperty("SoldOutItineraries")
    public void setSoldOutItineraries(SoldOutItineraries soldOutItineraries) {
        this.soldOutItineraries = soldOutItineraries;
    }

    @JsonProperty("AvailableItineraries")
    public AvailableItineraries getAvailableItineraries() {
        return availableItineraries;
    }

    @JsonProperty("AvailableItineraries")
    public void setAvailableItineraries(AvailableItineraries availableItineraries) {
        this.availableItineraries = availableItineraries;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions_____________________ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_____________________ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("PricedItinCount")
    public Double getPricedItinCount() {
        return pricedItinCount;
    }

    @JsonProperty("PricedItinCount")
    public void setPricedItinCount(Double pricedItinCount) {
        this.pricedItinCount = pricedItinCount;
    }

    @JsonProperty("BrandedOneWayItinCount")
    public Double getBrandedOneWayItinCount() {
        return brandedOneWayItinCount;
    }

    @JsonProperty("BrandedOneWayItinCount")
    public void setBrandedOneWayItinCount(Double brandedOneWayItinCount) {
        this.brandedOneWayItinCount = brandedOneWayItinCount;
    }

    @JsonProperty("SimpleOneWayItinCount")
    public Double getSimpleOneWayItinCount() {
        return simpleOneWayItinCount;
    }

    @JsonProperty("SimpleOneWayItinCount")
    public void setSimpleOneWayItinCount(Double simpleOneWayItinCount) {
        this.simpleOneWayItinCount = simpleOneWayItinCount;
    }

    @JsonProperty("DepartedItinCount")
    public Double getDepartedItinCount() {
        return departedItinCount;
    }

    @JsonProperty("DepartedItinCount")
    public void setDepartedItinCount(Double departedItinCount) {
        this.departedItinCount = departedItinCount;
    }

    @JsonProperty("SoldOutItinCount")
    public Double getSoldOutItinCount() {
        return soldOutItinCount;
    }

    @JsonProperty("SoldOutItinCount")
    public void setSoldOutItinCount(Double soldOutItinCount) {
        this.soldOutItinCount = soldOutItinCount;
    }

    @JsonProperty("AvailableItinCount")
    public Double getAvailableItinCount() {
        return availableItinCount;
    }

    @JsonProperty("AvailableItinCount")
    public void setAvailableItinCount(Double availableItinCount) {
        this.availableItinCount = availableItinCount;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("errors", errors).append("success", success).append("warnings", warnings).append("brandFeatures", brandFeatures).append("pricedItineraries", pricedItineraries).append("oneWayItineraries", oneWayItineraries).append("departedItineraries", departedItineraries).append("soldOutItineraries", soldOutItineraries).append("availableItineraries", availableItineraries).append("tPAExtensions", tPAExtensions).append("pricedItinCount", pricedItinCount).append("brandedOneWayItinCount", brandedOneWayItinCount).append("simpleOneWayItinCount", simpleOneWayItinCount).append("departedItinCount", departedItinCount).append("soldOutItinCount", soldOutItinCount).append("availableItinCount", availableItinCount).append("echoToken", echoToken).append("timeStamp", timeStamp).append("target", target).append("version", version).append("transactionIdentifier", transactionIdentifier).append("sequenceNmbr", sequenceNmbr).append("transactionStatusCode", transactionStatusCode).append("primaryLangID", primaryLangID).append("altLangID", altLangID).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(availableItinCount).append(transactionIdentifier).append(departedItinCount).append(echoToken).append(sequenceNmbr).append(soldOutItineraries).append(pricedItinCount).append(simpleOneWayItinCount).append(brandFeatures).append(availableItineraries).append(transactionStatusCode).append(oneWayItineraries).append(warnings).append(brandedOneWayItinCount).append(altLangID).append(primaryLangID).append(version).append(departedItineraries).append(target).append(timeStamp).append(pricedItineraries).append(tPAExtensions).append(success).append(soldOutItinCount).append(errors).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OTAAirLowFareSearchRS) == false) {
            return false;
        }
        OTAAirLowFareSearchRS rhs = ((OTAAirLowFareSearchRS) other);
        return new EqualsBuilder().append(availableItinCount, rhs.availableItinCount).append(transactionIdentifier, rhs.transactionIdentifier).append(departedItinCount, rhs.departedItinCount).append(echoToken, rhs.echoToken).append(sequenceNmbr, rhs.sequenceNmbr).append(soldOutItineraries, rhs.soldOutItineraries).append(pricedItinCount, rhs.pricedItinCount).append(simpleOneWayItinCount, rhs.simpleOneWayItinCount).append(brandFeatures, rhs.brandFeatures).append(availableItineraries, rhs.availableItineraries).append(transactionStatusCode, rhs.transactionStatusCode).append(oneWayItineraries, rhs.oneWayItineraries).append(warnings, rhs.warnings).append(brandedOneWayItinCount, rhs.brandedOneWayItinCount).append(altLangID, rhs.altLangID).append(primaryLangID, rhs.primaryLangID).append(version, rhs.version).append(departedItineraries, rhs.departedItineraries).append(target, rhs.target).append(timeStamp, rhs.timeStamp).append(pricedItineraries, rhs.pricedItineraries).append(tPAExtensions, rhs.tPAExtensions).append(success, rhs.success).append(soldOutItinCount, rhs.soldOutItinCount).append(errors, rhs.errors).isEquals();
    }

}

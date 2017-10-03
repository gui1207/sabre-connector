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
    "Fare",
    "POS",
    "OriginDestinationInformation",
    "Arunk",
    "TravelPreferences",
    "TravelerInfoSummary",
    "TPA_Extensions",
    "OriginalTktIssueDateTime",
    "ExchangedTktIssueDateTime",
    "PreviousExchangeDateTime",
    "NumberOfTaxBoxes",
    "BypassAdvancePurchaseOption"
})
public class Exchange {

    @JsonProperty("Fare")
    private Fare_ fare;
    @JsonProperty("POS")
    private POS_ pOS;
    @JsonProperty("OriginDestinationInformation")
    private OriginDestinationInformation_ originDestinationInformation;
    @JsonProperty("Arunk")
    private List<Arunk> arunk = new ArrayList<Arunk>();
    @JsonProperty("TravelPreferences")
    private TravelPreferences_ travelPreferences;
    @JsonProperty("TravelerInfoSummary")
    private TravelerInfoSummary travelerInfoSummary;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions_______ tPAExtensions;
    @JsonProperty("OriginalTktIssueDateTime")
    private String originalTktIssueDateTime;
    @JsonProperty("ExchangedTktIssueDateTime")
    private String exchangedTktIssueDateTime;
    @JsonProperty("PreviousExchangeDateTime")
    private String previousExchangeDateTime;
    @JsonProperty("NumberOfTaxBoxes")
    private Double numberOfTaxBoxes;
    @JsonProperty("BypassAdvancePurchaseOption")
    private String bypassAdvancePurchaseOption;

    @JsonProperty("Fare")
    public Fare_ getFare() {
        return fare;
    }

    @JsonProperty("Fare")
    public void setFare(Fare_ fare) {
        this.fare = fare;
    }

    @JsonProperty("POS")
    public POS_ getPOS() {
        return pOS;
    }

    @JsonProperty("POS")
    public void setPOS(POS_ pOS) {
        this.pOS = pOS;
    }

    @JsonProperty("OriginDestinationInformation")
    public OriginDestinationInformation_ getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    @JsonProperty("OriginDestinationInformation")
    public void setOriginDestinationInformation(OriginDestinationInformation_ originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }

    @JsonProperty("Arunk")
    public List<Arunk> getArunk() {
        return arunk;
    }

    @JsonProperty("Arunk")
    public void setArunk(List<Arunk> arunk) {
        this.arunk = arunk;
    }

    @JsonProperty("TravelPreferences")
    public TravelPreferences_ getTravelPreferences() {
        return travelPreferences;
    }

    @JsonProperty("TravelPreferences")
    public void setTravelPreferences(TravelPreferences_ travelPreferences) {
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
    public TPAExtensions_______ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_______ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("OriginalTktIssueDateTime")
    public String getOriginalTktIssueDateTime() {
        return originalTktIssueDateTime;
    }

    @JsonProperty("OriginalTktIssueDateTime")
    public void setOriginalTktIssueDateTime(String originalTktIssueDateTime) {
        this.originalTktIssueDateTime = originalTktIssueDateTime;
    }

    @JsonProperty("ExchangedTktIssueDateTime")
    public String getExchangedTktIssueDateTime() {
        return exchangedTktIssueDateTime;
    }

    @JsonProperty("ExchangedTktIssueDateTime")
    public void setExchangedTktIssueDateTime(String exchangedTktIssueDateTime) {
        this.exchangedTktIssueDateTime = exchangedTktIssueDateTime;
    }

    @JsonProperty("PreviousExchangeDateTime")
    public String getPreviousExchangeDateTime() {
        return previousExchangeDateTime;
    }

    @JsonProperty("PreviousExchangeDateTime")
    public void setPreviousExchangeDateTime(String previousExchangeDateTime) {
        this.previousExchangeDateTime = previousExchangeDateTime;
    }

    @JsonProperty("NumberOfTaxBoxes")
    public Double getNumberOfTaxBoxes() {
        return numberOfTaxBoxes;
    }

    @JsonProperty("NumberOfTaxBoxes")
    public void setNumberOfTaxBoxes(Double numberOfTaxBoxes) {
        this.numberOfTaxBoxes = numberOfTaxBoxes;
    }

    @JsonProperty("BypassAdvancePurchaseOption")
    public String getBypassAdvancePurchaseOption() {
        return bypassAdvancePurchaseOption;
    }

    @JsonProperty("BypassAdvancePurchaseOption")
    public void setBypassAdvancePurchaseOption(String bypassAdvancePurchaseOption) {
        this.bypassAdvancePurchaseOption = bypassAdvancePurchaseOption;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("fare", fare).append("pOS", pOS).append("originDestinationInformation", originDestinationInformation).append("arunk", arunk).append("travelPreferences", travelPreferences).append("travelerInfoSummary", travelerInfoSummary).append("tPAExtensions", tPAExtensions).append("originalTktIssueDateTime", originalTktIssueDateTime).append("exchangedTktIssueDateTime", exchangedTktIssueDateTime).append("previousExchangeDateTime", previousExchangeDateTime).append("numberOfTaxBoxes", numberOfTaxBoxes).append("bypassAdvancePurchaseOption", bypassAdvancePurchaseOption).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(fare).append(originalTktIssueDateTime).append(exchangedTktIssueDateTime).append(bypassAdvancePurchaseOption).append(originDestinationInformation).append(arunk).append(travelPreferences).append(numberOfTaxBoxes).append(travelerInfoSummary).append(previousExchangeDateTime).append(pOS).append(tPAExtensions).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Exchange) == false) {
            return false;
        }
        Exchange rhs = ((Exchange) other);
        return new EqualsBuilder().append(fare, rhs.fare).append(originalTktIssueDateTime, rhs.originalTktIssueDateTime).append(exchangedTktIssueDateTime, rhs.exchangedTktIssueDateTime).append(bypassAdvancePurchaseOption, rhs.bypassAdvancePurchaseOption).append(originDestinationInformation, rhs.originDestinationInformation).append(arunk, rhs.arunk).append(travelPreferences, rhs.travelPreferences).append(numberOfTaxBoxes, rhs.numberOfTaxBoxes).append(travelerInfoSummary, rhs.travelerInfoSummary).append(previousExchangeDateTime, rhs.previousExchangeDateTime).append(pOS, rhs.pOS).append(tPAExtensions, rhs.tPAExtensions).isEquals();
    }

}

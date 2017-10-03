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
    "Weightings",
    "TimeOfDayDistribution",
    "InboundOutboundPairing",
    "AdditionalNonStopsNumber",
    "AdditionalNonStopsPercentage"
})
public class DiversityParameters {

    @JsonProperty("Weightings")
    private Weightings weightings;
    @JsonProperty("TimeOfDayDistribution")
    private TimeOfDayDistribution timeOfDayDistribution;
    @JsonProperty("InboundOutboundPairing")
    private Integer inboundOutboundPairing;
    @JsonProperty("AdditionalNonStopsNumber")
    private Integer additionalNonStopsNumber;
    @JsonProperty("AdditionalNonStopsPercentage")
    private Integer additionalNonStopsPercentage;

    @JsonProperty("Weightings")
    public Weightings getWeightings() {
        return weightings;
    }

    @JsonProperty("Weightings")
    public void setWeightings(Weightings weightings) {
        this.weightings = weightings;
    }

    @JsonProperty("TimeOfDayDistribution")
    public TimeOfDayDistribution getTimeOfDayDistribution() {
        return timeOfDayDistribution;
    }

    @JsonProperty("TimeOfDayDistribution")
    public void setTimeOfDayDistribution(TimeOfDayDistribution timeOfDayDistribution) {
        this.timeOfDayDistribution = timeOfDayDistribution;
    }

    @JsonProperty("InboundOutboundPairing")
    public Integer getInboundOutboundPairing() {
        return inboundOutboundPairing;
    }

    @JsonProperty("InboundOutboundPairing")
    public void setInboundOutboundPairing(Integer inboundOutboundPairing) {
        this.inboundOutboundPairing = inboundOutboundPairing;
    }

    @JsonProperty("AdditionalNonStopsNumber")
    public Integer getAdditionalNonStopsNumber() {
        return additionalNonStopsNumber;
    }

    @JsonProperty("AdditionalNonStopsNumber")
    public void setAdditionalNonStopsNumber(Integer additionalNonStopsNumber) {
        this.additionalNonStopsNumber = additionalNonStopsNumber;
    }

    @JsonProperty("AdditionalNonStopsPercentage")
    public Integer getAdditionalNonStopsPercentage() {
        return additionalNonStopsPercentage;
    }

    @JsonProperty("AdditionalNonStopsPercentage")
    public void setAdditionalNonStopsPercentage(Integer additionalNonStopsPercentage) {
        this.additionalNonStopsPercentage = additionalNonStopsPercentage;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("weightings", weightings).append("timeOfDayDistribution", timeOfDayDistribution).append("inboundOutboundPairing", inboundOutboundPairing).append("additionalNonStopsNumber", additionalNonStopsNumber).append("additionalNonStopsPercentage", additionalNonStopsPercentage).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeOfDayDistribution).append(inboundOutboundPairing).append(additionalNonStopsPercentage).append(weightings).append(additionalNonStopsNumber).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiversityParameters) == false) {
            return false;
        }
        DiversityParameters rhs = ((DiversityParameters) other);
        return new EqualsBuilder().append(timeOfDayDistribution, rhs.timeOfDayDistribution).append(inboundOutboundPairing, rhs.inboundOutboundPairing).append(additionalNonStopsPercentage, rhs.additionalNonStopsPercentage).append(weightings, rhs.weightings).append(additionalNonStopsNumber, rhs.additionalNonStopsNumber).isEquals();
    }

}

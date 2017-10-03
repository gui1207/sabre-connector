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
    "FareRestriction",
    "PreferLevel",
    "AdvResTicketing",
    "StayRestrictions",
    "VoluntaryChanges"
})
public class FareRestrictPref {

    @JsonProperty("FareRestriction")
    private String fareRestriction;
    @JsonProperty("PreferLevel")
    private String preferLevel;
    @JsonProperty("AdvResTicketing")
    private AdvResTicketing advResTicketing;
    @JsonProperty("StayRestrictions")
    private StayRestrictions stayRestrictions;
    @JsonProperty("VoluntaryChanges")
    private VoluntaryChanges voluntaryChanges;

    @JsonProperty("FareRestriction")
    public String getFareRestriction() {
        return fareRestriction;
    }

    @JsonProperty("FareRestriction")
    public void setFareRestriction(String fareRestriction) {
        this.fareRestriction = fareRestriction;
    }

    @JsonProperty("PreferLevel")
    public String getPreferLevel() {
        return preferLevel;
    }

    @JsonProperty("PreferLevel")
    public void setPreferLevel(String preferLevel) {
        this.preferLevel = preferLevel;
    }

    @JsonProperty("AdvResTicketing")
    public AdvResTicketing getAdvResTicketing() {
        return advResTicketing;
    }

    @JsonProperty("AdvResTicketing")
    public void setAdvResTicketing(AdvResTicketing advResTicketing) {
        this.advResTicketing = advResTicketing;
    }

    @JsonProperty("StayRestrictions")
    public StayRestrictions getStayRestrictions() {
        return stayRestrictions;
    }

    @JsonProperty("StayRestrictions")
    public void setStayRestrictions(StayRestrictions stayRestrictions) {
        this.stayRestrictions = stayRestrictions;
    }

    @JsonProperty("VoluntaryChanges")
    public VoluntaryChanges getVoluntaryChanges() {
        return voluntaryChanges;
    }

    @JsonProperty("VoluntaryChanges")
    public void setVoluntaryChanges(VoluntaryChanges voluntaryChanges) {
        this.voluntaryChanges = voluntaryChanges;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("fareRestriction", fareRestriction).append("preferLevel", preferLevel).append("advResTicketing", advResTicketing).append("stayRestrictions", stayRestrictions).append("voluntaryChanges", voluntaryChanges).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(preferLevel).append(fareRestriction).append(stayRestrictions).append(voluntaryChanges).append(advResTicketing).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareRestrictPref) == false) {
            return false;
        }
        FareRestrictPref rhs = ((FareRestrictPref) other);
        return new EqualsBuilder().append(preferLevel, rhs.preferLevel).append(fareRestriction, rhs.fareRestriction).append(stayRestrictions, rhs.stayRestrictions).append(voluntaryChanges, rhs.voluntaryChanges).append(advResTicketing, rhs.advResTicketing).isEquals();
    }

}

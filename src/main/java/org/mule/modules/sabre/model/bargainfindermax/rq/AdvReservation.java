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
    "LatestTimeOfDay",
    "LatestPeriod",
    "LatestUnit"
})
public class AdvReservation {

    @JsonProperty("LatestTimeOfDay")
    private String latestTimeOfDay;
    @JsonProperty("LatestPeriod")
    private String latestPeriod;
    @JsonProperty("LatestUnit")
    private String latestUnit;

    @JsonProperty("LatestTimeOfDay")
    public String getLatestTimeOfDay() {
        return latestTimeOfDay;
    }

    @JsonProperty("LatestTimeOfDay")
    public void setLatestTimeOfDay(String latestTimeOfDay) {
        this.latestTimeOfDay = latestTimeOfDay;
    }

    @JsonProperty("LatestPeriod")
    public String getLatestPeriod() {
        return latestPeriod;
    }

    @JsonProperty("LatestPeriod")
    public void setLatestPeriod(String latestPeriod) {
        this.latestPeriod = latestPeriod;
    }

    @JsonProperty("LatestUnit")
    public String getLatestUnit() {
        return latestUnit;
    }

    @JsonProperty("LatestUnit")
    public void setLatestUnit(String latestUnit) {
        this.latestUnit = latestUnit;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("latestTimeOfDay", latestTimeOfDay).append("latestPeriod", latestPeriod).append("latestUnit", latestUnit).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(latestPeriod).append(latestUnit).append(latestTimeOfDay).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvReservation) == false) {
            return false;
        }
        AdvReservation rhs = ((AdvReservation) other);
        return new EqualsBuilder().append(latestPeriod, rhs.latestPeriod).append(latestUnit, rhs.latestUnit).append(latestTimeOfDay, rhs.latestTimeOfDay).isEquals();
    }

}

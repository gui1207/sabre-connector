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
    "FromResTimeOfDay",
    "FromResPeriod",
    "FromResUnit",
    "FromDepartTimeOfDay",
    "FromDepartPeriod",
    "FromDepartUnit"
})
public class AdvTicketing {

    @JsonProperty("FromResTimeOfDay")
    private String fromResTimeOfDay;
    @JsonProperty("FromResPeriod")
    private String fromResPeriod;
    @JsonProperty("FromResUnit")
    private String fromResUnit;
    @JsonProperty("FromDepartTimeOfDay")
    private String fromDepartTimeOfDay;
    @JsonProperty("FromDepartPeriod")
    private String fromDepartPeriod;
    @JsonProperty("FromDepartUnit")
    private String fromDepartUnit;

    @JsonProperty("FromResTimeOfDay")
    public String getFromResTimeOfDay() {
        return fromResTimeOfDay;
    }

    @JsonProperty("FromResTimeOfDay")
    public void setFromResTimeOfDay(String fromResTimeOfDay) {
        this.fromResTimeOfDay = fromResTimeOfDay;
    }

    @JsonProperty("FromResPeriod")
    public String getFromResPeriod() {
        return fromResPeriod;
    }

    @JsonProperty("FromResPeriod")
    public void setFromResPeriod(String fromResPeriod) {
        this.fromResPeriod = fromResPeriod;
    }

    @JsonProperty("FromResUnit")
    public String getFromResUnit() {
        return fromResUnit;
    }

    @JsonProperty("FromResUnit")
    public void setFromResUnit(String fromResUnit) {
        this.fromResUnit = fromResUnit;
    }

    @JsonProperty("FromDepartTimeOfDay")
    public String getFromDepartTimeOfDay() {
        return fromDepartTimeOfDay;
    }

    @JsonProperty("FromDepartTimeOfDay")
    public void setFromDepartTimeOfDay(String fromDepartTimeOfDay) {
        this.fromDepartTimeOfDay = fromDepartTimeOfDay;
    }

    @JsonProperty("FromDepartPeriod")
    public String getFromDepartPeriod() {
        return fromDepartPeriod;
    }

    @JsonProperty("FromDepartPeriod")
    public void setFromDepartPeriod(String fromDepartPeriod) {
        this.fromDepartPeriod = fromDepartPeriod;
    }

    @JsonProperty("FromDepartUnit")
    public String getFromDepartUnit() {
        return fromDepartUnit;
    }

    @JsonProperty("FromDepartUnit")
    public void setFromDepartUnit(String fromDepartUnit) {
        this.fromDepartUnit = fromDepartUnit;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("fromResTimeOfDay", fromResTimeOfDay).append("fromResPeriod", fromResPeriod).append("fromResUnit", fromResUnit).append("fromDepartTimeOfDay", fromDepartTimeOfDay).append("fromDepartPeriod", fromDepartPeriod).append("fromDepartUnit", fromDepartUnit).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(fromResPeriod).append(fromDepartUnit).append(fromResTimeOfDay).append(fromDepartTimeOfDay).append(fromDepartPeriod).append(fromResUnit).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvTicketing) == false) {
            return false;
        }
        AdvTicketing rhs = ((AdvTicketing) other);
        return new EqualsBuilder().append(fromResPeriod, rhs.fromResPeriod).append(fromDepartUnit, rhs.fromDepartUnit).append(fromResTimeOfDay, rhs.fromResTimeOfDay).append(fromDepartTimeOfDay, rhs.fromDepartTimeOfDay).append(fromDepartPeriod, rhs.fromDepartPeriod).append(fromResUnit, rhs.fromResUnit).isEquals();
    }

}

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
    "TimeWindowStart",
    "TimeWindowEnd",
    "TimeTolerance",
    "DateFlexibility",
    "MaxOptionsPerDate",
    "ConnectionTimeMin",
    "ConnectionTimeMax",
    "DateTime",
    "WeekDays"
})
public class DepartureDateTime {

    @JsonProperty("TimeWindowStart")
    private String timeWindowStart;
    @JsonProperty("TimeWindowEnd")
    private String timeWindowEnd;
    @JsonProperty("TimeTolerance")
    private Integer timeTolerance;
    @JsonProperty("DateFlexibility")
    private Integer dateFlexibility;
    @JsonProperty("MaxOptionsPerDate")
    private Integer maxOptionsPerDate;
    @JsonProperty("ConnectionTimeMin")
    private Integer connectionTimeMin;
    @JsonProperty("ConnectionTimeMax")
    private Integer connectionTimeMax;
    @JsonProperty("DateTime")
    private String dateTime;
    @JsonProperty("WeekDays")
    private String weekDays;

    @JsonProperty("TimeWindowStart")
    public String getTimeWindowStart() {
        return timeWindowStart;
    }

    @JsonProperty("TimeWindowStart")
    public void setTimeWindowStart(String timeWindowStart) {
        this.timeWindowStart = timeWindowStart;
    }

    @JsonProperty("TimeWindowEnd")
    public String getTimeWindowEnd() {
        return timeWindowEnd;
    }

    @JsonProperty("TimeWindowEnd")
    public void setTimeWindowEnd(String timeWindowEnd) {
        this.timeWindowEnd = timeWindowEnd;
    }

    @JsonProperty("TimeTolerance")
    public Integer getTimeTolerance() {
        return timeTolerance;
    }

    @JsonProperty("TimeTolerance")
    public void setTimeTolerance(Integer timeTolerance) {
        this.timeTolerance = timeTolerance;
    }

    @JsonProperty("DateFlexibility")
    public Integer getDateFlexibility() {
        return dateFlexibility;
    }

    @JsonProperty("DateFlexibility")
    public void setDateFlexibility(Integer dateFlexibility) {
        this.dateFlexibility = dateFlexibility;
    }

    @JsonProperty("MaxOptionsPerDate")
    public Integer getMaxOptionsPerDate() {
        return maxOptionsPerDate;
    }

    @JsonProperty("MaxOptionsPerDate")
    public void setMaxOptionsPerDate(Integer maxOptionsPerDate) {
        this.maxOptionsPerDate = maxOptionsPerDate;
    }

    @JsonProperty("ConnectionTimeMin")
    public Integer getConnectionTimeMin() {
        return connectionTimeMin;
    }

    @JsonProperty("ConnectionTimeMin")
    public void setConnectionTimeMin(Integer connectionTimeMin) {
        this.connectionTimeMin = connectionTimeMin;
    }

    @JsonProperty("ConnectionTimeMax")
    public Integer getConnectionTimeMax() {
        return connectionTimeMax;
    }

    @JsonProperty("ConnectionTimeMax")
    public void setConnectionTimeMax(Integer connectionTimeMax) {
        this.connectionTimeMax = connectionTimeMax;
    }

    @JsonProperty("DateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("WeekDays")
    public String getWeekDays() {
        return weekDays;
    }

    @JsonProperty("WeekDays")
    public void setWeekDays(String weekDays) {
        this.weekDays = weekDays;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("timeWindowStart", timeWindowStart).append("timeWindowEnd", timeWindowEnd).append("timeTolerance", timeTolerance).append("dateFlexibility", dateFlexibility).append("maxOptionsPerDate", maxOptionsPerDate).append("connectionTimeMin", connectionTimeMin).append("connectionTimeMax", connectionTimeMax).append("dateTime", dateTime).append("weekDays", weekDays).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeWindowStart).append(dateTime).append(dateFlexibility).append(weekDays).append(timeWindowEnd).append(connectionTimeMax).append(connectionTimeMin).append(timeTolerance).append(maxOptionsPerDate).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepartureDateTime) == false) {
            return false;
        }
        DepartureDateTime rhs = ((DepartureDateTime) other);
        return new EqualsBuilder().append(timeWindowStart, rhs.timeWindowStart).append(dateTime, rhs.dateTime).append(dateFlexibility, rhs.dateFlexibility).append(weekDays, rhs.weekDays).append(timeWindowEnd, rhs.timeWindowEnd).append(connectionTimeMax, rhs.connectionTimeMax).append(connectionTimeMin, rhs.connectionTimeMin).append(timeTolerance, rhs.timeTolerance).append(maxOptionsPerDate, rhs.maxOptionsPerDate).isEquals();
    }

}

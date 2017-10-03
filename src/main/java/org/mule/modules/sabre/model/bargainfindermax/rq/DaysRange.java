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
    "FromDate",
    "ToDate",
    "WeekDays"
})
public class DaysRange {

    @JsonProperty("FromDate")
    private String fromDate;
    @JsonProperty("ToDate")
    private String toDate;
    @JsonProperty("WeekDays")
    private String weekDays;

    @JsonProperty("FromDate")
    public String getFromDate() {
        return fromDate;
    }

    @JsonProperty("FromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    @JsonProperty("ToDate")
    public String getToDate() {
        return toDate;
    }

    @JsonProperty("ToDate")
    public void setToDate(String toDate) {
        this.toDate = toDate;
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
        return new ToStringBuilder(this).append("fromDate", fromDate).append("toDate", toDate).append("weekDays", weekDays).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(fromDate).append(weekDays).append(toDate).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DaysRange) == false) {
            return false;
        }
        DaysRange rhs = ((DaysRange) other);
        return new EqualsBuilder().append(fromDate, rhs.fromDate).append(weekDays, rhs.weekDays).append(toDate, rhs.toDate).isEquals();
    }

}

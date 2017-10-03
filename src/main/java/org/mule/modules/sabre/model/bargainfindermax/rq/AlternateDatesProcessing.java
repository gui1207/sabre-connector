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
    "CalendarMode",
    "NumOptionsPerAlternateDate"
})
public class AlternateDatesProcessing {

    @JsonProperty("CalendarMode")
    private Boolean calendarMode;
    @JsonProperty("NumOptionsPerAlternateDate")
    private Integer numOptionsPerAlternateDate;

    @JsonProperty("CalendarMode")
    public Boolean getCalendarMode() {
        return calendarMode;
    }

    @JsonProperty("CalendarMode")
    public void setCalendarMode(Boolean calendarMode) {
        this.calendarMode = calendarMode;
    }

    @JsonProperty("NumOptionsPerAlternateDate")
    public Integer getNumOptionsPerAlternateDate() {
        return numOptionsPerAlternateDate;
    }

    @JsonProperty("NumOptionsPerAlternateDate")
    public void setNumOptionsPerAlternateDate(Integer numOptionsPerAlternateDate) {
        this.numOptionsPerAlternateDate = numOptionsPerAlternateDate;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("calendarMode", calendarMode).append("numOptionsPerAlternateDate", numOptionsPerAlternateDate).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(calendarMode).append(numOptionsPerAlternateDate).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlternateDatesProcessing) == false) {
            return false;
        }
        AlternateDatesProcessing rhs = ((AlternateDatesProcessing) other);
        return new EqualsBuilder().append(calendarMode, rhs.calendarMode).append(numOptionsPerAlternateDate, rhs.numOptionsPerAlternateDate).isEquals();
    }

}

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
    "Day",
    "DaysRange"
})
public class ArrivalDates {

    @JsonProperty("Day")
    private List<Day> day = new ArrayList<Day>();
    @JsonProperty("DaysRange")
    private List<DaysRange> daysRange = new ArrayList<DaysRange>();

    @JsonProperty("Day")
    public List<Day> getDay() {
        return day;
    }

    @JsonProperty("Day")
    public void setDay(List<Day> day) {
        this.day = day;
    }

    @JsonProperty("DaysRange")
    public List<DaysRange> getDaysRange() {
        return daysRange;
    }

    @JsonProperty("DaysRange")
    public void setDaysRange(List<DaysRange> daysRange) {
        this.daysRange = daysRange;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("day", day).append("daysRange", daysRange).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(day).append(daysRange).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArrivalDates) == false) {
            return false;
        }
        ArrivalDates rhs = ((ArrivalDates) other);
        return new EqualsBuilder().append(day, rhs.day).append(daysRange, rhs.daysRange).isEquals();
    }

}

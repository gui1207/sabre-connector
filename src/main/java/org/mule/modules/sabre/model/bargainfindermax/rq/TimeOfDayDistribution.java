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
    "TimeOfDayRange"
})
public class TimeOfDayDistribution {

    @JsonProperty("TimeOfDayRange")
    private List<TimeOfDayRange> timeOfDayRange = new ArrayList<TimeOfDayRange>();

    @JsonProperty("TimeOfDayRange")
    public List<TimeOfDayRange> getTimeOfDayRange() {
        return timeOfDayRange;
    }

    @JsonProperty("TimeOfDayRange")
    public void setTimeOfDayRange(List<TimeOfDayRange> timeOfDayRange) {
        this.timeOfDayRange = timeOfDayRange;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("timeOfDayRange", timeOfDayRange).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeOfDayRange).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeOfDayDistribution) == false) {
            return false;
        }
        TimeOfDayDistribution rhs = ((TimeOfDayDistribution) other);
        return new EqualsBuilder().append(timeOfDayRange, rhs.timeOfDayRange).isEquals();
    }

}

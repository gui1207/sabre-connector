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
    "Begin",
    "End",
    "Percentage"
})
public class TimeOfDayRange {

    @JsonProperty("Begin")
    private String begin;
    @JsonProperty("End")
    private String end;
    @JsonProperty("Percentage")
    private Integer percentage;

    @JsonProperty("Begin")
    public String getBegin() {
        return begin;
    }

    @JsonProperty("Begin")
    public void setBegin(String begin) {
        this.begin = begin;
    }

    @JsonProperty("End")
    public String getEnd() {
        return end;
    }

    @JsonProperty("End")
    public void setEnd(String end) {
        this.end = end;
    }

    @JsonProperty("Percentage")
    public Integer getPercentage() {
        return percentage;
    }

    @JsonProperty("Percentage")
    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("begin", begin).append("end", end).append("percentage", percentage).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(end).append(begin).append(percentage).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeOfDayRange) == false) {
            return false;
        }
        TimeOfDayRange rhs = ((TimeOfDayRange) other);
        return new EqualsBuilder().append(end, rhs.end).append(begin, rhs.begin).append(percentage, rhs.percentage).isEquals();
    }

}

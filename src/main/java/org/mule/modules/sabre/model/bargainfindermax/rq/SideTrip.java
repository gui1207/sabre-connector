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
    "Number",
    "Start",
    "End"
})
public class SideTrip {

    @JsonProperty("Number")
    private Double number;
    @JsonProperty("Start")
    private Boolean start;
    @JsonProperty("End")
    private Boolean end;

    @JsonProperty("Number")
    public Double getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(Double number) {
        this.number = number;
    }

    @JsonProperty("Start")
    public Boolean getStart() {
        return start;
    }

    @JsonProperty("Start")
    public void setStart(Boolean start) {
        this.start = start;
    }

    @JsonProperty("End")
    public Boolean getEnd() {
        return end;
    }

    @JsonProperty("End")
    public void setEnd(Boolean end) {
        this.end = end;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("number", number).append("start", start).append("end", end).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(start).append(number).append(end).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SideTrip) == false) {
            return false;
        }
        SideTrip rhs = ((SideTrip) other);
        return new EqualsBuilder().append(start, rhs.start).append(number, rhs.number).append(end, rhs.end).isEquals();
    }

}

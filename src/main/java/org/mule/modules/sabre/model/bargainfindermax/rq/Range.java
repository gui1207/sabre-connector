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
    "Options"
})
public class Range {

    @JsonProperty("Begin")
    private String begin;
    @JsonProperty("End")
    private String end;
    @JsonProperty("Options")
    private String options;

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

    @JsonProperty("Options")
    public String getOptions() {
        return options;
    }

    @JsonProperty("Options")
    public void setOptions(String options) {
        this.options = options;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("begin", begin).append("end", end).append("options", options).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(options).append(end).append(begin).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Range) == false) {
            return false;
        }
        Range rhs = ((Range) other);
        return new EqualsBuilder().append(options, rhs.options).append(end, rhs.end).append(begin, rhs.begin).isEquals();
    }

}

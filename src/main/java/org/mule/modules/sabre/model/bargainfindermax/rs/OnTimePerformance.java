/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Level",
    "Percentage"
})
public class OnTimePerformance {

    @JsonProperty("Level")
    private String level;
    @JsonProperty("Percentage")
    private String percentage;

    @JsonProperty("Level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("Level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("Percentage")
    public String getPercentage() {
        return percentage;
    }

    @JsonProperty("Percentage")
    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("level", level).append("percentage", percentage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(level).append(percentage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OnTimePerformance) == false) {
            return false;
        }
        OnTimePerformance rhs = ((OnTimePerformance) other);
        return new EqualsBuilder().append(level, rhs.level).append(percentage, rhs.percentage).isEquals();
    }

}

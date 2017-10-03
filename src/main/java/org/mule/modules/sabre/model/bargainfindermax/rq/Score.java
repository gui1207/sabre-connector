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
    "Value",
    "Carrier"
})
public class Score {

    @JsonProperty("Value")
    private Integer value;
    @JsonProperty("Carrier")
    private String carrier;

    @JsonProperty("Value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @JsonProperty("Carrier")
    public String getCarrier() {
        return carrier;
    }

    @JsonProperty("Carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("carrier", carrier).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(carrier).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Score) == false) {
            return false;
        }
        Score rhs = ((Score) other);
        return new EqualsBuilder().append(value, rhs.value).append(carrier, rhs.carrier).isEquals();
    }

}

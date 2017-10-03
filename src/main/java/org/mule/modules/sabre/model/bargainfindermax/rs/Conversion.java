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
    "From",
    "To",
    "RateOfExchange"
})
public class Conversion {

    @JsonProperty("From")
    private String from;
    @JsonProperty("To")
    private String to;
    @JsonProperty("RateOfExchange")
    private Double rateOfExchange;

    @JsonProperty("From")
    public String getFrom() {
        return from;
    }

    @JsonProperty("From")
    public void setFrom(String from) {
        this.from = from;
    }

    @JsonProperty("To")
    public String getTo() {
        return to;
    }

    @JsonProperty("To")
    public void setTo(String to) {
        this.to = to;
    }

    @JsonProperty("RateOfExchange")
    public Double getRateOfExchange() {
        return rateOfExchange;
    }

    @JsonProperty("RateOfExchange")
    public void setRateOfExchange(Double rateOfExchange) {
        this.rateOfExchange = rateOfExchange;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("from", from).append("to", to).append("rateOfExchange", rateOfExchange).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(from).append(to).append(rateOfExchange).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conversion) == false) {
            return false;
        }
        Conversion rhs = ((Conversion) other);
        return new EqualsBuilder().append(from, rhs.from).append(to, rhs.to).append(rateOfExchange, rhs.rateOfExchange).isEquals();
    }

}

/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

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
    "PricingSource",
    "Message",
    "Leg"
})
public class ProcessingMessage {

    @JsonProperty("PricingSource")
    private String pricingSource;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Leg")
    private List<Leg> leg = new ArrayList<Leg>();

    @JsonProperty("PricingSource")
    public String getPricingSource() {
        return pricingSource;
    }

    @JsonProperty("PricingSource")
    public void setPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
    }

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("Leg")
    public List<Leg> getLeg() {
        return leg;
    }

    @JsonProperty("Leg")
    public void setLeg(List<Leg> leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pricingSource", pricingSource).append("message", message).append("leg", leg).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(message).append(pricingSource).append(leg).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessingMessage) == false) {
            return false;
        }
        ProcessingMessage rhs = ((ProcessingMessage) other);
        return new EqualsBuilder().append(message, rhs.message).append(pricingSource, rhs.pricingSource).append(leg, rhs.leg).isEquals();
    }

}

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
    "AdvReservation",
    "AdvTicketing",
    "AdvResInd",
    "AdvTicketingInd"
})
public class AdvResTicketing {

    @JsonProperty("AdvReservation")
    private AdvReservation advReservation;
    @JsonProperty("AdvTicketing")
    private AdvTicketing advTicketing;
    @JsonProperty("AdvResInd")
    private Boolean advResInd;
    @JsonProperty("AdvTicketingInd")
    private Boolean advTicketingInd;

    @JsonProperty("AdvReservation")
    public AdvReservation getAdvReservation() {
        return advReservation;
    }

    @JsonProperty("AdvReservation")
    public void setAdvReservation(AdvReservation advReservation) {
        this.advReservation = advReservation;
    }

    @JsonProperty("AdvTicketing")
    public AdvTicketing getAdvTicketing() {
        return advTicketing;
    }

    @JsonProperty("AdvTicketing")
    public void setAdvTicketing(AdvTicketing advTicketing) {
        this.advTicketing = advTicketing;
    }

    @JsonProperty("AdvResInd")
    public Boolean getAdvResInd() {
        return advResInd;
    }

    @JsonProperty("AdvResInd")
    public void setAdvResInd(Boolean advResInd) {
        this.advResInd = advResInd;
    }

    @JsonProperty("AdvTicketingInd")
    public Boolean getAdvTicketingInd() {
        return advTicketingInd;
    }

    @JsonProperty("AdvTicketingInd")
    public void setAdvTicketingInd(Boolean advTicketingInd) {
        this.advTicketingInd = advTicketingInd;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("advReservation", advReservation).append("advTicketing", advTicketing).append("advResInd", advResInd).append("advTicketingInd", advTicketingInd).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(advReservation).append(advTicketingInd).append(advResInd).append(advTicketing).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvResTicketing) == false) {
            return false;
        }
        AdvResTicketing rhs = ((AdvResTicketing) other);
        return new EqualsBuilder().append(advReservation, rhs.advReservation).append(advTicketingInd, rhs.advTicketingInd).append(advResInd, rhs.advResInd).append(advTicketing, rhs.advTicketing).isEquals();
    }

}

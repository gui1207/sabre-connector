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
    "Ticket"
})
public class Tickets {

    @JsonProperty("Ticket")
    private List<Ticket> ticket = new ArrayList<Ticket>();

    @JsonProperty("Ticket")
    public List<Ticket> getTicket() {
        return ticket;
    }

    @JsonProperty("Ticket")
    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ticket", ticket).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ticket).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tickets) == false) {
            return false;
        }
        Tickets rhs = ((Tickets) other);
        return new EqualsBuilder().append(ticket, rhs.ticket).isEquals();
    }

}

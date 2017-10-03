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
    "TPA_Extensions",
    "ValidInterlineTicket"
})
public class TravelPreferences_ {

    @JsonProperty("TPA_Extensions")
    private TPAExtensions______ tPAExtensions;
    @JsonProperty("ValidInterlineTicket")
    private Boolean validInterlineTicket;

    @JsonProperty("TPA_Extensions")
    public TPAExtensions______ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions______ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("ValidInterlineTicket")
    public Boolean getValidInterlineTicket() {
        return validInterlineTicket;
    }

    @JsonProperty("ValidInterlineTicket")
    public void setValidInterlineTicket(Boolean validInterlineTicket) {
        this.validInterlineTicket = validInterlineTicket;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("tPAExtensions", tPAExtensions).append("validInterlineTicket", validInterlineTicket).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(tPAExtensions).append(validInterlineTicket).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TravelPreferences_) == false) {
            return false;
        }
        TravelPreferences_ rhs = ((TravelPreferences_) other);
        return new EqualsBuilder().append(tPAExtensions, rhs.tPAExtensions).append(validInterlineTicket, rhs.validInterlineTicket).isEquals();
    }

}

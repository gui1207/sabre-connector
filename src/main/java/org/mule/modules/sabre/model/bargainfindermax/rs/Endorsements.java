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
    "Endorsement",
    "TPA_Extensions",
    "NonRefundableIndicator",
    "NonEndorsableIndicator"
})
public class Endorsements {

    @JsonProperty("Endorsement")
    private List<Endorsement> endorsement = new ArrayList<Endorsement>();
    @JsonProperty("TPA_Extensions")
    private String tPAExtensions;
    @JsonProperty("NonRefundableIndicator")
    private Boolean nonRefundableIndicator;
    @JsonProperty("NonEndorsableIndicator")
    private Boolean nonEndorsableIndicator;

    @JsonProperty("Endorsement")
    public List<Endorsement> getEndorsement() {
        return endorsement;
    }

    @JsonProperty("Endorsement")
    public void setEndorsement(List<Endorsement> endorsement) {
        this.endorsement = endorsement;
    }

    @JsonProperty("TPA_Extensions")
    public String getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(String tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("NonRefundableIndicator")
    public Boolean getNonRefundableIndicator() {
        return nonRefundableIndicator;
    }

    @JsonProperty("NonRefundableIndicator")
    public void setNonRefundableIndicator(Boolean nonRefundableIndicator) {
        this.nonRefundableIndicator = nonRefundableIndicator;
    }

    @JsonProperty("NonEndorsableIndicator")
    public Boolean getNonEndorsableIndicator() {
        return nonEndorsableIndicator;
    }

    @JsonProperty("NonEndorsableIndicator")
    public void setNonEndorsableIndicator(Boolean nonEndorsableIndicator) {
        this.nonEndorsableIndicator = nonEndorsableIndicator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endorsement", endorsement).append("tPAExtensions", tPAExtensions).append("nonRefundableIndicator", nonRefundableIndicator).append("nonEndorsableIndicator", nonEndorsableIndicator).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endorsement).append(tPAExtensions).append(nonRefundableIndicator).append(nonEndorsableIndicator).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endorsements) == false) {
            return false;
        }
        Endorsements rhs = ((Endorsements) other);
        return new EqualsBuilder().append(endorsement, rhs.endorsement).append(tPAExtensions, rhs.tPAExtensions).append(nonRefundableIndicator, rhs.nonRefundableIndicator).append(nonEndorsableIndicator, rhs.nonEndorsableIndicator).isEquals();
    }

}

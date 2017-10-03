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
    "Penalty",
    "VolChangeInd"
})
public class VoluntaryChanges {

    @JsonProperty("Penalty")
    private Penalty penalty;
    @JsonProperty("VolChangeInd")
    private Boolean volChangeInd;

    @JsonProperty("Penalty")
    public Penalty getPenalty() {
        return penalty;
    }

    @JsonProperty("Penalty")
    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    @JsonProperty("VolChangeInd")
    public Boolean getVolChangeInd() {
        return volChangeInd;
    }

    @JsonProperty("VolChangeInd")
    public void setVolChangeInd(Boolean volChangeInd) {
        this.volChangeInd = volChangeInd;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("penalty", penalty).append("volChangeInd", volChangeInd).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(penalty).append(volChangeInd).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VoluntaryChanges) == false) {
            return false;
        }
        VoluntaryChanges rhs = ((VoluntaryChanges) other);
        return new EqualsBuilder().append(penalty, rhs.penalty).append(volChangeInd, rhs.volChangeInd).isEquals();
    }

}

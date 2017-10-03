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
    "Penalty",
    "Match"
})
public class VoluntaryChanges {

    @JsonProperty("Penalty")
    private List<Penalty_> penalty = new ArrayList<Penalty_>();
    @JsonProperty("Match")
    private String match;

    @JsonProperty("Penalty")
    public List<Penalty_> getPenalty() {
        return penalty;
    }

    @JsonProperty("Penalty")
    public void setPenalty(List<Penalty_> penalty) {
        this.penalty = penalty;
    }

    @JsonProperty("Match")
    public String getMatch() {
        return match;
    }

    @JsonProperty("Match")
    public void setMatch(String match) {
        this.match = match;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("penalty", penalty).append("match", match).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(match).append(penalty).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VoluntaryChanges) == false) {
            return false;
        }
        VoluntaryChanges rhs = ((VoluntaryChanges) other);
        return new EqualsBuilder().append(match, rhs.match).append(penalty, rhs.penalty).isEquals();
    }

}

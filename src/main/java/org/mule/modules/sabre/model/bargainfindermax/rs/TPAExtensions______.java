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
    "SeatsRemaining",
    "Cabin",
    "FareNote",
    "Meal",
    "Rule"
})
public class TPAExtensions______ {

    @JsonProperty("SeatsRemaining")
    private SeatsRemaining_ seatsRemaining;
    @JsonProperty("Cabin")
    private Cabin_ cabin;
    @JsonProperty("FareNote")
    private List<FareNote_> fareNote = new ArrayList<FareNote_>();
    @JsonProperty("Meal")
    private Meal_ meal;
    @JsonProperty("Rule")
    private List<Rule_> rule = new ArrayList<Rule_>();

    @JsonProperty("SeatsRemaining")
    public SeatsRemaining_ getSeatsRemaining() {
        return seatsRemaining;
    }

    @JsonProperty("SeatsRemaining")
    public void setSeatsRemaining(SeatsRemaining_ seatsRemaining) {
        this.seatsRemaining = seatsRemaining;
    }

    @JsonProperty("Cabin")
    public Cabin_ getCabin() {
        return cabin;
    }

    @JsonProperty("Cabin")
    public void setCabin(Cabin_ cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("FareNote")
    public List<FareNote_> getFareNote() {
        return fareNote;
    }

    @JsonProperty("FareNote")
    public void setFareNote(List<FareNote_> fareNote) {
        this.fareNote = fareNote;
    }

    @JsonProperty("Meal")
    public Meal_ getMeal() {
        return meal;
    }

    @JsonProperty("Meal")
    public void setMeal(Meal_ meal) {
        this.meal = meal;
    }

    @JsonProperty("Rule")
    public List<Rule_> getRule() {
        return rule;
    }

    @JsonProperty("Rule")
    public void setRule(List<Rule_> rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("seatsRemaining", seatsRemaining).append("cabin", cabin).append("fareNote", fareNote).append("meal", meal).append("rule", rule).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(meal).append(cabin).append(fareNote).append(rule).append(seatsRemaining).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions______) == false) {
            return false;
        }
        TPAExtensions______ rhs = ((TPAExtensions______) other);
        return new EqualsBuilder().append(meal, rhs.meal).append(cabin, rhs.cabin).append(fareNote, rhs.fareNote).append(rule, rhs.rule).append(seatsRemaining, rhs.seatsRemaining).isEquals();
    }

}

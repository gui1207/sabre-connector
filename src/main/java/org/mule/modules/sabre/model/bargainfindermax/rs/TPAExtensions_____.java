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
public class TPAExtensions_____ {

    @JsonProperty("SeatsRemaining")
    private SeatsRemaining seatsRemaining;
    @JsonProperty("Cabin")
    private Cabin cabin;
    @JsonProperty("FareNote")
    private List<FareNote> fareNote = new ArrayList<FareNote>();
    @JsonProperty("Meal")
    private Meal meal;
    @JsonProperty("Rule")
    private List<Rule> rule = new ArrayList<Rule>();

    @JsonProperty("SeatsRemaining")
    public SeatsRemaining getSeatsRemaining() {
        return seatsRemaining;
    }

    @JsonProperty("SeatsRemaining")
    public void setSeatsRemaining(SeatsRemaining seatsRemaining) {
        this.seatsRemaining = seatsRemaining;
    }

    @JsonProperty("Cabin")
    public Cabin getCabin() {
        return cabin;
    }

    @JsonProperty("Cabin")
    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("FareNote")
    public List<FareNote> getFareNote() {
        return fareNote;
    }

    @JsonProperty("FareNote")
    public void setFareNote(List<FareNote> fareNote) {
        this.fareNote = fareNote;
    }

    @JsonProperty("Meal")
    public Meal getMeal() {
        return meal;
    }

    @JsonProperty("Meal")
    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    @JsonProperty("Rule")
    public List<Rule> getRule() {
        return rule;
    }

    @JsonProperty("Rule")
    public void setRule(List<Rule> rule) {
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
        if ((other instanceof TPAExtensions_____) == false) {
            return false;
        }
        TPAExtensions_____ rhs = ((TPAExtensions_____) other);
        return new EqualsBuilder().append(meal, rhs.meal).append(cabin, rhs.cabin).append(fareNote, rhs.fareNote).append(rule, rhs.rule).append(seatsRemaining, rhs.seatsRemaining).isEquals();
    }

}

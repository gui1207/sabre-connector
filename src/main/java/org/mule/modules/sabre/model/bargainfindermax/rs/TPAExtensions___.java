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
    "BirthDate",
    "Age",
    "State",
    "TotalNumber",
    "VoluntaryChanges"
})
public class TPAExtensions___ {

    @JsonProperty("BirthDate")
    private BirthDate birthDate;
    @JsonProperty("Age")
    private Age age;
    @JsonProperty("State")
    private State state;
    @JsonProperty("TotalNumber")
    private TotalNumber totalNumber;
    @JsonProperty("VoluntaryChanges")
    private VoluntaryChanges voluntaryChanges;

    @JsonProperty("BirthDate")
    public BirthDate getBirthDate() {
        return birthDate;
    }

    @JsonProperty("BirthDate")
    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("Age")
    public Age getAge() {
        return age;
    }

    @JsonProperty("Age")
    public void setAge(Age age) {
        this.age = age;
    }

    @JsonProperty("State")
    public State getState() {
        return state;
    }

    @JsonProperty("State")
    public void setState(State state) {
        this.state = state;
    }

    @JsonProperty("TotalNumber")
    public TotalNumber getTotalNumber() {
        return totalNumber;
    }

    @JsonProperty("TotalNumber")
    public void setTotalNumber(TotalNumber totalNumber) {
        this.totalNumber = totalNumber;
    }

    @JsonProperty("VoluntaryChanges")
    public VoluntaryChanges getVoluntaryChanges() {
        return voluntaryChanges;
    }

    @JsonProperty("VoluntaryChanges")
    public void setVoluntaryChanges(VoluntaryChanges voluntaryChanges) {
        this.voluntaryChanges = voluntaryChanges;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("birthDate", birthDate).append("age", age).append("state", state).append("totalNumber", totalNumber).append("voluntaryChanges", voluntaryChanges).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalNumber).append(state).append(voluntaryChanges).append(birthDate).append(age).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions___) == false) {
            return false;
        }
        TPAExtensions___ rhs = ((TPAExtensions___) other);
        return new EqualsBuilder().append(totalNumber, rhs.totalNumber).append(state, rhs.state).append(voluntaryChanges, rhs.voluntaryChanges).append(birthDate, rhs.birthDate).append(age, rhs.age).isEquals();
    }

}

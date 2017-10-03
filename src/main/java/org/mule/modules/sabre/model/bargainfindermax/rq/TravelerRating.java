/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

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
    "Score",
    "FrequentFlyer"
})
public class TravelerRating {

    @JsonProperty("Score")
    private List<Score> score = new ArrayList<Score>();
    @JsonProperty("FrequentFlyer")
    private List<FrequentFlyer_> frequentFlyer = new ArrayList<FrequentFlyer_>();

    @JsonProperty("Score")
    public List<Score> getScore() {
        return score;
    }

    @JsonProperty("Score")
    public void setScore(List<Score> score) {
        this.score = score;
    }

    @JsonProperty("FrequentFlyer")
    public List<FrequentFlyer_> getFrequentFlyer() {
        return frequentFlyer;
    }

    @JsonProperty("FrequentFlyer")
    public void setFrequentFlyer(List<FrequentFlyer_> frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("score", score).append("frequentFlyer", frequentFlyer).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(score).append(frequentFlyer).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TravelerRating) == false) {
            return false;
        }
        TravelerRating rhs = ((TravelerRating) other);
        return new EqualsBuilder().append(score, rhs.score).append(frequentFlyer, rhs.frequentFlyer).isEquals();
    }

}

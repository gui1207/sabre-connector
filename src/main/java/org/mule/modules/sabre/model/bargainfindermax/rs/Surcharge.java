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
    "content",
    "Ind",
    "Type"
})
public class Surcharge {

    @JsonProperty("content")
    private String content;
    @JsonProperty("Ind")
    private String ind;
    @JsonProperty("Type")
    private String type;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("Ind")
    public String getInd() {
        return ind;
    }

    @JsonProperty("Ind")
    public void setInd(String ind) {
        this.ind = ind;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("ind", ind).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(content).append(ind).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Surcharge) == false) {
            return false;
        }
        Surcharge rhs = ((Surcharge) other);
        return new EqualsBuilder().append(type, rhs.type).append(content, rhs.content).append(ind, rhs.ind).isEquals();
    }

}

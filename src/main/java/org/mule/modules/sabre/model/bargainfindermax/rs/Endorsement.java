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
    "Language"
})
public class Endorsement {

    @JsonProperty("content")
    private String content;
    @JsonProperty("Language")
    private String language;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("Language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("language", language).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(content).append(language).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endorsement) == false) {
            return false;
        }
        Endorsement rhs = ((Endorsement) other);
        return new EqualsBuilder().append(content, rhs.content).append(language, rhs.language).isEquals();
    }

}

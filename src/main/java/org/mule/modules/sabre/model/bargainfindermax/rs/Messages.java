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
    "Message"
})
public class Messages {

    @JsonProperty("Message")
    private List<Message_> message = new ArrayList<Message_>();

    @JsonProperty("Message")
    public List<Message_> getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(List<Message_> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("message", message).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(message).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Messages) == false) {
            return false;
        }
        Messages rhs = ((Messages) other);
        return new EqualsBuilder().append(message, rhs.message).isEquals();
    }

}

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
    "ProcessingMessage"
})
public class TPAExtensions__________________ {

    @JsonProperty("ProcessingMessage")
    private List<ProcessingMessage> processingMessage = new ArrayList<ProcessingMessage>();

    @JsonProperty("ProcessingMessage")
    public List<ProcessingMessage> getProcessingMessage() {
        return processingMessage;
    }

    @JsonProperty("ProcessingMessage")
    public void setProcessingMessage(List<ProcessingMessage> processingMessage) {
        this.processingMessage = processingMessage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("processingMessage", processingMessage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(processingMessage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions__________________) == false) {
            return false;
        }
        TPAExtensions__________________ rhs = ((TPAExtensions__________________) other);
        return new EqualsBuilder().append(processingMessage, rhs.processingMessage).isEquals();
    }

}

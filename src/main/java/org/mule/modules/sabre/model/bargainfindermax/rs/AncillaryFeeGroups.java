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
    "AncillaryFeeGroup",
    "Message"
})
public class AncillaryFeeGroups {

    @JsonProperty("AncillaryFeeGroup")
    private List<AncillaryFeeGroup> ancillaryFeeGroup = new ArrayList<AncillaryFeeGroup>();
    @JsonProperty("Message")
    private String message;

    @JsonProperty("AncillaryFeeGroup")
    public List<AncillaryFeeGroup> getAncillaryFeeGroup() {
        return ancillaryFeeGroup;
    }

    @JsonProperty("AncillaryFeeGroup")
    public void setAncillaryFeeGroup(List<AncillaryFeeGroup> ancillaryFeeGroup) {
        this.ancillaryFeeGroup = ancillaryFeeGroup;
    }

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ancillaryFeeGroup", ancillaryFeeGroup).append("message", message).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(message).append(ancillaryFeeGroup).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AncillaryFeeGroups) == false) {
            return false;
        }
        AncillaryFeeGroups rhs = ((AncillaryFeeGroups) other);
        return new EqualsBuilder().append(message, rhs.message).append(ancillaryFeeGroup, rhs.ancillaryFeeGroup).isEquals();
    }

}

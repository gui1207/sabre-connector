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
    "AncillaryFeeItem",
    "Code",
    "Name",
    "Message"
})
public class AncillaryFeeGroup {

    @JsonProperty("AncillaryFeeItem")
    private List<AncillaryFeeItem> ancillaryFeeItem = new ArrayList<AncillaryFeeItem>();
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Message")
    private String message;

    @JsonProperty("AncillaryFeeItem")
    public List<AncillaryFeeItem> getAncillaryFeeItem() {
        return ancillaryFeeItem;
    }

    @JsonProperty("AncillaryFeeItem")
    public void setAncillaryFeeItem(List<AncillaryFeeItem> ancillaryFeeItem) {
        this.ancillaryFeeItem = ancillaryFeeItem;
    }

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
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
        return new ToStringBuilder(this).append("ancillaryFeeItem", ancillaryFeeItem).append("code", code).append("name", name).append("message", message).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(ancillaryFeeItem).append(code).append(message).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AncillaryFeeGroup) == false) {
            return false;
        }
        AncillaryFeeGroup rhs = ((AncillaryFeeGroup) other);
        return new EqualsBuilder().append(name, rhs.name).append(ancillaryFeeItem, rhs.ancillaryFeeItem).append(code, rhs.code).append(message, rhs.message).isEquals();
    }

}

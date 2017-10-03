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
    "eTicket",
    "DataElement",
    "Mileage",
    "Message"
})
public class TPAExtensions_ {

    @JsonProperty("eTicket")
    private ETicket eTicket;
    @JsonProperty("DataElement")
    private DataElement dataElement;
    @JsonProperty("Mileage")
    private Mileage mileage;
    @JsonProperty("Message")
    private Message message;

    @JsonProperty("eTicket")
    public ETicket getETicket() {
        return eTicket;
    }

    @JsonProperty("eTicket")
    public void setETicket(ETicket eTicket) {
        this.eTicket = eTicket;
    }

    @JsonProperty("DataElement")
    public DataElement getDataElement() {
        return dataElement;
    }

    @JsonProperty("DataElement")
    public void setDataElement(DataElement dataElement) {
        this.dataElement = dataElement;
    }

    @JsonProperty("Mileage")
    public Mileage getMileage() {
        return mileage;
    }

    @JsonProperty("Mileage")
    public void setMileage(Mileage mileage) {
        this.mileage = mileage;
    }

    @JsonProperty("Message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eTicket", eTicket).append("dataElement", dataElement).append("mileage", mileage).append("message", message).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eTicket).append(dataElement).append(message).append(mileage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions_) == false) {
            return false;
        }
        TPAExtensions_ rhs = ((TPAExtensions_) other);
        return new EqualsBuilder().append(eTicket, rhs.eTicket).append(dataElement, rhs.dataElement).append(message, rhs.message).append(mileage, rhs.mileage).isEquals();
    }

}

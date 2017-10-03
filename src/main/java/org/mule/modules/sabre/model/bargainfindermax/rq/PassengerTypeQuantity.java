/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Age",
    "Code",
    "CodeContext",
    "URI",
    "Quantity",
    "TPA_Extensions",
    "Changeable",
    "Index",
    "RequestedPassengerIndex"
})
public class PassengerTypeQuantity {

    @JsonProperty("Age")
    private Integer age;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("CodeContext")
    private String codeContext;
    @JsonProperty("URI")
    private String uRI;
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions__ tPAExtensions;
    @JsonProperty("Changeable")
    private Boolean changeable;
    @JsonProperty("Index")
    private Integer index;
    @JsonProperty("RequestedPassengerIndex")
    private Integer requestedPassengerIndex;

    @JsonProperty("Age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("Age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("CodeContext")
    public String getCodeContext() {
        return codeContext;
    }

    @JsonProperty("CodeContext")
    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }

    @JsonProperty("URI")
    public String getURI() {
        return uRI;
    }

    @JsonProperty("URI")
    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions__ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions__ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("Changeable")
    public Boolean getChangeable() {
        return changeable;
    }

    @JsonProperty("Changeable")
    public void setChangeable(Boolean changeable) {
        this.changeable = changeable;
    }

    @JsonProperty("Index")
    public Integer getIndex() {
        return index;
    }

    @JsonProperty("Index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    @JsonProperty("RequestedPassengerIndex")
    public Integer getRequestedPassengerIndex() {
        return requestedPassengerIndex;
    }

    @JsonProperty("RequestedPassengerIndex")
    public void setRequestedPassengerIndex(Integer requestedPassengerIndex) {
        this.requestedPassengerIndex = requestedPassengerIndex;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("age", age).append("code", code).append("codeContext", codeContext).append("uRI", uRI).append("quantity", quantity).append("tPAExtensions", tPAExtensions).append("changeable", changeable).append("index", index).append("requestedPassengerIndex", requestedPassengerIndex).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(quantity).append(tPAExtensions).append(requestedPassengerIndex).append(codeContext).append(changeable).append(index).append(uRI).append(age).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassengerTypeQuantity) == false) {
            return false;
        }
        PassengerTypeQuantity rhs = ((PassengerTypeQuantity) other);
        return new EqualsBuilder().append(code, rhs.code).append(quantity, rhs.quantity).append(tPAExtensions, rhs.tPAExtensions).append(requestedPassengerIndex, rhs.requestedPassengerIndex).append(codeContext, rhs.codeContext).append(changeable, rhs.changeable).append(index, rhs.index).append(uRI, rhs.uRI).append(age, rhs.age).isEquals();
    }

}

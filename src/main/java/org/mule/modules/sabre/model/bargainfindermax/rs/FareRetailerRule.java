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
    "TransactionType",
    "Code"
})
public class FareRetailerRule {

    @JsonProperty("TransactionType")
    private String transactionType;
    @JsonProperty("Code")
    private String code;

    @JsonProperty("TransactionType")
    public String getTransactionType() {
        return transactionType;
    }

    @JsonProperty("TransactionType")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transactionType", transactionType).append("code", code).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(transactionType).append(code).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareRetailerRule) == false) {
            return false;
        }
        FareRetailerRule rhs = ((FareRetailerRule) other);
        return new EqualsBuilder().append(transactionType, rhs.transactionType).append(code, rhs.code).isEquals();
    }

}

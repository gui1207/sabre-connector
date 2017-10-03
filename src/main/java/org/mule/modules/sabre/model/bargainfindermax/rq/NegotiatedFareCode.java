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
    "TPA_Extensions",
    "Supplier",
    "SecondaryCode",
    "SupplierCode",
    "Code",
    "CodeContext",
    "URI",
    "Quantity"
})
public class NegotiatedFareCode {

    @JsonProperty("TPA_Extensions")
    private List<String> tPAExtensions = new ArrayList<String>();
    @JsonProperty("Supplier")
    private List<CompanyName> supplier = new ArrayList<CompanyName>();
    @JsonProperty("SecondaryCode")
    private String secondaryCode;
    @JsonProperty("SupplierCode")
    private String supplierCode;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("CodeContext")
    private String codeContext;
    @JsonProperty("URI")
    private String uRI;
    @JsonProperty("Quantity")
    private Integer quantity;

    @JsonProperty("TPA_Extensions")
    public List<String> getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(List<String> tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("Supplier")
    public List<CompanyName> getSupplier() {
        return supplier;
    }

    @JsonProperty("Supplier")
    public void setSupplier(List<CompanyName> supplier) {
        this.supplier = supplier;
    }

    @JsonProperty("SecondaryCode")
    public String getSecondaryCode() {
        return secondaryCode;
    }

    @JsonProperty("SecondaryCode")
    public void setSecondaryCode(String secondaryCode) {
        this.secondaryCode = secondaryCode;
    }

    @JsonProperty("SupplierCode")
    public String getSupplierCode() {
        return supplierCode;
    }

    @JsonProperty("SupplierCode")
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
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

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("tPAExtensions", tPAExtensions).append("supplier", supplier).append("secondaryCode", secondaryCode).append("supplierCode", supplierCode).append("code", code).append("codeContext", codeContext).append("uRI", uRI).append("quantity", quantity).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(quantity).append(tPAExtensions).append(supplier).append(secondaryCode).append(codeContext).append(supplierCode).append(uRI).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NegotiatedFareCode) == false) {
            return false;
        }
        NegotiatedFareCode rhs = ((NegotiatedFareCode) other);
        return new EqualsBuilder().append(code, rhs.code).append(quantity, rhs.quantity).append(tPAExtensions, rhs.tPAExtensions).append(supplier, rhs.supplier).append(secondaryCode, rhs.secondaryCode).append(codeContext, rhs.codeContext).append(supplierCode, rhs.supplierCode).append(uRI, rhs.uRI).isEquals();
    }

}

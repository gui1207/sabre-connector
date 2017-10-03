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
    "ChangeFees",
    "ResidualIdicator",
    "TypeOfServiceFee",
    "TypeOfReissueTransaction",
    "ReissueResultFromTag",
    "FormOfRefund",
    "ReissueRequiresElectronicTicket",
    "ReissueDoesNotAllowElectronicTicket",
    "TaxRefundable"
})
public class ReissueInfo {

    @JsonProperty("ChangeFees")
    private ChangeFees changeFees;
    @JsonProperty("ResidualIdicator")
    private String residualIdicator;
    @JsonProperty("TypeOfServiceFee")
    private String typeOfServiceFee;
    @JsonProperty("TypeOfReissueTransaction")
    private String typeOfReissueTransaction;
    @JsonProperty("ReissueResultFromTag")
    private Boolean reissueResultFromTag;
    @JsonProperty("FormOfRefund")
    private String formOfRefund;
    @JsonProperty("ReissueRequiresElectronicTicket")
    private Boolean reissueRequiresElectronicTicket;
    @JsonProperty("ReissueDoesNotAllowElectronicTicket")
    private Boolean reissueDoesNotAllowElectronicTicket;
    @JsonProperty("TaxRefundable")
    private Boolean taxRefundable;

    @JsonProperty("ChangeFees")
    public ChangeFees getChangeFees() {
        return changeFees;
    }

    @JsonProperty("ChangeFees")
    public void setChangeFees(ChangeFees changeFees) {
        this.changeFees = changeFees;
    }

    @JsonProperty("ResidualIdicator")
    public String getResidualIdicator() {
        return residualIdicator;
    }

    @JsonProperty("ResidualIdicator")
    public void setResidualIdicator(String residualIdicator) {
        this.residualIdicator = residualIdicator;
    }

    @JsonProperty("TypeOfServiceFee")
    public String getTypeOfServiceFee() {
        return typeOfServiceFee;
    }

    @JsonProperty("TypeOfServiceFee")
    public void setTypeOfServiceFee(String typeOfServiceFee) {
        this.typeOfServiceFee = typeOfServiceFee;
    }

    @JsonProperty("TypeOfReissueTransaction")
    public String getTypeOfReissueTransaction() {
        return typeOfReissueTransaction;
    }

    @JsonProperty("TypeOfReissueTransaction")
    public void setTypeOfReissueTransaction(String typeOfReissueTransaction) {
        this.typeOfReissueTransaction = typeOfReissueTransaction;
    }

    @JsonProperty("ReissueResultFromTag")
    public Boolean getReissueResultFromTag() {
        return reissueResultFromTag;
    }

    @JsonProperty("ReissueResultFromTag")
    public void setReissueResultFromTag(Boolean reissueResultFromTag) {
        this.reissueResultFromTag = reissueResultFromTag;
    }

    @JsonProperty("FormOfRefund")
    public String getFormOfRefund() {
        return formOfRefund;
    }

    @JsonProperty("FormOfRefund")
    public void setFormOfRefund(String formOfRefund) {
        this.formOfRefund = formOfRefund;
    }

    @JsonProperty("ReissueRequiresElectronicTicket")
    public Boolean getReissueRequiresElectronicTicket() {
        return reissueRequiresElectronicTicket;
    }

    @JsonProperty("ReissueRequiresElectronicTicket")
    public void setReissueRequiresElectronicTicket(Boolean reissueRequiresElectronicTicket) {
        this.reissueRequiresElectronicTicket = reissueRequiresElectronicTicket;
    }

    @JsonProperty("ReissueDoesNotAllowElectronicTicket")
    public Boolean getReissueDoesNotAllowElectronicTicket() {
        return reissueDoesNotAllowElectronicTicket;
    }

    @JsonProperty("ReissueDoesNotAllowElectronicTicket")
    public void setReissueDoesNotAllowElectronicTicket(Boolean reissueDoesNotAllowElectronicTicket) {
        this.reissueDoesNotAllowElectronicTicket = reissueDoesNotAllowElectronicTicket;
    }

    @JsonProperty("TaxRefundable")
    public Boolean getTaxRefundable() {
        return taxRefundable;
    }

    @JsonProperty("TaxRefundable")
    public void setTaxRefundable(Boolean taxRefundable) {
        this.taxRefundable = taxRefundable;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("changeFees", changeFees).append("residualIdicator", residualIdicator).append("typeOfServiceFee", typeOfServiceFee).append("typeOfReissueTransaction", typeOfReissueTransaction).append("reissueResultFromTag", reissueResultFromTag).append("formOfRefund", formOfRefund).append("reissueRequiresElectronicTicket", reissueRequiresElectronicTicket).append("reissueDoesNotAllowElectronicTicket", reissueDoesNotAllowElectronicTicket).append("taxRefundable", taxRefundable).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(taxRefundable).append(residualIdicator).append(typeOfReissueTransaction).append(reissueResultFromTag).append(changeFees).append(formOfRefund).append(typeOfServiceFee).append(reissueDoesNotAllowElectronicTicket).append(reissueRequiresElectronicTicket).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReissueInfo) == false) {
            return false;
        }
        ReissueInfo rhs = ((ReissueInfo) other);
        return new EqualsBuilder().append(taxRefundable, rhs.taxRefundable).append(residualIdicator, rhs.residualIdicator).append(typeOfReissueTransaction, rhs.typeOfReissueTransaction).append(reissueResultFromTag, rhs.reissueResultFromTag).append(changeFees, rhs.changeFees).append(formOfRefund, rhs.formOfRefund).append(typeOfServiceFee, rhs.typeOfServiceFee).append(reissueDoesNotAllowElectronicTicket, rhs.reissueDoesNotAllowElectronicTicket).append(reissueRequiresElectronicTicket, rhs.reissueRequiresElectronicTicket).isEquals();
    }

}

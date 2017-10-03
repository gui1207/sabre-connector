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
    "Cat16TextOnly",
    "Type",
    "Applicability",
    "Refundable",
    "Changeable",
    "ConditionsApply",
    "Cat16Info",
    "Amount",
    "CurrencyCode",
    "DecimalPlaces"
})
public class Penalty {

    @JsonProperty("Cat16TextOnly")
    private List<Cat16TextOnly> cat16TextOnly = new ArrayList<Cat16TextOnly>();
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Applicability")
    private String applicability;
    @JsonProperty("Refundable")
    private Boolean refundable;
    @JsonProperty("Changeable")
    private Boolean changeable;
    @JsonProperty("ConditionsApply")
    private Boolean conditionsApply;
    @JsonProperty("Cat16Info")
    private Boolean cat16Info;
    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("DecimalPlaces")
    private Integer decimalPlaces;

    @JsonProperty("Cat16TextOnly")
    public List<Cat16TextOnly> getCat16TextOnly() {
        return cat16TextOnly;
    }

    @JsonProperty("Cat16TextOnly")
    public void setCat16TextOnly(List<Cat16TextOnly> cat16TextOnly) {
        this.cat16TextOnly = cat16TextOnly;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Applicability")
    public String getApplicability() {
        return applicability;
    }

    @JsonProperty("Applicability")
    public void setApplicability(String applicability) {
        this.applicability = applicability;
    }

    @JsonProperty("Refundable")
    public Boolean getRefundable() {
        return refundable;
    }

    @JsonProperty("Refundable")
    public void setRefundable(Boolean refundable) {
        this.refundable = refundable;
    }

    @JsonProperty("Changeable")
    public Boolean getChangeable() {
        return changeable;
    }

    @JsonProperty("Changeable")
    public void setChangeable(Boolean changeable) {
        this.changeable = changeable;
    }

    @JsonProperty("ConditionsApply")
    public Boolean getConditionsApply() {
        return conditionsApply;
    }

    @JsonProperty("ConditionsApply")
    public void setConditionsApply(Boolean conditionsApply) {
        this.conditionsApply = conditionsApply;
    }

    @JsonProperty("Cat16Info")
    public Boolean getCat16Info() {
        return cat16Info;
    }

    @JsonProperty("Cat16Info")
    public void setCat16Info(Boolean cat16Info) {
        this.cat16Info = cat16Info;
    }

    @JsonProperty("Amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("DecimalPlaces")
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    @JsonProperty("DecimalPlaces")
    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cat16TextOnly", cat16TextOnly).append("type", type).append("applicability", applicability).append("refundable", refundable).append("changeable", changeable).append("conditionsApply", conditionsApply).append("cat16Info", cat16Info).append("amount", amount).append("currencyCode", currencyCode).append("decimalPlaces", decimalPlaces).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(decimalPlaces).append(cat16TextOnly).append(conditionsApply).append(changeable).append(applicability).append(refundable).append(type).append(cat16Info).append(currencyCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Penalty) == false) {
            return false;
        }
        Penalty rhs = ((Penalty) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(decimalPlaces, rhs.decimalPlaces).append(cat16TextOnly, rhs.cat16TextOnly).append(conditionsApply, rhs.conditionsApply).append(changeable, rhs.changeable).append(applicability, rhs.applicability).append(refundable, rhs.refundable).append(type, rhs.type).append(cat16Info, rhs.cat16Info).append(currencyCode, rhs.currencyCode).isEquals();
    }

}

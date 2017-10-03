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
    "HighestChangeFee",
    "PaymentAmount",
    "PaymentCurrency",
    "PaymentDecimalPlaces",
    "ChangeFeeWaived",
    "ChangeFeeNotApplicable",
    "Amount",
    "CurrencyCode",
    "DecimalPlaces"
})
public class ChangeFee {

    @JsonProperty("HighestChangeFee")
    private Boolean highestChangeFee;
    @JsonProperty("PaymentAmount")
    private Double paymentAmount;
    @JsonProperty("PaymentCurrency")
    private String paymentCurrency;
    @JsonProperty("PaymentDecimalPlaces")
    private Integer paymentDecimalPlaces;
    @JsonProperty("ChangeFeeWaived")
    private Boolean changeFeeWaived;
    @JsonProperty("ChangeFeeNotApplicable")
    private Boolean changeFeeNotApplicable;
    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("DecimalPlaces")
    private Integer decimalPlaces;

    @JsonProperty("HighestChangeFee")
    public Boolean getHighestChangeFee() {
        return highestChangeFee;
    }

    @JsonProperty("HighestChangeFee")
    public void setHighestChangeFee(Boolean highestChangeFee) {
        this.highestChangeFee = highestChangeFee;
    }

    @JsonProperty("PaymentAmount")
    public Double getPaymentAmount() {
        return paymentAmount;
    }

    @JsonProperty("PaymentAmount")
    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @JsonProperty("PaymentCurrency")
    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    @JsonProperty("PaymentCurrency")
    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    @JsonProperty("PaymentDecimalPlaces")
    public Integer getPaymentDecimalPlaces() {
        return paymentDecimalPlaces;
    }

    @JsonProperty("PaymentDecimalPlaces")
    public void setPaymentDecimalPlaces(Integer paymentDecimalPlaces) {
        this.paymentDecimalPlaces = paymentDecimalPlaces;
    }

    @JsonProperty("ChangeFeeWaived")
    public Boolean getChangeFeeWaived() {
        return changeFeeWaived;
    }

    @JsonProperty("ChangeFeeWaived")
    public void setChangeFeeWaived(Boolean changeFeeWaived) {
        this.changeFeeWaived = changeFeeWaived;
    }

    @JsonProperty("ChangeFeeNotApplicable")
    public Boolean getChangeFeeNotApplicable() {
        return changeFeeNotApplicable;
    }

    @JsonProperty("ChangeFeeNotApplicable")
    public void setChangeFeeNotApplicable(Boolean changeFeeNotApplicable) {
        this.changeFeeNotApplicable = changeFeeNotApplicable;
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
        return new ToStringBuilder(this).append("highestChangeFee", highestChangeFee).append("paymentAmount", paymentAmount).append("paymentCurrency", paymentCurrency).append("paymentDecimalPlaces", paymentDecimalPlaces).append("changeFeeWaived", changeFeeWaived).append("changeFeeNotApplicable", changeFeeNotApplicable).append("amount", amount).append("currencyCode", currencyCode).append("decimalPlaces", decimalPlaces).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(changeFeeWaived).append(highestChangeFee).append(paymentDecimalPlaces).append(amount).append(decimalPlaces).append(changeFeeNotApplicable).append(paymentCurrency).append(paymentAmount).append(currencyCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeFee) == false) {
            return false;
        }
        ChangeFee rhs = ((ChangeFee) other);
        return new EqualsBuilder().append(changeFeeWaived, rhs.changeFeeWaived).append(highestChangeFee, rhs.highestChangeFee).append(paymentDecimalPlaces, rhs.paymentDecimalPlaces).append(amount, rhs.amount).append(decimalPlaces, rhs.decimalPlaces).append(changeFeeNotApplicable, rhs.changeFeeNotApplicable).append(paymentCurrency, rhs.paymentCurrency).append(paymentAmount, rhs.paymentAmount).append(currencyCode, rhs.currencyCode).isEquals();
    }

}

/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NegotiatedFareCode",
    "AccountCode",
    "TPA_Extensions",
    "FareQualifier",
    "NegotiatedFaresOnly",
    "CurrencyCode",
    "PricingSource",
    "Reprice",
    "ProcessThruFaresOnly",
    "PurchaseDate",
    "PurchaseTime",
    "NetFaresUsed",
    "BypassAdvancePurchase"
})
public class PriceRequestInformation {

    @JsonProperty("NegotiatedFareCode")
    private List<NegotiatedFareCode> negotiatedFareCode = new ArrayList<NegotiatedFareCode>();
    @JsonProperty("AccountCode")
    private List<AccountCode_> accountCode = new ArrayList<AccountCode_>();
    @JsonProperty("TPA_Extensions")
    private TPAExtensions___ tPAExtensions;
    @JsonProperty("FareQualifier")
    private String fareQualifier;
    @JsonProperty("NegotiatedFaresOnly")
    private Boolean negotiatedFaresOnly;
    @JsonProperty("CurrencyCode")
    private String currencyCode;
    @JsonProperty("PricingSource")
    private String pricingSource;
    @JsonProperty("Reprice")
    private Boolean reprice;
    @JsonProperty("ProcessThruFaresOnly")
    private Boolean processThruFaresOnly;
    @JsonProperty("PurchaseDate")
    private String purchaseDate;
    @JsonProperty("PurchaseTime")
    private String purchaseTime;
    @JsonProperty("NetFaresUsed")
    private Boolean netFaresUsed;
    @JsonProperty("BypassAdvancePurchase")
    private PriceRequestInformation.BypassAdvancePurchase bypassAdvancePurchase;

    @JsonProperty("NegotiatedFareCode")
    public List<NegotiatedFareCode> getNegotiatedFareCode() {
        return negotiatedFareCode;
    }

    @JsonProperty("NegotiatedFareCode")
    public void setNegotiatedFareCode(List<NegotiatedFareCode> negotiatedFareCode) {
        this.negotiatedFareCode = negotiatedFareCode;
    }

    @JsonProperty("AccountCode")
    public List<AccountCode_> getAccountCode() {
        return accountCode;
    }

    @JsonProperty("AccountCode")
    public void setAccountCode(List<AccountCode_> accountCode) {
        this.accountCode = accountCode;
    }

    @JsonProperty("TPA_Extensions")
    public TPAExtensions___ getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions___ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("FareQualifier")
    public String getFareQualifier() {
        return fareQualifier;
    }

    @JsonProperty("FareQualifier")
    public void setFareQualifier(String fareQualifier) {
        this.fareQualifier = fareQualifier;
    }

    @JsonProperty("NegotiatedFaresOnly")
    public Boolean getNegotiatedFaresOnly() {
        return negotiatedFaresOnly;
    }

    @JsonProperty("NegotiatedFaresOnly")
    public void setNegotiatedFaresOnly(Boolean negotiatedFaresOnly) {
        this.negotiatedFaresOnly = negotiatedFaresOnly;
    }

    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("PricingSource")
    public String getPricingSource() {
        return pricingSource;
    }

    @JsonProperty("PricingSource")
    public void setPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
    }

    @JsonProperty("Reprice")
    public Boolean getReprice() {
        return reprice;
    }

    @JsonProperty("Reprice")
    public void setReprice(Boolean reprice) {
        this.reprice = reprice;
    }

    @JsonProperty("ProcessThruFaresOnly")
    public Boolean getProcessThruFaresOnly() {
        return processThruFaresOnly;
    }

    @JsonProperty("ProcessThruFaresOnly")
    public void setProcessThruFaresOnly(Boolean processThruFaresOnly) {
        this.processThruFaresOnly = processThruFaresOnly;
    }

    @JsonProperty("PurchaseDate")
    public String getPurchaseDate() {
        return purchaseDate;
    }

    @JsonProperty("PurchaseDate")
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @JsonProperty("PurchaseTime")
    public String getPurchaseTime() {
        return purchaseTime;
    }

    @JsonProperty("PurchaseTime")
    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    @JsonProperty("NetFaresUsed")
    public Boolean getNetFaresUsed() {
        return netFaresUsed;
    }

    @JsonProperty("NetFaresUsed")
    public void setNetFaresUsed(Boolean netFaresUsed) {
        this.netFaresUsed = netFaresUsed;
    }

    @JsonProperty("BypassAdvancePurchase")
    public PriceRequestInformation.BypassAdvancePurchase getBypassAdvancePurchase() {
        return bypassAdvancePurchase;
    }

    @JsonProperty("BypassAdvancePurchase")
    public void setBypassAdvancePurchase(PriceRequestInformation.BypassAdvancePurchase bypassAdvancePurchase) {
        this.bypassAdvancePurchase = bypassAdvancePurchase;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("negotiatedFareCode", negotiatedFareCode).append("accountCode", accountCode).append("tPAExtensions", tPAExtensions).append("fareQualifier", fareQualifier).append("negotiatedFaresOnly", negotiatedFaresOnly).append("currencyCode", currencyCode).append("pricingSource", pricingSource).append("reprice", reprice).append("processThruFaresOnly", processThruFaresOnly).append("purchaseDate", purchaseDate).append("purchaseTime", purchaseTime).append("netFaresUsed", netFaresUsed).append("bypassAdvancePurchase", bypassAdvancePurchase).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountCode).append(purchaseDate).append(reprice).append(pricingSource).append(negotiatedFareCode).append(bypassAdvancePurchase).append(tPAExtensions).append(fareQualifier).append(processThruFaresOnly).append(negotiatedFaresOnly).append(purchaseTime).append(currencyCode).append(netFaresUsed).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriceRequestInformation) == false) {
            return false;
        }
        PriceRequestInformation rhs = ((PriceRequestInformation) other);
        return new EqualsBuilder().append(accountCode, rhs.accountCode).append(purchaseDate, rhs.purchaseDate).append(reprice, rhs.reprice).append(pricingSource, rhs.pricingSource).append(negotiatedFareCode, rhs.negotiatedFareCode).append(bypassAdvancePurchase, rhs.bypassAdvancePurchase).append(tPAExtensions, rhs.tPAExtensions).append(fareQualifier, rhs.fareQualifier).append(processThruFaresOnly, rhs.processThruFaresOnly).append(negotiatedFaresOnly, rhs.negotiatedFaresOnly).append(purchaseTime, rhs.purchaseTime).append(currencyCode, rhs.currencyCode).append(netFaresUsed, rhs.netFaresUsed).isEquals();
    }

    public enum BypassAdvancePurchase {

        N("N"),
        T("T"),
        F("F");
        private final String value;
        private final static Map<String, PriceRequestInformation.BypassAdvancePurchase> CONSTANTS = new HashMap<String, PriceRequestInformation.BypassAdvancePurchase>();

        static {
            for (PriceRequestInformation.BypassAdvancePurchase c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private BypassAdvancePurchase(String value) {
            this.value = value;
        }

        @java.lang.Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static PriceRequestInformation.BypassAdvancePurchase fromValue(String value) {
            PriceRequestInformation.BypassAdvancePurchase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

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
    "Surcharges",
    "Legs",
    "FareComponents",
    "Messages",
    "BaggageInformationList",
    "SellingFareDataList",
    "CommissionData"
})
public class TPAExtensions__ {

    @JsonProperty("Surcharges")
    private List<Surcharge> surcharges = new ArrayList<Surcharge>();
    @JsonProperty("Legs")
    private Legs legs;
    @JsonProperty("FareComponents")
    private FareComponents fareComponents;
    @JsonProperty("Messages")
    private Messages messages;
    @JsonProperty("BaggageInformationList")
    private BaggageInformationList baggageInformationList;
    @JsonProperty("SellingFareDataList")
    private SellingFareDataList sellingFareDataList;
    @JsonProperty("CommissionData")
    private CommissionData commissionData;

    @JsonProperty("Surcharges")
    public List<Surcharge> getSurcharges() {
        return surcharges;
    }

    @JsonProperty("Surcharges")
    public void setSurcharges(List<Surcharge> surcharges) {
        this.surcharges = surcharges;
    }

    @JsonProperty("Legs")
    public Legs getLegs() {
        return legs;
    }

    @JsonProperty("Legs")
    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    @JsonProperty("FareComponents")
    public FareComponents getFareComponents() {
        return fareComponents;
    }

    @JsonProperty("FareComponents")
    public void setFareComponents(FareComponents fareComponents) {
        this.fareComponents = fareComponents;
    }

    @JsonProperty("Messages")
    public Messages getMessages() {
        return messages;
    }

    @JsonProperty("Messages")
    public void setMessages(Messages messages) {
        this.messages = messages;
    }

    @JsonProperty("BaggageInformationList")
    public BaggageInformationList getBaggageInformationList() {
        return baggageInformationList;
    }

    @JsonProperty("BaggageInformationList")
    public void setBaggageInformationList(BaggageInformationList baggageInformationList) {
        this.baggageInformationList = baggageInformationList;
    }

    @JsonProperty("SellingFareDataList")
    public SellingFareDataList getSellingFareDataList() {
        return sellingFareDataList;
    }

    @JsonProperty("SellingFareDataList")
    public void setSellingFareDataList(SellingFareDataList sellingFareDataList) {
        this.sellingFareDataList = sellingFareDataList;
    }

    @JsonProperty("CommissionData")
    public CommissionData getCommissionData() {
        return commissionData;
    }

    @JsonProperty("CommissionData")
    public void setCommissionData(CommissionData commissionData) {
        this.commissionData = commissionData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("surcharges", surcharges).append("legs", legs).append("fareComponents", fareComponents).append("messages", messages).append("baggageInformationList", baggageInformationList).append("sellingFareDataList", sellingFareDataList).append("commissionData", commissionData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sellingFareDataList).append(fareComponents).append(commissionData).append(legs).append(surcharges).append(messages).append(baggageInformationList).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions__) == false) {
            return false;
        }
        TPAExtensions__ rhs = ((TPAExtensions__) other);
        return new EqualsBuilder().append(sellingFareDataList, rhs.sellingFareDataList).append(fareComponents, rhs.fareComponents).append(commissionData, rhs.commissionData).append(legs, rhs.legs).append(surcharges, rhs.surcharges).append(messages, rhs.messages).append(baggageInformationList, rhs.baggageInformationList).isEquals();
    }

}

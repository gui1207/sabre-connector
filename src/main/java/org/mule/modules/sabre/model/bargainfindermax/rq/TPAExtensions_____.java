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
    "IntelliSellTransaction",
    "DiversityControl",
    "MessagingDetails",
    "AlternateAirportCities",
    "AlternateAirportMileage",
    "AwardShopping",
    "Billing",
    "ExchangeSettings",
    "Exchange",
    "SplitTaxes",
    "AlternateDatesProcessing",
    "ItineraryCache",
    "MultiTicket",
    "Partitions",
    "ReservationData",
    "AlternatePCC"
})
public class TPAExtensions_____ {

    @JsonProperty("IntelliSellTransaction")
    private IntelliSellTransaction intelliSellTransaction;
    @JsonProperty("DiversityControl")
    private DiversityControl diversityControl;
    @JsonProperty("MessagingDetails")
    private MessagingDetails messagingDetails;
    @JsonProperty("AlternateAirportCities")
    private List<AlternateAirportCity> alternateAirportCities = new ArrayList<AlternateAirportCity>();
    @JsonProperty("AlternateAirportMileage")
    private AlternateAirportMileage alternateAirportMileage;
    @JsonProperty("AwardShopping")
    private AwardShopping awardShopping;
    @JsonProperty("Billing")
    private Billing billing;
    @JsonProperty("ExchangeSettings")
    private ExchangeSettings exchangeSettings;
    @JsonProperty("Exchange")
    private List<Exchange> exchange = new ArrayList<Exchange>();
    @JsonProperty("SplitTaxes")
    private SplitTaxes splitTaxes;
    @JsonProperty("AlternateDatesProcessing")
    private AlternateDatesProcessing alternateDatesProcessing;
    @JsonProperty("ItineraryCache")
    private ItineraryCache itineraryCache;
    @JsonProperty("MultiTicket")
    private MultiTicket multiTicket;
    @JsonProperty("Partitions")
    private Partitions partitions;
    @JsonProperty("ReservationData")
    private ReservationData reservationData;
    @JsonProperty("AlternatePCC")
    private List<AlternatePCC> alternatePCC = new ArrayList<AlternatePCC>();

    @JsonProperty("IntelliSellTransaction")
    public IntelliSellTransaction getIntelliSellTransaction() {
        return intelliSellTransaction;
    }

    @JsonProperty("IntelliSellTransaction")
    public void setIntelliSellTransaction(IntelliSellTransaction intelliSellTransaction) {
        this.intelliSellTransaction = intelliSellTransaction;
    }

    @JsonProperty("DiversityControl")
    public DiversityControl getDiversityControl() {
        return diversityControl;
    }

    @JsonProperty("DiversityControl")
    public void setDiversityControl(DiversityControl diversityControl) {
        this.diversityControl = diversityControl;
    }

    @JsonProperty("MessagingDetails")
    public MessagingDetails getMessagingDetails() {
        return messagingDetails;
    }

    @JsonProperty("MessagingDetails")
    public void setMessagingDetails(MessagingDetails messagingDetails) {
        this.messagingDetails = messagingDetails;
    }

    @JsonProperty("AlternateAirportCities")
    public List<AlternateAirportCity> getAlternateAirportCities() {
        return alternateAirportCities;
    }

    @JsonProperty("AlternateAirportCities")
    public void setAlternateAirportCities(List<AlternateAirportCity> alternateAirportCities) {
        this.alternateAirportCities = alternateAirportCities;
    }

    @JsonProperty("AlternateAirportMileage")
    public AlternateAirportMileage getAlternateAirportMileage() {
        return alternateAirportMileage;
    }

    @JsonProperty("AlternateAirportMileage")
    public void setAlternateAirportMileage(AlternateAirportMileage alternateAirportMileage) {
        this.alternateAirportMileage = alternateAirportMileage;
    }

    @JsonProperty("AwardShopping")
    public AwardShopping getAwardShopping() {
        return awardShopping;
    }

    @JsonProperty("AwardShopping")
    public void setAwardShopping(AwardShopping awardShopping) {
        this.awardShopping = awardShopping;
    }

    @JsonProperty("Billing")
    public Billing getBilling() {
        return billing;
    }

    @JsonProperty("Billing")
    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    @JsonProperty("ExchangeSettings")
    public ExchangeSettings getExchangeSettings() {
        return exchangeSettings;
    }

    @JsonProperty("ExchangeSettings")
    public void setExchangeSettings(ExchangeSettings exchangeSettings) {
        this.exchangeSettings = exchangeSettings;
    }

    @JsonProperty("Exchange")
    public List<Exchange> getExchange() {
        return exchange;
    }

    @JsonProperty("Exchange")
    public void setExchange(List<Exchange> exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("SplitTaxes")
    public SplitTaxes getSplitTaxes() {
        return splitTaxes;
    }

    @JsonProperty("SplitTaxes")
    public void setSplitTaxes(SplitTaxes splitTaxes) {
        this.splitTaxes = splitTaxes;
    }

    @JsonProperty("AlternateDatesProcessing")
    public AlternateDatesProcessing getAlternateDatesProcessing() {
        return alternateDatesProcessing;
    }

    @JsonProperty("AlternateDatesProcessing")
    public void setAlternateDatesProcessing(AlternateDatesProcessing alternateDatesProcessing) {
        this.alternateDatesProcessing = alternateDatesProcessing;
    }

    @JsonProperty("ItineraryCache")
    public ItineraryCache getItineraryCache() {
        return itineraryCache;
    }

    @JsonProperty("ItineraryCache")
    public void setItineraryCache(ItineraryCache itineraryCache) {
        this.itineraryCache = itineraryCache;
    }

    @JsonProperty("MultiTicket")
    public MultiTicket getMultiTicket() {
        return multiTicket;
    }

    @JsonProperty("MultiTicket")
    public void setMultiTicket(MultiTicket multiTicket) {
        this.multiTicket = multiTicket;
    }

    @JsonProperty("Partitions")
    public Partitions getPartitions() {
        return partitions;
    }

    @JsonProperty("Partitions")
    public void setPartitions(Partitions partitions) {
        this.partitions = partitions;
    }

    @JsonProperty("ReservationData")
    public ReservationData getReservationData() {
        return reservationData;
    }

    @JsonProperty("ReservationData")
    public void setReservationData(ReservationData reservationData) {
        this.reservationData = reservationData;
    }

    @JsonProperty("AlternatePCC")
    public List<AlternatePCC> getAlternatePCC() {
        return alternatePCC;
    }

    @JsonProperty("AlternatePCC")
    public void setAlternatePCC(List<AlternatePCC> alternatePCC) {
        this.alternatePCC = alternatePCC;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("intelliSellTransaction", intelliSellTransaction).append("diversityControl", diversityControl).append("messagingDetails", messagingDetails).append("alternateAirportCities", alternateAirportCities).append("alternateAirportMileage", alternateAirportMileage).append("awardShopping", awardShopping).append("billing", billing).append("exchangeSettings", exchangeSettings).append("exchange", exchange).append("splitTaxes", splitTaxes).append("alternateDatesProcessing", alternateDatesProcessing).append("itineraryCache", itineraryCache).append("multiTicket", multiTicket).append("partitions", partitions).append("reservationData", reservationData).append("alternatePCC", alternatePCC).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(partitions).append(reservationData).append(alternateAirportCities).append(splitTaxes).append(exchangeSettings).append(awardShopping).append(intelliSellTransaction).append(alternateAirportMileage).append(alternatePCC).append(itineraryCache).append(billing).append(messagingDetails).append(multiTicket).append(diversityControl).append(alternateDatesProcessing).append(exchange).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions_____) == false) {
            return false;
        }
        TPAExtensions_____ rhs = ((TPAExtensions_____) other);
        return new EqualsBuilder().append(partitions, rhs.partitions).append(reservationData, rhs.reservationData).append(alternateAirportCities, rhs.alternateAirportCities).append(splitTaxes, rhs.splitTaxes).append(exchangeSettings, rhs.exchangeSettings).append(awardShopping, rhs.awardShopping).append(intelliSellTransaction, rhs.intelliSellTransaction).append(alternateAirportMileage, rhs.alternateAirportMileage).append(alternatePCC, rhs.alternatePCC).append(itineraryCache, rhs.itineraryCache).append(billing, rhs.billing).append(messagingDetails, rhs.messagingDetails).append(multiTicket, rhs.multiTicket).append(diversityControl, rhs.diversityControl).append(alternateDatesProcessing, rhs.alternateDatesProcessing).append(exchange, rhs.exchange).isEquals();
    }

}

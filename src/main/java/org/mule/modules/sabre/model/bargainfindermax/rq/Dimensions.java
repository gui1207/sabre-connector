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
    "TravelTime",
    "Carrier",
    "OperatingDuplicate",
    "InboundOutboundPairing",
    "TimeOfDay",
    "StopsNumber",
    "PriceWeight"
})
public class Dimensions {

    @JsonProperty("TravelTime")
    private TravelTime travelTime;
    @JsonProperty("Carrier")
    private Carrier___ carrier;
    @JsonProperty("OperatingDuplicate")
    private OperatingDuplicate operatingDuplicate;
    @JsonProperty("InboundOutboundPairing")
    private InboundOutboundPairing inboundOutboundPairing;
    @JsonProperty("TimeOfDay")
    private TimeOfDay timeOfDay;
    @JsonProperty("StopsNumber")
    private StopsNumber stopsNumber;
    @JsonProperty("PriceWeight")
    private Double priceWeight;

    @JsonProperty("TravelTime")
    public TravelTime getTravelTime() {
        return travelTime;
    }

    @JsonProperty("TravelTime")
    public void setTravelTime(TravelTime travelTime) {
        this.travelTime = travelTime;
    }

    @JsonProperty("Carrier")
    public Carrier___ getCarrier() {
        return carrier;
    }

    @JsonProperty("Carrier")
    public void setCarrier(Carrier___ carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("OperatingDuplicate")
    public OperatingDuplicate getOperatingDuplicate() {
        return operatingDuplicate;
    }

    @JsonProperty("OperatingDuplicate")
    public void setOperatingDuplicate(OperatingDuplicate operatingDuplicate) {
        this.operatingDuplicate = operatingDuplicate;
    }

    @JsonProperty("InboundOutboundPairing")
    public InboundOutboundPairing getInboundOutboundPairing() {
        return inboundOutboundPairing;
    }

    @JsonProperty("InboundOutboundPairing")
    public void setInboundOutboundPairing(InboundOutboundPairing inboundOutboundPairing) {
        this.inboundOutboundPairing = inboundOutboundPairing;
    }

    @JsonProperty("TimeOfDay")
    public TimeOfDay getTimeOfDay() {
        return timeOfDay;
    }

    @JsonProperty("TimeOfDay")
    public void setTimeOfDay(TimeOfDay timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    @JsonProperty("StopsNumber")
    public StopsNumber getStopsNumber() {
        return stopsNumber;
    }

    @JsonProperty("StopsNumber")
    public void setStopsNumber(StopsNumber stopsNumber) {
        this.stopsNumber = stopsNumber;
    }

    @JsonProperty("PriceWeight")
    public Double getPriceWeight() {
        return priceWeight;
    }

    @JsonProperty("PriceWeight")
    public void setPriceWeight(Double priceWeight) {
        this.priceWeight = priceWeight;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("travelTime", travelTime).append("carrier", carrier).append("operatingDuplicate", operatingDuplicate).append("inboundOutboundPairing", inboundOutboundPairing).append("timeOfDay", timeOfDay).append("stopsNumber", stopsNumber).append("priceWeight", priceWeight).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(travelTime).append(carrier).append(inboundOutboundPairing).append(priceWeight).append(operatingDuplicate).append(stopsNumber).append(timeOfDay).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dimensions) == false) {
            return false;
        }
        Dimensions rhs = ((Dimensions) other);
        return new EqualsBuilder().append(travelTime, rhs.travelTime).append(carrier, rhs.carrier).append(inboundOutboundPairing, rhs.inboundOutboundPairing).append(priceWeight, rhs.priceWeight).append(operatingDuplicate, rhs.operatingDuplicate).append(stopsNumber, rhs.stopsNumber).append(timeOfDay, rhs.timeOfDay).isEquals();
    }

}

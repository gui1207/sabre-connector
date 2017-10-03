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
    "Price",
    "DirectFlights",
    "Time",
    "Vendor",
    "MarketingCarrier",
    "OperatingCarrier",
    "ElapsedTime",
    "DepartureTime",
    "ConnectionTime"
})
public class Priority {

    @JsonProperty("Price")
    private Price price;
    @JsonProperty("DirectFlights")
    private DirectFlights directFlights;
    @JsonProperty("Time")
    private Time time;
    @JsonProperty("Vendor")
    private Vendor vendor;
    @JsonProperty("MarketingCarrier")
    private MarketingCarrier marketingCarrier;
    @JsonProperty("OperatingCarrier")
    private OperatingCarrier operatingCarrier;
    @JsonProperty("ElapsedTime")
    private ElapsedTime elapsedTime;
    @JsonProperty("DepartureTime")
    private DepartureTime departureTime;
    @JsonProperty("ConnectionTime")
    private ConnectionTime_ connectionTime;

    @JsonProperty("Price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("DirectFlights")
    public DirectFlights getDirectFlights() {
        return directFlights;
    }

    @JsonProperty("DirectFlights")
    public void setDirectFlights(DirectFlights directFlights) {
        this.directFlights = directFlights;
    }

    @JsonProperty("Time")
    public Time getTime() {
        return time;
    }

    @JsonProperty("Time")
    public void setTime(Time time) {
        this.time = time;
    }

    @JsonProperty("Vendor")
    public Vendor getVendor() {
        return vendor;
    }

    @JsonProperty("Vendor")
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @JsonProperty("MarketingCarrier")
    public MarketingCarrier getMarketingCarrier() {
        return marketingCarrier;
    }

    @JsonProperty("MarketingCarrier")
    public void setMarketingCarrier(MarketingCarrier marketingCarrier) {
        this.marketingCarrier = marketingCarrier;
    }

    @JsonProperty("OperatingCarrier")
    public OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("OperatingCarrier")
    public void setOperatingCarrier(OperatingCarrier operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    @JsonProperty("ElapsedTime")
    public ElapsedTime getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("ElapsedTime")
    public void setElapsedTime(ElapsedTime elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @JsonProperty("DepartureTime")
    public DepartureTime getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("DepartureTime")
    public void setDepartureTime(DepartureTime departureTime) {
        this.departureTime = departureTime;
    }

    @JsonProperty("ConnectionTime")
    public ConnectionTime_ getConnectionTime() {
        return connectionTime;
    }

    @JsonProperty("ConnectionTime")
    public void setConnectionTime(ConnectionTime_ connectionTime) {
        this.connectionTime = connectionTime;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("price", price).append("directFlights", directFlights).append("time", time).append("vendor", vendor).append("marketingCarrier", marketingCarrier).append("operatingCarrier", operatingCarrier).append("elapsedTime", elapsedTime).append("departureTime", departureTime).append("connectionTime", connectionTime).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(departureTime).append(marketingCarrier).append(price).append(vendor).append(directFlights).append(time).append(operatingCarrier).append(connectionTime).append(elapsedTime).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Priority) == false) {
            return false;
        }
        Priority rhs = ((Priority) other);
        return new EqualsBuilder().append(departureTime, rhs.departureTime).append(marketingCarrier, rhs.marketingCarrier).append(price, rhs.price).append(vendor, rhs.vendor).append(directFlights, rhs.directFlights).append(time, rhs.time).append(operatingCarrier, rhs.operatingCarrier).append(connectionTime, rhs.connectionTime).append(elapsedTime, rhs.elapsedTime).isEquals();
    }

}

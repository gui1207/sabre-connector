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
    "InboundOutboundCarrier",
    "InboundCarrier",
    "OutboundCarrier",
    "ConnectPoint"
})
public class RoutingLeg {

    @JsonProperty("InboundOutboundCarrier")
    private List<String> inboundOutboundCarrier = new ArrayList<String>();
    @JsonProperty("InboundCarrier")
    private List<String> inboundCarrier = new ArrayList<String>();
    @JsonProperty("OutboundCarrier")
    private List<String> outboundCarrier = new ArrayList<String>();
    @JsonProperty("ConnectPoint")
    private List<String> connectPoint = new ArrayList<String>();

    @JsonProperty("InboundOutboundCarrier")
    public List<String> getInboundOutboundCarrier() {
        return inboundOutboundCarrier;
    }

    @JsonProperty("InboundOutboundCarrier")
    public void setInboundOutboundCarrier(List<String> inboundOutboundCarrier) {
        this.inboundOutboundCarrier = inboundOutboundCarrier;
    }

    @JsonProperty("InboundCarrier")
    public List<String> getInboundCarrier() {
        return inboundCarrier;
    }

    @JsonProperty("InboundCarrier")
    public void setInboundCarrier(List<String> inboundCarrier) {
        this.inboundCarrier = inboundCarrier;
    }

    @JsonProperty("OutboundCarrier")
    public List<String> getOutboundCarrier() {
        return outboundCarrier;
    }

    @JsonProperty("OutboundCarrier")
    public void setOutboundCarrier(List<String> outboundCarrier) {
        this.outboundCarrier = outboundCarrier;
    }

    @JsonProperty("ConnectPoint")
    public List<String> getConnectPoint() {
        return connectPoint;
    }

    @JsonProperty("ConnectPoint")
    public void setConnectPoint(List<String> connectPoint) {
        this.connectPoint = connectPoint;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("inboundOutboundCarrier", inboundOutboundCarrier).append("inboundCarrier", inboundCarrier).append("outboundCarrier", outboundCarrier).append("connectPoint", connectPoint).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectPoint).append(outboundCarrier).append(inboundOutboundCarrier).append(inboundCarrier).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoutingLeg) == false) {
            return false;
        }
        RoutingLeg rhs = ((RoutingLeg) other);
        return new EqualsBuilder().append(connectPoint, rhs.connectPoint).append(outboundCarrier, rhs.outboundCarrier).append(inboundOutboundCarrier, rhs.inboundOutboundCarrier).append(inboundCarrier, rhs.inboundCarrier).isEquals();
    }

}

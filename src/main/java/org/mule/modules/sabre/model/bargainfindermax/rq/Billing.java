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
    "UserStation",
    "UserBranch",
    "PartitionID",
    "UserSetAddress",
    "AAACity",
    "AgentSineIn",
    "ServiceName",
    "ActionCode"
})
public class Billing {

    @JsonProperty("UserStation")
    private Double userStation;
    @JsonProperty("UserBranch")
    private Double userBranch;
    @JsonProperty("PartitionID")
    private String partitionID;
    @JsonProperty("UserSetAddress")
    private String userSetAddress;
    @JsonProperty("AAACity")
    private String aAACity;
    @JsonProperty("AgentSineIn")
    private String agentSineIn;
    @JsonProperty("ServiceName")
    private String serviceName;
    @JsonProperty("ActionCode")
    private String actionCode;

    @JsonProperty("UserStation")
    public Double getUserStation() {
        return userStation;
    }

    @JsonProperty("UserStation")
    public void setUserStation(Double userStation) {
        this.userStation = userStation;
    }

    @JsonProperty("UserBranch")
    public Double getUserBranch() {
        return userBranch;
    }

    @JsonProperty("UserBranch")
    public void setUserBranch(Double userBranch) {
        this.userBranch = userBranch;
    }

    @JsonProperty("PartitionID")
    public String getPartitionID() {
        return partitionID;
    }

    @JsonProperty("PartitionID")
    public void setPartitionID(String partitionID) {
        this.partitionID = partitionID;
    }

    @JsonProperty("UserSetAddress")
    public String getUserSetAddress() {
        return userSetAddress;
    }

    @JsonProperty("UserSetAddress")
    public void setUserSetAddress(String userSetAddress) {
        this.userSetAddress = userSetAddress;
    }

    @JsonProperty("AAACity")
    public String getAAACity() {
        return aAACity;
    }

    @JsonProperty("AAACity")
    public void setAAACity(String aAACity) {
        this.aAACity = aAACity;
    }

    @JsonProperty("AgentSineIn")
    public String getAgentSineIn() {
        return agentSineIn;
    }

    @JsonProperty("AgentSineIn")
    public void setAgentSineIn(String agentSineIn) {
        this.agentSineIn = agentSineIn;
    }

    @JsonProperty("ServiceName")
    public String getServiceName() {
        return serviceName;
    }

    @JsonProperty("ServiceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @JsonProperty("ActionCode")
    public String getActionCode() {
        return actionCode;
    }

    @JsonProperty("ActionCode")
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("userStation", userStation).append("userBranch", userBranch).append("partitionID", partitionID).append("userSetAddress", userSetAddress).append("aAACity", aAACity).append("agentSineIn", agentSineIn).append("serviceName", serviceName).append("actionCode", actionCode).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(userBranch).append(agentSineIn).append(userSetAddress).append(userStation).append(partitionID).append(aAACity).append(actionCode).append(serviceName).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Billing) == false) {
            return false;
        }
        Billing rhs = ((Billing) other);
        return new EqualsBuilder().append(userBranch, rhs.userBranch).append(agentSineIn, rhs.agentSineIn).append(userSetAddress, rhs.userSetAddress).append(userStation, rhs.userStation).append(partitionID, rhs.partitionID).append(aAACity, rhs.aAACity).append(actionCode, rhs.actionCode).append(serviceName, rhs.serviceName).isEquals();
    }

}

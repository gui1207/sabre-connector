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
    "RequestType",
    "ServiceTag",
    "CustomerProfile",
    "PurchaseType",
    "SabreAth",
    "TranID",
    "ClientSessionID",
    "Branch",
    "CompressResponse",
    "FareOverrides",
    "Diagnostics",
    "SubagentData",
    "ResponseSorting",
    "SeatStatusSim",
    "AvailableLevel",
    "ATSETest",
    "Debug",
    "DebugKey",
    "ConfigSet",
    "DisableCache",
    "ChunkNumber",
    "ShowItinSource"
})
public class IntelliSellTransaction {

    @JsonProperty("RequestType")
    private RequestType requestType;
    @JsonProperty("ServiceTag")
    private ServiceTag serviceTag;
    @JsonProperty("CustomerProfile")
    private CustomerProfile customerProfile;
    @JsonProperty("PurchaseType")
    private PurchaseType purchaseType;
    @JsonProperty("SabreAth")
    private SabreAth sabreAth;
    @JsonProperty("TranID")
    private TranID tranID;
    @JsonProperty("ClientSessionID")
    private ClientSessionID clientSessionID;
    @JsonProperty("Branch")
    private Branch branch;
    @JsonProperty("CompressResponse")
    private CompressResponse compressResponse;
    @JsonProperty("FareOverrides")
    private FareOverrides fareOverrides;
    @JsonProperty("Diagnostics")
    private Diagnostics diagnostics;
    @JsonProperty("SubagentData")
    private SubagentData subagentData;
    @JsonProperty("ResponseSorting")
    private ResponseSorting responseSorting;
    @JsonProperty("SeatStatusSim")
    private SeatStatusSim seatStatusSim;
    @JsonProperty("AvailableLevel")
    private AvailableLevel availableLevel;
    @JsonProperty("ATSETest")
    private ATSETest aTSETest;
    @JsonProperty("Debug")
    private Boolean debug;
    @JsonProperty("DebugKey")
    private String debugKey;
    @JsonProperty("ConfigSet")
    private String configSet;
    @JsonProperty("DisableCache")
    private Boolean disableCache;
    @JsonProperty("ChunkNumber")
    private String chunkNumber;
    @JsonProperty("ShowItinSource")
    private Boolean showItinSource;

    @JsonProperty("RequestType")
    public RequestType getRequestType() {
        return requestType;
    }

    @JsonProperty("RequestType")
    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    @JsonProperty("ServiceTag")
    public ServiceTag getServiceTag() {
        return serviceTag;
    }

    @JsonProperty("ServiceTag")
    public void setServiceTag(ServiceTag serviceTag) {
        this.serviceTag = serviceTag;
    }

    @JsonProperty("CustomerProfile")
    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    @JsonProperty("CustomerProfile")
    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }

    @JsonProperty("PurchaseType")
    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    @JsonProperty("PurchaseType")
    public void setPurchaseType(PurchaseType purchaseType) {
        this.purchaseType = purchaseType;
    }

    @JsonProperty("SabreAth")
    public SabreAth getSabreAth() {
        return sabreAth;
    }

    @JsonProperty("SabreAth")
    public void setSabreAth(SabreAth sabreAth) {
        this.sabreAth = sabreAth;
    }

    @JsonProperty("TranID")
    public TranID getTranID() {
        return tranID;
    }

    @JsonProperty("TranID")
    public void setTranID(TranID tranID) {
        this.tranID = tranID;
    }

    @JsonProperty("ClientSessionID")
    public ClientSessionID getClientSessionID() {
        return clientSessionID;
    }

    @JsonProperty("ClientSessionID")
    public void setClientSessionID(ClientSessionID clientSessionID) {
        this.clientSessionID = clientSessionID;
    }

    @JsonProperty("Branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("Branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @JsonProperty("CompressResponse")
    public CompressResponse getCompressResponse() {
        return compressResponse;
    }

    @JsonProperty("CompressResponse")
    public void setCompressResponse(CompressResponse compressResponse) {
        this.compressResponse = compressResponse;
    }

    @JsonProperty("FareOverrides")
    public FareOverrides getFareOverrides() {
        return fareOverrides;
    }

    @JsonProperty("FareOverrides")
    public void setFareOverrides(FareOverrides fareOverrides) {
        this.fareOverrides = fareOverrides;
    }

    @JsonProperty("Diagnostics")
    public Diagnostics getDiagnostics() {
        return diagnostics;
    }

    @JsonProperty("Diagnostics")
    public void setDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
    }

    @JsonProperty("SubagentData")
    public SubagentData getSubagentData() {
        return subagentData;
    }

    @JsonProperty("SubagentData")
    public void setSubagentData(SubagentData subagentData) {
        this.subagentData = subagentData;
    }

    @JsonProperty("ResponseSorting")
    public ResponseSorting getResponseSorting() {
        return responseSorting;
    }

    @JsonProperty("ResponseSorting")
    public void setResponseSorting(ResponseSorting responseSorting) {
        this.responseSorting = responseSorting;
    }

    @JsonProperty("SeatStatusSim")
    public SeatStatusSim getSeatStatusSim() {
        return seatStatusSim;
    }

    @JsonProperty("SeatStatusSim")
    public void setSeatStatusSim(SeatStatusSim seatStatusSim) {
        this.seatStatusSim = seatStatusSim;
    }

    @JsonProperty("AvailableLevel")
    public AvailableLevel getAvailableLevel() {
        return availableLevel;
    }

    @JsonProperty("AvailableLevel")
    public void setAvailableLevel(AvailableLevel availableLevel) {
        this.availableLevel = availableLevel;
    }

    @JsonProperty("ATSETest")
    public ATSETest getATSETest() {
        return aTSETest;
    }

    @JsonProperty("ATSETest")
    public void setATSETest(ATSETest aTSETest) {
        this.aTSETest = aTSETest;
    }

    @JsonProperty("Debug")
    public Boolean getDebug() {
        return debug;
    }

    @JsonProperty("Debug")
    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    @JsonProperty("DebugKey")
    public String getDebugKey() {
        return debugKey;
    }

    @JsonProperty("DebugKey")
    public void setDebugKey(String debugKey) {
        this.debugKey = debugKey;
    }

    @JsonProperty("ConfigSet")
    public String getConfigSet() {
        return configSet;
    }

    @JsonProperty("ConfigSet")
    public void setConfigSet(String configSet) {
        this.configSet = configSet;
    }

    @JsonProperty("DisableCache")
    public Boolean getDisableCache() {
        return disableCache;
    }

    @JsonProperty("DisableCache")
    public void setDisableCache(Boolean disableCache) {
        this.disableCache = disableCache;
    }

    @JsonProperty("ChunkNumber")
    public String getChunkNumber() {
        return chunkNumber;
    }

    @JsonProperty("ChunkNumber")
    public void setChunkNumber(String chunkNumber) {
        this.chunkNumber = chunkNumber;
    }

    @JsonProperty("ShowItinSource")
    public Boolean getShowItinSource() {
        return showItinSource;
    }

    @JsonProperty("ShowItinSource")
    public void setShowItinSource(Boolean showItinSource) {
        this.showItinSource = showItinSource;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("requestType", requestType).append("serviceTag", serviceTag).append("customerProfile", customerProfile).append("purchaseType", purchaseType).append("sabreAth", sabreAth).append("tranID", tranID).append("clientSessionID", clientSessionID).append("branch", branch).append("compressResponse", compressResponse).append("fareOverrides", fareOverrides).append("diagnostics", diagnostics).append("subagentData", subagentData).append("responseSorting", responseSorting).append("seatStatusSim", seatStatusSim).append("availableLevel", availableLevel).append("aTSETest", aTSETest).append("debug", debug).append("debugKey", debugKey).append("configSet", configSet).append("disableCache", disableCache).append("chunkNumber", chunkNumber).append("showItinSource", showItinSource).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(tranID).append(responseSorting).append(debug).append(requestType).append(aTSETest).append(customerProfile).append(fareOverrides).append(debugKey).append(subagentData).append(showItinSource).append(configSet).append(branch).append(seatStatusSim).append(purchaseType).append(clientSessionID).append(chunkNumber).append(diagnostics).append(compressResponse).append(disableCache).append(serviceTag).append(availableLevel).append(sabreAth).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IntelliSellTransaction) == false) {
            return false;
        }
        IntelliSellTransaction rhs = ((IntelliSellTransaction) other);
        return new EqualsBuilder().append(tranID, rhs.tranID).append(responseSorting, rhs.responseSorting).append(debug, rhs.debug).append(requestType, rhs.requestType).append(aTSETest, rhs.aTSETest).append(customerProfile, rhs.customerProfile).append(fareOverrides, rhs.fareOverrides).append(debugKey, rhs.debugKey).append(subagentData, rhs.subagentData).append(showItinSource, rhs.showItinSource).append(configSet, rhs.configSet).append(branch, rhs.branch).append(seatStatusSim, rhs.seatStatusSim).append(purchaseType, rhs.purchaseType).append(clientSessionID, rhs.clientSessionID).append(chunkNumber, rhs.chunkNumber).append(diagnostics, rhs.diagnostics).append(compressResponse, rhs.compressResponse).append(disableCache, rhs.disableCache).append(serviceTag, rhs.serviceTag).append(availableLevel, rhs.availableLevel).append(sabreAth, rhs.sabreAth).isEquals();
    }

}

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
    "content",
    "LocationCode",
    "CodeContext",
    "TerminalID"
})
public class DepartureAirport {

    @JsonProperty("content")
    private String content;
    @JsonProperty("LocationCode")
    private String locationCode;
    @JsonProperty("CodeContext")
    private String codeContext;
    @JsonProperty("TerminalID")
    private String terminalID;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("LocationCode")
    public String getLocationCode() {
        return locationCode;
    }

    @JsonProperty("LocationCode")
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    @JsonProperty("CodeContext")
    public String getCodeContext() {
        return codeContext;
    }

    @JsonProperty("CodeContext")
    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }

    @JsonProperty("TerminalID")
    public String getTerminalID() {
        return terminalID;
    }

    @JsonProperty("TerminalID")
    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("locationCode", locationCode).append("codeContext", codeContext).append("terminalID", terminalID).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codeContext).append(terminalID).append(locationCode).append(content).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepartureAirport) == false) {
            return false;
        }
        DepartureAirport rhs = ((DepartureAirport) other);
        return new EqualsBuilder().append(codeContext, rhs.codeContext).append(terminalID, rhs.terminalID).append(locationCode, rhs.locationCode).append(content, rhs.content).isEquals();
    }

}

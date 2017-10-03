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
    "content",
    "DistribType",
    "TicketTime",
    "PreferLevel"
})
public class TicketDistribPref {

    @JsonProperty("content")
    private String content;
    @JsonProperty("DistribType")
    private String distribType;
    @JsonProperty("TicketTime")
    private String ticketTime;
    @JsonProperty("PreferLevel")
    private String preferLevel;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("DistribType")
    public String getDistribType() {
        return distribType;
    }

    @JsonProperty("DistribType")
    public void setDistribType(String distribType) {
        this.distribType = distribType;
    }

    @JsonProperty("TicketTime")
    public String getTicketTime() {
        return ticketTime;
    }

    @JsonProperty("TicketTime")
    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    @JsonProperty("PreferLevel")
    public String getPreferLevel() {
        return preferLevel;
    }

    @JsonProperty("PreferLevel")
    public void setPreferLevel(String preferLevel) {
        this.preferLevel = preferLevel;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("distribType", distribType).append("ticketTime", ticketTime).append("preferLevel", preferLevel).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(ticketTime).append(preferLevel).append(distribType).append(content).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TicketDistribPref) == false) {
            return false;
        }
        TicketDistribPref rhs = ((TicketDistribPref) other);
        return new EqualsBuilder().append(ticketTime, rhs.ticketTime).append(preferLevel, rhs.preferLevel).append(distribType, rhs.distribType).append(content, rhs.content).isEquals();
    }

}

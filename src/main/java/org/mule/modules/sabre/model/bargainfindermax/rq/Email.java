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
    "EmailType",
    "ShareSynchInd",
    "ShareMarketInd",
    "DefaultInd"
})
public class Email {

    @JsonProperty("content")
    private String content;
    @JsonProperty("EmailType")
    private String emailType;
    @JsonProperty("ShareSynchInd")
    private String shareSynchInd;
    @JsonProperty("ShareMarketInd")
    private String shareMarketInd;
    @JsonProperty("DefaultInd")
    private Boolean defaultInd;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("EmailType")
    public String getEmailType() {
        return emailType;
    }

    @JsonProperty("EmailType")
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    @JsonProperty("ShareSynchInd")
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    @JsonProperty("ShareSynchInd")
    public void setShareSynchInd(String shareSynchInd) {
        this.shareSynchInd = shareSynchInd;
    }

    @JsonProperty("ShareMarketInd")
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    @JsonProperty("ShareMarketInd")
    public void setShareMarketInd(String shareMarketInd) {
        this.shareMarketInd = shareMarketInd;
    }

    @JsonProperty("DefaultInd")
    public Boolean getDefaultInd() {
        return defaultInd;
    }

    @JsonProperty("DefaultInd")
    public void setDefaultInd(Boolean defaultInd) {
        this.defaultInd = defaultInd;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("emailType", emailType).append("shareSynchInd", shareSynchInd).append("shareMarketInd", shareMarketInd).append("defaultInd", defaultInd).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(shareMarketInd).append(emailType).append(defaultInd).append(content).append(shareSynchInd).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Email) == false) {
            return false;
        }
        Email rhs = ((Email) other);
        return new EqualsBuilder().append(shareMarketInd, rhs.shareMarketInd).append(emailType, rhs.emailType).append(defaultInd, rhs.defaultInd).append(content, rhs.content).append(shareSynchInd, rhs.shareSynchInd).isEquals();
    }

}

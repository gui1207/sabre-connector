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
    "PromoID",
    "CorpID",
    "ContentID"
})
public class PromoOffer {

    @JsonProperty("PromoID")
    private String promoID;
    @JsonProperty("CorpID")
    private String corpID;
    @JsonProperty("ContentID")
    private String contentID;

    @JsonProperty("PromoID")
    public String getPromoID() {
        return promoID;
    }

    @JsonProperty("PromoID")
    public void setPromoID(String promoID) {
        this.promoID = promoID;
    }

    @JsonProperty("CorpID")
    public String getCorpID() {
        return corpID;
    }

    @JsonProperty("CorpID")
    public void setCorpID(String corpID) {
        this.corpID = corpID;
    }

    @JsonProperty("ContentID")
    public String getContentID() {
        return contentID;
    }

    @JsonProperty("ContentID")
    public void setContentID(String contentID) {
        this.contentID = contentID;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("promoID", promoID).append("corpID", corpID).append("contentID", contentID).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contentID).append(promoID).append(corpID).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PromoOffer) == false) {
            return false;
        }
        PromoOffer rhs = ((PromoOffer) other);
        return new EqualsBuilder().append(contentID, rhs.contentID).append(promoID, rhs.promoID).append(corpID, rhs.corpID).isEquals();
    }

}

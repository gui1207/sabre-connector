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
    "FormattedInd",
    "ShareSynchInd",
    "ShareMarketInd",
    "PhoneLocationType",
    "PhoneTechType",
    "CountryAccessCode",
    "AreaCityCode",
    "PhoneNumber",
    "Extension",
    "PIN"
})
public class Telephone {

    @JsonProperty("FormattedInd")
    private Boolean formattedInd;
    @JsonProperty("ShareSynchInd")
    private String shareSynchInd;
    @JsonProperty("ShareMarketInd")
    private String shareMarketInd;
    @JsonProperty("PhoneLocationType")
    private String phoneLocationType;
    @JsonProperty("PhoneTechType")
    private String phoneTechType;
    @JsonProperty("CountryAccessCode")
    private String countryAccessCode;
    @JsonProperty("AreaCityCode")
    private String areaCityCode;
    @JsonProperty("PhoneNumber")
    private String phoneNumber;
    @JsonProperty("Extension")
    private String extension;
    @JsonProperty("PIN")
    private String pIN;

    @JsonProperty("FormattedInd")
    public Boolean getFormattedInd() {
        return formattedInd;
    }

    @JsonProperty("FormattedInd")
    public void setFormattedInd(Boolean formattedInd) {
        this.formattedInd = formattedInd;
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

    @JsonProperty("PhoneLocationType")
    public String getPhoneLocationType() {
        return phoneLocationType;
    }

    @JsonProperty("PhoneLocationType")
    public void setPhoneLocationType(String phoneLocationType) {
        this.phoneLocationType = phoneLocationType;
    }

    @JsonProperty("PhoneTechType")
    public String getPhoneTechType() {
        return phoneTechType;
    }

    @JsonProperty("PhoneTechType")
    public void setPhoneTechType(String phoneTechType) {
        this.phoneTechType = phoneTechType;
    }

    @JsonProperty("CountryAccessCode")
    public String getCountryAccessCode() {
        return countryAccessCode;
    }

    @JsonProperty("CountryAccessCode")
    public void setCountryAccessCode(String countryAccessCode) {
        this.countryAccessCode = countryAccessCode;
    }

    @JsonProperty("AreaCityCode")
    public String getAreaCityCode() {
        return areaCityCode;
    }

    @JsonProperty("AreaCityCode")
    public void setAreaCityCode(String areaCityCode) {
        this.areaCityCode = areaCityCode;
    }

    @JsonProperty("PhoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("PhoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("Extension")
    public String getExtension() {
        return extension;
    }

    @JsonProperty("Extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    @JsonProperty("PIN")
    public String getPIN() {
        return pIN;
    }

    @JsonProperty("PIN")
    public void setPIN(String pIN) {
        this.pIN = pIN;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("formattedInd", formattedInd).append("shareSynchInd", shareSynchInd).append("shareMarketInd", shareMarketInd).append("phoneLocationType", phoneLocationType).append("phoneTechType", phoneTechType).append("countryAccessCode", countryAccessCode).append("areaCityCode", areaCityCode).append("phoneNumber", phoneNumber).append("extension", extension).append("pIN", pIN).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(phoneTechType).append(shareMarketInd).append(areaCityCode).append(extension).append(phoneNumber).append(pIN).append(countryAccessCode).append(phoneLocationType).append(formattedInd).append(shareSynchInd).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Telephone) == false) {
            return false;
        }
        Telephone rhs = ((Telephone) other);
        return new EqualsBuilder().append(phoneTechType, rhs.phoneTechType).append(shareMarketInd, rhs.shareMarketInd).append(areaCityCode, rhs.areaCityCode).append(extension, rhs.extension).append(phoneNumber, rhs.phoneNumber).append(pIN, rhs.pIN).append(countryAccessCode, rhs.countryAccessCode).append(phoneLocationType, rhs.phoneLocationType).append(formattedInd, rhs.formattedInd).append(shareSynchInd, rhs.shareSynchInd).isEquals();
    }

}

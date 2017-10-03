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
    "NamePrefix",
    "GivenName",
    "MiddleName",
    "SurnamePrefix",
    "Surname",
    "NameSuffix",
    "NameTitle",
    "NameType",
    "ShareSynchInd",
    "ShareMarketInd"
})
public class PersonName {

    @JsonProperty("NamePrefix")
    private List<String> namePrefix = new ArrayList<String>();
    @JsonProperty("GivenName")
    private List<String> givenName = new ArrayList<String>();
    @JsonProperty("MiddleName")
    private List<String> middleName = new ArrayList<String>();
    @JsonProperty("SurnamePrefix")
    private String surnamePrefix;
    @JsonProperty("Surname")
    private String surname;
    @JsonProperty("NameSuffix")
    private List<String> nameSuffix = new ArrayList<String>();
    @JsonProperty("NameTitle")
    private List<String> nameTitle = new ArrayList<String>();
    @JsonProperty("NameType")
    private String nameType;
    @JsonProperty("ShareSynchInd")
    private String shareSynchInd;
    @JsonProperty("ShareMarketInd")
    private String shareMarketInd;

    @JsonProperty("NamePrefix")
    public List<String> getNamePrefix() {
        return namePrefix;
    }

    @JsonProperty("NamePrefix")
    public void setNamePrefix(List<String> namePrefix) {
        this.namePrefix = namePrefix;
    }

    @JsonProperty("GivenName")
    public List<String> getGivenName() {
        return givenName;
    }

    @JsonProperty("GivenName")
    public void setGivenName(List<String> givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("MiddleName")
    public List<String> getMiddleName() {
        return middleName;
    }

    @JsonProperty("MiddleName")
    public void setMiddleName(List<String> middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("SurnamePrefix")
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    @JsonProperty("SurnamePrefix")
    public void setSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
    }

    @JsonProperty("Surname")
    public String getSurname() {
        return surname;
    }

    @JsonProperty("Surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @JsonProperty("NameSuffix")
    public List<String> getNameSuffix() {
        return nameSuffix;
    }

    @JsonProperty("NameSuffix")
    public void setNameSuffix(List<String> nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    @JsonProperty("NameTitle")
    public List<String> getNameTitle() {
        return nameTitle;
    }

    @JsonProperty("NameTitle")
    public void setNameTitle(List<String> nameTitle) {
        this.nameTitle = nameTitle;
    }

    @JsonProperty("NameType")
    public String getNameType() {
        return nameType;
    }

    @JsonProperty("NameType")
    public void setNameType(String nameType) {
        this.nameType = nameType;
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

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("namePrefix", namePrefix).append("givenName", givenName).append("middleName", middleName).append("surnamePrefix", surnamePrefix).append("surname", surname).append("nameSuffix", nameSuffix).append("nameTitle", nameTitle).append("nameType", nameType).append("shareSynchInd", shareSynchInd).append("shareMarketInd", shareMarketInd).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(nameType).append(surnamePrefix).append(shareMarketInd).append(namePrefix).append(surname).append(nameTitle).append(givenName).append(nameSuffix).append(middleName).append(shareSynchInd).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonName) == false) {
            return false;
        }
        PersonName rhs = ((PersonName) other);
        return new EqualsBuilder().append(nameType, rhs.nameType).append(surnamePrefix, rhs.surnamePrefix).append(shareMarketInd, rhs.shareMarketInd).append(namePrefix, rhs.namePrefix).append(surname, rhs.surname).append(nameTitle, rhs.nameTitle).append(givenName, rhs.givenName).append(nameSuffix, rhs.nameSuffix).append(middleName, rhs.middleName).append(shareSynchInd, rhs.shareSynchInd).isEquals();
    }

}

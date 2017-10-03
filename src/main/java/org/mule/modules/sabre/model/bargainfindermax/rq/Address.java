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
    "StreetNmbr",
    "BldgRoom",
    "AddressLine",
    "CityName",
    "PostalCode",
    "County",
    "StateProv",
    "CountryName",
    "Type",
    "FormattedInd",
    "ShareSynchInd",
    "ShareMarketInd"
})
public class Address {

    @JsonProperty("StreetNmbr")
    private StreetNmbr streetNmbr;
    @JsonProperty("BldgRoom")
    private String bldgRoom;
    @JsonProperty("AddressLine")
    private List<String> addressLine = new ArrayList<String>();
    @JsonProperty("CityName")
    private String cityName;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonProperty("County")
    private String county;
    @JsonProperty("StateProv")
    private StateProv stateProv;
    @JsonProperty("CountryName")
    private CountryName countryName;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("FormattedInd")
    private Boolean formattedInd;
    @JsonProperty("ShareSynchInd")
    private String shareSynchInd;
    @JsonProperty("ShareMarketInd")
    private String shareMarketInd;

    @JsonProperty("StreetNmbr")
    public StreetNmbr getStreetNmbr() {
        return streetNmbr;
    }

    @JsonProperty("StreetNmbr")
    public void setStreetNmbr(StreetNmbr streetNmbr) {
        this.streetNmbr = streetNmbr;
    }

    @JsonProperty("BldgRoom")
    public String getBldgRoom() {
        return bldgRoom;
    }

    @JsonProperty("BldgRoom")
    public void setBldgRoom(String bldgRoom) {
        this.bldgRoom = bldgRoom;
    }

    @JsonProperty("AddressLine")
    public List<String> getAddressLine() {
        return addressLine;
    }

    @JsonProperty("AddressLine")
    public void setAddressLine(List<String> addressLine) {
        this.addressLine = addressLine;
    }

    @JsonProperty("CityName")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("CityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("County")
    public String getCounty() {
        return county;
    }

    @JsonProperty("County")
    public void setCounty(String county) {
        this.county = county;
    }

    @JsonProperty("StateProv")
    public StateProv getStateProv() {
        return stateProv;
    }

    @JsonProperty("StateProv")
    public void setStateProv(StateProv stateProv) {
        this.stateProv = stateProv;
    }

    @JsonProperty("CountryName")
    public CountryName getCountryName() {
        return countryName;
    }

    @JsonProperty("CountryName")
    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

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

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("streetNmbr", streetNmbr).append("bldgRoom", bldgRoom).append("addressLine", addressLine).append("cityName", cityName).append("postalCode", postalCode).append("county", county).append("stateProv", stateProv).append("countryName", countryName).append("type", type).append("formattedInd", formattedInd).append("shareSynchInd", shareSynchInd).append("shareMarketInd", shareMarketInd).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(shareMarketInd).append(bldgRoom).append(postalCode).append(county).append(addressLine).append(type).append(streetNmbr).append(stateProv).append(cityName).append(countryName).append(formattedInd).append(shareSynchInd).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(shareMarketInd, rhs.shareMarketInd).append(bldgRoom, rhs.bldgRoom).append(postalCode, rhs.postalCode).append(county, rhs.county).append(addressLine, rhs.addressLine).append(type, rhs.type).append(streetNmbr, rhs.streetNmbr).append(stateProv, rhs.stateProv).append(cityName, rhs.cityName).append(countryName, rhs.countryName).append(formattedInd, rhs.formattedInd).append(shareSynchInd, rhs.shareSynchInd).isEquals();
    }

}

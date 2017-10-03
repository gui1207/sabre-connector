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
    "StateCode",
    "CountryCode",
    "CityCode",
    "Type"
})
public class PassengerStatus {

    @JsonProperty("StateCode")
    private String stateCode;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("CityCode")
    private String cityCode;
    @JsonProperty("Type")
    private String type;

    @JsonProperty("StateCode")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("StateCode")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("CityCode")
    public String getCityCode() {
        return cityCode;
    }

    @JsonProperty("CityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("stateCode", stateCode).append("countryCode", countryCode).append("cityCode", cityCode).append("type", type).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(stateCode).append(type).append(countryCode).append(cityCode).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassengerStatus) == false) {
            return false;
        }
        PassengerStatus rhs = ((PassengerStatus) other);
        return new EqualsBuilder().append(stateCode, rhs.stateCode).append(type, rhs.type).append(countryCode, rhs.countryCode).append(cityCode, rhs.cityCode).isEquals();
    }

}

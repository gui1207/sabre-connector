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
    "AirlineCode",
    "Type",
    "FailCode",
    "Info"
})
public class Message_ {

    @JsonProperty("AirlineCode")
    private String airlineCode;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("FailCode")
    private Double failCode;
    @JsonProperty("Info")
    private String info;

    @JsonProperty("AirlineCode")
    public String getAirlineCode() {
        return airlineCode;
    }

    @JsonProperty("AirlineCode")
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("FailCode")
    public Double getFailCode() {
        return failCode;
    }

    @JsonProperty("FailCode")
    public void setFailCode(Double failCode) {
        this.failCode = failCode;
    }

    @JsonProperty("Info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("Info")
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("airlineCode", airlineCode).append("type", type).append("failCode", failCode).append("info", info).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(failCode).append(airlineCode).append(type).append(info).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Message_) == false) {
            return false;
        }
        Message_ rhs = ((Message_) other);
        return new EqualsBuilder().append(failCode, rhs.failCode).append(airlineCode, rhs.airlineCode).append(type, rhs.type).append(info, rhs.info).isEquals();
    }

}

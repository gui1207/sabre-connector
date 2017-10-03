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
    "AirEquipType",
    "ChangeofGauge",
    "WideBody",
    "PreferLevel"
})
public class EquipPref {

    @JsonProperty("content")
    private String content;
    @JsonProperty("AirEquipType")
    private String airEquipType;
    @JsonProperty("ChangeofGauge")
    private Boolean changeofGauge;
    @JsonProperty("WideBody")
    private Boolean wideBody;
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

    @JsonProperty("AirEquipType")
    public String getAirEquipType() {
        return airEquipType;
    }

    @JsonProperty("AirEquipType")
    public void setAirEquipType(String airEquipType) {
        this.airEquipType = airEquipType;
    }

    @JsonProperty("ChangeofGauge")
    public Boolean getChangeofGauge() {
        return changeofGauge;
    }

    @JsonProperty("ChangeofGauge")
    public void setChangeofGauge(Boolean changeofGauge) {
        this.changeofGauge = changeofGauge;
    }

    @JsonProperty("WideBody")
    public Boolean getWideBody() {
        return wideBody;
    }

    @JsonProperty("WideBody")
    public void setWideBody(Boolean wideBody) {
        this.wideBody = wideBody;
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
        return new ToStringBuilder(this).append("content", content).append("airEquipType", airEquipType).append("changeofGauge", changeofGauge).append("wideBody", wideBody).append("preferLevel", preferLevel).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(airEquipType).append(wideBody).append(preferLevel).append(content).append(changeofGauge).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EquipPref) == false) {
            return false;
        }
        EquipPref rhs = ((EquipPref) other);
        return new EqualsBuilder().append(airEquipType, rhs.airEquipType).append(wideBody, rhs.wideBody).append(preferLevel, rhs.preferLevel).append(content, rhs.content).append(changeofGauge, rhs.changeofGauge).isEquals();
    }

}

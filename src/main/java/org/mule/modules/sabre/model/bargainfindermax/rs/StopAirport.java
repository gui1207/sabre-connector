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
    "ArrivalDateTime",
    "DepartureDateTime",
    "ElapsedTime",
    "Duration",
    "GMTOffset",
    "Equipment"
})
public class StopAirport {

    @JsonProperty("content")
    private String content;
    @JsonProperty("LocationCode")
    private String locationCode;
    @JsonProperty("CodeContext")
    private String codeContext;
    @JsonProperty("ArrivalDateTime")
    private String arrivalDateTime;
    @JsonProperty("DepartureDateTime")
    private String departureDateTime;
    @JsonProperty("ElapsedTime")
    private Integer elapsedTime;
    @JsonProperty("Duration")
    private Integer duration;
    @JsonProperty("GMTOffset")
    private Double gMTOffset;
    @JsonProperty("Equipment")
    private String equipment;

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

    @JsonProperty("ArrivalDateTime")
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    @JsonProperty("ArrivalDateTime")
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    @JsonProperty("DepartureDateTime")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    @JsonProperty("DepartureDateTime")
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @JsonProperty("ElapsedTime")
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    @JsonProperty("ElapsedTime")
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @JsonProperty("Duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("Duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("GMTOffset")
    public Double getGMTOffset() {
        return gMTOffset;
    }

    @JsonProperty("GMTOffset")
    public void setGMTOffset(Double gMTOffset) {
        this.gMTOffset = gMTOffset;
    }

    @JsonProperty("Equipment")
    public String getEquipment() {
        return equipment;
    }

    @JsonProperty("Equipment")
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("locationCode", locationCode).append("codeContext", codeContext).append("arrivalDateTime", arrivalDateTime).append("departureDateTime", departureDateTime).append("elapsedTime", elapsedTime).append("duration", duration).append("gMTOffset", gMTOffset).append("equipment", equipment).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(duration).append(codeContext).append(departureDateTime).append(equipment).append(arrivalDateTime).append(gMTOffset).append(locationCode).append(content).append(elapsedTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopAirport) == false) {
            return false;
        }
        StopAirport rhs = ((StopAirport) other);
        return new EqualsBuilder().append(duration, rhs.duration).append(codeContext, rhs.codeContext).append(departureDateTime, rhs.departureDateTime).append(equipment, rhs.equipment).append(arrivalDateTime, rhs.arrivalDateTime).append(gMTOffset, rhs.gMTOffset).append(locationCode, rhs.locationCode).append(content, rhs.content).append(elapsedTime, rhs.elapsedTime).isEquals();
    }

}

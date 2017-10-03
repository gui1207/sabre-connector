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
    "LocationCode",
    "AirportsGroup",
    "CodeContext",
    "LocationType",
    "AllAirports"
})
public class OriginLocation {

    @JsonProperty("content")
    private String content;
    @JsonProperty("LocationCode")
    private String locationCode;
    @JsonProperty("AirportsGroup")
    private String airportsGroup;
    @JsonProperty("CodeContext")
    private String codeContext;
    @JsonProperty("LocationType")
    private String locationType;
    @JsonProperty("AllAirports")
    private Boolean allAirports;

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

    @JsonProperty("AirportsGroup")
    public String getAirportsGroup() {
        return airportsGroup;
    }

    @JsonProperty("AirportsGroup")
    public void setAirportsGroup(String airportsGroup) {
        this.airportsGroup = airportsGroup;
    }

    @JsonProperty("CodeContext")
    public String getCodeContext() {
        return codeContext;
    }

    @JsonProperty("CodeContext")
    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }

    @JsonProperty("LocationType")
    public String getLocationType() {
        return locationType;
    }

    @JsonProperty("LocationType")
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @JsonProperty("AllAirports")
    public Boolean getAllAirports() {
        return allAirports;
    }

    @JsonProperty("AllAirports")
    public void setAllAirports(Boolean allAirports) {
        this.allAirports = allAirports;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("locationCode", locationCode).append("airportsGroup", airportsGroup).append("codeContext", codeContext).append("locationType", locationType).append("allAirports", allAirports).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(codeContext).append(locationType).append(allAirports).append(locationCode).append(airportsGroup).append(content).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginLocation) == false) {
            return false;
        }
        OriginLocation rhs = ((OriginLocation) other);
        return new EqualsBuilder().append(codeContext, rhs.codeContext).append(locationType, rhs.locationType).append(allAirports, rhs.allAirports).append(locationCode, rhs.locationCode).append(airportsGroup, rhs.airportsGroup).append(content, rhs.content).isEquals();
    }

}

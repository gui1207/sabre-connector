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
    "PreferLevel"
})
public class ConnectionLocation {

    @JsonProperty("content")
    private String content;
    @JsonProperty("LocationCode")
    private String locationCode;
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

    @JsonProperty("LocationCode")
    public String getLocationCode() {
        return locationCode;
    }

    @JsonProperty("LocationCode")
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
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
        return new ToStringBuilder(this).append("content", content).append("locationCode", locationCode).append("preferLevel", preferLevel).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(preferLevel).append(locationCode).append(content).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectionLocation) == false) {
            return false;
        }
        ConnectionLocation rhs = ((ConnectionLocation) other);
        return new EqualsBuilder().append(preferLevel, rhs.preferLevel).append(locationCode, rhs.locationCode).append(content, rhs.content).isEquals();
    }

}

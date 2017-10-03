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
    "ReturnTimeOfDay",
    "MinStay",
    "StayUnit",
    "MinStayDate"
})
public class MinimumStay {

    @JsonProperty("ReturnTimeOfDay")
    private String returnTimeOfDay;
    @JsonProperty("MinStay")
    private Integer minStay;
    @JsonProperty("StayUnit")
    private String stayUnit;
    @JsonProperty("MinStayDate")
    private String minStayDate;

    @JsonProperty("ReturnTimeOfDay")
    public String getReturnTimeOfDay() {
        return returnTimeOfDay;
    }

    @JsonProperty("ReturnTimeOfDay")
    public void setReturnTimeOfDay(String returnTimeOfDay) {
        this.returnTimeOfDay = returnTimeOfDay;
    }

    @JsonProperty("MinStay")
    public Integer getMinStay() {
        return minStay;
    }

    @JsonProperty("MinStay")
    public void setMinStay(Integer minStay) {
        this.minStay = minStay;
    }

    @JsonProperty("StayUnit")
    public String getStayUnit() {
        return stayUnit;
    }

    @JsonProperty("StayUnit")
    public void setStayUnit(String stayUnit) {
        this.stayUnit = stayUnit;
    }

    @JsonProperty("MinStayDate")
    public String getMinStayDate() {
        return minStayDate;
    }

    @JsonProperty("MinStayDate")
    public void setMinStayDate(String minStayDate) {
        this.minStayDate = minStayDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("returnTimeOfDay", returnTimeOfDay).append("minStay", minStay).append("stayUnit", stayUnit).append("minStayDate", minStayDate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(minStay).append(minStayDate).append(returnTimeOfDay).append(stayUnit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MinimumStay) == false) {
            return false;
        }
        MinimumStay rhs = ((MinimumStay) other);
        return new EqualsBuilder().append(minStay, rhs.minStay).append(minStayDate, rhs.minStayDate).append(returnTimeOfDay, rhs.returnTimeOfDay).append(stayUnit, rhs.stayUnit).isEquals();
    }

}

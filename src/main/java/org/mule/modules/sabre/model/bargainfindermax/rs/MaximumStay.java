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
    "ReturnType",
    "ReturnTimeOfDay",
    "MaxStay",
    "StayUnit",
    "MaxStayDate"
})
public class MaximumStay {

    @JsonProperty("ReturnType")
    private String returnType;
    @JsonProperty("ReturnTimeOfDay")
    private String returnTimeOfDay;
    @JsonProperty("MaxStay")
    private Integer maxStay;
    @JsonProperty("StayUnit")
    private String stayUnit;
    @JsonProperty("MaxStayDate")
    private String maxStayDate;

    @JsonProperty("ReturnType")
    public String getReturnType() {
        return returnType;
    }

    @JsonProperty("ReturnType")
    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    @JsonProperty("ReturnTimeOfDay")
    public String getReturnTimeOfDay() {
        return returnTimeOfDay;
    }

    @JsonProperty("ReturnTimeOfDay")
    public void setReturnTimeOfDay(String returnTimeOfDay) {
        this.returnTimeOfDay = returnTimeOfDay;
    }

    @JsonProperty("MaxStay")
    public Integer getMaxStay() {
        return maxStay;
    }

    @JsonProperty("MaxStay")
    public void setMaxStay(Integer maxStay) {
        this.maxStay = maxStay;
    }

    @JsonProperty("StayUnit")
    public String getStayUnit() {
        return stayUnit;
    }

    @JsonProperty("StayUnit")
    public void setStayUnit(String stayUnit) {
        this.stayUnit = stayUnit;
    }

    @JsonProperty("MaxStayDate")
    public String getMaxStayDate() {
        return maxStayDate;
    }

    @JsonProperty("MaxStayDate")
    public void setMaxStayDate(String maxStayDate) {
        this.maxStayDate = maxStayDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("returnType", returnType).append("returnTimeOfDay", returnTimeOfDay).append("maxStay", maxStay).append("stayUnit", stayUnit).append("maxStayDate", maxStayDate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxStayDate).append(maxStay).append(returnTimeOfDay).append(stayUnit).append(returnType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaximumStay) == false) {
            return false;
        }
        MaximumStay rhs = ((MaximumStay) other);
        return new EqualsBuilder().append(maxStayDate, rhs.maxStayDate).append(maxStay, rhs.maxStay).append(returnTimeOfDay, rhs.returnTimeOfDay).append(stayUnit, rhs.stayUnit).append(returnType, rhs.returnType).isEquals();
    }

}

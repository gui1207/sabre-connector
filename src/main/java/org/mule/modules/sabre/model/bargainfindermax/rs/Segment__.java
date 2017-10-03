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
    "Number",
    "ProgramID",
    "ProgramCode",
    "ProgramDescription",
    "ProgramSystemCode",
    "BrandID",
    "BrandName",
    "FareStatus"
})
public class Segment__ {

    @JsonProperty("Number")
    private Integer number;
    @JsonProperty("ProgramID")
    private String programID;
    @JsonProperty("ProgramCode")
    private String programCode;
    @JsonProperty("ProgramDescription")
    private String programDescription;
    @JsonProperty("ProgramSystemCode")
    private String programSystemCode;
    @JsonProperty("BrandID")
    private String brandID;
    @JsonProperty("BrandName")
    private String brandName;
    @JsonProperty("FareStatus")
    private String fareStatus;

    @JsonProperty("Number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("ProgramID")
    public String getProgramID() {
        return programID;
    }

    @JsonProperty("ProgramID")
    public void setProgramID(String programID) {
        this.programID = programID;
    }

    @JsonProperty("ProgramCode")
    public String getProgramCode() {
        return programCode;
    }

    @JsonProperty("ProgramCode")
    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    @JsonProperty("ProgramDescription")
    public String getProgramDescription() {
        return programDescription;
    }

    @JsonProperty("ProgramDescription")
    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    @JsonProperty("ProgramSystemCode")
    public String getProgramSystemCode() {
        return programSystemCode;
    }

    @JsonProperty("ProgramSystemCode")
    public void setProgramSystemCode(String programSystemCode) {
        this.programSystemCode = programSystemCode;
    }

    @JsonProperty("BrandID")
    public String getBrandID() {
        return brandID;
    }

    @JsonProperty("BrandID")
    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    @JsonProperty("BrandName")
    public String getBrandName() {
        return brandName;
    }

    @JsonProperty("BrandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @JsonProperty("FareStatus")
    public String getFareStatus() {
        return fareStatus;
    }

    @JsonProperty("FareStatus")
    public void setFareStatus(String fareStatus) {
        this.fareStatus = fareStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("number", number).append("programID", programID).append("programCode", programCode).append("programDescription", programDescription).append("programSystemCode", programSystemCode).append("brandID", brandID).append("brandName", brandName).append("fareStatus", fareStatus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(number).append(programDescription).append(brandName).append(programCode).append(brandID).append(programSystemCode).append(programID).append(fareStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Segment__) == false) {
            return false;
        }
        Segment__ rhs = ((Segment__) other);
        return new EqualsBuilder().append(number, rhs.number).append(programDescription, rhs.programDescription).append(brandName, rhs.brandName).append(programCode, rhs.programCode).append(brandID, rhs.brandID).append(programSystemCode, rhs.programSystemCode).append(programID, rhs.programID).append(fareStatus, rhs.fareStatus).isEquals();
    }

}

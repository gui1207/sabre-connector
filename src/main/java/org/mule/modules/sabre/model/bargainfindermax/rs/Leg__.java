/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

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
    "Segment",
    "Number",
    "BrandID",
    "BrandDescription",
    "ProgramName",
    "ProgramID",
    "ProgramCode",
    "ProgramSystemCode",
    "FareStatus"
})
public class Leg__ {

    @JsonProperty("Segment")
    private List<Segment__> segment = new ArrayList<Segment__>();
    @JsonProperty("Number")
    private String number;
    @JsonProperty("BrandID")
    private String brandID;
    @JsonProperty("BrandDescription")
    private String brandDescription;
    @JsonProperty("ProgramName")
    private String programName;
    @JsonProperty("ProgramID")
    private String programID;
    @JsonProperty("ProgramCode")
    private String programCode;
    @JsonProperty("ProgramSystemCode")
    private String programSystemCode;
    @JsonProperty("FareStatus")
    private String fareStatus;

    @JsonProperty("Segment")
    public List<Segment__> getSegment() {
        return segment;
    }

    @JsonProperty("Segment")
    public void setSegment(List<Segment__> segment) {
        this.segment = segment;
    }

    @JsonProperty("Number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("BrandID")
    public String getBrandID() {
        return brandID;
    }

    @JsonProperty("BrandID")
    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    @JsonProperty("BrandDescription")
    public String getBrandDescription() {
        return brandDescription;
    }

    @JsonProperty("BrandDescription")
    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    @JsonProperty("ProgramName")
    public String getProgramName() {
        return programName;
    }

    @JsonProperty("ProgramName")
    public void setProgramName(String programName) {
        this.programName = programName;
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

    @JsonProperty("ProgramSystemCode")
    public String getProgramSystemCode() {
        return programSystemCode;
    }

    @JsonProperty("ProgramSystemCode")
    public void setProgramSystemCode(String programSystemCode) {
        this.programSystemCode = programSystemCode;
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
        return new ToStringBuilder(this).append("segment", segment).append("number", number).append("brandID", brandID).append("brandDescription", brandDescription).append("programName", programName).append("programID", programID).append("programCode", programCode).append("programSystemCode", programSystemCode).append("fareStatus", fareStatus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(number).append(brandDescription).append(programCode).append(programName).append(segment).append(brandID).append(programSystemCode).append(programID).append(fareStatus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Leg__) == false) {
            return false;
        }
        Leg__ rhs = ((Leg__) other);
        return new EqualsBuilder().append(number, rhs.number).append(brandDescription, rhs.brandDescription).append(programCode, rhs.programCode).append(programName, rhs.programName).append(segment, rhs.segment).append(brandID, rhs.brandID).append(programSystemCode, rhs.programSystemCode).append(programID, rhs.programID).append(fareStatus, rhs.fareStatus).isEquals();
    }

}

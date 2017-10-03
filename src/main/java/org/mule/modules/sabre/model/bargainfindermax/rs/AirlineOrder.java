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
    "CompanyShortName",
    "TravelSector",
    "Code",
    "CodeContext",
    "SequenceNumber"
})
public class AirlineOrder {

    @JsonProperty("content")
    private String content;
    @JsonProperty("CompanyShortName")
    private String companyShortName;
    @JsonProperty("TravelSector")
    private String travelSector;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("CodeContext")
    private String codeContext;
    @JsonProperty("SequenceNumber")
    private Double sequenceNumber;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("CompanyShortName")
    public String getCompanyShortName() {
        return companyShortName;
    }

    @JsonProperty("CompanyShortName")
    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    @JsonProperty("TravelSector")
    public String getTravelSector() {
        return travelSector;
    }

    @JsonProperty("TravelSector")
    public void setTravelSector(String travelSector) {
        this.travelSector = travelSector;
    }

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("CodeContext")
    public String getCodeContext() {
        return codeContext;
    }

    @JsonProperty("CodeContext")
    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }

    @JsonProperty("SequenceNumber")
    public Double getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("SequenceNumber")
    public void setSequenceNumber(Double sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("companyShortName", companyShortName).append("travelSector", travelSector).append("code", code).append("codeContext", codeContext).append("sequenceNumber", sequenceNumber).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sequenceNumber).append(code).append(codeContext).append(companyShortName).append(travelSector).append(content).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirlineOrder) == false) {
            return false;
        }
        AirlineOrder rhs = ((AirlineOrder) other);
        return new EqualsBuilder().append(sequenceNumber, rhs.sequenceNumber).append(code, rhs.code).append(codeContext, rhs.codeContext).append(companyShortName, rhs.companyShortName).append(travelSector, rhs.travelSector).append(content, rhs.content).isEquals();
    }

}

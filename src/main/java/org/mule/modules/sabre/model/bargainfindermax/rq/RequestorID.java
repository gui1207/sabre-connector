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
    "CompanyName",
    "URL",
    "Type",
    "Instance",
    "ID_Context",
    "ID"
})
public class RequestorID {

    @JsonProperty("CompanyName")
    private CompanyName companyName;
    @JsonProperty("URL")
    private String uRL;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Instance")
    private String instance;
    @JsonProperty("ID_Context")
    private String iDContext;
    @JsonProperty("ID")
    private String iD;

    @JsonProperty("CompanyName")
    public CompanyName getCompanyName() {
        return companyName;
    }

    @JsonProperty("CompanyName")
    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("URL")
    public String getURL() {
        return uRL;
    }

    @JsonProperty("URL")
    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Instance")
    public String getInstance() {
        return instance;
    }

    @JsonProperty("Instance")
    public void setInstance(String instance) {
        this.instance = instance;
    }

    @JsonProperty("ID_Context")
    public String getIDContext() {
        return iDContext;
    }

    @JsonProperty("ID_Context")
    public void setIDContext(String iDContext) {
        this.iDContext = iDContext;
    }

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("companyName", companyName).append("uRL", uRL).append("type", type).append("instance", instance).append("iDContext", iDContext).append("iD", iD).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(instance).append(iDContext).append(companyName).append(iD).append(type).append(uRL).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestorID) == false) {
            return false;
        }
        RequestorID rhs = ((RequestorID) other);
        return new EqualsBuilder().append(instance, rhs.instance).append(iDContext, rhs.iDContext).append(companyName, rhs.companyName).append(iD, rhs.iD).append(type, rhs.type).append(uRL, rhs.uRL).isEquals();
    }

}

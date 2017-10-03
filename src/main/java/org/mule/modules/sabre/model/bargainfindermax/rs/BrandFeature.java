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
    "Id",
    "Application",
    "ServiceType",
    "ServiceGroup",
    "SubCode",
    "Vendor",
    "CommercialName"
})
public class BrandFeature {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Application")
    private String application;
    @JsonProperty("ServiceType")
    private String serviceType;
    @JsonProperty("ServiceGroup")
    private String serviceGroup;
    @JsonProperty("SubCode")
    private String subCode;
    @JsonProperty("Vendor")
    private String vendor;
    @JsonProperty("CommercialName")
    private String commercialName;

    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("Application")
    public String getApplication() {
        return application;
    }

    @JsonProperty("Application")
    public void setApplication(String application) {
        this.application = application;
    }

    @JsonProperty("ServiceType")
    public String getServiceType() {
        return serviceType;
    }

    @JsonProperty("ServiceType")
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @JsonProperty("ServiceGroup")
    public String getServiceGroup() {
        return serviceGroup;
    }

    @JsonProperty("ServiceGroup")
    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    @JsonProperty("SubCode")
    public String getSubCode() {
        return subCode;
    }

    @JsonProperty("SubCode")
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    @JsonProperty("Vendor")
    public String getVendor() {
        return vendor;
    }

    @JsonProperty("Vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @JsonProperty("CommercialName")
    public String getCommercialName() {
        return commercialName;
    }

    @JsonProperty("CommercialName")
    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("application", application).append("serviceType", serviceType).append("serviceGroup", serviceGroup).append("subCode", subCode).append("vendor", vendor).append("commercialName", commercialName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceType).append(application).append(subCode).append(vendor).append(serviceGroup).append(id).append(commercialName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BrandFeature) == false) {
            return false;
        }
        BrandFeature rhs = ((BrandFeature) other);
        return new EqualsBuilder().append(serviceType, rhs.serviceType).append(application, rhs.application).append(subCode, rhs.subCode).append(vendor, rhs.vendor).append(serviceGroup, rhs.serviceGroup).append(id, rhs.id).append(commercialName, rhs.commercialName).isEquals();
    }

}

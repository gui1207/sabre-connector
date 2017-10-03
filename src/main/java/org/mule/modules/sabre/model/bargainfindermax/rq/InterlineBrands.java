/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

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
    "Brand",
    "ChangeBrandForSoldout"
})
public class InterlineBrands {

    @JsonProperty("Brand")
    private List<Brand> brand = new ArrayList<Brand>();
    @JsonProperty("ChangeBrandForSoldout")
    private Boolean changeBrandForSoldout;

    @JsonProperty("Brand")
    public List<Brand> getBrand() {
        return brand;
    }

    @JsonProperty("Brand")
    public void setBrand(List<Brand> brand) {
        this.brand = brand;
    }

    @JsonProperty("ChangeBrandForSoldout")
    public Boolean getChangeBrandForSoldout() {
        return changeBrandForSoldout;
    }

    @JsonProperty("ChangeBrandForSoldout")
    public void setChangeBrandForSoldout(Boolean changeBrandForSoldout) {
        this.changeBrandForSoldout = changeBrandForSoldout;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("brand", brand).append("changeBrandForSoldout", changeBrandForSoldout).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(brand).append(changeBrandForSoldout).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InterlineBrands) == false) {
            return false;
        }
        InterlineBrands rhs = ((InterlineBrands) other);
        return new EqualsBuilder().append(brand, rhs.brand).append(changeBrandForSoldout, rhs.changeBrandForSoldout).isEquals();
    }

}

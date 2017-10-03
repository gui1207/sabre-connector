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
    "SellingFareData"
})
public class SellingFareDataList {

    @JsonProperty("SellingFareData")
    private List<SellingFareDatum> sellingFareData = new ArrayList<SellingFareDatum>();

    @JsonProperty("SellingFareData")
    public List<SellingFareDatum> getSellingFareData() {
        return sellingFareData;
    }

    @JsonProperty("SellingFareData")
    public void setSellingFareData(List<SellingFareDatum> sellingFareData) {
        this.sellingFareData = sellingFareData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sellingFareData", sellingFareData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sellingFareData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SellingFareDataList) == false) {
            return false;
        }
        SellingFareDataList rhs = ((SellingFareDataList) other);
        return new EqualsBuilder().append(sellingFareData, rhs.sellingFareData).isEquals();
    }

}

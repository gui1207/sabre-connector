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
    "AirlineOrder"
})
public class AirlineOrderList {

    @JsonProperty("AirlineOrder")
    private List<AirlineOrder> airlineOrder = new ArrayList<AirlineOrder>();

    @JsonProperty("AirlineOrder")
    public List<AirlineOrder> getAirlineOrder() {
        return airlineOrder;
    }

    @JsonProperty("AirlineOrder")
    public void setAirlineOrder(List<AirlineOrder> airlineOrder) {
        this.airlineOrder = airlineOrder;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("airlineOrder", airlineOrder).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(airlineOrder).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirlineOrderList) == false) {
            return false;
        }
        AirlineOrderList rhs = ((AirlineOrderList) other);
        return new EqualsBuilder().append(airlineOrder, rhs.airlineOrder).isEquals();
    }

}

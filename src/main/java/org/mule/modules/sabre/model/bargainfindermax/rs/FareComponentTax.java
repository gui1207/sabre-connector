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
    "FlightSegment",
    "Tax",
    "TaxSummary"
})
public class FareComponentTax {

    @JsonProperty("FlightSegment")
    private List<FlightSegment_> flightSegment = new ArrayList<FlightSegment_>();
    @JsonProperty("Tax")
    private List<Tax> tax = new ArrayList<Tax>();
    @JsonProperty("TaxSummary")
    private List<TaxSummary> taxSummary = new ArrayList<TaxSummary>();

    @JsonProperty("FlightSegment")
    public List<FlightSegment_> getFlightSegment() {
        return flightSegment;
    }

    @JsonProperty("FlightSegment")
    public void setFlightSegment(List<FlightSegment_> flightSegment) {
        this.flightSegment = flightSegment;
    }

    @JsonProperty("Tax")
    public List<Tax> getTax() {
        return tax;
    }

    @JsonProperty("Tax")
    public void setTax(List<Tax> tax) {
        this.tax = tax;
    }

    @JsonProperty("TaxSummary")
    public List<TaxSummary> getTaxSummary() {
        return taxSummary;
    }

    @JsonProperty("TaxSummary")
    public void setTaxSummary(List<TaxSummary> taxSummary) {
        this.taxSummary = taxSummary;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("flightSegment", flightSegment).append("tax", tax).append("taxSummary", taxSummary).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flightSegment).append(tax).append(taxSummary).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareComponentTax) == false) {
            return false;
        }
        FareComponentTax rhs = ((FareComponentTax) other);
        return new EqualsBuilder().append(flightSegment, rhs.flightSegment).append(tax, rhs.tax).append(taxSummary, rhs.taxSummary).isEquals();
    }

}

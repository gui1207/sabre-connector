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
    "Default",
    "Alternate",
    "OtherTicketing",
    "SettlementMethod",
    "Country",
    "NewVcxProcess"
})
public class ValidatingCarrier {

    @JsonProperty("Default")
    private Default _default;
    @JsonProperty("Alternate")
    private List<Default> alternate = new ArrayList<Default>();
    @JsonProperty("OtherTicketing")
    private List<Default> otherTicketing = new ArrayList<Default>();
    @JsonProperty("SettlementMethod")
    private String settlementMethod;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("NewVcxProcess")
    private Boolean newVcxProcess;

    @JsonProperty("Default")
    public Default getDefault() {
        return _default;
    }

    @JsonProperty("Default")
    public void setDefault(Default _default) {
        this._default = _default;
    }

    @JsonProperty("Alternate")
    public List<Default> getAlternate() {
        return alternate;
    }

    @JsonProperty("Alternate")
    public void setAlternate(List<Default> alternate) {
        this.alternate = alternate;
    }

    @JsonProperty("OtherTicketing")
    public List<Default> getOtherTicketing() {
        return otherTicketing;
    }

    @JsonProperty("OtherTicketing")
    public void setOtherTicketing(List<Default> otherTicketing) {
        this.otherTicketing = otherTicketing;
    }

    @JsonProperty("SettlementMethod")
    public String getSettlementMethod() {
        return settlementMethod;
    }

    @JsonProperty("SettlementMethod")
    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("NewVcxProcess")
    public Boolean getNewVcxProcess() {
        return newVcxProcess;
    }

    @JsonProperty("NewVcxProcess")
    public void setNewVcxProcess(Boolean newVcxProcess) {
        this.newVcxProcess = newVcxProcess;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("_default", _default).append("alternate", alternate).append("otherTicketing", otherTicketing).append("settlementMethod", settlementMethod).append("country", country).append("newVcxProcess", newVcxProcess).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_default).append(country).append(newVcxProcess).append(alternate).append(settlementMethod).append(otherTicketing).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValidatingCarrier) == false) {
            return false;
        }
        ValidatingCarrier rhs = ((ValidatingCarrier) other);
        return new EqualsBuilder().append(_default, rhs._default).append(country, rhs.country).append(newVcxProcess, rhs.newVcxProcess).append(alternate, rhs.alternate).append(settlementMethod, rhs.settlementMethod).append(otherTicketing, rhs.otherTicketing).isEquals();
    }

}

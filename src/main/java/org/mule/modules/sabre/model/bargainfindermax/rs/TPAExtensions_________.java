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
    "AdditionalFares",
    "Ops",
    "ItinSource",
    "ValueBucket",
    "ValidatingCarrier",
    "UnflownPrice",
    "DiversitySwapper",
    "Failed"
})
public class TPAExtensions_________ {

    @JsonProperty("AdditionalFares")
    private List<AdditionalFare> additionalFares = new ArrayList<AdditionalFare>();
    @JsonProperty("Ops")
    private Ops ops;
    @JsonProperty("ItinSource")
    private ItinSource itinSource;
    @JsonProperty("ValueBucket")
    private ValueBucket valueBucket;
    @JsonProperty("ValidatingCarrier")
    private ValidatingCarrier__ validatingCarrier;
    @JsonProperty("UnflownPrice")
    private UnflownPrice unflownPrice;
    @JsonProperty("DiversitySwapper")
    private DiversitySwapper diversitySwapper;
    @JsonProperty("Failed")
    private Failed failed;

    @JsonProperty("AdditionalFares")
    public List<AdditionalFare> getAdditionalFares() {
        return additionalFares;
    }

    @JsonProperty("AdditionalFares")
    public void setAdditionalFares(List<AdditionalFare> additionalFares) {
        this.additionalFares = additionalFares;
    }

    @JsonProperty("Ops")
    public Ops getOps() {
        return ops;
    }

    @JsonProperty("Ops")
    public void setOps(Ops ops) {
        this.ops = ops;
    }

    @JsonProperty("ItinSource")
    public ItinSource getItinSource() {
        return itinSource;
    }

    @JsonProperty("ItinSource")
    public void setItinSource(ItinSource itinSource) {
        this.itinSource = itinSource;
    }

    @JsonProperty("ValueBucket")
    public ValueBucket getValueBucket() {
        return valueBucket;
    }

    @JsonProperty("ValueBucket")
    public void setValueBucket(ValueBucket valueBucket) {
        this.valueBucket = valueBucket;
    }

    @JsonProperty("ValidatingCarrier")
    public ValidatingCarrier__ getValidatingCarrier() {
        return validatingCarrier;
    }

    @JsonProperty("ValidatingCarrier")
    public void setValidatingCarrier(ValidatingCarrier__ validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    @JsonProperty("UnflownPrice")
    public UnflownPrice getUnflownPrice() {
        return unflownPrice;
    }

    @JsonProperty("UnflownPrice")
    public void setUnflownPrice(UnflownPrice unflownPrice) {
        this.unflownPrice = unflownPrice;
    }

    @JsonProperty("DiversitySwapper")
    public DiversitySwapper getDiversitySwapper() {
        return diversitySwapper;
    }

    @JsonProperty("DiversitySwapper")
    public void setDiversitySwapper(DiversitySwapper diversitySwapper) {
        this.diversitySwapper = diversitySwapper;
    }

    @JsonProperty("Failed")
    public Failed getFailed() {
        return failed;
    }

    @JsonProperty("Failed")
    public void setFailed(Failed failed) {
        this.failed = failed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("additionalFares", additionalFares).append("ops", ops).append("itinSource", itinSource).append("valueBucket", valueBucket).append("validatingCarrier", validatingCarrier).append("unflownPrice", unflownPrice).append("diversitySwapper", diversitySwapper).append("failed", failed).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(valueBucket).append(additionalFares).append(ops).append(unflownPrice).append(itinSource).append(validatingCarrier).append(failed).append(diversitySwapper).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions_________) == false) {
            return false;
        }
        TPAExtensions_________ rhs = ((TPAExtensions_________) other);
        return new EqualsBuilder().append(valueBucket, rhs.valueBucket).append(additionalFares, rhs.additionalFares).append(ops, rhs.ops).append(unflownPrice, rhs.unflownPrice).append(itinSource, rhs.itinSource).append(validatingCarrier, rhs.validatingCarrier).append(failed, rhs.failed).append(diversitySwapper, rhs.diversitySwapper).isEquals();
    }

}

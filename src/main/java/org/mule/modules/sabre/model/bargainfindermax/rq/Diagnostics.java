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
    "Diagnostic"
})
public class Diagnostics {

    @JsonProperty("Diagnostic")
    private List<Diagnostic> diagnostic = new ArrayList<Diagnostic>();

    @JsonProperty("Diagnostic")
    public List<Diagnostic> getDiagnostic() {
        return diagnostic;
    }

    @JsonProperty("Diagnostic")
    public void setDiagnostic(List<Diagnostic> diagnostic) {
        this.diagnostic = diagnostic;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("diagnostic", diagnostic).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(diagnostic).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Diagnostics) == false) {
            return false;
        }
        Diagnostics rhs = ((Diagnostics) other);
        return new EqualsBuilder().append(diagnostic, rhs.diagnostic).isEquals();
    }

}

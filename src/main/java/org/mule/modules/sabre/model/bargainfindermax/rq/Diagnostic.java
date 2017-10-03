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
    "DiagnosticArgument",
    "TPA_Extensions",
    "Target",
    "Code"
})
public class Diagnostic {

    @JsonProperty("DiagnosticArgument")
    private List<DiagnosticArgument> diagnosticArgument = new ArrayList<DiagnosticArgument>();
    @JsonProperty("TPA_Extensions")
    private String tPAExtensions;
    @JsonProperty("Target")
    private String target;
    @JsonProperty("Code")
    private String code;

    @JsonProperty("DiagnosticArgument")
    public List<DiagnosticArgument> getDiagnosticArgument() {
        return diagnosticArgument;
    }

    @JsonProperty("DiagnosticArgument")
    public void setDiagnosticArgument(List<DiagnosticArgument> diagnosticArgument) {
        this.diagnosticArgument = diagnosticArgument;
    }

    @JsonProperty("TPA_Extensions")
    public String getTPAExtensions() {
        return tPAExtensions;
    }

    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(String tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    @JsonProperty("Target")
    public String getTarget() {
        return target;
    }

    @JsonProperty("Target")
    public void setTarget(String target) {
        this.target = target;
    }

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("diagnosticArgument", diagnosticArgument).append("tPAExtensions", tPAExtensions).append("target", target).append("code", code).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(diagnosticArgument).append(tPAExtensions).append(target).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Diagnostic) == false) {
            return false;
        }
        Diagnostic rhs = ((Diagnostic) other);
        return new EqualsBuilder().append(code, rhs.code).append(diagnosticArgument, rhs.diagnosticArgument).append(tPAExtensions, rhs.tPAExtensions).append(target, rhs.target).isEquals();
    }

}

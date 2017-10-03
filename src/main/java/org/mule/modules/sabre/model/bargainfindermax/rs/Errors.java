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
    "Error"
})
public class Errors {

    @JsonProperty("Error")
    private List<Error> error = new ArrayList<Error>();

    @JsonProperty("Error")
    public List<Error> getError() {
        return error;
    }

    @JsonProperty("Error")
    public void setError(List<Error> error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("error", error).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(error).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Errors) == false) {
            return false;
        }
        Errors rhs = ((Errors) other);
        return new EqualsBuilder().append(error, rhs.error).isEquals();
    }

}

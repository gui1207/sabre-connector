/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Operating",
    "Marketing"
})
public class Airline {

    @JsonProperty("Operating")
    private String operating;
    @JsonProperty("Marketing")
    private String marketing;

    @JsonProperty("Operating")
    public String getOperating() {
        return operating;
    }

    @JsonProperty("Operating")
    public void setOperating(String operating) {
        this.operating = operating;
    }

    @JsonProperty("Marketing")
    public String getMarketing() {
        return marketing;
    }

    @JsonProperty("Marketing")
    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("operating", operating).append("marketing", marketing).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(marketing).append(operating).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Airline) == false) {
            return false;
        }
        Airline rhs = ((Airline) other);
        return new EqualsBuilder().append(marketing, rhs.marketing).append(operating, rhs.operating).isEquals();
    }

}

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
    "Type",
    "Command"
})
public class SeatStatusSim {

    @JsonProperty("Type")
    private String type;
    @JsonProperty("Command")
    private String command;

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Command")
    public String getCommand() {
        return command;
    }

    @JsonProperty("Command")
    public void setCommand(String command) {
        this.command = command;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("command", command).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(command).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeatStatusSim) == false) {
            return false;
        }
        SeatStatusSim rhs = ((SeatStatusSim) other);
        return new EqualsBuilder().append(type, rhs.type).append(command, rhs.command).isEquals();
    }

}

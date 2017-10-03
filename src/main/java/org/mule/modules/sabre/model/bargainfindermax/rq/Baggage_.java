/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rq;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RequestType",
    "Description",
    "RequestedPieces",
    "FreePieceRequired"
})
public class Baggage_ {

    @JsonProperty("RequestType")
    private Baggage_.RequestType requestType;
    @JsonProperty("Description")
    private Boolean description;
    @JsonProperty("RequestedPieces")
    private Integer requestedPieces;
    @JsonProperty("FreePieceRequired")
    private Boolean freePieceRequired;

    @JsonProperty("RequestType")
    public Baggage_.RequestType getRequestType() {
        return requestType;
    }

    @JsonProperty("RequestType")
    public void setRequestType(Baggage_.RequestType requestType) {
        this.requestType = requestType;
    }

    @JsonProperty("Description")
    public Boolean getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(Boolean description) {
        this.description = description;
    }

    @JsonProperty("RequestedPieces")
    public Integer getRequestedPieces() {
        return requestedPieces;
    }

    @JsonProperty("RequestedPieces")
    public void setRequestedPieces(Integer requestedPieces) {
        this.requestedPieces = requestedPieces;
    }

    @JsonProperty("FreePieceRequired")
    public Boolean getFreePieceRequired() {
        return freePieceRequired;
    }

    @JsonProperty("FreePieceRequired")
    public void setFreePieceRequired(Boolean freePieceRequired) {
        this.freePieceRequired = freePieceRequired;
    }

    @java.lang.Override
    public String toString() {
        return new ToStringBuilder(this).append("requestType", requestType).append("description", description).append("requestedPieces", requestedPieces).append("freePieceRequired", freePieceRequired).toString();
    }

    @java.lang.Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(freePieceRequired).append(requestType).append(requestedPieces).toHashCode();
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Baggage_) == false) {
            return false;
        }
        Baggage_ rhs = ((Baggage_) other);
        return new EqualsBuilder().append(description, rhs.description).append(freePieceRequired, rhs.freePieceRequired).append(requestType, rhs.requestType).append(requestedPieces, rhs.requestedPieces).isEquals();
    }

    public enum RequestType {

        C("C"),
        N("N"),
        A("A");
        private final String value;
        private final static Map<String, Baggage_.RequestType> CONSTANTS = new HashMap<String, Baggage_.RequestType>();

        static {
            for (Baggage_.RequestType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private RequestType(String value) {
            this.value = value;
        }

        @java.lang.Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Baggage_.RequestType fromValue(String value) {
            Baggage_.RequestType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is
 * published under the terms of the CPAL v1.0 license, a copy of which
 * has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.sabre.model.bargainfindermax.rs;

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
    "content",
    "Language",
    "Type",
    "NodeList",
    "ShortText",
    "Code",
    "DocURL",
    "Status",
    "Tag",
    "RecordID",
    "MessageClass"
})
public class Error {

    @JsonProperty("content")
    private String content;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("NodeList")
    private String nodeList;
    @JsonProperty("ShortText")
    private String shortText;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("DocURL")
    private String docURL;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Tag")
    private String tag;
    @JsonProperty("RecordID")
    private String recordID;
    @JsonProperty("MessageClass")
    private Error.MessageClass messageClass;

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("Language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("NodeList")
    public String getNodeList() {
        return nodeList;
    }

    @JsonProperty("NodeList")
    public void setNodeList(String nodeList) {
        this.nodeList = nodeList;
    }

    @JsonProperty("ShortText")
    public String getShortText() {
        return shortText;
    }

    @JsonProperty("ShortText")
    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("DocURL")
    public String getDocURL() {
        return docURL;
    }

    @JsonProperty("DocURL")
    public void setDocURL(String docURL) {
        this.docURL = docURL;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("Tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("Tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("RecordID")
    public String getRecordID() {
        return recordID;
    }

    @JsonProperty("RecordID")
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    @JsonProperty("MessageClass")
    public Error.MessageClass getMessageClass() {
        return messageClass;
    }

    @JsonProperty("MessageClass")
    public void setMessageClass(Error.MessageClass messageClass) {
        this.messageClass = messageClass;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("content", content).append("language", language).append("type", type).append("nodeList", nodeList).append("shortText", shortText).append("code", code).append("docURL", docURL).append("status", status).append("tag", tag).append("recordID", recordID).append("messageClass", messageClass).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recordID).append(code).append(shortText).append(docURL).append(messageClass).append(language).append(tag).append(type).append(nodeList).append(content).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Error) == false) {
            return false;
        }
        Error rhs = ((Error) other);
        return new EqualsBuilder().append(recordID, rhs.recordID).append(code, rhs.code).append(shortText, rhs.shortText).append(docURL, rhs.docURL).append(messageClass, rhs.messageClass).append(language, rhs.language).append(tag, rhs.tag).append(type, rhs.type).append(nodeList, rhs.nodeList).append(content, rhs.content).append(status, rhs.status).isEquals();
    }

    public enum MessageClass {

        W("W"),
        D("D"),
        E("E"),
        I("I");
        private final String value;
        private final static Map<String, Error.MessageClass> CONSTANTS = new HashMap<String, Error.MessageClass>();

        static {
            for (Error.MessageClass c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private MessageClass(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Error.MessageClass fromValue(String value) {
            Error.MessageClass constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

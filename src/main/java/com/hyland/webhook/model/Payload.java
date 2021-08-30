
package com.hyland.webhook.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "account_id",
    "object"
})
@Generated("jsonschema2pojo")
public class Payload implements Serializable
{

    /**
     * Account Id of the user (host / co-host) who ended the meeting and also completed the recording.
     * 
     */
    @JsonProperty("account_id")
    @JsonPropertyDescription("Account Id of the user (host / co-host) who ended the meeting and also completed the recording.")
    private String accountId;
    @JsonProperty("object")
    private com.hyland.webhook.model.Object object;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = -2426156735360110015L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payload() {
    }

    /**
     * 
     * @param accountId
     * @param object
     */
    public Payload(String accountId, com.hyland.webhook.model.Object object) {
        super();
        this.accountId = accountId;
        this.object = object;
    }

    /**
     * Account Id of the user (host / co-host) who ended the meeting and also completed the recording.
     * 
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }

    /**
     * Account Id of the user (host / co-host) who ended the meeting and also completed the recording.
     * 
     */
    @JsonProperty("account_id")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Payload withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    @JsonProperty("object")
    public com.hyland.webhook.model.Object getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(com.hyland.webhook.model.Object object) {
        this.object = object;
    }

    public Payload withObject(com.hyland.webhook.model.Object object) {
        this.object = object;
        return this;
    }

    @JsonAnyGetter
    public Map<String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
    }

    public Payload withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Payload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.object == null)? 0 :this.object.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payload) == false) {
            return false;
        }
        Payload rhs = ((Payload) other);
        return ((((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.object == rhs.object)||((this.object!= null)&&this.object.equals(rhs.object))));
    }

}

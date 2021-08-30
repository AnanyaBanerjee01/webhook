
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
    "event",
    "payload",
    "download_token"
})
@Generated("jsonschema2pojo")
public class RecordingCompleteDTO implements Serializable
{

    /**
     * Name of the event. 
     * 
     */
    @JsonProperty("event")
    @JsonPropertyDescription("Name of the event. ")
    private String event;
    @JsonProperty("payload")
    private Payload payload;
    /**
     * Use this token along with the `download_url` to download the  Cloud Recording via an [OAuth app](https://marketplace.zoom.us/docs/guides/getting-started/app-types/create-oauth-app). This token only lasts for 24 hours after generation and thus, you can only download the file within 24 hours of receiving the "recording.completed" event notification.
     * 
     * You can either include the `download_token` as a query parameter or pass it as a Bearer token in the Authorization header of your HTTP request. 
     * #### Using Authorization Header (Recommended)
     * 
     * ```
     * curl --request GET \
     *   --url {download_url} \
     *   --header 'authorization: Bearer {download_token} \
     *   --header 'content-type: application/json'
     * ```
     * 
     * #### Using Query Parameter
     * The URL to download this type of recording will follow this structure: `{download_url}/?access_token={download_token}`
     * 
     * Example: `https://zoom.us/recording/download/bdfdgdg?access_token=abvdoerbfg`
     * 
     */
    @JsonProperty("download_token")
    @JsonPropertyDescription("Use this token along with the `download_url` to download the  Cloud Recording via an [OAuth app](https://marketplace.zoom.us/docs/guides/getting-started/app-types/create-oauth-app). This token only lasts for 24 hours after generation and thus, you can only download the file within 24 hours of receiving the \"recording.completed\" event notification.\n\nYou can either include the `download_token` as a query parameter or pass it as a Bearer token in the Authorization header of your HTTP request. \n#### Using Authorization Header (Recommended)\n\n```\ncurl --request GET \\\n  --url {download_url} \\\n  --header 'authorization: Bearer {download_token} \\\n  --header 'content-type: application/json'\n```\n\n#### Using Query Parameter\nThe URL to download this type of recording will follow this structure: `{download_url}/?access_token={download_token}`\n\nExample: `https://zoom.us/recording/download/bdfdgdg?access_token=abvdoerbfg`")
    private String downloadToken;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = 20084162999028740L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RecordingCompleteDTO() {
    }

    /**
     * 
     * @param payload
     * @param downloadToken
     * @param event
     */
    public RecordingCompleteDTO(String event, Payload payload, String downloadToken) {
        super();
        this.event = event;
        this.payload = payload;
        this.downloadToken = downloadToken;
    }

    /**
     * Name of the event. 
     * 
     */
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    /**
     * Name of the event. 
     * 
     */
    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    public RecordingCompleteDTO withEvent(String event) {
        this.event = event;
        return this;
    }

    @JsonProperty("payload")
    public Payload getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public RecordingCompleteDTO withPayload(Payload payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Use this token along with the `download_url` to download the  Cloud Recording via an [OAuth app](https://marketplace.zoom.us/docs/guides/getting-started/app-types/create-oauth-app). This token only lasts for 24 hours after generation and thus, you can only download the file within 24 hours of receiving the "recording.completed" event notification.
     * 
     * You can either include the `download_token` as a query parameter or pass it as a Bearer token in the Authorization header of your HTTP request. 
     * #### Using Authorization Header (Recommended)
     * 
     * ```
     * curl --request GET \
     *   --url {download_url} \
     *   --header 'authorization: Bearer {download_token} \
     *   --header 'content-type: application/json'
     * ```
     * 
     * #### Using Query Parameter
     * The URL to download this type of recording will follow this structure: `{download_url}/?access_token={download_token}`
     * 
     * Example: `https://zoom.us/recording/download/bdfdgdg?access_token=abvdoerbfg`
     * 
     */
    @JsonProperty("download_token")
    public String getDownloadToken() {
        return downloadToken;
    }

    /**
     * Use this token along with the `download_url` to download the  Cloud Recording via an [OAuth app](https://marketplace.zoom.us/docs/guides/getting-started/app-types/create-oauth-app). This token only lasts for 24 hours after generation and thus, you can only download the file within 24 hours of receiving the "recording.completed" event notification.
     * 
     * You can either include the `download_token` as a query parameter or pass it as a Bearer token in the Authorization header of your HTTP request. 
     * #### Using Authorization Header (Recommended)
     * 
     * ```
     * curl --request GET \
     *   --url {download_url} \
     *   --header 'authorization: Bearer {download_token} \
     *   --header 'content-type: application/json'
     * ```
     * 
     * #### Using Query Parameter
     * The URL to download this type of recording will follow this structure: `{download_url}/?access_token={download_token}`
     * 
     * Example: `https://zoom.us/recording/download/bdfdgdg?access_token=abvdoerbfg`
     * 
     */
    @JsonProperty("download_token")
    public void setDownloadToken(String downloadToken) {
        this.downloadToken = downloadToken;
    }

    public RecordingCompleteDTO withDownloadToken(String downloadToken) {
        this.downloadToken = downloadToken;
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

    public RecordingCompleteDTO withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecordingCompleteDTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
        sb.append(',');
        sb.append("downloadToken");
        sb.append('=');
        sb.append(((this.downloadToken == null)?"<null>":this.downloadToken));
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
        result = ((result* 31)+((this.downloadToken == null)? 0 :this.downloadToken.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecordingCompleteDTO) == false) {
            return false;
        }
        RecordingCompleteDTO rhs = ((RecordingCompleteDTO) other);
        return (((((this.downloadToken == rhs.downloadToken)||((this.downloadToken!= null)&&this.downloadToken.equals(rhs.downloadToken)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))));
    }

}


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
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "recording_start",
    "recording_end",
    "file_type",
    "file_name",
    "file_size",
    "play_url",
    "download_url",
    "status"
})
@Generated("jsonschema2pojo")
public class ParticipantAudioFile implements Serializable
{

    /**
     * The recording file's unique ID.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The recording file's unique ID.")
    private String id;
    /**
     * The recording file's start time.
     * 
     */
    @JsonProperty("recording_start")
    @JsonPropertyDescription("The recording file's start time.")
    private DateTime recordingStart;
    /**
     * The recording file's end time.
     * 
     */
    @JsonProperty("recording_end")
    @JsonPropertyDescription("The recording file's end time.")
    private DateTime recordingEnd;
    /**
     * The recording file's format.
     * 
     */
    @JsonProperty("file_type")
    @JsonPropertyDescription("The recording file's format.")
    private String fileType;
    /**
     * The recording file's name.
     * 
     */
    @JsonProperty("file_name")
    @JsonPropertyDescription("The recording file's name.")
    private String fileName;
    /**
     * The size of the recording file, in bytes.
     * 
     */
    @JsonProperty("file_size")
    @JsonPropertyDescription("The size of the recording file, in bytes.")
    private Long fileSize;
    /**
     * The URL at which the recording file can be opened and played.
     * 
     */
    @JsonProperty("play_url")
    @JsonPropertyDescription("The URL at which the recording file can be opened and played.")
    private String playUrl;
    /**
     * The recording file's status.
     * 
     */
    @JsonProperty("download_url")
    @JsonPropertyDescription("The recording file's status.")
    private String downloadUrl;
    /**
     * Status of the recording.
     * * `completed`: Recording has been completed.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the recording.\n* `completed`: Recording has been completed.")
    private String status;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = -8295857326441081852L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ParticipantAudioFile() {
    }

    /**
     * 
     * @param fileName
     * @param recordingEnd
     * @param recordingStart
     * @param fileSize
     * @param downloadUrl
     * @param id
     * @param fileType
     * @param playUrl
     * @param status
     */
    public ParticipantAudioFile(String id, DateTime recordingStart, DateTime recordingEnd, String fileType, String fileName, Long fileSize, String playUrl, String downloadUrl, String status) {
        super();
        this.id = id;
        this.recordingStart = recordingStart;
        this.recordingEnd = recordingEnd;
        this.fileType = fileType;
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.playUrl = playUrl;
        this.downloadUrl = downloadUrl;
        this.status = status;
    }

    /**
     * The recording file's unique ID.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * The recording file's unique ID.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ParticipantAudioFile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The recording file's start time.
     * 
     */
    @JsonProperty("recording_start")
    public DateTime getRecordingStart() {
        return recordingStart;
    }

    /**
     * The recording file's start time.
     * 
     */
    @JsonProperty("recording_start")
    public void setRecordingStart(DateTime recordingStart) {
        this.recordingStart = recordingStart;
    }

    public ParticipantAudioFile withRecordingStart(DateTime recordingStart) {
        this.recordingStart = recordingStart;
        return this;
    }

    /**
     * The recording file's end time.
     * 
     */
    @JsonProperty("recording_end")
    public DateTime getRecordingEnd() {
        return recordingEnd;
    }

    /**
     * The recording file's end time.
     * 
     */
    @JsonProperty("recording_end")
    public void setRecordingEnd(DateTime recordingEnd) {
        this.recordingEnd = recordingEnd;
    }

    public ParticipantAudioFile withRecordingEnd(DateTime recordingEnd) {
        this.recordingEnd = recordingEnd;
        return this;
    }

    /**
     * The recording file's format.
     * 
     */
    @JsonProperty("file_type")
    public String getFileType() {
        return fileType;
    }

    /**
     * The recording file's format.
     * 
     */
    @JsonProperty("file_type")
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ParticipantAudioFile withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * The recording file's name.
     * 
     */
    @JsonProperty("file_name")
    public String getFileName() {
        return fileName;
    }

    /**
     * The recording file's name.
     * 
     */
    @JsonProperty("file_name")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ParticipantAudioFile withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * The size of the recording file, in bytes.
     * 
     */
    @JsonProperty("file_size")
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * The size of the recording file, in bytes.
     * 
     */
    @JsonProperty("file_size")
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public ParticipantAudioFile withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * The URL at which the recording file can be opened and played.
     * 
     */
    @JsonProperty("play_url")
    public String getPlayUrl() {
        return playUrl;
    }

    /**
     * The URL at which the recording file can be opened and played.
     * 
     */
    @JsonProperty("play_url")
    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public ParticipantAudioFile withPlayUrl(String playUrl) {
        this.playUrl = playUrl;
        return this;
    }

    /**
     * The recording file's status.
     * 
     */
    @JsonProperty("download_url")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * The recording file's status.
     * 
     */
    @JsonProperty("download_url")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public ParticipantAudioFile withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Status of the recording.
     * * `completed`: Recording has been completed.
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status of the recording.
     * * `completed`: Recording has been completed.
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public ParticipantAudioFile withStatus(String status) {
        this.status = status;
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

    public ParticipantAudioFile withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParticipantAudioFile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("recordingStart");
        sb.append('=');
        sb.append(((this.recordingStart == null)?"<null>":this.recordingStart));
        sb.append(',');
        sb.append("recordingEnd");
        sb.append('=');
        sb.append(((this.recordingEnd == null)?"<null>":this.recordingEnd));
        sb.append(',');
        sb.append("fileType");
        sb.append('=');
        sb.append(((this.fileType == null)?"<null>":this.fileType));
        sb.append(',');
        sb.append("fileName");
        sb.append('=');
        sb.append(((this.fileName == null)?"<null>":this.fileName));
        sb.append(',');
        sb.append("fileSize");
        sb.append('=');
        sb.append(((this.fileSize == null)?"<null>":this.fileSize));
        sb.append(',');
        sb.append("playUrl");
        sb.append('=');
        sb.append(((this.playUrl == null)?"<null>":this.playUrl));
        sb.append(',');
        sb.append("downloadUrl");
        sb.append('=');
        sb.append(((this.downloadUrl == null)?"<null>":this.downloadUrl));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.fileName == null)? 0 :this.fileName.hashCode()));
        result = ((result* 31)+((this.recordingEnd == null)? 0 :this.recordingEnd.hashCode()));
        result = ((result* 31)+((this.recordingStart == null)? 0 :this.recordingStart.hashCode()));
        result = ((result* 31)+((this.fileSize == null)? 0 :this.fileSize.hashCode()));
        result = ((result* 31)+((this.downloadUrl == null)? 0 :this.downloadUrl.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fileType == null)? 0 :this.fileType.hashCode()));
        result = ((result* 31)+((this.playUrl == null)? 0 :this.playUrl.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParticipantAudioFile) == false) {
            return false;
        }
        ParticipantAudioFile rhs = ((ParticipantAudioFile) other);
        return (((((((((((this.fileName == rhs.fileName)||((this.fileName!= null)&&this.fileName.equals(rhs.fileName)))&&((this.recordingEnd == rhs.recordingEnd)||((this.recordingEnd!= null)&&this.recordingEnd.equals(rhs.recordingEnd))))&&((this.recordingStart == rhs.recordingStart)||((this.recordingStart!= null)&&this.recordingStart.equals(rhs.recordingStart))))&&((this.fileSize == rhs.fileSize)||((this.fileSize!= null)&&this.fileSize.equals(rhs.fileSize))))&&((this.downloadUrl == rhs.downloadUrl)||((this.downloadUrl!= null)&&this.downloadUrl.equals(rhs.downloadUrl))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fileType == rhs.fileType)||((this.fileType!= null)&&this.fileType.equals(rhs.fileType))))&&((this.playUrl == rhs.playUrl)||((this.playUrl!= null)&&this.playUrl.equals(rhs.playUrl))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}

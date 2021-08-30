
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
    "meeting_id",
    "recording_start",
    "recording_end",
    "file_type",
    "file_size",
    "play_url",
    "download_url",
    "status",
    "recording_type"
})
@Generated("jsonschema2pojo")
public class RecordingFile implements Serializable
{

    /**
     * Unique Identifier for Recording File. Recording File ID.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique Identifier for Recording File. Recording File ID.")
    private String id;
    /**
     * Unique Identifier of the meeting.
     * 
     */
    @JsonProperty("meeting_id")
    @JsonPropertyDescription("Unique Identifier of the meeting.")
    private String meetingId;
    /**
     * The date and time at which recording started.
     * 
     */
    @JsonProperty("recording_start")
    @JsonPropertyDescription("The date and time at which recording started.")
    private DateTime recordingStart;
    /**
     * The date and time at which recording ended.
     * 
     */
    @JsonProperty("recording_end")
    @JsonPropertyDescription("The date and time at which recording ended.")
    private String recordingEnd;
    /**
     * The type of file.
     * 
     */
    @JsonProperty("file_type")
    @JsonPropertyDescription("The type of file.")
    private String fileType;
    /**
     * The size of the recording file in bytes.
     * 
     */
    @JsonProperty("file_size")
    @JsonPropertyDescription("The size of the recording file in bytes.")
    private Long fileSize;
    /**
     * The URL of the file using which it can be opened and played.
     * 
     */
    @JsonProperty("play_url")
    @JsonPropertyDescription("The URL of the file using which it can be opened and played.")
    private String playUrl;
    /**
     * The URL using which the file can be downloaded.
     * 
     */
    @JsonProperty("download_url")
    @JsonPropertyDescription("The URL using which the file can be downloaded.")
    private String downloadUrl;
    /**
     * Status of the recording. <br>`completed`: Recording has been completed.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the recording. <br>`completed`: Recording has been completed.")
    private String status;
    /**
     * The type of the recording.
     * 
     */
    @JsonProperty("recording_type")
    @JsonPropertyDescription("The type of the recording.")
    private String recordingType;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = 306677788981229852L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RecordingFile() {
    }

    /**
     * 
     * @param recordingEnd
     * @param recordingStart
     * @param fileSize
     * @param recordingType
     * @param downloadUrl
     * @param meetingId
     * @param id
     * @param fileType
     * @param playUrl
     * @param status
     */
    public RecordingFile(String id, String meetingId, DateTime recordingStart, String recordingEnd, String fileType, Long fileSize, String playUrl, String downloadUrl, String status, String recordingType) {
        super();
        this.id = id;
        this.meetingId = meetingId;
        this.recordingStart = recordingStart;
        this.recordingEnd = recordingEnd;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.playUrl = playUrl;
        this.downloadUrl = downloadUrl;
        this.status = status;
        this.recordingType = recordingType;
    }

    /**
     * Unique Identifier for Recording File. Recording File ID.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Unique Identifier for Recording File. Recording File ID.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RecordingFile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique Identifier of the meeting.
     * 
     */
    @JsonProperty("meeting_id")
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * Unique Identifier of the meeting.
     * 
     */
    @JsonProperty("meeting_id")
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public RecordingFile withMeetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }

    /**
     * The date and time at which recording started.
     * 
     */
    @JsonProperty("recording_start")
    public DateTime getRecordingStart() {
        return recordingStart;
    }

    /**
     * The date and time at which recording started.
     * 
     */
    @JsonProperty("recording_start")
    public void setRecordingStart(DateTime recordingStart) {
        this.recordingStart = recordingStart;
    }

    public RecordingFile withRecordingStart(DateTime recordingStart) {
        this.recordingStart = recordingStart;
        return this;
    }

    /**
     * The date and time at which recording ended.
     * 
     */
    @JsonProperty("recording_end")
    public String getRecordingEnd() {
        return recordingEnd;
    }

    /**
     * The date and time at which recording ended.
     * 
     */
    @JsonProperty("recording_end")
    public void setRecordingEnd(String recordingEnd) {
        this.recordingEnd = recordingEnd;
    }

    public RecordingFile withRecordingEnd(String recordingEnd) {
        this.recordingEnd = recordingEnd;
        return this;
    }

    /**
     * The type of file.
     * 
     */
    @JsonProperty("file_type")
    public String getFileType() {
        return fileType;
    }

    /**
     * The type of file.
     * 
     */
    @JsonProperty("file_type")
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public RecordingFile withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * The size of the recording file in bytes.
     * 
     */
    @JsonProperty("file_size")
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * The size of the recording file in bytes.
     * 
     */
    @JsonProperty("file_size")
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public RecordingFile withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * The URL of the file using which it can be opened and played.
     * 
     */
    @JsonProperty("play_url")
    public String getPlayUrl() {
        return playUrl;
    }

    /**
     * The URL of the file using which it can be opened and played.
     * 
     */
    @JsonProperty("play_url")
    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public RecordingFile withPlayUrl(String playUrl) {
        this.playUrl = playUrl;
        return this;
    }

    /**
     * The URL using which the file can be downloaded.
     * 
     */
    @JsonProperty("download_url")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * The URL using which the file can be downloaded.
     * 
     */
    @JsonProperty("download_url")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public RecordingFile withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Status of the recording. <br>`completed`: Recording has been completed.
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status of the recording. <br>`completed`: Recording has been completed.
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public RecordingFile withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The type of the recording.
     * 
     */
    @JsonProperty("recording_type")
    public String getRecordingType() {
        return recordingType;
    }

    /**
     * The type of the recording.
     * 
     */
    @JsonProperty("recording_type")
    public void setRecordingType(String recordingType) {
        this.recordingType = recordingType;
    }

    public RecordingFile withRecordingType(String recordingType) {
        this.recordingType = recordingType;
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

    public RecordingFile withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecordingFile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("meetingId");
        sb.append('=');
        sb.append(((this.meetingId == null)?"<null>":this.meetingId));
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
        sb.append("recordingType");
        sb.append('=');
        sb.append(((this.recordingType == null)?"<null>":this.recordingType));
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
        result = ((result* 31)+((this.recordingEnd == null)? 0 :this.recordingEnd.hashCode()));
        result = ((result* 31)+((this.recordingStart == null)? 0 :this.recordingStart.hashCode()));
        result = ((result* 31)+((this.fileSize == null)? 0 :this.fileSize.hashCode()));
        result = ((result* 31)+((this.recordingType == null)? 0 :this.recordingType.hashCode()));
        result = ((result* 31)+((this.downloadUrl == null)? 0 :this.downloadUrl.hashCode()));
        result = ((result* 31)+((this.meetingId == null)? 0 :this.meetingId.hashCode()));
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
        if ((other instanceof RecordingFile) == false) {
            return false;
        }
        RecordingFile rhs = ((RecordingFile) other);
        return ((((((((((((this.recordingEnd == rhs.recordingEnd)||((this.recordingEnd!= null)&&this.recordingEnd.equals(rhs.recordingEnd)))&&((this.recordingStart == rhs.recordingStart)||((this.recordingStart!= null)&&this.recordingStart.equals(rhs.recordingStart))))&&((this.fileSize == rhs.fileSize)||((this.fileSize!= null)&&this.fileSize.equals(rhs.fileSize))))&&((this.recordingType == rhs.recordingType)||((this.recordingType!= null)&&this.recordingType.equals(rhs.recordingType))))&&((this.downloadUrl == rhs.downloadUrl)||((this.downloadUrl!= null)&&this.downloadUrl.equals(rhs.downloadUrl))))&&((this.meetingId == rhs.meetingId)||((this.meetingId!= null)&&this.meetingId.equals(rhs.meetingId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fileType == rhs.fileType)||((this.fileType!= null)&&this.fileType.equals(rhs.fileType))))&&((this.playUrl == rhs.playUrl)||((this.playUrl!= null)&&this.playUrl.equals(rhs.playUrl))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}

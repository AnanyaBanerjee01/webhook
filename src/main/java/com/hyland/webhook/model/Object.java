
package com.hyland.webhook.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "uuid",
    "host_id",
    "topic",
    "type",
    "start_time",
    "timezone",
    "duration",
    "share_url",
    "total_size",
    "recording_count",
    "recording_files",
    "host_email",
    "participant_audio_files"
})
@Generated("jsonschema2pojo")
public class Object implements Serializable
{

    /**
     * Unique Identifier of the Meeting/ Webinar that was being recorded.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique Identifier of the Meeting/ Webinar that was being recorded.")
    private Long id;
    /**
     * Universally unique identifier of the Meeting/Webinar instance that was recorded.
     * 
     */
    @JsonProperty("uuid")
    @JsonPropertyDescription("Universally unique identifier of the Meeting/Webinar instance that was recorded.")
    private String uuid;
    /**
     * ID of the user who is set as the host of the meeting.
     * 
     */
    @JsonProperty("host_id")
    @JsonPropertyDescription("ID of the user who is set as the host of the meeting.")
    private String hostId;
    /**
     * Meeting topic.
     * 
     */
    @JsonProperty("topic")
    @JsonPropertyDescription("Meeting topic.")
    private String topic;
    /**
     * Meeting or Webinar Types.
     * 
     * If the recording is of a meeting, the type can be one of the following Meeting types:<br>`1` - Instant meeting.<br>`2` - Scheduled meeting.<br>`3` - Recurring meeting with no fixed time.<br>
     * `4` - Meeting created using Personal Meeting ID.<br>
     * `7` - Personal Audio Conference ([PAC](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference)).<br>
     * `8` - Recurring meeting with fixed time.
     * 
     * If the recording is of a Webinar, the type can be one of the following Webinar Types:<br> `5` - Webinar<br> `6` - Recurring Webinar without a fixed time<br> `9` - Recurring Webinar with a fixed time. 
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Meeting or Webinar Types.\n\nIf the recording is of a meeting, the type can be one of the following Meeting types:<br>`1` - Instant meeting.<br>`2` - Scheduled meeting.<br>`3` - Recurring meeting with no fixed time.<br>\n`4` - Meeting created using Personal Meeting ID.<br>\n`7` - Personal Audio Conference ([PAC](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference)).<br>\n`8` - Recurring meeting with fixed time.\n\nIf the recording is of a Webinar, the type can be one of the following Webinar Types:<br> `5` - Webinar<br> `6` - Recurring Webinar without a fixed time<br> `9` - Recurring Webinar with a fixed time. ")
    private Object.Type type;
    /**
     * Meeting start time.
     * 
     */
    @JsonProperty("start_time")
    @JsonPropertyDescription("Meeting start time.")
    private DateTime startTime;
    /**
     * Timezone to format the meeting start time.
     * 
     */
    @JsonProperty("timezone")
    @JsonPropertyDescription("Timezone to format the meeting start time.")
    private String timezone;
    /**
     * Duration of the recording.
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("Duration of the recording.")
    private Long duration;
    /**
     * The URL of the recording using which approved users can view the recording.
     * 
     */
    @JsonProperty("share_url")
    @JsonPropertyDescription("The URL of the recording using which approved users can view the recording.")
    private String shareUrl;
    /**
     * The total size of the recording in bytes.
     * 
     */
    @JsonProperty("total_size")
    @JsonPropertyDescription("The total size of the recording in bytes.")
    private Long totalSize;
    /**
     * The number of recording files recovered.
     * 
     */
    @JsonProperty("recording_count")
    @JsonPropertyDescription("The number of recording files recovered.")
    private Long recordingCount;
    /**
     * Array of recording file objects recovered.
     * 
     */
    @JsonProperty("recording_files")
    @JsonPropertyDescription("Array of recording file objects recovered.")
    private List<RecordingFile> recordingFiles = new ArrayList<RecordingFile>();
    /**
     * Email address of the host.
     * 
     */
    @JsonProperty("host_email")
    @JsonPropertyDescription("Email address of the host.")
    private String hostEmail;
    /**
     * An array of recovered participants' recording file objects.
     * 
     */
    @JsonProperty("participant_audio_files")
    @JsonPropertyDescription("An array of recovered participants' recording file objects.")
    private List<ParticipantAudioFile> participantAudioFiles = new ArrayList<ParticipantAudioFile>();
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();
    private final static long serialVersionUID = 6584274001009422726L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Object() {
    }

    /**
     * 
     * @param participantAudioFiles
     * @param timezone
     * @param hostId
     * @param type
     * @param uuid
     * @param recordingCount
     * @param duration
     * @param totalSize
     * @param topic
     * @param hostEmail
     * @param startTime
     * @param shareUrl
     * @param id
     * @param recordingFiles
     */
    public Object(Long id, String uuid, String hostId, String topic, Object.Type type, DateTime startTime, String timezone, Long duration, String shareUrl, Long totalSize, Long recordingCount, List<RecordingFile> recordingFiles, String hostEmail, List<ParticipantAudioFile> participantAudioFiles) {
        super();
        this.id = id;
        this.uuid = uuid;
        this.hostId = hostId;
        this.topic = topic;
        this.type = type;
        this.startTime = startTime;
        this.timezone = timezone;
        this.duration = duration;
        this.shareUrl = shareUrl;
        this.totalSize = totalSize;
        this.recordingCount = recordingCount;
        this.recordingFiles = recordingFiles;
        this.hostEmail = hostEmail;
        this.participantAudioFiles = participantAudioFiles;
    }

    /**
     * Unique Identifier of the Meeting/ Webinar that was being recorded.
     * 
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * Unique Identifier of the Meeting/ Webinar that was being recorded.
     * 
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public Object withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Universally unique identifier of the Meeting/Webinar instance that was recorded.
     * 
     */
    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    /**
     * Universally unique identifier of the Meeting/Webinar instance that was recorded.
     * 
     */
    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Object withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * ID of the user who is set as the host of the meeting.
     * 
     */
    @JsonProperty("host_id")
    public String getHostId() {
        return hostId;
    }

    /**
     * ID of the user who is set as the host of the meeting.
     * 
     */
    @JsonProperty("host_id")
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public Object withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * Meeting topic.
     * 
     */
    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    /**
     * Meeting topic.
     * 
     */
    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Object withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Meeting or Webinar Types.
     * 
     * If the recording is of a meeting, the type can be one of the following Meeting types:<br>`1` - Instant meeting.<br>`2` - Scheduled meeting.<br>`3` - Recurring meeting with no fixed time.<br>
     * `4` - Meeting created using Personal Meeting ID.<br>
     * `7` - Personal Audio Conference ([PAC](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference)).<br>
     * `8` - Recurring meeting with fixed time.
     * 
     * If the recording is of a Webinar, the type can be one of the following Webinar Types:<br> `5` - Webinar<br> `6` - Recurring Webinar without a fixed time<br> `9` - Recurring Webinar with a fixed time. 
     * 
     */
    @JsonProperty("type")
    public Object.Type getType() {
        return type;
    }

    /**
     * Meeting or Webinar Types.
     * 
     * If the recording is of a meeting, the type can be one of the following Meeting types:<br>`1` - Instant meeting.<br>`2` - Scheduled meeting.<br>`3` - Recurring meeting with no fixed time.<br>
     * `4` - Meeting created using Personal Meeting ID.<br>
     * `7` - Personal Audio Conference ([PAC](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference)).<br>
     * `8` - Recurring meeting with fixed time.
     * 
     * If the recording is of a Webinar, the type can be one of the following Webinar Types:<br> `5` - Webinar<br> `6` - Recurring Webinar without a fixed time<br> `9` - Recurring Webinar with a fixed time. 
     * 
     */
    @JsonProperty("type")
    public void setType(Object.Type type) {
        this.type = type;
    }

    public Object withType(Object.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Meeting start time.
     * 
     */
    @JsonProperty("start_time")
    public DateTime getStartTime() {
        return startTime;
    }

    /**
     * Meeting start time.
     * 
     */
    @JsonProperty("start_time")
    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public Object withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Timezone to format the meeting start time.
     * 
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * Timezone to format the meeting start time.
     * 
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Object withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Duration of the recording.
     * 
     */
    @JsonProperty("duration")
    public Long getDuration() {
        return duration;
    }

    /**
     * Duration of the recording.
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Object withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The URL of the recording using which approved users can view the recording.
     * 
     */
    @JsonProperty("share_url")
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * The URL of the recording using which approved users can view the recording.
     * 
     */
    @JsonProperty("share_url")
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Object withShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
        return this;
    }

    /**
     * The total size of the recording in bytes.
     * 
     */
    @JsonProperty("total_size")
    public Long getTotalSize() {
        return totalSize;
    }

    /**
     * The total size of the recording in bytes.
     * 
     */
    @JsonProperty("total_size")
    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public Object withTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * The number of recording files recovered.
     * 
     */
    @JsonProperty("recording_count")
    public Long getRecordingCount() {
        return recordingCount;
    }

    /**
     * The number of recording files recovered.
     * 
     */
    @JsonProperty("recording_count")
    public void setRecordingCount(Long recordingCount) {
        this.recordingCount = recordingCount;
    }

    public Object withRecordingCount(Long recordingCount) {
        this.recordingCount = recordingCount;
        return this;
    }

    /**
     * Array of recording file objects recovered.
     * 
     */
    @JsonProperty("recording_files")
    public List<RecordingFile> getRecordingFiles() {
        return recordingFiles;
    }

    /**
     * Array of recording file objects recovered.
     * 
     */
    @JsonProperty("recording_files")
    public void setRecordingFiles(List<RecordingFile> recordingFiles) {
        this.recordingFiles = recordingFiles;
    }

    public Object withRecordingFiles(List<RecordingFile> recordingFiles) {
        this.recordingFiles = recordingFiles;
        return this;
    }

    /**
     * Email address of the host.
     * 
     */
    @JsonProperty("host_email")
    public String getHostEmail() {
        return hostEmail;
    }

    /**
     * Email address of the host.
     * 
     */
    @JsonProperty("host_email")
    public void setHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
    }

    public Object withHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
        return this;
    }

    /**
     * An array of recovered participants' recording file objects.
     * 
     */
    @JsonProperty("participant_audio_files")
    public List<ParticipantAudioFile> getParticipantAudioFiles() {
        return participantAudioFiles;
    }

    /**
     * An array of recovered participants' recording file objects.
     * 
     */
    @JsonProperty("participant_audio_files")
    public void setParticipantAudioFiles(List<ParticipantAudioFile> participantAudioFiles) {
        this.participantAudioFiles = participantAudioFiles;
    }

    public Object withParticipantAudioFiles(List<ParticipantAudioFile> participantAudioFiles) {
        this.participantAudioFiles = participantAudioFiles;
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

    public Object withAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Object.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("hostId");
        sb.append('=');
        sb.append(((this.hostId == null)?"<null>":this.hostId));
        sb.append(',');
        sb.append("topic");
        sb.append('=');
        sb.append(((this.topic == null)?"<null>":this.topic));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("shareUrl");
        sb.append('=');
        sb.append(((this.shareUrl == null)?"<null>":this.shareUrl));
        sb.append(',');
        sb.append("totalSize");
        sb.append('=');
        sb.append(((this.totalSize == null)?"<null>":this.totalSize));
        sb.append(',');
        sb.append("recordingCount");
        sb.append('=');
        sb.append(((this.recordingCount == null)?"<null>":this.recordingCount));
        sb.append(',');
        sb.append("recordingFiles");
        sb.append('=');
        sb.append(((this.recordingFiles == null)?"<null>":this.recordingFiles));
        sb.append(',');
        sb.append("hostEmail");
        sb.append('=');
        sb.append(((this.hostEmail == null)?"<null>":this.hostEmail));
        sb.append(',');
        sb.append("participantAudioFiles");
        sb.append('=');
        sb.append(((this.participantAudioFiles == null)?"<null>":this.participantAudioFiles));
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
        result = ((result* 31)+((this.participantAudioFiles == null)? 0 :this.participantAudioFiles.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.hostId == null)? 0 :this.hostId.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        result = ((result* 31)+((this.recordingCount == null)? 0 :this.recordingCount.hashCode()));
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.totalSize == null)? 0 :this.totalSize.hashCode()));
        result = ((result* 31)+((this.topic == null)? 0 :this.topic.hashCode()));
        result = ((result* 31)+((this.hostEmail == null)? 0 :this.hostEmail.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.shareUrl == null)? 0 :this.shareUrl.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.recordingFiles == null)? 0 :this.recordingFiles.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Object) == false) {
            return false;
        }
        Object rhs = ((Object) other);
        return ((((((((((((((((this.participantAudioFiles == rhs.participantAudioFiles)||((this.participantAudioFiles!= null)&&this.participantAudioFiles.equals(rhs.participantAudioFiles)))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.hostId == rhs.hostId)||((this.hostId!= null)&&this.hostId.equals(rhs.hostId))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))))&&((this.recordingCount == rhs.recordingCount)||((this.recordingCount!= null)&&this.recordingCount.equals(rhs.recordingCount))))&&((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration))))&&((this.totalSize == rhs.totalSize)||((this.totalSize!= null)&&this.totalSize.equals(rhs.totalSize))))&&((this.topic == rhs.topic)||((this.topic!= null)&&this.topic.equals(rhs.topic))))&&((this.hostEmail == rhs.hostEmail)||((this.hostEmail!= null)&&this.hostEmail.equals(rhs.hostEmail))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.shareUrl == rhs.shareUrl)||((this.shareUrl!= null)&&this.shareUrl.equals(rhs.shareUrl))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.recordingFiles == rhs.recordingFiles)||((this.recordingFiles!= null)&&this.recordingFiles.equals(rhs.recordingFiles))));
    }


    /**
     * Meeting or Webinar Types.
     * 
     * If the recording is of a meeting, the type can be one of the following Meeting types:<br>`1` - Instant meeting.<br>`2` - Scheduled meeting.<br>`3` - Recurring meeting with no fixed time.<br>
     * `4` - Meeting created using Personal Meeting ID.<br>
     * `7` - Personal Audio Conference ([PAC](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference)).<br>
     * `8` - Recurring meeting with fixed time.
     * 
     * If the recording is of a Webinar, the type can be one of the following Webinar Types:<br> `5` - Webinar<br> `6` - Recurring Webinar without a fixed time<br> `9` - Recurring Webinar with a fixed time. 
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        _1(1L),
        _2(2L),
        _3(3L),
        _4(4L),
        _5(5L),
        _6(6L),
        _7(7L),
        _8(8L),
        _9(9L);
        private final Long value;
        private final static Map<Long, Object.Type> CONSTANTS = new HashMap<Long, Object.Type>();

        static {
            for (Object.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long value() {
            return this.value;
        }

        @JsonCreator
        public static Object.Type fromValue(Long value) {
            Object.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}

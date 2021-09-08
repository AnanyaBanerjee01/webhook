package com.hyland.webhook.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyland.webhook.DTO.gen.RecordingCompletedSchema;
import com.hyland.webhook.constants.WebHookConstants;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/webhook")
@Log4j2
public class WebhookController {


    @RequestMapping("/fetch")
    public String getNotification() {
        log.info("#### Hello Webhooks ##### ");
        return "Hello Webhooks!!!";
    }

    @PostMapping("/get")
    public ResponseEntity<String> onRecordingEventConsumption(@RequestBody String requestBody, @RequestHeader(value = WebHookConstants.HOST) String host, @RequestHeader(value = WebHookConstants.USER_AGENT) String userAgent) {
        log.debug("#### Incoming Webhook Notification from Zoom API ##### {}", requestBody);
        log.debug("#### Request Header Information #####  Host :: User Agent :: {}   {} ", host, userAgent);

        try {
            //Convert JSON object to Java POJO
            ObjectMapper mapper = new ObjectMapper();
            RecordingCompletedSchema recordingObject = mapper.readValue(requestBody, RecordingCompletedSchema.class);
            log.debug("Converted Json Payload to Object");

            // Validate if the event notification is for Recording Completed event subscribed
            if (recordingObject.getEvent().equals(WebHookConstants.RECORDING_COMPLETED)) {
                log.debug("Recording Completed Event Payload {} ::", recordingObject);
            }

        } catch (Exception e) {
            log.error("Exception occured while parsing the notification event {}", e);
        }

        return new ResponseEntity<>(requestBody, HttpStatus.OK);
    }


}


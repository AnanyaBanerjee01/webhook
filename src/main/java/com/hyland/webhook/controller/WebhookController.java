package com.hyland.webhook.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyland.webhook.DTO.gen.RecordingCompletedSchema;
import com.hyland.webhook.constants.WebHookConstants;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/webhook")
@Log4j2
public class WebhookController {

    @Value("${zoom.verification.token}")
    private String verificationToken;

    @RequestMapping("/get")
    public String getNotification() {
        log.info("#### Hello Webhooks ##### ");
        return "Hello Webhooks!!!";
    }


    @PostMapping
    public ResponseEntity<String> onRecordingCompleted(@RequestBody String requestBody, @RequestHeader(value = WebHookConstants.HOST) String host, @RequestHeader(value = WebHookConstants.USER_AGENT) String userAgent, @RequestHeader(value = WebHookConstants.AUTHORIZATION) String authToken) {
        log.info("#### Incoming Webhook Notification from Zoom API ##### {}", requestBody);
        ObjectMapper mapper = new ObjectMapper();
        log.debug("#### Request Header Information #####  Host :: User Agent :: {}   {} ", host, userAgent);

        try {
            //Convert JSON object to Java POJO
            RecordingCompletedSchema recordingObject = mapper.readValue(requestBody, RecordingCompletedSchema.class);
            log.debug("Converted Json Payload to Object");

            // verify if the event notification originated from Zoom
            if (null != authToken && !authToken.equals(verificationToken)) {
                log.debug("Invalid Verification Token");
                return new ResponseEntity<>(requestBody, HttpStatus.FORBIDDEN);
            }
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


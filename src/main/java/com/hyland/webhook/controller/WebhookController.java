package com.hyland.webhook.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hyland.webhook.DTO.gen.Object;


    @RestController
    @RequestMapping("/api/webhook")
    @Log4j2
    public class WebhookController {

        @RequestMapping ("/get")
        public String getNotification() {
            log.info("#### Hello Webhooks ##### ");
            return "Hello Webhooks!!!";
        }
        @PostMapping
        public ResponseEntity<String> consumeNotification(@RequestBody String requestBody) {
            log.info("#### Incoming Webhook Notification from Zoom API ##### {}" , requestBody);
            ObjectMapper mapper = new ObjectMapper();
           try{
               //Convert JSON object to Java POJO
               Object recordingObject = mapper.readValue(requestBody, Object.class);
               log.info("Recording Completed Event Payload {} ::", recordingObject);
           }
           catch(Exception e){
                log.error("Exception occured while parsing the notification event {}",e);
            }

            return new ResponseEntity<>(requestBody, HttpStatus.OK);
        }

        /**
         * Generate JWT token for Zoom using api credentials
         *
         * @return JWT Token String
         */
/*        private String generateZoomJWTTOken() {
            String id = UUID.randomUUID().toString().replace("-", "");
            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

            Date creation = new Date(System.currentTimeMillis());
            Date tokenExpiry = new Date(System.currentTimeMillis() + (1000 * 60));

            Key key = Keys
                    .hmacShaKeyFor(zoomApiSecret.getBytes());
            return Jwts.builder()
                    .setId(id)
                    .setIssuer(zoomApiKey)
                    .setIssuedAt(creation)
                    .setSubject("")
                    .setExpiration(tokenExpiry)
                    .signWith(key, signatureAlgorithm)
                    .compact();
        }*/


    }


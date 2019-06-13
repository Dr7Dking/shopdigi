package com.prospero.shopdigi.web.rest;

import com.prospero.shopdigi.service.ShopdigiKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/shopdigi-kafka")
public class ShopdigiKafkaResource {

    private final Logger log = LoggerFactory.getLogger(ShopdigiKafkaResource.class);

    private ShopdigiKafkaProducer kafkaProducer;

    public ShopdigiKafkaResource(ShopdigiKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}

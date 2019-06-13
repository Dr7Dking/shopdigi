package com.prospero.shopdigi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ShopdigiKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(ShopdigiKafkaConsumer.class);
    private static final String TOPIC = "topic_shopdigi";

    @KafkaListener(topics = "topic_shopdigi", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}

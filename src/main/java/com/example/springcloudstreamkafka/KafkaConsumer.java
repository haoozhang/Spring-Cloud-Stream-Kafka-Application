package com.example.springcloudstreamkafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @Bean
    public Consumer<Message<String>> consume() {
        return message -> LOGGER.info("Received message: '{}'", message.getPayload());
    }
}

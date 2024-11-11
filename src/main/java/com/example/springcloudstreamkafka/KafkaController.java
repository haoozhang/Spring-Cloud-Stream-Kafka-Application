package com.example.springcloudstreamkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Sinks;

@RestController
public class KafkaController {

    @Autowired
    private Sinks.Many<Message<String>> many;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        many.emitNext(new GenericMessage<>(message), Sinks.EmitFailureHandler.FAIL_FAST);
        return message;
    }
}
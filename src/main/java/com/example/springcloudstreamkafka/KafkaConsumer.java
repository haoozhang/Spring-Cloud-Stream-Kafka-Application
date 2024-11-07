package com.example.springcloudstreamkafka;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Sink.class)  // Binding to the 'input' channel
public class KafkaConsumer {

    @StreamListener(Sink.INPUT)  // Listen on the 'input' channel (Kafka topic)
    public void consumeMessage(Message<String> message) {
        System.out.println("Consumed message: " + message.getPayload());
    }
}


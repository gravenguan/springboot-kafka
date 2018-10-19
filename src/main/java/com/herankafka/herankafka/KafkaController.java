package com.herankafka.herankafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    KafkaProducerConfig kafkaProducerConfig;

    @GetMapping(value="/kafka")
    public String producer(@RequestParam("message") String message){
        kafkaProducerConfig.send(message);
        return "Message sent to Kafka successfully";
    }
}

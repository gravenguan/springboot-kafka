package com.herankafka.herankafka;


import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class KafkaProducerConfig {
    @Autowired
    KafkaTemplate kafkaTemplate;

    public void send(String message){
        kafkaTemplate.send("herantopic",message);
        kafkaTemplate.send("herantopic",message);
    }
}

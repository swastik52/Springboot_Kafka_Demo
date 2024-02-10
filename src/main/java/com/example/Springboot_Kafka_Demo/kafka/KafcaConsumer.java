package com.example.Springboot_Kafka_Demo.kafka;

import com.example.Springboot_Kafka_Demo.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;

@Service
public class KafcaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafcaConsumer.class);
//    @KafkaListener(topics = "swastik",groupId = "myGroup")
//    public void consume(String message){
//        LOGGER.info(String.format("Message Received -> %s", message));
//    }

    @KafkaListener(topics = "swastik",groupId = "myGroup")
    public void consume(Message message){
        LOGGER.info("Received Messasge in group fooddd: "+message);
    }
}

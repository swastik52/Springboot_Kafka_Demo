package com.example.Springboot_Kafka_Demo.kafka;

import com.example.Springboot_Kafka_Demo.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);
    private KafkaTemplate<String,Message> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, Message > kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

//    public void sendMessage(String message){
//        LOGGER.info(String.format("Message Sent %s",message));
//        kafkaTemplate.send("swastik",message);
//    }

    public void send(Message message) {
        LOGGER.info("Message Sent ......");
        kafkaTemplate.send("swastik",message);
    }
}

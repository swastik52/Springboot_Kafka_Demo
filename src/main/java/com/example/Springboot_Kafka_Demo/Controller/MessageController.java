package com.example.Springboot_Kafka_Demo.Controller;


import com.example.Springboot_Kafka_Demo.kafka.JsonKafkaProducer;
import com.example.Springboot_Kafka_Demo.kafka.KafkaProducer;
import com.example.Springboot_Kafka_Demo.model.Message;
import com.example.Springboot_Kafka_Demo.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/kafka")
@AllArgsConstructor
public class MessageController {

    private KafkaProducer kafkaProducer;
    private JsonKafkaProducer jsonKafkaProducer;


//    @GetMapping("/publish")
//    public ResponseEntity<String> publish(@RequestParam("message") String message){
//        kafkaProducer.sendMessage(message);
//        return ResponseEntity.ok("Message sent to topic");
//    }
    @GetMapping("/sendMessage")
    public ResponseEntity<String> sendMessage(){
        List<Message> mList = new ArrayList<>();
        mList.add(new Message("Hi","Swastik",null));
        mList.add(new Message("Bye","Prasad",null));
        Message message = new Message("First","try",mList);
        kafkaProducer.send(message);
        return ResponseEntity.ok("Message sent to topic");
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
}

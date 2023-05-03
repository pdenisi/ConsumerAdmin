package com.example.io.consumeradmin.kafkaConsumer;

import com.example.io.consumeradmin.dto.RegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


    @KafkaListener(topics = "${neoregister.kafka.topic}")
    @KafkaHandler
    public void receiveNewRegistration(@Payload RegistrationEntity data, @Headers MessageHeaders headers){
        System.out.println(data);
    }
}

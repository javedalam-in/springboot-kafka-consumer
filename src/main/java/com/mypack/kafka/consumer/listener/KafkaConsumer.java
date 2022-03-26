package com.mypack.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.mypack.kafka.consumer.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "KafkaTopicExample", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed Message: " + message);
	}
	
	@KafkaListener(topics = "KafkaTopicExampleJson", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}

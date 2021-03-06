package com.w77996.springboot.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message2")
public class TopicReceiver2 {

    @RabbitHandler
    public void process(String message) {
        System.out.println("Topic Receiver2 : " + message);
    }
}

package com.jms.kafka;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {

    @JmsListener(destination = "MY_QUEUE")
    public void receiveQueueMessage(Object message){
        System.out.println("Queue Received:"+ message);
    }

    @JmsListener(destination = "MY_TOPIC", containerFactory = "jmsListenerContainerFactory")
    public void reciveTopicMessage(Object message){
        System.out.println("Topic Received:"+message);
    }
}

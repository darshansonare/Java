package com.jms.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import jakarta.jms.Queue;
import jakarta.jms.Topic;
@Service
public class JmsProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue myQueue;

    @Autowired
    private Topic myTopic;

    // Send TextMessage
    public void sendTextMessage(String msg) {
        jmsTemplate.convertAndSend(myQueue, msg);
    }

    // Send ObjectMessage
    public void sendObjectMessage(Person person) {
        jmsTemplate.convertAndSend(myQueue, person);
    }

    // Send Topic Message
    public void sendTopicMessage(String msg) {
        jmsTemplate.convertAndSend(myTopic, msg);
    }
}

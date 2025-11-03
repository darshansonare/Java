package com.jms.kafka;

import jakarta.jms.Queue;
import jakarta.jms.Topic;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DestinationConfig {

    @Bean
    public Queue myQueue() {
        return new ActiveMQQueue("MY_QUEUE");
    }

    @Bean
    public Topic myTopic() {
        return new ActiveMQTopic("MY_TOPIC");
    }
}

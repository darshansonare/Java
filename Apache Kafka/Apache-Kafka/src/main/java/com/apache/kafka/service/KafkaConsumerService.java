package com.apache.kafka.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test-topic", groupId = "demo-group")
    public void consume(ConsumerRecord<String, String> record, Acknowledgment ack) {
        System.out.println("📩 Received message: " + record.value());
        System.out.println("Partition: " + record.partition() + " Offset: " + record.offset());

        // Manual acknowledgment (commit)
        ack.acknowledge();
    }
}

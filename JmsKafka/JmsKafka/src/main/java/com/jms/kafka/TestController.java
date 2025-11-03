package com.jms.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private JmsProducer producer;

    @GetMapping("/sendText")
    public String sendText() {
        producer.sendTextMessage("Hello Queue!");
        return "Text message sent";
    }

    @GetMapping("/sendObject")
    public String sendObject() {
        producer.sendObjectMessage(new Person("Darshan", 22));
        return "Object message sent";
    }

    @GetMapping("/sendTopic")
    public String sendTopic() {
        producer.sendTopicMessage("Hello Topic Subscribers!");
        return "Topic message sent";
    }
}

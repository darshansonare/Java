package com.apache.kafka.controller;


import com.apache.kafka.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MessageController {

    private final KafkaProducerService producerService;

    public MessageController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable String message) {
        producerService.sendMessage(message);
        return "✅ Message sent: " + message;
    }
}

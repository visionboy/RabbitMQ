package com.rbmq.example.hi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    private static final Logger log = LoggerFactory.getLogger(Producer.class);

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 2000, initialDelay = 1000)
    public void sendMessage(){
        rabbitTemplate.convertAndSend("hihi", "hello world2");
    }
}

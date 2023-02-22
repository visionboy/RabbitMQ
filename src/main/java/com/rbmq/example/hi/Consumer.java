package com.rbmq.example.hi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    @RabbitListener(queues = "hihi")
    public void consume(Message message){
        log.info("consumer consumes message: {}",message);
    }
}

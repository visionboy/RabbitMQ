package com.rbmq.example.hi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class MultipleConsumer {
    private static final Logger log = LoggerFactory.getLogger(MultipleConsumer.class);

    @RabbitListener(queues = "hihi", concurrency = "3")
    public void listen(String message){

        log.info("consume message {} on {} ", message, Thread.currentThread().getName());

        try {
            Thread.sleep(ThreadLocalRandom.current().nextLong(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

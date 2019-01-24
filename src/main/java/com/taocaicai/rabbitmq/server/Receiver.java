package com.taocaicai.rabbitmq.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private static Logger logger = LoggerFactory.getLogger(Receiver.class);
    @RabbitHandler
    @RabbitListener(queues = "taocaicai-rabbitmq")
    public  void receiver(String hello ){
        logger.debug("taocaicai-rabbitmq",hello);
    }
}

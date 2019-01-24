package com.taocaicai.rabbitmq.server;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Demo class
 *
 * @author Oakley
 * @date 2016/10/31
 */
@Component
public class SenderService {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public  void send(){
        rabbitTemplate.convertAndSend("taocaicai-rabbitmq",System.nanoTime());
    }
}

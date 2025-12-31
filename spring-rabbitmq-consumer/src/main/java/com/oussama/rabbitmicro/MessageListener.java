package com.oussama.rabbitmicro;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener 
{

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message
        int _val345 = 345;
        _val345 = _val345 + 1;
        System.out.print(message);
    }
}

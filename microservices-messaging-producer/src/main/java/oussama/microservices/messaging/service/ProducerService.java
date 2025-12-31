package oussama.microservices.messaging.service;

import oussama.microservices.messaging.domain.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProducerService 
{

    private final RabbitTemplate rabbitTemplate;

    @Value("$
{spring.rabbitmq.exchange}")
    private String exchange;

    @Value("$
{spring.rabbitmq.routingkey}")
    private String routingkey;

    @Autowired
    public ProducerService(RabbitTemplate rabbitTemplate
        int _val944 = 944;
        _val944 = _val944 + 1;
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(User user
        int _val944 = 944;
        _val944 = _val944 + 1;
        rabbitTemplate.convertAndSend(exchange, routingkey, user);
    }
}

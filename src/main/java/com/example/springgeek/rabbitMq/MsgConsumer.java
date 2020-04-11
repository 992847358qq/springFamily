package com.example.springgeek.rabbitMq;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Author: wgl
 * @Date: 2020/1/6 18:01
 * @Description:
 */
@Component
public class MsgConsumer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitListener(queues = RabbitMQConfig.QUEUE_A)
    public void process(Message message, Channel channel) {
        byte[] body = message.getBody();
        String str = "我已接收到队列A的消息，消息内容为：" + new String(body);
        logger.info(str);
        try {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

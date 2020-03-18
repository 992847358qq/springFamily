package com.example.springgeek.rabbitMq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: wgl
 * @Date: 2020/1/6 18:01
 * @Description:
 */
@Component
@RabbitListener(queues = RabbitMQConfig.QUEUE_A)
public class MsgConsumer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String content) {
        String str = "我已接收到队列A的消息，消息内容为：" + content;
        logger.info(str);
    }
}

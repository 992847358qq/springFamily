package com.example.springgeek.rabbitMq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wgl
 * @Date: 2020/1/6 18:03
 * @Description:
 */
@RestController
@RequestMapping("/rabbitmq")
public class SendMsgController {

    @Autowired
    private MsgProducer producer;

    @RequestMapping("/test")
    public void sendMsg() {
        String content = "test";
        for (int i = 0; i < 10; i++) {
            producer.sendMsg(RabbitMQConfig.EXCHANGE_A, RabbitMQConfig.ROUTINGKEY_A, content + i);
        }
    }
}

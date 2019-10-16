package com.cdc.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by asus on 2019/7/28.
 */
@Component
public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    /**
     * 接收到消息的方法，message就是指从主题获取的消息，主题配置在RedisMessageListener配置类做配置
     * @param message
     */
    public void receiveMessage(String message) {
       // TestService testService=new TestService();
        //testService.getData();
        LOGGER.info("Received <" + message + ">");

    }
}

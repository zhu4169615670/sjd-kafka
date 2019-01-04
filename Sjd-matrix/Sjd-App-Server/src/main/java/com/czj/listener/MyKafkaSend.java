package com.czj.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;

/**
 * @author zpf
 * @Title: MyKafkaSend
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/17 17:29
 */
@Component
public class MyKafkaSend implements Serializable {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMess(String topic, Object data) throws Exception{
        kafkaTemplate.send(topic,data);
    }
}

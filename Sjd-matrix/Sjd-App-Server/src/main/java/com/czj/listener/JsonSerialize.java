package com.czj.listener;

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.common.serialization.Serializer;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * @author zpf
 * @Title: JsonSerialize
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/17 10:12
 */
public class JsonSerialize implements Serializer<JSONObject> {
    @Override
    public void configure(Map<String, ?> map, boolean b) {

    }

    @Override
    public byte[] serialize(String topic, JSONObject data) {
        try {
            return data.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void close() {

    }
}

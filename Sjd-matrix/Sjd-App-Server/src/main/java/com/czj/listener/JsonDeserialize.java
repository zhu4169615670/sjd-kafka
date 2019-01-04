package com.czj.listener;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * @author zpf
 * @Title: JsonDeserialize
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/17 10:13
 */
public class JsonDeserialize implements Deserializer<JSONObject> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public JSONObject deserialize(String topic, byte[] data) {
        JSONObject obj = null;
        try {
            obj = new JSONObject(Boolean.parseBoolean(new String(data,"UTF-8")));
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void close() {
    }
}

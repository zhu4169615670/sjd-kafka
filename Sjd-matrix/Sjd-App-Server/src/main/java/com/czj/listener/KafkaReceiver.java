package com.czj.listener;

import java.util.Map;
import java.util.Optional;

import com.alibaba.fastjson.JSONObject;
import com.czj.mapper.MissionUserDepositMapper;
import com.czj.model.MissionUser;
import com.czj.model.MissionUserAccount;
import com.czj.model.MissionUserDeposit;
import com.czj.service.MissionUserDepositService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Component
public class KafkaReceiver {

    private Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

    private static final String KAFKA_PREFEX = "{}";

    @Autowired
    private MissionUserDepositService missionUserDepositService;

    @Autowired
    private MissionUserDepositMapper missionUserDepositMapper;


    @KafkaListener(topics = {KafkaConfig.TOPICS_USER_DEPOSIT})
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            String message = kafkaMessage.get().toString();
            logger.error("信息为：" + message);
            if (!StringUtils.isEmpty(message) && !message.contains(KAFKA_PREFEX)) {
                Map map = JSONObject.parseObject(message, Map.class);
                MissionUserDeposit owmUserDeposit = JSONObject.parseObject(JSONObject.toJSONString(map.get("ownUserDeposit")), MissionUserDeposit.class);
                MissionUserAccount owmUserAccount = JSONObject.parseObject(JSONObject.toJSONString(map.get("ownUserAccount")), MissionUserAccount.class);
                MissionUserDeposit shifuUserDeposit = JSONObject.parseObject(JSONObject.toJSONString(map.get("shifuUserDeposit")), MissionUserDeposit.class);
                MissionUserAccount shifuUserAccount = JSONObject.parseObject(JSONObject.toJSONString(map.get("shifuUserAccount")), MissionUserAccount.class);
                MissionUser user = JSONObject.parseObject(JSONObject.toJSONString(map.get("user")), MissionUser.class);
                MissionUserDeposit userDepositHistory = new MissionUserDeposit();
             /*   if(!ObjectUtils.isEmpty(owmUserDeposit))
                {
                    userDepositHistory = missionUserDepositMapper.findByUserIdAndTaskIdAndDepositType(owmUserDeposit.getUserId(), owmUserDeposit.getTaskId(), owmUserDeposit.getDepositType());
                }
                if(!ObjectUtils.isEmpty(shifuUserDeposit))
                {
                    userDepositHistory = missionUserDepositMapper.findByUserIdAndTaskIdAndDepositType(shifuUserDeposit.getUserId(), shifuUserDeposit.getTaskId(), shifuUserDeposit.getDepositType());
                }*/
                missionUserDepositService.updateMissionUserDepoAndUserAccountAndUser(owmUserDeposit,owmUserAccount,user,shifuUserDeposit,shifuUserAccount);
                /*if (!ObjectUtils.isEmpty(userDepositHistory)) {

                }*/
            }
        }
    }

    @KafkaListener(topics = {KafkaConfig.TOPICS_SEND_MESSAGE})
    public void userListen(ConsumerRecord<?, ?> record) {
        System.out.println("kafka消费端：" + record.value().toString());
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            String message = kafkaMessage.get().toString();
            logger.error("信息为：" + message);

        }
    }


    public static void main(String[] args) {
        String json = "{\"country\":\"\",\"createIp\":\"\",\"city\":\"\",\"signature\":\"\",\"devNo\":\"e09ede063ca172e\",\"cardNo\":\"\",\"province\":\"\",\"enable\":1,\"nickname\":\"金主:7020\",\"parentExtensionId\":22,\"ext3\":\"official\",\"cardPositive\":\"\",\"ext2\":\"864416034669054\",\"ext\":\"0\",\"hId\":0,\"cardOther\":\"\",\"sex\":0,\"avatar\":\"https://czjin.oss-cn-beijing.aliyuncs.com/1.png\",\"masterReward\":0.2,\"userId\":1129,\"token\":\"d1f925605f348bf6e4231310e4fe90\",\"isTrue\":0,\"createTime\":{\"date\":13,\"hours\":18,\"seconds\":30,\"month\":11,\"timezoneOffset\":-480,\"year\":118,\"minutes\":33,\"time\":1544697210000,\"day\":4},\"phone\":\"18605167020\",\"name\":\"\",\"nativePlace\":\"\",\"userPid\":1130}";
        MissionUser user = JSONObject.parseObject(json, MissionUser.class);
        System.out.println(user);
//        String json = "{\"ext\":\"\",\"accountId\":1126,\"balance\":2,\"credit\":0,\"goldBalance\":0,\"userId\":1130,\"version\":2,\"point\":0,\"ext1\":\"\"}";
//        MissionUserAccount missionUserAccount = JSONObject.parseObject(json, MissionUserAccount.class);
//        System.out.println(missionUserAccount);
    }
}

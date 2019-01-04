package com.czj.controller;

import com.alibaba.fastjson.JSONObject;
import com.czj.common.Result;
import com.czj.listener.KafkaConfig;
import com.czj.mapper.MissionSysConfigMapper;
import com.czj.mapper.MissionUserDepositMapper;
import com.czj.model.MissionSysConfig;
import com.czj.model.MissionUserDeposit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * @author zpf
 * @Title: AppTestController
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/10 18:11
 */
@CrossOrigin
@RestController
@RequestMapping("/kafka")
@Slf4j
public class AppTestController {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    private MissionUserDepositMapper missionUserDepositMapper;

    @Autowired
    private MissionSysConfigMapper missionSysConfigMapper;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    @ResponseBody
    public Result sendKafka(String messages) {
    /*    System.out.println(messages);
        User user = JSONObject.parseObject(messages, User.class);
        User user1 = userMapper.findByUserIdAndTaskId(user.getUserId(),user.getTaskId());
        System.out.println(user1);
        long begin = System.currentTimeMillis();
      *//*  for (int i = 1; i <=10000; i++) {
            kafkaTemplate.send("test",""+i+"");
        }*/
//       kafkaTemplate.send("test","1211221");
        /*long end = System.currentTimeMillis();
        System.out.println("用时间："+((end-begin)/1000)+"秒");*/
        MissionUserDeposit missionUserDeposit = new MissionUserDeposit();
        missionUserDeposit.setUserId(111);
        missionUserDeposit.setApprenticeUserId(null);
        missionUserDeposit.setPrizeType(null);
        missionUserDepositMapper.save(missionUserDeposit);
        return Result.Ok();
    }



    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Result test(String messages) {
        MissionSysConfig sysConfig = new MissionSysConfig();
        sysConfig.setRemark("test");
        sysConfig.setSysKey("test");
        sysConfig.setSysValue("test");
        missionSysConfigMapper.save(sysConfig);
          kafkaTemplate.send(KafkaConfig.TOPICS_SEND_MESSAGE,"11111");
        /*long end = System.currentTimeMillis();
        System.out.println("用时间："+((end-begin)/1000)+"秒");*/
        return Result.Ok(messages);
    }

    @RequestMapping(value = "/addDeposit", method = RequestMethod.POST)
    @ResponseBody
    public Result addDeposit(@RequestBody Map<String,Object> map) {
       try{
           kafkaTemplate.send(KafkaConfig.TOPICS_USER_DEPOSIT, JSONObject.toJSONString(map));
       }catch (Exception e){
           e.printStackTrace();
           return Result.Error(e.getMessage());
       }
        return Result.Ok();
    }

}

package com.czj.controller;

import com.czj.common.Result;
import com.czj.mapper.OrderTestMapper;
import com.czj.model.OrderTest;
import com.czj.util.OrderIdUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zpf
 * @Title: AppOrderTestController
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/25 17:06
 */
@CrossOrigin
@RestController
@RequestMapping("/order")
@Slf4j
public class AppOrderTestController {

    @Autowired
    private OrderTestMapper orderTestMapper;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @ResponseBody
    public Result create() {
        OrderIdUtils orderId= OrderIdUtils.getInstance();
        OrderTest orderTest = new OrderTest();
      orderTest.setOrdNum(orderId.nextId().replace(".",""));
        orderTestMapper.save(orderTest);
        return Result.Ok();
    }

}

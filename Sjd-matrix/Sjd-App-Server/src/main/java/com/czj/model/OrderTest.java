package com.czj.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author zpf
 * @Title: OrderTest
 * @ProjectName Sjd-matrix
 * @Description: 订单测试类
 * @date 2018/12/25 16:59
 */
@Data
@Entity
@Table(name = "order_test")
public class OrderTest implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ordNum;
}

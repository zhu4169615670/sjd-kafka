package com.czj.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zpf
 * @Title: MissionUserDeposit
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/17 9:46
 */
@Data
@Entity
@Table(name = "mission_user_deposit")
public class MissionUserDeposit implements Serializable {

    /**
     * 提现编号
     *
     * @mbg.generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer depositId;

    /**
     * 提现帐号
     *
     * @mbg.generated
     */
    private Integer accountId;

    /**
     * 帐号编号
     *
     * @mbg.generated
     */
    private Integer bindId;

    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 类型(1余额2积分3信用积分 4红包)
     *
     * @mbg.generated
     */
    private Integer depositType;

    /**
     * 是否增加(1增加2减少)
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * 对应任务编号
     *
     * @mbg.generated
     */
    private Integer taskId;

    /**
     * 子任务编号
     *
     * @mbg.generated
     */
    private Integer detailId;

    /**
     * 金额(或积分)
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * 余额
     *
     * @mbg.generated
     */
    private BigDecimal balance;

    /**
     * 徒弟的用户id
     */
    private Integer apprenticeUserId;


    /**
     * 徒弟的用户头像
     */
    private Integer prizeType;
}

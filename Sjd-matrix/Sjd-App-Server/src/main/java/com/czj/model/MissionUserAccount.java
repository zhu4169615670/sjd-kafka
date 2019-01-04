package com.czj.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "mission_user_account")
public class MissionUserAccount implements Serializable {
    /**
     * 账户编号
     *
     * @mbg.generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * 余额
     *
     * @mbg.generated
     */
    private BigDecimal balance;

    /**
     * 积分
     *
     * @mbg.generated
     */
    private Integer point;

    /**
     * 信用积分
     *
     * @mbg.generated
     */
    private Integer credit;

    /**
     * 版本
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     * 扩展字段
     *
     * @mbg.generated
     */
    private String ext;

    /**
     * 扩展字段1
     *
     * @mbg.generated
     */
    private String ext1;

    /**
     * 金币余额
     *
     * @mbg.generated
     */
    private Integer goldBalance;
}
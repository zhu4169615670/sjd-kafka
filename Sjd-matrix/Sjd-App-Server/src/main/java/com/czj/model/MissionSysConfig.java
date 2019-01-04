package com.czj.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author zpf
 * @Title: MissionSysConfig
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/24 10:41
 */
@Data
@Entity
@Table(name = "mission_sys_config")
public class MissionSysConfig implements Serializable {

    /**
     * 编号
     *
     * @mbg.generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sysConfigId;

    private String sysKey;


    private String sysValue;


    private String remark;
}

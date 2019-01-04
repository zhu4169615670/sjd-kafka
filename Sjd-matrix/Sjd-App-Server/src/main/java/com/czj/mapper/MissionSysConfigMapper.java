package com.czj.mapper;

import com.czj.model.MissionSysConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zpf
 * @Title: MissionSysConfigMapper
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/24 10:44
 */
@Repository
@Transactional(rollbackFor = Exception.class)
public interface MissionSysConfigMapper extends JpaRepository<MissionSysConfig,Long> {
}

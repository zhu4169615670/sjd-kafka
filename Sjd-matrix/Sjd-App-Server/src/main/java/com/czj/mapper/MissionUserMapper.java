package com.czj.mapper;

import com.czj.model.MissionUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zpf
 * @Title: MissionUserMapper
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/20 9:56
 */
@Repository
public interface MissionUserMapper extends JpaRepository<MissionUser,Long> {
}

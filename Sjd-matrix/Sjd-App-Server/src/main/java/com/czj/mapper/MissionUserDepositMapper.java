package com.czj.mapper;

import com.czj.model.MissionUserDeposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zpf
 * @Title: MissionUserDepositMapper
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/17 9:51
 */
@Repository
@Transactional(rollbackFor = Exception.class)
public interface MissionUserDepositMapper extends JpaRepository<MissionUserDeposit, Long> {

    @Query(value = "select u from MissionUserDeposit u where u.userId=?1 and u.taskId=?2 and u.depositType=?3")
    MissionUserDeposit findByUserIdAndTaskIdAndDepositType(Integer userId, Integer taskId,Integer depositType);
}

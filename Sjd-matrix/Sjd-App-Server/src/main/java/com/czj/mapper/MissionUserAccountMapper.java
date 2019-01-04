package com.czj.mapper;

import com.czj.model.MissionUserAccount;
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
public interface MissionUserAccountMapper extends JpaRepository<MissionUserAccount, Long> {

}

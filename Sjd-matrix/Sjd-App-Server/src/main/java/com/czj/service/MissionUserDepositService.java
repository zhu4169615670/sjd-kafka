package com.czj.service;

import com.czj.model.MissionUser;
import com.czj.model.MissionUserAccount;
import com.czj.model.MissionUserDeposit;

/**
 * @author zpf
 * @Title: MissionUserDepositService
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/20 11:46
 */
public interface MissionUserDepositService {

    int updateMissionUserDepoAndUserAccountAndUser(MissionUserDeposit ownMissionUserDeposit, MissionUserAccount ownMissionUserAccount, MissionUser missionUser,MissionUserDeposit shifuMissionUserDeposit, MissionUserAccount shifuMissionUserAccount);
}

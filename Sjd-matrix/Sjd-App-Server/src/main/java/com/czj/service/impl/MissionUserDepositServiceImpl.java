package com.czj.service.impl;

import com.czj.mapper.MissionUserAccountMapper;
import com.czj.mapper.MissionUserDepositMapper;
import com.czj.mapper.MissionUserMapper;
import com.czj.model.MissionUser;
import com.czj.model.MissionUserAccount;
import com.czj.model.MissionUserDeposit;
import com.czj.service.MissionUserDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;


/**
 * @author zpf
 * @Title: MissionUserDepositServiceImpl
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/20 11:46
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MissionUserDepositServiceImpl implements MissionUserDepositService {

    @Autowired
    private MissionUserDepositMapper missionUserDepositMapper;

    @Autowired
    private MissionUserAccountMapper missionUserAccountMapper;

    @Autowired
    private MissionUserMapper missionUserMapper;

    @Override
    public int updateMissionUserDepoAndUserAccountAndUser(MissionUserDeposit ownMissionUserDeposit, MissionUserAccount ownMissionUserAccount, MissionUser missionUser,MissionUserDeposit shifuMissionUserDeposit, MissionUserAccount shifuMissionUserAccount) {
        if(!ObjectUtils.isEmpty(ownMissionUserDeposit)){
            ownMissionUserDeposit.setApprenticeUserId(null);
            ownMissionUserDeposit.setPrizeType(null);
            missionUserDepositMapper.save(ownMissionUserDeposit);
        }
        if(!ObjectUtils.isEmpty(ownMissionUserAccount)){
            missionUserAccountMapper.save(ownMissionUserAccount);
        }
        if(!ObjectUtils.isEmpty(missionUser)){
            missionUserMapper.save(missionUser);
        }
        if(!ObjectUtils.isEmpty(shifuMissionUserDeposit)){
            missionUserDepositMapper.save(shifuMissionUserDeposit);
        }
        if(!ObjectUtils.isEmpty(shifuMissionUserAccount)){
            missionUserAccountMapper.save(shifuMissionUserAccount);
        }
        return 1;
    }
}

package com.czj.mapper;

import com.czj.model.MissionSysConfig;
import com.czj.model.OrderTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zpf
 * @Title: OrderTestMapper
 * @ProjectName Sjd-matrix
 * @Description: TODO
 * @date 2018/12/25 17:00
 */
@Repository
@Transactional(rollbackFor = Exception.class)
public interface OrderTestMapper extends JpaRepository<OrderTest,Long> {
}

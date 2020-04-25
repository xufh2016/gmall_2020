package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OmsOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author jiangli
 * @since 2020-04-23 13:40:15
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrder> {

}

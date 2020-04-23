package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OmsOrderSetting;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * @author jiangli
 * @since  2020-04-23 13:40:15
 */
@Mapper
public interface OmsOrderSettingDao extends BaseMapper<OmsOrderSetting> {
	
}

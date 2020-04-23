package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.GrowthChangeHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * @author jiangli
 * @since  2020-04-23 14:40:52
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistory> {
	
}

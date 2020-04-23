package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.MemberPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * @author jiangli
 * @since  2020-04-23 14:30:10
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {
	
}

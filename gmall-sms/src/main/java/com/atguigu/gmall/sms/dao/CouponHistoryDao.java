package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 *
 * @author jiangli
 * @since 2020-04-23 14:30:10
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistory> {

}

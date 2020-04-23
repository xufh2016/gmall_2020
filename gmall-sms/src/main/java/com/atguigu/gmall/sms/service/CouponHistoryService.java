package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.CouponHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券领取历史记录
 *
 * @author jiangli
 * @since  2020-04-23 14:30:10
 */
public interface CouponHistoryService extends IService<CouponHistory> {

    PageVo queryPage(QueryCondition params);
}


package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.Coupon;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券信息
 *
 * @author jiangli
 * @since  2020-04-23 14:30:10
 */
public interface CouponService extends IService<Coupon> {

    PageVo queryPage(QueryCondition params);
}


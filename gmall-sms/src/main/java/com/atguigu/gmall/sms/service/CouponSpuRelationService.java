package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.CouponSpuRelation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券与产品关联
 *
 * @author jiangli
 * @since 2020-04-23 14:30:10
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelation> {

    PageVo queryPage(QueryCondition params);
}


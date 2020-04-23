package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.MemberPrice;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品会员价格
 *
 * @author jiangli
 * @since  2020-04-23 14:30:10
 */
public interface MemberPriceService extends IService<MemberPrice> {

    PageVo queryPage(QueryCondition params);
}


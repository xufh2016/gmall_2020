package com.atguigu.gmall.oms.service;

import com.atguigu.gmall.oms.entity.OmsOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单
 *
 * @author jiangli
 * @since 2020-04-23 13:40:15
 */
public interface OmsOrderService extends IService<OmsOrder> {

    PageVo queryPage(QueryCondition params);
}


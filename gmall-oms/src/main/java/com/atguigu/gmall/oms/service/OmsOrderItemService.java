package com.atguigu.gmall.oms.service;

import com.atguigu.gmall.oms.entity.OmsOrderItem;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单项信息
 *
 * @author jiangli
 * @since 2020-04-23 13:40:15
 */
public interface OmsOrderItemService extends IService<OmsOrderItem> {

    PageVo queryPage(QueryCondition params);
}


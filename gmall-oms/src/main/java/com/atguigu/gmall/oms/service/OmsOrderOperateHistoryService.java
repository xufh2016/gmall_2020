package com.atguigu.gmall.oms.service;

import com.atguigu.gmall.oms.entity.OmsOrderOperateHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单操作历史记录
 *
 * @author jiangli
 * @since  2020-04-23 13:40:15
 */
public interface OmsOrderOperateHistoryService extends IService<OmsOrderOperateHistory> {

    PageVo queryPage(QueryCondition params);
}


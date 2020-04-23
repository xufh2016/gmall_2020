package com.atguigu.gmall.oms.service;

import com.atguigu.gmall.oms.entity.OmsOrderReturnReason;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 退货原因
 *
 * @author jiangli
 * @since  2020-04-23 13:40:15
 */
public interface OmsOrderReturnReasonService extends IService<OmsOrderReturnReason> {

    PageVo queryPage(QueryCondition params);
}


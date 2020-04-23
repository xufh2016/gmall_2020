package com.atguigu.gmall.oms.service;

import com.atguigu.gmall.oms.entity.OmsPaymentInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 支付信息表
 *
 * @author jiangli
 * @since  2020-04-23 13:40:15
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfo> {

    PageVo queryPage(QueryCondition params);
}


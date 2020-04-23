package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SpuFullReduction;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品满减信息
 *
 * @author jiangli
 * @since  2020-04-23 14:30:09
 */
public interface SpuFullReductionService extends IService<SpuFullReduction> {

    PageVo queryPage(QueryCondition params);
}


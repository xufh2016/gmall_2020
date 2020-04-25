package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SeckillSkuRelation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动商品关联
 *
 * @author jiangli
 * @since 2020-04-23 14:30:09
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelation> {

    PageVo queryPage(QueryCondition params);
}


package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SeckillPromotion;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动
 *
 * @author jiangli
 * @since  2020-04-23 14:30:09
 */
public interface SeckillPromotionService extends IService<SeckillPromotion> {

    PageVo queryPage(QueryCondition params);
}


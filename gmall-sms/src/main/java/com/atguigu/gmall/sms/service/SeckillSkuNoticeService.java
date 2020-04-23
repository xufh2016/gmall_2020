package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SeckillSkuNotice;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀商品通知订阅
 *
 * @author jiangli
 * @since  2020-04-23 14:30:09
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageVo queryPage(QueryCondition params);
}


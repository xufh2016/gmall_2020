package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SkuBounds;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品sku积分设置
 *
 * @author jiangli
 * @since  2020-04-23 14:30:09
 */
public interface SkuBoundsService extends IService<SkuBounds> {

    PageVo queryPage(QueryCondition params);
}


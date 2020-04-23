package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SpuBounds;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品spu积分设置
 *
 * @author jiangli
 * @since  2020-04-23 14:30:09
 */
public interface SpuBoundsService extends IService<SpuBounds> {

    PageVo queryPage(QueryCondition params);
}


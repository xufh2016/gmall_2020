package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.SkuLadder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品阶梯价格
 *
 * @author jiangli
 * @since 2020-04-23 14:30:09
 */
public interface SkuLadderService extends IService<SkuLadder> {

    PageVo queryPage(QueryCondition params);
}


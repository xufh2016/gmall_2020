package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.HomeAdv;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 首页轮播广告
 *
 * @author jiangli
 * @since  2020-04-23 14:30:09
 */
public interface HomeAdvService extends IService<HomeAdv> {

    PageVo queryPage(QueryCondition params);
}


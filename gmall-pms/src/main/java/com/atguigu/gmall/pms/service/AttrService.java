package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.Attr;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品属性
 *
 * @author jiangli
 * @since 2020-04-23 09:52:30
 */
public interface AttrService extends IService<Attr> {

    PageVo queryPage(QueryCondition params);
}


package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.HomeSubjectSpu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 专题商品
 *
 * @author jiangli
 * @since 2020-04-23 14:30:10
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpu> {

    PageVo queryPage(QueryCondition params);
}


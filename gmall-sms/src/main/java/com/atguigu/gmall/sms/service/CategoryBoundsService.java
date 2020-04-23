package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.CategoryBounds;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品分类积分设置
 *
 * @author jiangli
 * @since  2020-04-23 14:30:10
 */
public interface CategoryBoundsService extends IService<CategoryBounds> {

    PageVo queryPage(QueryCondition params);
}


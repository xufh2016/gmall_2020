package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品三级分类
 *
 * @author jiangli
 * @since  2020-04-23 09:52:30
 */
public interface CategoryService extends IService<Category> {

    PageVo queryPage(QueryCondition params);
}


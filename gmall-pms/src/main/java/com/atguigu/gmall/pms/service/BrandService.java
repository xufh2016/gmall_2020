package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 品牌
 *
 * @author jiangli
 * @since  2020-04-23 09:52:30
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}


package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.ProductAttrValue;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu属性值
 *
 * @author jiangli
 * @since 2020-04-23 09:52:30
 */
public interface ProductAttrValueService extends IService<ProductAttrValue> {

    PageVo queryPage(QueryCondition params);
}


package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.AttrAttrgroupRelation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 属性&属性分组关联
 *
 * @author jiangli
 * @since 2020-04-23 09:52:30
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelation> {

    PageVo queryPage(QueryCondition params);
}


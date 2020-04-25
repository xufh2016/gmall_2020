package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.FeightTemplate;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 运费模板
 *
 * @author jiangli
 * @since 2020-04-23 14:59:27
 */
public interface FeightTemplateService extends IService<FeightTemplate> {

    PageVo queryPage(QueryCondition params);
}


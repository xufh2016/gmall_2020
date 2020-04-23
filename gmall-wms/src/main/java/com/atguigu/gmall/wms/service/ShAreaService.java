package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.ShArea;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 全国省市区信息
 *
 * @author jiangli
 * @since  2020-04-23 14:59:27
 */
public interface ShAreaService extends IService<ShArea> {

    PageVo queryPage(QueryCondition params);
}


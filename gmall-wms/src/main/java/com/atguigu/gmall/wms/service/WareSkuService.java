package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WareSku;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品库存
 *
 * @author jiangli
 * @since  2020-04-23 14:59:27
 */
public interface WareSkuService extends IService<WareSku> {

    PageVo queryPage(QueryCondition params);
}


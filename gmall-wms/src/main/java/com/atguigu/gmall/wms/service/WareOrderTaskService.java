package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WareOrderTask;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 库存工作单
 *
 * @author jiangli
 * @since 2020-04-23 14:59:27
 */
public interface WareOrderTaskService extends IService<WareOrderTask> {

    PageVo queryPage(QueryCondition params);
}


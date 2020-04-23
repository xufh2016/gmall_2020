package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WareInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 仓库信息
 *
 * @author jiangli
 * @since  2020-04-23 14:59:27
 */
public interface WareInfoService extends IService<WareInfo> {

    PageVo queryPage(QueryCondition params);
}


package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.SpuInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu信息
 *
 * @author jiangli
 * @since  2020-04-23 09:52:30
 */
public interface SpuInfoService extends IService<SpuInfo> {

    PageVo queryPage(QueryCondition params);
}


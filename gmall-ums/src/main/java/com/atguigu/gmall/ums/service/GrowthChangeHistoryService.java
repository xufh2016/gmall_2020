package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.GrowthChangeHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 成长值变化历史记录
 *
 * @author jiangli
 * @since 2020-04-23 14:40:52
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistory> {

    PageVo queryPage(QueryCondition params);
}


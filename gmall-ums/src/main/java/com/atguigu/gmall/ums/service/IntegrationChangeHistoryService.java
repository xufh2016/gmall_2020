package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.IntegrationChangeHistory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 积分变化历史记录
 *
 * @author jiangli
 * @since  2020-04-23 14:40:52
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistory> {

    PageVo queryPage(QueryCondition params);
}


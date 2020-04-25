package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.UndoLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * @author jiangli
 * @since 2020-04-23 09:52:30
 */
public interface UndoLogService extends IService<UndoLog> {

    PageVo queryPage(QueryCondition params);
}


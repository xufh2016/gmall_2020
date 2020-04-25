package com.atguigu.gmall.sms.service;

import com.atguigu.gmall.sms.entity.UndoLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * @author jiangli
 * @since 2020-04-23 14:30:09
 */
public interface UndoLogService extends IService<UndoLog> {

    PageVo queryPage(QueryCondition params);
}


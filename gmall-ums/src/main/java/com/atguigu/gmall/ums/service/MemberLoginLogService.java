package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.MemberLoginLog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员登录记录
 *
 * @author jiangli
 * @since 2020-04-23 14:40:52
 */
public interface MemberLoginLogService extends IService<MemberLoginLog> {

    PageVo queryPage(QueryCondition params);
}


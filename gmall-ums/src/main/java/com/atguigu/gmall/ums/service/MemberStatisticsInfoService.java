package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.MemberStatisticsInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员统计信息
 *
 * @author jiangli
 * @since  2020-04-23 14:40:52
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfo> {

    PageVo queryPage(QueryCondition params);
}


package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.MemberLevel;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员等级
 *
 * @author jiangli
 * @since 2020-04-23 14:40:52
 */
public interface MemberLevelService extends IService<MemberLevel> {

    PageVo queryPage(QueryCondition params);
}


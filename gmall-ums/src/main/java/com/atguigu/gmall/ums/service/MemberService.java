package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员
 *
 * @author jiangli
 * @since 2020-04-23 14:40:52
 */
public interface MemberService extends IService<Member> {

    PageVo queryPage(QueryCondition params);
}


package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.MemberCollectSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收藏的专题活动
 *
 * @author jiangli
 * @since  2020-04-23 14:40:52
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubject> {

    PageVo queryPage(QueryCondition params);
}


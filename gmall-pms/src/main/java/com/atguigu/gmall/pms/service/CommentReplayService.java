package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.CommentReplay;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品评价回复关系
 *
 * @author jiangli
 * @since  2020-04-23 09:52:30
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageVo queryPage(QueryCondition params);
}


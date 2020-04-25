package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.SpuComment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品评价
 *
 * @author jiangli
 * @since 2020-04-23 09:52:30
 */
public interface SpuCommentService extends IService<SpuComment> {

    PageVo queryPage(QueryCondition params);
}


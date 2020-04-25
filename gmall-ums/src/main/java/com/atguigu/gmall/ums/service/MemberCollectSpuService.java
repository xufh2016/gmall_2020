package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.MemberCollectSpu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收藏的商品
 *
 * @author jiangli
 * @since 2020-04-23 14:40:52
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpu> {

    PageVo queryPage(QueryCondition params);
}


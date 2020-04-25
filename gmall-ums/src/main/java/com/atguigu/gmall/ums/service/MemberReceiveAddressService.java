package com.atguigu.gmall.ums.service;

import com.atguigu.gmall.ums.entity.MemberReceiveAddress;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收货地址
 *
 * @author jiangli
 * @since 2020-04-23 14:40:52
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddress> {

    PageVo queryPage(QueryCondition params);
}


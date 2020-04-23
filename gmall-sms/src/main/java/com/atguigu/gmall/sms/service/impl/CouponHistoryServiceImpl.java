package com.atguigu.gmall.sms.service.impl;

import com.atguigu.gmall.sms.dao.CouponHistoryDao;
import com.atguigu.gmall.sms.entity.CouponHistory;
import com.atguigu.gmall.sms.service.CouponHistoryService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryDao, CouponHistory> implements CouponHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponHistory> page = this.page(
                new Query<CouponHistory>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
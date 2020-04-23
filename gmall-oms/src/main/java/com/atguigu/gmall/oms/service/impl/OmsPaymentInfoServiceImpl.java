package com.atguigu.gmall.oms.service.impl;

import com.atguigu.gmall.oms.dao.OmsPaymentInfoDao;
import com.atguigu.gmall.oms.entity.OmsPaymentInfo;
import com.atguigu.gmall.oms.service.OmsPaymentInfoService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl extends ServiceImpl<OmsPaymentInfoDao, OmsPaymentInfo> implements OmsPaymentInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsPaymentInfo> page = this.page(
                new Query<OmsPaymentInfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
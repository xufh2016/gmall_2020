package com.atguigu.gmall.oms.service.impl;

import com.atguigu.gmall.oms.dao.OmsRefundInfoDao;
import com.atguigu.gmall.oms.entity.OmsRefundInfo;
import com.atguigu.gmall.oms.service.OmsRefundInfoService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("omsRefundInfoService")
public class OmsRefundInfoServiceImpl extends ServiceImpl<OmsRefundInfoDao, OmsRefundInfo> implements OmsRefundInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsRefundInfo> page = this.page(
                new Query<OmsRefundInfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
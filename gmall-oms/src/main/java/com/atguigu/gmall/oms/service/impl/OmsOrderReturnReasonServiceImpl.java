package com.atguigu.gmall.oms.service.impl;

import com.atguigu.gmall.oms.dao.OmsOrderReturnReasonDao;
import com.atguigu.gmall.oms.entity.OmsOrderReturnReason;
import com.atguigu.gmall.oms.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReason> implements OmsOrderReturnReasonService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsOrderReturnReason> page = this.page(
                new Query<OmsOrderReturnReason>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
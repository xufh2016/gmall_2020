package com.atguigu.gmall.oms.service.impl;

import com.atguigu.gmall.oms.dao.OmsOrderItemDao;
import com.atguigu.gmall.oms.entity.OmsOrderItem;
import com.atguigu.gmall.oms.service.OmsOrderItemService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemDao, OmsOrderItem> implements OmsOrderItemService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsOrderItem> page = this.page(
                new Query<OmsOrderItem>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
package com.atguigu.gmall.oms.service.impl;

import com.atguigu.gmall.oms.dao.OmsOrderOperateHistoryDao;
import com.atguigu.gmall.oms.entity.OmsOrderOperateHistory;
import com.atguigu.gmall.oms.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryDao, OmsOrderOperateHistory> implements OmsOrderOperateHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsOrderOperateHistory> page = this.page(
                new Query<OmsOrderOperateHistory>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
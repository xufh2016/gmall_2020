package com.atguigu.gmall.ums.service.impl;

import com.atguigu.gmall.ums.dao.GrowthChangeHistoryDao;
import com.atguigu.gmall.ums.entity.GrowthChangeHistory;
import com.atguigu.gmall.ums.service.GrowthChangeHistoryService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistory> implements GrowthChangeHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<GrowthChangeHistory> page = this.page(
                new Query<GrowthChangeHistory>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
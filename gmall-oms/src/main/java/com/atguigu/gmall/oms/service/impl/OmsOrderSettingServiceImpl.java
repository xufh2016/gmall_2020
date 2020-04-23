package com.atguigu.gmall.oms.service.impl;

import com.atguigu.gmall.oms.dao.OmsOrderSettingDao;
import com.atguigu.gmall.oms.entity.OmsOrderSetting;
import com.atguigu.gmall.oms.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingDao, OmsOrderSetting> implements OmsOrderSettingService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OmsOrderSetting> page = this.page(
                new Query<OmsOrderSetting>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
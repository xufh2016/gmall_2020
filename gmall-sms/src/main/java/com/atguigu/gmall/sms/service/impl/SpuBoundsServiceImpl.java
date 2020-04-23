package com.atguigu.gmall.sms.service.impl;

import com.atguigu.gmall.sms.dao.SpuBoundsDao;
import com.atguigu.gmall.sms.entity.SpuBounds;
import com.atguigu.gmall.sms.service.SpuBoundsService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBounds> implements SpuBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuBounds> page = this.page(
                new Query<SpuBounds>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.pms.dao.SkuImagesDao;
import com.atguigu.gmall.pms.entity.SkuImages;
import com.atguigu.gmall.pms.service.SkuImagesService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;
import org.springframework.stereotype.Service;

@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImages> implements SkuImagesService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SkuImages> page = this.page(
                new Query<SkuImages>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}
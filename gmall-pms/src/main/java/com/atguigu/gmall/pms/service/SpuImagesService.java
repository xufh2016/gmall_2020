package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.SpuImages;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu图片
 *
 * @author jiangli
 * @since 2020-04-23 09:52:30
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageVo queryPage(QueryCondition params);
}


package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 *
 * @author jiangli
 * @since 2020-04-23 14:59:27
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSku> {

}

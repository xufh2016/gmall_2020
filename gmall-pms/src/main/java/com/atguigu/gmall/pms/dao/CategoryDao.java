package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * @author jiangli
 * @since  2020-04-23 09:52:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
	
}

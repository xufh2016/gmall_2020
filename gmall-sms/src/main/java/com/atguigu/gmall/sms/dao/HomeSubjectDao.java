package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.HomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * @author jiangli
 * @since  2020-04-23 14:30:10
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubject> {
	
}

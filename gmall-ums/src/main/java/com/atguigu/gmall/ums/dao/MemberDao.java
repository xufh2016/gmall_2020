package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * @author jiangli
 * @since  2020-04-23 14:40:52
 */
@Mapper
public interface MemberDao extends BaseMapper<Member> {
	
}

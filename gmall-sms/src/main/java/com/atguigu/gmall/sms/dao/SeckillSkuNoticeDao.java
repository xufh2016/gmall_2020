package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SeckillSkuNotice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 *
 * @author jiangli
 * @since 2020-04-23 14:30:09
 */
@Mapper
public interface SeckillSkuNoticeDao extends BaseMapper<SeckillSkuNotice> {

}

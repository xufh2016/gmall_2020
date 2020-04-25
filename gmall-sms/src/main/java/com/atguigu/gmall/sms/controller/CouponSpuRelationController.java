package com.atguigu.gmall.sms.controller;

import java.util.Arrays;

import com.atguigu.gmall.sms.entity.CouponSpuRelation;
import com.atguigu.gmall.sms.service.CouponSpuRelationService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * 优惠券与产品关联
 *
 * @author jiangli
 * @since 2020-04-23 14:30:10
 */
@Api(tags = "优惠券与产品关联 管理")
@RestController
@RequestMapping("sms/couponspurelation")
public class CouponSpuRelationController {
    @Autowired
    private CouponSpuRelationService couponSpuRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:couponspurelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = couponSpuRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:couponspurelation:info')")
    public Resp<CouponSpuRelation> info(@PathVariable("id") Long id) {
        CouponSpuRelation couponSpuRelation = couponSpuRelationService.getById(id);

        return Resp.ok(couponSpuRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:couponspurelation:save')")
    public Resp<Object> save(@RequestBody CouponSpuRelation couponSpuRelation) {
        couponSpuRelationService.save(couponSpuRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:couponspurelation:update')")
    public Resp<Object> update(@RequestBody CouponSpuRelation couponSpuRelation) {
        couponSpuRelationService.updateById(couponSpuRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:couponspurelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids) {
        couponSpuRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}

package com.atguigu.gmall.oms.controller;

import java.util.Arrays;

import com.atguigu.gmall.oms.entity.OmsOrderReturnApply;
import com.atguigu.gmall.oms.service.OmsOrderReturnApplyService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * 订单退货申请
 *
 * @author jiangli
 * @since 2020-04-23 13:40:15
 */
@Api(tags = "订单退货申请 管理")
@RestController
@RequestMapping("oms/omsorderreturnapply")
public class OmsOrderReturnApplyController {
    @Autowired
    private OmsOrderReturnApplyService omsOrderReturnApplyService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:omsorderreturnapply:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = omsOrderReturnApplyService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:omsorderreturnapply:info')")
    public Resp<OmsOrderReturnApply> info(@PathVariable("id") Long id) {
        OmsOrderReturnApply omsOrderReturnApply = omsOrderReturnApplyService.getById(id);

        return Resp.ok(omsOrderReturnApply);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:omsorderreturnapply:save')")
    public Resp<Object> save(@RequestBody OmsOrderReturnApply omsOrderReturnApply) {
        omsOrderReturnApplyService.save(omsOrderReturnApply);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:omsorderreturnapply:update')")
    public Resp<Object> update(@RequestBody OmsOrderReturnApply omsOrderReturnApply) {
        omsOrderReturnApplyService.updateById(omsOrderReturnApply);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:omsorderreturnapply:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids) {
        omsOrderReturnApplyService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}

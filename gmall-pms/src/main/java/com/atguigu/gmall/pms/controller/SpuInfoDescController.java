package com.atguigu.gmall.pms.controller;

import java.util.Arrays;

import com.atguigu.gmall.pms.entity.SpuInfoDesc;
import com.atguigu.gmall.pms.service.SpuInfoDescService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * spu信息介绍
 *
 * @author jiangli
 * @since 2020-04-23 09:52:30
 */
@Api(tags = "spu信息介绍 管理")
@RestController
@RequestMapping("pms/spuinfodesc")
public class SpuInfoDescController {
    @Autowired
    private SpuInfoDescService spuInfoDescService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:spuinfodesc:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = spuInfoDescService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{spuId}")
    @PreAuthorize("hasAuthority('pms:spuinfodesc:info')")
    public Resp<SpuInfoDesc> info(@PathVariable("spuId") Long spuId) {
        SpuInfoDesc spuInfoDesc = spuInfoDescService.getById(spuId);

        return Resp.ok(spuInfoDesc);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:spuinfodesc:save')")
    public Resp<Object> save(@RequestBody SpuInfoDesc spuInfoDesc) {
        spuInfoDescService.save(spuInfoDesc);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:spuinfodesc:update')")
    public Resp<Object> update(@RequestBody SpuInfoDesc spuInfoDesc) {
        spuInfoDescService.updateById(spuInfoDesc);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:spuinfodesc:delete')")
    public Resp<Object> delete(@RequestBody Long[] spuIds) {
        spuInfoDescService.removeByIds(Arrays.asList(spuIds));

        return Resp.ok(null);
    }

}

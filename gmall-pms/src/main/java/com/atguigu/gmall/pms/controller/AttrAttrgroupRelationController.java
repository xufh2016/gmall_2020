package com.atguigu.gmall.pms.controller;

import com.atguigu.gmall.pms.entity.AttrAttrgroupRelation;
import com.atguigu.gmall.pms.service.AttrAttrgroupRelationService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * 属性&属性分组关联
 *
 * @author jiangli
 * @since 2020-04-23 09:52:30
 */
@Api(tags = "属性&属性分组关联 管理")
@RestController
@RequestMapping("pms/attrattrgrouprelation")
public class AttrAttrgroupRelationController { //类继承关系快捷键ctrl+ t
    //类下的所有方法快捷键 alt+7
    @Autowired
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = attrAttrgroupRelationService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:info')")
    public Resp<AttrAttrgroupRelation> info(@PathVariable("id") Long id) {
        AttrAttrgroupRelation attrAttrgroupRelation = attrAttrgroupRelationService.getById(id);

        return Resp.ok(attrAttrgroupRelation);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:save')")
    public Resp<Object> save(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation) {
        attrAttrgroupRelationService.save(attrAttrgroupRelation);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:update')")
    public Resp<Object> update(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation) {
        attrAttrgroupRelationService.updateById(attrAttrgroupRelation);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids) {
        attrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}

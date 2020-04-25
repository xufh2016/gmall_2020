package com.atguigu.gmall.ums.controller;

import java.util.Arrays;

import com.atguigu.gmall.ums.entity.MemberCollectSpu;
import com.atguigu.gmall.ums.service.MemberCollectSpuService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * 会员收藏的商品
 *
 * @author jiangli
 * @since 2020-04-23 14:40:52
 */
@Api(tags = "会员收藏的商品 管理")
@RestController
@RequestMapping("ums/membercollectspu")
public class MemberCollectSpuController {
    @Autowired
    private MemberCollectSpuService memberCollectSpuService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:membercollectspu:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = memberCollectSpuService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:membercollectspu:info')")
    public Resp<MemberCollectSpu> info(@PathVariable("id") Long id) {
        MemberCollectSpu memberCollectSpu = memberCollectSpuService.getById(id);

        return Resp.ok(memberCollectSpu);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:membercollectspu:save')")
    public Resp<Object> save(@RequestBody MemberCollectSpu memberCollectSpu) {
        memberCollectSpuService.save(memberCollectSpu);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:membercollectspu:update')")
    public Resp<Object> update(@RequestBody MemberCollectSpu memberCollectSpu) {
        memberCollectSpuService.updateById(memberCollectSpu);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:membercollectspu:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids) {
        memberCollectSpuService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}

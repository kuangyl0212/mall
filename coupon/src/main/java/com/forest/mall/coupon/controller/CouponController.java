package com.forest.mall.coupon.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

// import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.forest.mall.coupon.entity.CouponEntity;
import com.forest.mall.coupon.service.CouponService;
import com.forest.mall.common.utils.PageUtils;
import com.forest.mall.common.utils.R;



/**
 * 优惠券信息
 *
 * @author forest
 * @email kuangyl0212@gmail.com
 * @date 2022-04-13 21:14:31
 */
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @GetMapping("/account/list")
    public R couponsOfAccount() {
        CouponEntity coupon = new CouponEntity();
        coupon.setCouponName("Easter Offer");
        return R.ok().put("coupons", Collections.singletonList(coupon));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:coupon:list")
    public R couponsOfAccount(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

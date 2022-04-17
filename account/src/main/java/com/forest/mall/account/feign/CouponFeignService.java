package com.forest.mall.account.feign;

import com.forest.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author forest
 * @Date 2022/4/17 14:03
 * @Version 1.0
 */

@FeignClient(name = "account-service", url = "127.0.0.1:8081")
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/account/list")
    public R couponsOfAccount();
}

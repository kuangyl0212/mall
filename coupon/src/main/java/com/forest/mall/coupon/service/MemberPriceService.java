package com.forest.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forest.mall.common.utils.PageUtils;
import com.forest.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author forest
 * @email kuangyl0212@gmail.com
 * @date 2022-04-13 21:14:31
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


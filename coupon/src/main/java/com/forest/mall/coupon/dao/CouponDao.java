package com.forest.mall.coupon.dao;

import com.forest.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author forest
 * @email kuangyl0212@gmail.com
 * @date 2022-04-13 21:14:31
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

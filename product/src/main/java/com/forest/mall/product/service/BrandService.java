package com.forest.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forest.mall.common.utils.PageUtils;
import com.forest.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author forest
 * @email kuangyl0212@gmail.com
 * @date 2022-04-12 20:41:04
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


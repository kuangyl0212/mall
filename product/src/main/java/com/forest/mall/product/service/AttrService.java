package com.forest.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forest.mall.common.utils.PageUtils;
import com.forest.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author forest
 * @email kuangyl0212@gmail.com
 * @date 2022-04-12 20:41:04
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


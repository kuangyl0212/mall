package com.forest.mall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forest.mall.common.utils.PageUtils;
import com.forest.mall.warehouse.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author forest
 * @email kuangyl0212@gmail.com
 * @date 2022-04-13 21:07:50
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.forest.mall.warehouse.dao;

import com.forest.mall.warehouse.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author forest
 * @email kuangyl0212@gmail.com
 * @date 2022-04-13 21:07:50
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}

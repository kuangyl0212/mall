package com.forest.mall.account.dao;

import com.forest.mall.account.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author forest
 * @email kuangyl0212@gmail.com
 * @date 2022-04-13 21:22:01
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}

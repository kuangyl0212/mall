package com.forest.mall.account.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forest.mall.common.utils.PageUtils;
import com.forest.mall.account.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author forest
 * @email kuangyl0212@gmail.com
 * @date 2022-04-13 21:22:01
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


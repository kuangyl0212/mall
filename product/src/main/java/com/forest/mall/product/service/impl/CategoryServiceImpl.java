package com.forest.mall.product.service.impl;

import com.forest.mall.common.utils.PageUtils;
import com.forest.mall.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.forest.mall.product.dao.CategoryDao;
import com.forest.mall.product.entity.CategoryEntity;
import com.forest.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public List<CategoryEntity> listAsTree() {
        List<CategoryEntity> cats = baseMapper.selectList(null);
        CategoryEntity dummyHead = new CategoryEntity();
        dummyHead.setCatId(0L);
        CategoryEntity tree = recursivelyBuildCategoryTree(dummyHead, cats);
        return tree.getChildren();
    }

    private CategoryEntity recursivelyBuildCategoryTree(CategoryEntity root, List<CategoryEntity> cats) {
        List<CategoryEntity> children = cats.stream()
                .filter(cat -> Objects.equals(cat.getParentCid(), root.getCatId()))
                .map(cat -> recursivelyBuildCategoryTree(cat, cats))
                .collect(Collectors.toList());
        root.setChildren(children);
        return root;
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

}
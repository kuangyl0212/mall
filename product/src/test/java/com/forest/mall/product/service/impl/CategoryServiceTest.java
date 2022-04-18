package com.forest.mall.product.service.impl;

import com.forest.mall.product.entity.CategoryEntity;
import com.forest.mall.product.service.CategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author forest
 * @Date 2022/4/18 21:23
 * @Version 1.0
 */
@SpringBootTest
class CategoryServiceTest {
    @Autowired
    CategoryService categoryService;

    @Test
    void listAsTree() {
        List<CategoryEntity> cats = categoryService.listAsTree();
        Assertions.assertEquals(0, cats.size());
    }
}
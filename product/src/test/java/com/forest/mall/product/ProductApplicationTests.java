package com.forest.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.forest.mall.product.entity.BrandEntity;
import com.forest.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
    }

    @Test
    void brandServiceTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("Apple");
        brandService.save(brandEntity);
        brandService.list(new QueryWrapper<BrandEntity>()).forEach(System.out::println);
    }
}

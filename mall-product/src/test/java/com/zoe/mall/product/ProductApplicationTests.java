package com.zoe.mall.product;

import com.zoe.mall.product.entity.BrandEntity;
import com.zoe.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void testBrandSave() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("Huawei");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

    @Test
    void testBrandUpdate() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(2L);
        brandEntity.setName("Xiaomi");
        brandEntity.setDescript("小米手机挺好用的，但是没有华为手机好用");
        brandService.updateById(brandEntity);
        System.out.println("修改成功");
    }

}

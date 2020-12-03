package com.itheima.ivy.aopxml;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import javax.annotation.Resource;


/**
 * xml方法 AOP开发
 */

@SpringJUnitConfig(locations = "classpath:bean1.xml")
class ProductImplTest {

    @Resource
    private ProductDao productDao;

    @Test
    void save() {
        productDao.save();
    }

    @Test
    void delete() {
        productDao.delete();
    }

    @Test
    void update() {
        productDao.update();
    }

    @Test
    void query() {
        productDao.query();
    }
}
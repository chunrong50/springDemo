package com.itheima.ivy.aopanno;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;

/**
 *注解方式 AOP开发
 */
@SpringJUnitConfig(locations = "classpath:aopanno.xml")
class OrderDaoTest {

    @Resource
    private  OrderDao orderDao;

    @Test
    void save() {
        orderDao.save();
    }

    @Test
    void update() {
        orderDao.update();
    }

    @Test
    void find() {
        orderDao.find();
    }

    @Test
    void delete() {
        orderDao.delete();
    }
}
package com.itheima.ivy.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




class UserDaoImplTest {

    @Test
    void save() {
        UserDao  userDao=new UserDaoImpl();
        userDao.save();
    }

    // Spring IOC注解方式, 类注解
    @Test
    void save2(){
        ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao  userDao= (UserDao) applicationContext.getBean("userDaoPPP");// userDaoPPP为类上设置的@Component(value = "userDaoPPP")
        userDao.save();
    }

    // Spring IOC注解方式, 属性注解
    @Test
    void print(){
        ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao  userDao= (UserDao) applicationContext.getBean("userDaoPPP");
        userDao.print(); //  属性上设置：@Value("wang wang")
    }

    // Spring IOC注解方式, 属性注解--对象类型
    @Test
    void save3(){
        ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService  userService= (UserService) applicationContext.getBean("UserService");// userDaoPPP为类上设置的@Component(value = "userDaoPPP")
        userService.save();
    }




}
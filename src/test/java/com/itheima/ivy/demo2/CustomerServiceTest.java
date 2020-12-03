package com.itheima.ivy.demo2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;


class CustomerServiceTest {



    @Test
    void save() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService= (CustomerService) applicationContext.getBean("customerService");
       customerService.save();

    }


}
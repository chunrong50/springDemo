package com.itheima.ivy.demo2;

import org.springframework.stereotype.Service;
import sun.security.x509.Extension;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 注解开发
 */

@Service("customerService")
public class CustomerService {

    @PostConstruct  // 初始化标记
    public  void init(){
        System.out.println("CustomerService  init");
    }

    public  void save(){
        System.out.println("CustomerService 被执行。。。。");
    }

    @PreDestroy //  结束后执行标记
    public  void dest(){
        System.out.println("CustomerService  destory");

    }


}

package com.itheima.ivy.aopxml;


/**
 * AOP 的XML 开发
 */

public class ProductImpl implements ProductDao {
    public void update() {
        System.out.println("update product set ***");
    }

    public void save() {
        System.out.println("insert into  product values  ***");

    }

    public void query() {
        System.out.println("select * from  product ");
        int  i=1/0;  //异常演示

    }

    public String delete() {
        System.out.println("delete  from  product where ** ");
        return  "张三" ;

    }
}

package com.itheima.ivy.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 用户DAO的实现类
 */

@Component(value = "userDaoPPP")
public class UserDaoImpl implements UserDao {
    @Value("wang wang")
    public String s;

    public void save() {
        System.out.println("DAO中保存用户的实现类已完成。。。");
    }

    public void print() {
        System.out.println("DAO中打印的实现类已完成。。。" + s);
    }
}

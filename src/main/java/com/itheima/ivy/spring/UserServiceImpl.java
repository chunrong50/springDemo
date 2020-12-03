package com.itheima.ivy.spring;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("UserService")// 相当于<bean id="UserService" class="com.itheima.ivy.spring.UserServiceImpl">
public class UserServiceImpl  implements  UserService{
    //注入DAO的对象属性
    @Resource
    private UserDao  userDao;

    public void save() {
        System.out.println("Service执行了。。。。");
        userDao.print();
    }
}

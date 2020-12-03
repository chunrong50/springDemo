package com.itheima.ivy.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspectAnno {

    /**
     * 前置通知
     */
    @Before("pointcut1()")
    public  void  before(){
        System.out.println("前置操作");
    }


    //后置通知
    @AfterReturning(value = "pointcut2()",returning = "result")
    public void logPrint(Object  result) {
        System.out.println("后置通知：日志打印----------" + result);
    }

    /**
     * 性能监控，环绕通知
     */
    @Around(value = "pointcut3()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知---");
        Object object=joinPoint.proceed();
        System.out.println("环绕后通知---");
        return object;
    }

    /**
     * 最终通知（类似finally中的方法）
     */
    @After(value = "pointcut4()")
    public  void  after(){
        System.out.println("最后通知………………………………");
    }

    /**
     * 异常通知
     * @param
     */
    @AfterThrowing(value = "pointcut4()",throwing = "ex")
    public  void afterThrowing(Throwable ex){
        System.out.println("异常通知#######"+ex.getMessage());

    }

    @Pointcut("execution(* com.itheima.ivy.aopanno.OrderDao.save(..))")
   private  void pointcut1(){}

    @Pointcut("execution(* com.itheima.ivy.aopanno.OrderDao.update(..))")
    private  void pointcut2(){}

    @Pointcut("execution(* com.itheima.ivy.aopanno.OrderDao.find(..))")
    private  void pointcut3(){}

    @Pointcut("execution(* com.itheima.ivy.aopanno.OrderDao.delete(..))")
    private  void pointcut4(){}


}

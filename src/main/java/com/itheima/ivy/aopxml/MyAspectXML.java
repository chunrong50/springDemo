package com.itheima.ivy.aopxml;


import org.aspectj.lang.ProceedingJoinPoint;

/**
 * AOP 的XML 开发
 */
public class MyAspectXML {
    // 前置通知
    public void checkPri(){
        System.out.println("前置通知：权限校验======");
    }

    //后置通知
    public void logPrint(Object  result) {
        System.out.println("后置通知：日志打印----------" + result);
    }

        /**
         * 性能监控
         */
        public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
            System.out.println("环绕前通知---");
            Object object=joinPoint.proceed();
            System.out.println("环绕后通知---");
            return object;
        }

    /**
     * 最后通知
     */
        public  void  after(){
            System.out.println("最后通知………………………………");
        }

    /**
     * 异常通知
     * @param
     */
    public  void afterThrowing(Throwable ex){
            System.out.println("异常通知#######"+ex.getMessage());

        }




}

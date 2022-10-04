package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Nikki
 * @create 2022-09-05 0:15
 */
@Component
@Aspect  //告诉spring容器是aop增强类
public class MyAdvice {

    //切面：即在这执行
    @Pointcut("execution(void com.example.demo.service.MyService.foo())") // execution：执行
    private void pt(){}

    @Before("pt()")
    public void method(){
        System.out.println("hello");
    }

    @Around("pt()")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint ) throws Throwable {
        System.out.println("around before 。。。");
        Object proceed = proceedingJoinPoint.proceed();//调用原方法
        System.out.println("around after 。。。");
    }
}

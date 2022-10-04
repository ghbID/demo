//package com.example.demo.aspect;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
///**
// * @author Nikki
// * @create 2022-09-05 0:15
// */
//
//@Aspect
////@Component
//public class MyAspect {
//
//    private static final Logger logger = LoggerFactory.getLogger(MyAspect.class);
//
///*
////    @Pointcut("execution(* com.example.demo.service.MyService.foo())")
//    @Pointcut("execution(void com.example.demo.service.MyService.foo())")
//    public void pt() {
//
//    }
//
//    @Before("pt()")
//    public void before(){
//        System.out.println("before()");
////        logger.debug("before()");
//    }
//
//*/
//
//
//    @Before("execution(* com.example.demo.service.MyService.foo())")
////  @Before("execution(* com.example.demo.aspect.MyAspect.before())")
//    public void before(){
//
//        logger.debug("before()");
//    }
//
////    @Pointcut(value = "within(com.example.demo.service.*)")
////    public void aopDemo() {
////
////    }
//    /*  */
//
//}

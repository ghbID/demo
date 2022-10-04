//package com.example.demo.service;
//
//import com.example.demo.dao.UserDao;
//import com.example.demo.util.IdGeneratorSnowFlake;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.interceptor.TransactionAspectSupport;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
///**
// * @author Nikki
// * @create 2022-07-27 11:45
// */
//
//@Service
//public class UserServiceImpl2 implements UserService {
//    @Autowired
//    private UserDao userDao;
//
//    @Override
//    public String test() {
//        System.out.println();
//        return "impl2";
//    }
//
//    @Override
//    public String countUser() {
//        return null;
//    }
//
//    @Override
//    public void updateUser() {
//
//    }
//
//    @Override
//    public String getIDBySnowFlake() {
//        return null;
//    }
//}

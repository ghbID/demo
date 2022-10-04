package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserInfoDao;
import com.example.demo.pojo.User;
import com.example.demo.pojo.UserInfo;
import com.example.demo.service.MyService;
import com.example.demo.service.UserService;
import com.example.demo.util.AppConfig;
import com.example.demo.util.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserDao userDao;

    @Autowired
    UserService UserService;

    @Autowired
    UserInfoDao userInfoDao;

    @Autowired
    private MyBean myBean;

    @Autowired
    private AppConfig appConfig;
    @Autowired
    MyService myService;



    @Test
    void test6()  {
//        new MyService().foo();
        myService.foo();
    }

    @Test
    void test5()  {
        MyBean myBean = appConfig.myBean();
        myBean.test();

    }


    @Test
    void test4()  {
        myBean.test();

    }

    @Test
    void test3()  {

//        List<UserInfo> allUser = userInfoDao.findAllUser();
//        for(UserInfo user : allUser){
//            System.out.println(user.toString());
//        }
//        System.out.println("***********");
        UserInfo byUserId = userInfoDao.findByUserId(101);
        System.out.println(byUserId.toString());

    }


    @Test
    void test2()  {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            threadPool.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        threadPool.shutdown();
    }




    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    @Test
    void testAtomicInteger() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            atomicInteger = new AtomicInteger(0);
            Thread t1 = new Thread() {
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        atomicInteger.incrementAndGet();
                    }
                }

                ;
            };
            Thread t2 = new Thread() {
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        atomicInteger.incrementAndGet();
                    }
                }

                ;
            };
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(String.format("最终atomicInteger%s的值为：%s", i, atomicInteger));
        }

    }

    @Test
    public void test1(){
        //现在Base64编码   import java.util.Base64;
        String s = "helloworld";
        String encodeToString = Base64.getEncoder().encodeToString(s.getBytes());
        System.out.println(encodeToString);//aGVsbG93b3JsZA==
        //解码
        byte[] decode = Base64.getDecoder().decode(encodeToString);
        System.out.println(new String(decode));//helloworld

        Map m = new HashMap();
        m.put("","");

    }

//https://blog.csdn.net/AdamCafe/article/details/116979863

    @Test
    void contextLoads4() {
        UserService.updateUser();

    }

    @Test
    void contextLoads3() {
        User userById = userDao.findById(1);
        System.out.println(userById.toString());//User{id=1, username='mary', password='123'}
    }

    @Test
    void contextLoads2() {
        User user = new User();
        user.setUsername("chen");
        user.setPassword("007");
        int i = userDao.addUser(user);
        System.out.println(i);//1 == 成功插入
    }

    @Test
    void contextLoads1() {
        Map user = userDao.user();

        System.out.println(user.get("count") +" " + user.get("max"));
        System.out.println(user.get("avg") +" " + user.get("sum"));
    }

    @Test
    void contextLoads() {

//        System.out.println(userDao.countUser());
        ArrayList<String> list = new ArrayList<>();
        list.add("e");
        list.add("n");
        list.add("b");
        list.add("a");
        list.add("c");
        System.out.println(list.toString());
    }





}

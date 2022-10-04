package com.example.demo.qtz;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

@Component
@EnableAsync
public class SpringQtzTest {

    public static List list =new ArrayList<>();
    private int i;

    @Autowired
    UserDao userDao;


    @Async //多少给线程就有多少个被这个注解注解的方法
    @Scheduled(cron="*/10 * * * * ?")   //每10秒执行一次
    public void execute1() {
//        User byId = userDao.findById(1);
//        System.out.println(byId.toString());//对的

        method();

        System.out.println("A:"+ i +" "+Thread.currentThread().getName());


    }

    @Async //多少给线程就有多少个被这个注解注解的方法
    @Scheduled(cron="*/10 * * * * ?")   //每10秒执行一次
    public void execute2() {
        method();
        System.out.println("B:"+  i +" "+Thread.currentThread().getName());

    }

    public void method() {
        i++;
        list.add(i);//从0开始
    }



    static class A{


    }

    SpringQtzTest springQtzTest =new SpringQtzTest();

    public static void main(String[] args) {
//        A a = new A();
//        A aa = new A();
//        System.out.println(a == aa);


        Hashtable hashtable = new Hashtable();
//        HashMap hashtable = new HashMap();
        hashtable.put("key","key");
//        hashtable.put(null,null);
//        hashtable.put("key",null);
//        hashtable.put(null,"key");
        System.out.println(hashtable);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("1");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1");
        final int age = 10;
//        age = 20;
    }

}
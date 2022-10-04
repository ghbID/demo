package com.example.demo.service;

import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Nikki
 * @create 2022-07-29 15:14
 */


@Component
public class MultithreadScheduleTask {

    

    @Autowired
    UserDao userDao;


    //CronTrigger配置完整格式为： [秒] [分] [小时] [日] [月] [周] [年]
//    @Scheduled(cron="*/5 * * * * ?")   //每5秒执行一次
    @Scheduled(cron="*/5 58 15 29 7 ?")
    public void execute1() {
//        System.out.println("hello。。");
        System.out.println(userDao.countUser());

    }
}

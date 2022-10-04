package com.example.demo.controller;

import com.example.demo.pojo.UserDTO;
import com.example.demo.service.UserService;
//import com.example.demo.util.AppConfig;
import com.example.demo.util.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Nikki
 * @create 2022-07-27 11:40
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    @Autowired
//    private AppConfig appConfig;
    @Autowired
    private MyBean myBean;



    @RequestMapping("/snowflake")
    public String index(){
        return userService.getIDBySnowFlake();
    }

    @RequestMapping("/hello")
    public String hello(){
//        MyBean myBean = appConfig.myBean();
        myBean.test();
        return "hello";
    }

    @RequestMapping("/getUserList")
    public void getUserList(UserDTO userDTO){
        userService.getUserList(userDTO);
    }

    @RequestMapping("/countUser")
    public String countUser(){
        //        return null;
       return userService.countUser();

    }


    @RequestMapping("/updateUser")
    public String updateUser(){
        //        return null;
        userService.updateUser();
        return "hello";

    }



    public volatile static int countInt = 0 ;
    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.compareAndSet(atomicInteger.get(),1);
        System.out.println(atomicInteger);
        System.out.println(atomicInteger.get());

    }
    public static int binarySearch(int[] arr,int item){
        int low = 0;
        int high = arr.length -1;
        int index = -1;//找不到返回 -1
        while (low <= high){
            int mid =(low + high) / 2;
            int guess = arr[mid];
            if(guess == item){
                index = mid;
                break;
            }
            if (guess > item){
                high = mid -1;
            }

            if (guess < item){
                low = mid + 1;

            }
        }
        return  index;

    }

    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }


    /*  冒泡排序*/
//        int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
//        int[] arr = new int[]{43,32,76,-98};
//        int temp ;
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr.length - 1; j++) {
//                if(arr[j] > arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] +" ");
//
//        }




}

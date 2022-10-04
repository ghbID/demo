package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import com.example.demo.pojo.UserCondition;
import com.example.demo.pojo.UserDTO;
import com.example.demo.pojo.UserVO;
import com.example.demo.util.IdGeneratorSnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Nikki
 * @create 2022-07-27 11:45
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public static int i = 1;

    @Autowired
    private IdGeneratorSnowFlake idGenerator;



    public String getIDBySnowFlake(){
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {
            threadPool.submit(() ->{
                System.out.println(idGenerator.snowflakeId());
            }) ;
        }

        threadPool.shutdown();

        return "hello snowflake";
    }



//   @Transactional(rollbackFor=Exception.class)
    @Transactional
    public void updateUser() {

        try{
            userDao.updateUser("001",1);



            if(1 == 1){
                //               throw new RuntimeException("异常。。");
                System.out.println("hiiii~~~~");
            }
            Thread.sleep(1000 * 20);

            userDao.updateUser("003",3);
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            //           System.out.println("hello....");
        }

//        System.out.println("hello....");
    }


    @Override
    public String test() {
        System.out.println();
        return "impl";
    }

    public String countUser(){

        // return null;
//        UserDao userDao = new UserDao();
        return userDao.countUser();
    }

    public static void main(String[] args) {
//        int i = UserServiceImpl.i;//
//
//        UserServiceImpl u =  new UserServiceImpl();

//        System.out.println(u.countUser());
/*
        Double:  0,3 - 0,2 = 0.09999999999999998
        Float:   0,3 - 0,2 = 0.10000001
        BigDecimal:  0,3 - 0,2 = 0.1
*//*
        Double a = new Double("0.3");
        Double b = new Double("0.2");


        BigDecimal c = new BigDecimal(0.3);
        BigDecimal d = new BigDecimal(0.2);
        BigDecimal subtract = c.subtract(d);
        System.out.println(subtract);

        BigDecimal e = new BigDecimal("0.3");
        BigDecimal f = new BigDecimal("0.2");
        BigDecimal subtract1 = e.subtract(f);
        System.out.println(subtract1);

*/

        ArrayList<User> users = new ArrayList<>();
        ArrayList<User> removeUsers = new ArrayList<>();
        User user;

        for (int j = 0; j < 10; j++) {

            if(j == 2 || j == 3){
                user = new User(j, "username", "123");

            }else {
                 user = new User(j, "username", "000");
            }

            users.add(user);
        }

        for (int j = 0; j < users.size(); j++) {

            if("123".equals(users.get(j).getPassword())){


                removeUsers.add(users.get(j));

                //users.remove(users.get(j));

            }
        }

        users.removeAll(removeUsers);

        for (int j = 0; j < users.size(); j++) {
            System.out.println(users.get(j).toString());

        }


        LinkedList<Object> objects = new LinkedList<>();
        objects.add("1a");
        System.out.println(objects.get(0));
    }

    public List<UserVO> getUserList(UserDTO userDTO){
        UserCondition con = new UserCondition();
        // userDto 和con 转换
        con.setUserCode(userDTO.getUserCode());
        return userDao.getUserList(con);
    }
}

package com.example.demo.dao;

import com.example.demo.pojo.User;
import com.example.demo.pojo.UserCondition;
import com.example.demo.pojo.UserVO;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Nikki
 * @create 2022-07-27 11:49
 */
public interface UserDao {

    @Select("select count(*) from users")   //方式一
//    public Integer countUser(); 方式一 √
    public String countUser();  //方式二 √ 类型不同 但是都能返回正确的结果


    public HashMap user();

    public int addUser(User user);

    public User findById(int id);


    public int updateUser(String password,int id);



    List<UserVO> getUserList(UserCondition con);
}

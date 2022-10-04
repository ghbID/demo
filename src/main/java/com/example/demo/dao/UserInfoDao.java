package com.example.demo.dao;

import com.example.demo.pojo.User;
import com.example.demo.pojo.UserInfo;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * @author Nikki
 * @create 2022-07-27 11:49
 */
public interface UserInfoDao {


    public List<UserInfo> findAllUser();

    public UserInfo findByUserId(int userId);



}

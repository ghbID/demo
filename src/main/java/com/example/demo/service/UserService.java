package com.example.demo.service;

import com.example.demo.pojo.UserDTO;
import com.example.demo.pojo.UserVO;

import java.util.List;

/**
 * @author Nikki
 * @create 2022-07-27 11:45
 */
public interface UserService {
    public String test();

    public String countUser();

    public void updateUser();

    public String getIDBySnowFlake();

    List<UserVO> getUserList(UserDTO userDTO);
}

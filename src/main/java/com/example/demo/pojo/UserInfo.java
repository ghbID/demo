package com.example.demo.pojo;

/**
 * @author Nikki
 * @create 2022-07-27 11:57
 */
public class UserInfo {

    private int id;
    private int userId;
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}

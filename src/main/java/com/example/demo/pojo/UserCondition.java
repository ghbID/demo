package com.example.demo.pojo;

/**
 * @author Nikki
 * @create 2022-09-24 11:51
 */
public class UserCondition extends BaseCondition {

    private String userName;

    private String userCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}

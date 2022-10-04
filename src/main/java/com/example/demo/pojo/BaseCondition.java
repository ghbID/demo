package com.example.demo.pojo;

import java.util.Date;

/**
 * @author Nikki
 * @create 2022-09-24 12:29
 */
public class BaseCondition {
/**
 * @Description
 * @param
 * @param
 * @return
 */
//通用查询条件
  private  String  searchWork;

  //组织id
  private  String  orgId;
    //权限
  private String permissionId;
  //创建人
  private String creator;
  // 最后操作人
  private String lastUpdator;
  //业务id
  private  String bussId;
  // 通用查询日期
  private Date bussDate;
  //扩展字段1
  private String extendsOne;


    public String getSearchWork() {
        return searchWork;
    }

    public void setSearchWork(String searchWork) {
        this.searchWork = searchWork;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getLastUpdator() {
        return lastUpdator;
    }

    public void setLastUpdator(String lastUpdator) {
        this.lastUpdator = lastUpdator;
    }

    public String getBussId() {
        return bussId;
    }

    public void setBussId(String bussId) {
        this.bussId = bussId;
    }

    public Date getBussDate() {
        return bussDate;
    }

    public void setBussDate(Date bussDate) {
        this.bussDate = bussDate;
    }
}

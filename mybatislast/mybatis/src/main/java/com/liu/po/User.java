package com.liu.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*
 *   属性名和表中的字段名对应
 *
 *  要实现mybatis的二级缓存(Mapper级别的缓存User类要实现序列化接口),因为二级缓存的存储介质不确定
 * */
public class User implements Serializable {
    private int id;
    private String username;
    private String sex;
    private Date birthday;
    private String address;

    //添加订单信息,用户创建的订单列表
    private List<Orders> ordersList;

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }


}

package com.liu.mapper;

import com.liu.bz.UserBz;
import com.liu.po.User;
import com.liu.po.UserEx;

import java.util.List;

public interface UserMapper {

    public List<UserEx> queryUserZH(UserBz userBz) throws Exception;

    public int queryUserCount(UserBz userBz) throws Exception;

    public List<UserEx> queryUserByMoreIds(UserBz userBz) throws Exception;

    public List<UserEx> queryUserByIds(UserBz userBz) throws Exception;

    public List<User> queryUserToOrders() throws Exception;

    public List<User> queryUserToOrderdetail() throws  Exception;

    public List<User> queryUserToItems() throws Exception;
}

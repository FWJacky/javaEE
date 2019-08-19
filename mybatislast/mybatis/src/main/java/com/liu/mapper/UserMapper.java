package com.liu.mapper;

import com.liu.po.User;

public interface UserMapper {

    public User queryUserById(int id) throws Exception;

    public void updateUser(User user3) throws Exception;
}

package com.liu.mapper;

import com.liu.po.User;
import com.liu.po.UserEx;
import com.liu.po.UserVO;

import java.util.List;

public interface UserMapper {

    public void deleteUserById(Integer id) throws Exception;

    public void modifyUser(User user) throws Exception;

    User queryUserById(Integer id) throws Exception;

    void insertUser(User user) throws Exception;
}

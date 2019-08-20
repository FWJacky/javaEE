package com.liu.service;

import com.liu.mapper.UserExMapper;
import com.liu.mapper.UserMapper;
import com.liu.po.User;
import com.liu.po.UserEx;
import com.liu.po.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author L
 * @Date 2019/8/12 19:00
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserExMapper userExMapper;

    @Override
    public List<UserEx> queryUserListService(UserVO userVO) throws Exception {
        return userExMapper.queryUserList(userVO);
    }

    @Override
    public void deleteUserByIdsService(Integer[] ids) throws Exception {
        userExMapper.deleteUserByIds(ids);
    }

    @Override
    public void deleteUserByIdService(Integer id) throws Exception {
        userMapper.deleteUserById(id);
    }

    @Override
    public User queryUserByIdService(int checkBox) throws Exception {
        return userMapper.queryUserById(checkBox);
    }

    @Override
    public List<UserEx> queryUserByIdsService(Integer[] ids) throws Exception {
        return userExMapper.queryUserByIds(ids);
    }

    @Override
    public void modifyUserService(Integer id,User user) throws Exception {
        userMapper.modifyUser(user);
    }

    @Override
    public void addUser(UserEx userEx) throws Exception {
        userMapper.insertUser(userEx);
    }

    @Override
    public void modifyUsersService(List<UserEx> userExList) throws Exception {
        userExMapper.modifyUsers(userExList);
    }

}

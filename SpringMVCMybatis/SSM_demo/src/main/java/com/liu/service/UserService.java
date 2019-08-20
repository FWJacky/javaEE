package com.liu.service;

import com.liu.po.User;
import com.liu.po.UserEx;
import com.liu.po.UserVO;

import java.util.List;

public interface UserService {
    public List<UserEx> queryUserListService(UserVO userVO) throws Exception;

    public void deleteUserByIdsService(Integer[] ids) throws Exception;

    public void deleteUserByIdService(Integer id) throws Exception;

    User queryUserByIdService(int checkBox) throws Exception;

    List<UserEx> queryUserByIdsService(Integer[] ids) throws Exception;

    void modifyUserService(Integer id,User user) throws Exception;

    void addUser(UserEx userEx) throws Exception;

    void modifyUsersService(List<UserEx> userExList) throws Exception;
}

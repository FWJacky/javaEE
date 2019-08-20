package com.liu.mapper;

import com.liu.po.User;
import com.liu.po.UserEx;
import com.liu.po.UserVO;

import java.util.List;

public interface UserExMapper {

    public List<UserEx> queryUserList(UserVO userVO) throws Exception;

    public void deleteUserByIds(Integer[] ids) throws Exception;

    void modifyUsers(List<UserEx> userExList) throws Exception;

    List<UserEx> queryUserByIds(Integer[] ids) throws Exception;
}

package com.liu;

import com.liu.bz.UserBz;
import com.liu.mapper.UserMapper;
import com.liu.po.UserEx;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyBatisTest
 * @Description TODO
 * @Author L
 * @Date 2019/8/9 15:52
 * @Version 1.0
 **/
public class MyBatisTest {

    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void initTest() {
        String file = "sqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserEx userEx = new UserEx();
            userEx.setSex("2");
            userEx.setUsername("vin");
            UserBz userBz = new UserBz();
            userBz.setUserEx(userEx);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<UserEx> userExList = userMapper.queryUserZH(null);
            System.out.println(userExList);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryUserCountTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserEx userEx = new UserEx();
            userEx.setSex("2");
            userEx.setUsername("vin");
            UserBz userBz = new UserBz();
            userBz.setUserEx(userEx);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int flag = userMapper.queryUserCount(null);
            System.out.println(flag);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryUserByMoreIdsTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            List<Integer> ids = new ArrayList<>();
            ids.add(24);
            ids.add(25);
            ids.add(26);
            UserBz userBz = new UserBz();
            userBz.setMoreIds(ids);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<UserEx> userExList = userMapper.queryUserByMoreIds(userBz);
            System.out.println(userExList);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryUserByIdsTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            List<Integer> ids = new ArrayList<>();
            ids.add(24);
            ids.add(26);
            UserBz userBz = new UserBz();
            userBz.setMoreIds(ids);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<UserEx> userExList = userMapper.queryUserByIds(userBz);
            System.out.println(userExList);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

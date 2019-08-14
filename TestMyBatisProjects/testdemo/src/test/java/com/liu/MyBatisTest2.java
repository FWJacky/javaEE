package com.liu;

import com.liu.mapper.OrdersMapper;
import com.liu.mapper.UserMapper;
import com.liu.po.Orders;
import com.liu.po.OrdersEx;
import com.liu.po.User;
import com.liu.po.UserEx;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName MyBatisTest2
 * @Description TODO
 * @Author L
 * @Date 2019/8/9 19:26
 * @Version 1.0
 **/
public class MyBatisTest2 {

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
    public void queryOrderToUserTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
            List<OrdersEx> ordersExes = ordersMapper.queryOrderToUser();
            System.out.println(ordersExes);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void queryOrderToUserTest2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
            List<Orders> ordersList = ordersMapper.queryOrderToUser2();
            System.out.println(ordersList);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void queryOrderToOrderdetailTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
            List<Orders> ordersList = ordersMapper.queryOrderToOrderdetail();
            System.out.println(ordersList);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void queryOrderToItemsTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
            List<Orders> ordersList = ordersMapper.queryOrderToItems();
            System.out.println(ordersList);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void queryUserToOrdersTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.queryUserToOrders();
            System.out.println(userList);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryUserToOrderdetailTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.queryUserToOrderdetail();
            System.out.println(userList);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void queryUserToItemsTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.queryUserToItems();
            System.out.println(userList);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package com.liu;

import com.liu.mapper.OrdersMapper;
import com.liu.mapper.UserMapper;
import com.liu.po.Orders;
import com.liu.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName MyBatisTest
 * @Description TODO
 * @Author L
 * @Date 2019/8/16 0:01
 * @Version 1.0
 **/
public class MyBatisTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void initTest() {
        try {
            String file = "sqlMapConfig.xml";
            InputStream is = Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void lazyLoadTest() throws Exception{
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        List<Orders> ordersList = ordersMapper.queryOrdersLazyLoad();

        for (Orders orders : ordersList) {
            User user = orders.getUser();
            System.out.println(user);
        }
        sqlSession.close();
    }

    // 测试一级缓存
    @Test
    public void cacheTest() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 第一次请求
        User user = userMapper.queryUserById(27);
        System.out.println(user);

        // 第二次请求
        User user1 = userMapper.queryUserById(27);
        System.out.println(user1);
        sqlSession.close();
    }

    @Test
    public void cacheIITest() throws Exception {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        // 第一次请求
        User user1 = userMapper1.queryUserById(27);
        System.out.println(user1);
        sqlSession1.close(); // 只有关闭，才能写入二级缓存区域

        // 清空缓存
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        User user3 = userMapper3.queryUserById(27);
        user3.setUsername("YYYYYY");
        userMapper3.updateUser(user3);
        sqlSession3.commit();
        sqlSession3.close();

        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        // 第二次请求
        User user2 = userMapper2.queryUserById(27);
        System.out.println(user2);
        sqlSession2.close();
    }
}

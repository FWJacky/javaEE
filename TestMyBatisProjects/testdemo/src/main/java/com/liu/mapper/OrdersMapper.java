package com.liu.mapper;

import com.liu.po.Orders;
import com.liu.po.OrdersEx;
import com.liu.po.User;

import java.util.List;

public interface OrdersMapper {

    public List<OrdersEx> queryOrderToUser()throws Exception;

    public List<Orders> queryOrderToUser2()throws Exception;

    public List<Orders> queryOrderToOrderdetail() throws Exception;

    public List<Orders> queryOrderToItems() throws Exception;


}

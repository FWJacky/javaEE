package com.liu.mapper;

import com.liu.po.Orders;

import java.util.List;

public interface OrdersMapper {

    public List<Orders> queryOrdersLazyLoad() throws Exception;
}

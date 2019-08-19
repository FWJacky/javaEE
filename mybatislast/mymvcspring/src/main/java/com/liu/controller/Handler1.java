package com.liu.controller;


import com.liu.vo.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Handler1
 * @Description TODO
 * @Author L
 * @Date 2019/8/15 22:35
 * @Version 1.0
 **/

public class Handler1 implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        /*
         *  模拟数据库
         *
         **/
        List<Items> itemsList = new ArrayList<>();
        Items items = new Items();
        items.setItemsId(1);
        items.setItemsName("liu");
        items.setItemsPrice(200);

        Items items1 = new Items();
        items1.setItemsId(2);
        items1.setItemsName("liu2");
        items1.setItemsPrice(200);

        Items items2 = new Items();
        items2.setItemsId(3);
        items2.setItemsName("liu3");
        items2.setItemsPrice(200);

        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(itemsList);
        modelAndView.setViewName("showItemsList");
        return modelAndView;
    }
}

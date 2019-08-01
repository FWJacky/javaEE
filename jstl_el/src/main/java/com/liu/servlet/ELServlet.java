package com.liu.servlet;

import com.liu.vo.Group;
import com.liu.vo.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/elServlet")
public class ELServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 测试EL表达式
        // 测试普通字符串
        request.setAttribute("strKey", "what!");

        // 测试结构体
        Group group = new Group();
        group.setgName("RockClass");

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("Liu");
        userInfo.setGroup(group);
        request.setAttribute("userInfoKey",userInfo);

        //  测试字符数组
        String[] strArr = new String[]{"aa","bb","cc","dd"};
        request.setAttribute("strArrKey", strArr);

        // 测试自定义数组
        UserInfo[] userInfos = new UserInfo[5];
        for (int i = 0; i < userInfos.length; i++) {
            UserInfo userInf = new UserInfo();
            userInf.setUsername("U_"+i);
            userInfos[i] = userInf;
        }
        request.setAttribute("userInfosKey",userInfos);

        // 跳转
        request.getRequestDispatcher("jstl_el.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

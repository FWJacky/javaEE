package com.liu.servlet;

import com.liu.model.EmployeeInfoServiceImpl;
import com.liu.model.IEmployeeInfoService;
import com.liu.vo.Department;
import com.liu.vo.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @ClassName SelectServlet
 * @Description TODO
 * @Author L
 * @Date 2019/8/1 21:11
 * @Version 1.0
 **/
@WebServlet("/selectServlet")
public class SelectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        // 获取页面参数
        int employeeId = Integer.parseInt(req.getParameter("employeeId"));

        IEmployeeInfoService employeeInfoService = new EmployeeInfoServiceImpl();
        Map<Employee, Department> rs = employeeInfoService.selectRs(employeeId);
        if (rs.size() != 0) {
            for (Employee employee : rs.keySet()) {
                Department department = rs.get(employee);
                req.setAttribute("employee", employee);
                req.setAttribute("department", department);
                req.getRequestDispatcher("success.jsp").forward(req, resp);
            }
        } else {
            req.getRequestDispatcher("failure.jsp").forward(req, resp);
        }
    }
}

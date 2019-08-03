package com.liu.model;

import com.liu.dao.EmployeeDAO;
import com.liu.vo.Department;
import com.liu.vo.Employee;

import java.util.Map;

/**
 * @ClassName EmployeeInfoServiceImpl
 * @Description TODO
 * @Author L
 * @Date 2019/8/1 21:30
 * @Version 1.0
 **/
public class EmployeeInfoServiceImpl implements IEmployeeInfoService{

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    @Override
    public Map<Employee, Department> selectRs(int employeeId) {
        return employeeDAO.selectRs(employeeId);
    }
}

package com.liu.model;

import com.liu.vo.Department;
import com.liu.vo.Employee;

import java.sql.ResultSet;
import java.util.Map;

/**
 * @ClassName IEmployeeInfoService
 * @Description TODO
 * @Author L
 * @Date 2019/8/1 21:15
 * @Version 1.0
 **/
public interface IEmployeeInfoService {

    public Map<Employee, Department> selectRs(int employeeId);
}

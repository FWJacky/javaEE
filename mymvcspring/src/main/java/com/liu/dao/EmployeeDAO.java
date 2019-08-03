package com.liu.dao;

import com.liu.db.DbManager;
import com.liu.vo.Department;
import com.liu.vo.Employee;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName EmployeeDAO
 * @Description TODO
 * @Author L
 * @Date 2019/8/1 21:17
 * @Version 1.0
 **/
public class EmployeeDAO {

    public Map<Employee,Department> selectRs(int employeeId) {
        String str = "select employee.employeeId,employee.employeeName,employee.departNum,department.departId,department.departName" +
                " from employee,department where employee.employeeId = '" + employeeId + "' and employee.departNum = department.departId";
        Employee employee = new Employee();
        Department department = new Department();
        Map<Employee,Department> map = new HashMap<>();
        try {
            DbManager dbManager = new DbManager();
            ResultSet rs = dbManager.queryMethod(str);
            while(rs.next()) {
                employee.setEmployeeId(rs.getInt("employeeId"));
                employee.setEmployeeName(rs.getString("employeeName"));
                employee.setDepartNum(rs.getInt("departNum"));
                department.setDepartId(rs.getInt("departId"));
                department.setDepartName(rs.getString("departName"));
                map.put(employee,department);
            }
            return map;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}

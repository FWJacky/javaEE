package com.liu.vo;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author L
 * @Date 2019/8/1 21:10
 * @Version 1.0
 **/
public class Employee {
    private int employeeId;
    private String employeeName;
    private int departNum;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getDepartNum() {
        return departNum;
    }

    public void setDepartNum(int departNum) {
        this.departNum = departNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", departNum=" + departNum +
                '}';
    }
}

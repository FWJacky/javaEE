package com.liu.vo;

/**
 * @ClassName Department
 * @Description TODO
 * @Author L
 * @Date 2019/8/1 21:10
 * @Version 1.0
 **/
public class Department {
    private int departId;
    private String departName;

    public int getDepartId() {
        return departId;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departId=" + departId +
                ", departName='" + departName + '\'' +
                '}';
    }
}

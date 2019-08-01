package com.liu.vo;

/**
 * @ClassName Group
 * @Description TODO
 * @Author L
 * @Date 2019/7/27 20:00
 * @Version 1.0
 **/
public class Group {
    private String gName;
    public Group() {

    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "gName='" + gName + '\'' +
                '}';
    }
}

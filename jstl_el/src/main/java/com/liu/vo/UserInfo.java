package com.liu.vo;

/**
 * @ClassName UserInfo
 * @Description TODO
 * @Author L
 * @Date 2019/7/27 20:00
 * @Version 1.0
 **/
public class UserInfo {

    private String username;

    private Group group;

    public UserInfo() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", group=" + group +
                '}';
    }
}

package com.liu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @ClassName DbManager
 * @Description TODO
 * @Author L
 * @Date 2019/8/1 20:57
 * @Version 1.0
 **/
public class DbManager {
    private Connection conn = null;
    private Statement state = null;
    private ResultSet rs = null;

    private String username = "root";
    private String password = "072864";
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/mytest";

    public Connection getConnection() {
        try {
            Class.forName(driver);
            System.out.println("connection loading ....");
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("connection success ....");
            return conn;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public int nonQueryMethod(String strSql) {
        int flag = 0;
        try {
            conn = this.getConnection();
            state = conn.createStatement();
            flag = state.executeUpdate(strSql);
            return flag;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public ResultSet queryMethod(String strSql) {
        try {
            conn = this.getConnection();
            state = conn.createStatement();
            rs = state.executeQuery(strSql);
            return rs;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void closeDb() {

        try {
            if (rs != null) {
                rs.close();
            }
            if (state != null) {
                state.close();
            }
            if (conn != null) {
                conn.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}

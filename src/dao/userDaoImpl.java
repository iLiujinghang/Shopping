package dao;

import jdbcUtil.jdbcUtils;
import domain.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class userDaoImpl implements userDao {
    user user = new user();

    //查找到用户，如果存在，传入到user中，如果不存在，返回null
    @Override
    public user getUser(String user_id) {
        try {
            Connection conn = jdbcUtils.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from user where user_id=" + user_id;
            System.out.println("执行的SQL语句是" + sql);
            ResultSet rs = stmt.executeQuery(sql);
            if (!rs.next()) {
                return null;
            } else {
                System.out.println("用户名：" + rs.getString("user_name"));
                user.setUser_id(rs.getString("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setUser_psd(rs.getString("user_psd"));
                user.setUser_phone(rs.getString("user_phone"));
                user.setUser_add(rs.getString("user_add"));
            }
            jdbcUtils.release(conn);
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    //添加用户
    @Override
    public boolean insert(String id, String name, String pwd, String phone, String add){
        boolean bool = false;
        try {
            Connection conn = jdbcUtils.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from user where user_id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            if (!rs.next()) {
                sql = "insert into user values ('" + id + "','" + name + "','" + pwd +"','"+ phone+"','"+add +"')";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();
                sql = "insert into wallet values ('"+id+"',0)";
                pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();
                bool = true;
                System.out.println("注册成功");
            } else {
                bool = false;
                System.out.println("用户id已存在请重新输入");
            }
            jdbcUtils.release(conn);
            stmt.close();
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return bool;
    }

    //获取全部用户列表
    @Override
    public List<user> getAlluser () {
        List<user> userlist = new ArrayList<>();
        try {
            Connection conn = jdbcUtils.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from user";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                user user = new user();
                user.setUser_id(rs.getString("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setUser_psd(rs.getString("user_psd"));
                user.setUser_phone(rs.getString("user_phone"));
                user.setUser_add(rs.getString("user_add"));
                userlist.add(user);
            }
            jdbcUtils.release(conn);
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userlist;
    }

}

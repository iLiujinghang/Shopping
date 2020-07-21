package dao;

import jdbcUtil.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class buycarDaoImpl implements buycarDao {


    //向购物车添加商品
    @Override
    public boolean addgoods(String user_id, int goods_id, int goods_num){
        boolean bool = false;
        try{
            Connection conn = jdbcUtils.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from buycar where user_id = "+user_id+" and goods_id = "+goods_id+" and pay= 0";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()){
                System.out.println(rs.getInt(4));
                int num = rs.getInt(3);
                goods_num = goods_num+num;
                sql = "update buycar set goods_num = "+goods_num+" where user_id ="+user_id+" and goods_id ="+goods_id+" and pay= 0";
                System.out.println(sql);
                stmt.executeUpdate(sql);
            }else {
                sql = "insert into buycar values ('"+user_id+"',"+goods_id+","+goods_num+",0)";
                System.out.println(sql);
                stmt.executeUpdate(sql);
            }
            if (stmt.getUpdateCount()==1){
                bool = true;
            }
            jdbcUtils.release(conn);
            stmt.close();
            rs.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return bool;
    }
    //结账
    @Override
    public boolean payment(String user_id, int goods_id){
        boolean bool = false;
        try{
            Connection conn = jdbcUtils.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "update buycar set pay = 1 where user_id ="+user_id+" and goods_id="+goods_id+" and pay=0";
            stmt.executeUpdate(sql);
            if (stmt.getUpdateCount()==1){
                bool=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return bool;
    }
}

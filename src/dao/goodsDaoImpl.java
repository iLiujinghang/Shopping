package dao;

import domain.goods;
import jdbcUtil.jdbcUtils;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class goodsDaoImpl implements goodsDao {
    goods goods = new goods();

    //查询单个商品，并返回商品
    public goods select(String goods_id) {
        try {
            Connection conn = jdbcUtils.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from goods where goods_id = " + goods_id;
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(sql);
            rs.next();
            goods.setGoods_id(rs.getInt(1));
            goods.setGoods_type(rs.getString(2));
            goods.setGoods_name(rs.getString(3));
            goods.setGoods_price(rs.getInt(4));
            goods.setGoods_num(rs.getInt(5));
            jdbcUtils.release(conn);
            stmt.close();
            rs.close();
            System.out.println(goods);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return goods;
    }

    //向商品库添加商品
    public boolean insert() {
        boolean bool = false;
        try {
            Connection conn = jdbcUtils.getConnection();
            String sql = "insert into goods values(3,'化妆品','cc',170,20)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
            bool = true;
            System.out.println("插入成功！");
            jdbcUtils.release(conn);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }

    //进行修改库存
    public boolean update(String goods_id) {
        boolean bool = false;
        try {
            int nums = select(goods_id).getGoods_num();
            System.out.println("当前库存为:"+nums);
            if (nums == 0){
                System.out.println("商品已售罄！");
            }else {
                Connection conn = jdbcUtils.getConnection();
                nums = nums - 1;
                String sql = "update goods set goods_num =" + nums + " where goods_id =" + goods_id;
                PreparedStatement stmt = conn.prepareStatement(sql);
                System.out.println("现在将商品库存修改为:" + nums);
                stmt.executeUpdate();
                System.out.println("修改成功");
                bool = true;
                jdbcUtils.release(conn);
                stmt.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }

    //删除商品
    public void delete() {
        try {
            Connection conn = jdbcUtils.getConnection();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要删除的商品编号:");
            int num = sc.nextInt();
            String sql = "delete from goods where goods_id=" + num;
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("删除成功！");
            jdbcUtils.release(conn);
            stmt.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    //批量导入商品
    public boolean allinsert(File file, String name) {
        boolean bool = false;
        try {
            Connection conn = jdbcUtils.getConnection();
            String sql = "load data infile '" + file + "/" + name + "' into table goods;";
            System.out.println(sql);
            PreparedStatement stmt = conn.prepareStatement(sql);
            boolean i = stmt.execute();
            if (i == false) {
                bool = true;
                System.out.println("批量导入成功！");
            } else {
                bool = false;
                System.out.println("导入失败");
            }
            jdbcUtils.release(conn);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }

    //获取全部商品列表
    public List<goods> getAllgoods(){
        List<goods> goodslist = new ArrayList<>();
        try{
            Connection conn = jdbcUtils.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select * from goods";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                goods goods = new goods();
                goods.setGoods_id(rs.getInt("goods_id"));
                goods.setGoods_type(rs.getString("goods_type"));
                goods.setGoods_name(rs.getString("goods_name"));
                goods.setGoods_price(rs.getInt("goods_price"));
                goods.setGoods_num(rs.getInt("goods_num"));
                goodslist.add(goods);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return goodslist;
    }
}
//显示jdbc连接
//class selectAll extends Thread{
//	public void run() {
//		try {
//			Connection conn = jdbcUtils.getConnection();
//			System.out.println(conn);
//			jdbcUtils.release(conn);
//		}catch (Exception e) {
//			// TODO: handle exception
//			throw new RuntimeException(e);
//		}
//	}
//}
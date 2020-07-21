import dao.*;
import domain.goods;
import domain.user;
import service.userService;

import java.sql.SQLException;
import java.util.List;
//用来测试功能
public class main {
    public static void main(String[] args) throws SQLException {
        //添加用户
//        userDaoImpl add = new userDaoImpl();
//        add.insert("1000","liu","ljh323423");
//        System.out.println("主方法执行完毕");
        //获取一个用户
//        userDaoImpl rs = new userDaoImpl();
//        user user= rs.getUser("1");
//        System.out.println(user);
        //批量导入商品
//        goodsDaoImpl allinsert = new  goodsDaoImpl();
//        allinsert.allinsert();
        //获取所有用户
//        userDaoImpl userDao = new userDaoImpl();
//        List list = userDao.getAlluser();
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        //获取所有商品
//        goodsDao goodsDao = new goodsDaoImpl();
//        List list = ((goodsDaoImpl) goodsDao).getAllgoods();
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        //结账
//        buycarDao buycarDao = new buycarDaoImpl();
//        ((buycarDaoImpl) buycarDao).payment("1",1);
        //查询全部商品
//        goodsDao goodsDao = new goodsDaoImpl();
//        List<goods> list1 = goodsDao.getAllgoods();
//        for (int i = 0;i<list1.size();i++){
//            goods goods = list1.get(i);
//            int id = goods.getGoods_id();
//            System.out.println(id);
//        }
    }
}


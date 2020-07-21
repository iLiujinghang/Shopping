package service;

import dao.buycarDao;
import dao.buycarDaoImpl;
import dao.userDao;
import dao.userDaoImpl;

import java.sql.SQLException;

public class userServiceImpl implements userService {
    userDao userDao = new userDaoImpl();
    buycarDao buycarDao = new buycarDaoImpl();


    //登录并判断
    @Override
    public boolean Login(String id, String psd) {
        boolean bool = false;
        System.out.println("传入的值为:" + id + "," + psd);
        if (id == null || psd == null) {
            System.out.println("请输入完整");
        } else if (userDao.getUser(id) == null) {
            System.out.println("用户不存在");
        } else if (userDao.getUser(id) != null && psd.equals(userDao.getUser(id).getUser_psd())) {
            System.out.println("用户名存在，且密码正确");
            bool = true;
        } else {
            System.out.println("用户名存在，密码错误");
            bool = false;
        }
        return bool;
    }

    //注册并判断
    @Override
    public boolean regidtered(String id, String name, String psd, String phone, String add) throws SQLException {
        boolean bool = false;
        System.out.println("传入的注册值为" + id + name + psd);
        if (id == null || name == null || psd == null) return bool;
        if (userDao.insert(id, name, psd, phone, add)) {
            bool = true;
            System.out.println("最终注册成功");
        }
        return bool;
    }

    //添加商品到购物车
    @Override
    public boolean buycar(String user_id, int goods_id, int goods_num) {
        if (buycarDao.addgoods(user_id, goods_id, goods_num)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}

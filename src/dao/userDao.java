package dao;
import domain.user;

import java.util.List;

public interface userDao {
    user getUser(String id);//获取用户
    boolean insert(String id,String name,String psd,String phone,String add);//添加用户
    List<user> getAlluser ();//获得所有用户
}

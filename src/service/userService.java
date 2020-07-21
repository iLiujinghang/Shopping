package service;
import domain.user;

import java.sql.SQLException;

public interface userService {
    boolean Login(String id,String psd);//登录并判断
    boolean regidtered(String id,String name,String psd,String phone,String add) throws SQLException;//注册并判断
    boolean buycar(String user_id,int goods_id,int goods_num);
}

package dao;

/**
 * @author liujinghang
 */
public interface buycarDao {
    boolean addgoods(String user_id,int goods_id,int goods_num);
    boolean payment(String user_id,int goods_id);
}

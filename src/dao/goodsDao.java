package dao;

import domain.goods;

import java.io.File;
import java.util.List;

public interface goodsDao {
    goods select(String goods_id);//查询商品
    boolean insert();//添加商品
    boolean update(String goods_id);//修改库存
    void delete();//删除商品
    boolean allinsert(File file, String name);//批量导入商品
    List<goods> getAllgoods();//查找全部商品列表
}

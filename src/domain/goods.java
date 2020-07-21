package domain;

public class goods {
    private int goods_id;
    private String goods_type;
    private String goods_name;
    private int goods_price;
    private int goods_num;

    public goods(int goods_id, String goods_type, String goods_name, int goods_price, int goods_num) {
        super();
        this.goods_id = goods_id;
        this.goods_type = goods_type;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
        this.goods_num = goods_num;
    }

    public goods() {

    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(int goods_price) {
        this.goods_price = goods_price;
    }

    public int getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(int goods_num) {
        this.goods_num = goods_num;
    }

    @Override
    public String toString() {
        return "商品id:" + goods_id + ",商品类型:" + goods_type + ",商品名称:" + goods_name + ",商品价格:" + goods_price + ",库存:" + goods_num;
    }
}
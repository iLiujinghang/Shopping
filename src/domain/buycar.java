package domain;

public class buycar {
    private String user_id;
    private String goods_id;
    private int goods_num;
    private int pay;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public int getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(int goods_num) {
        this.goods_num = goods_num;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public buycar(String user_id, String goods_id, int goods_num, int pay) {
        super();
        this.user_id = user_id;
        this.goods_id = goods_id;
        this.goods_num = goods_num;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "buycar{" +
                "user_id='" + user_id + '\'' +
                ", goods_id='" + goods_id + '\'' +
                ", goods_num=" + goods_num +
                ", pay=" + pay +
                '}';
    }
}

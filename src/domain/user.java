package domain;

public class user {
    private String user_id;
    private String user_name;
    private String user_psd;
    private String user_phone;
    private String user_add;



    public user() {

    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_psd() {
        return user_psd;
    }
    public void setUser_psd(String user_psd) {
        this.user_psd = user_psd;
    }
    public String getUser_phone() {
        return user_phone;
    }
    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }
    public String getUser_add() {
        return user_add;
    }
    public void setUser_add(String user_add) {
        this.user_add = user_add;
    }

    public user(String user_id, String user_name, String user_psd, String user_phone, String user_add) {
        super();
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_psd = user_psd;
        this.user_phone = user_phone;
        this.user_add = user_add;
    }

    @Override
    public String toString() {
        return "用户ID:" + user_id + ",名字:" + user_name + ",密码:" + user_psd + ",电话:" + user_phone + ",地址:" + user_add;
    }
}
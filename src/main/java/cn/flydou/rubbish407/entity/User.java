package cn.flydou.rubbish407.entity;

/**
 * Created by Cheng on 2017/6/8.
 */
public class User {
    private int id;
    private String account;
    private String password;
    private String usertype;

    public User(int id, String account, String password, String usertype) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.usertype = usertype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}

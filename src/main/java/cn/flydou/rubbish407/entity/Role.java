package cn.flydou.rubbish407.entity;

/**
 * Created by Cheng on 2017/6/8.
 */
public class Role {
    private int id;
    private String usertype;

    public Role(int id, String usertype) {
        this.id = id;
        this.usertype = usertype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}

package cn.flydou.rubbish407.entity;

/**
 * Created by Cheng on 2017/6/8.
 */
public class Sex {
    private int id;
    private String sex;

    public Sex(int id, String sex) {
        this.id = id;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

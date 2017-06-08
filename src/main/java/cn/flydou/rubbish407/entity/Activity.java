package cn.flydou.rubbish407.entity;

/**
 * Created by Cheng on 2017/6/8.
 */
public class Activity {
    private int id;
    private int clubId;
    private String content;
    public Activity(int id, int clubid, String content) {
        this.id = id;
        this.clubId = clubId;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClubid() {
        return clubId;
    }

    public void setClubid(int clubid) {
        this.clubId = clubid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

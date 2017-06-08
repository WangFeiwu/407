package cn.flydou.rubbish407.entity;

import java.sql.Timestamp;

/**
 * Created by Cheng on 2017/6/8.
 */
public class Note {
    private int id;
    private String sender;
    private Integer isProcess;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer result;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Integer getIsProcess() {
        return isProcess;
    }

    public void setIsProcess(Integer isProcess) {
        this.isProcess = isProcess;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}

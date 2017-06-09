package cn.flydou.rubbish407.entity;

/**
 * Created by wanchenqi on 2017/6/8.
 */
public class Note {

    private int id;
    private String sender;
    private Boolean isProcess;
    private String startTime;
    private String endTime;
    private Boolean result;

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

    public Boolean getProcess() {
        return isProcess;
    }

    public void setProcess(Boolean process) {
        isProcess = process;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}

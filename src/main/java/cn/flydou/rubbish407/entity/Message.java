package cn.flydou.rubbish407.entity;

/**
 * Created by Cheng on 2017/6/8.
 */
public class Message {
    private int id;
    private String content;
    private String sender;
    private String receiver;

    public Message(int id, String content, String sender, String receiver) {
        this.id = id;
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}

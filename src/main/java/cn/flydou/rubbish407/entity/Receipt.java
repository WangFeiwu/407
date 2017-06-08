package cn.flydou.rubbish407.entity;

import java.sql.Timestamp;

/**
 * Created by Cheng on 2017/6/8.
 */
public class Receipt {
    private int id;
    private int receipterId;
    private String receipterName;
    private String content;
    private String receiptType;
    private String receiptfor;
    private Integer isProcess;
    private Timestamp processedTime;
    private int receipteNum;
    private String receipteType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReceipterId() {
        return receipterId;
    }

    public void setReceipterId(int receipterId) {
        this.receipterId = receipterId;
    }

    public String getReceipterName() {
        return receipterName;
    }

    public void setReceipterName(String receipterName) {
        this.receipterName = receipterName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public String getReceiptfor() {
        return receiptfor;
    }

    public void setReceiptfor(String receiptfor) {
        this.receiptfor = receiptfor;
    }

    public Integer getIsProcess() {
        return isProcess;
    }

    public void setIsProcess(Integer isProcess) {
        this.isProcess = isProcess;
    }

    public Timestamp getProcessedTime() {
        return processedTime;
    }

    public void setProcessedTime(Timestamp processedTime) {
        this.processedTime = processedTime;
    }

    public int getReceipteNum() {
        return receipteNum;
    }

    public void setReceipteNum(int receipteNum) {
        this.receipteNum = receipteNum;
    }

    public String getReceipteType() {
        return receipteType;
    }

    public void setReceipteType(String receipteType) {
        this.receipteType = receipteType;
    }
}

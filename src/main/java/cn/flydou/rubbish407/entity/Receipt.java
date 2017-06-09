package cn.flydou.rubbish407.entity;

/**
 * Created by wanchenqi on 2017/6/8.
 */
public class Receipt {
    private int id;
    private int receipterId;
    private String receipterName;
    private String content;
    private String receiptType;
    private String receiptfor;
    private boolean isProcessed;
    private String processedTime;
    private String receipteNum;
    private String receipteType;

    public int getId() {
        return id;
    }

    public int getReceipterId() {
        return receipterId;
    }

    public String getReceipterName() {
        return receipterName;
    }

    public String getContent() {
        return content;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public String getReceiptfor() {
        return receiptfor;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public String getProcessedTime() {
        return processedTime;
    }

    public String getReceipteNum() {
        return receipteNum;
    }

    public String getReceipteType() {
        return receipteType;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setReceipterId(int receipterId) {
        this.receipterId = receipterId;
    }

    public void setReceipterName(String receipterName) {
        this.receipterName = receipterName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public void setReceiptfor(String receiptfor) {
        this.receiptfor = receiptfor;
    }

    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }

    public void setProcessedTime(String processedTime) {
        this.processedTime = processedTime;
    }

    public void setReceipteNum(String receipteNum) {
        this.receipteNum = receipteNum;
    }

    public void setReceipteType(String receipteType) {
        this.receipteType = receipteType;
    }

}

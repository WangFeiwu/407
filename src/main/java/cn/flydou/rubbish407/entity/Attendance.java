package cn.flydou.rubbish407.entity;

/**
 * Created by wanchenqi on 2017/6/9.
 */
public class Attendance {
    private int id;
    private String attenderName;
    private String morningStart;
    private String morningEnd;
    private String afternoonStart;
    private String afternoonEnd;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAttenderName() {
        return attenderName;
    }

    public void setAttenderName(String attenderName) {
        this.attenderName = attenderName;
    }

    public String getMorningStart() {
        return morningStart;
    }

    public void setMorningStart(String morningStart) {
        this.morningStart = morningStart;
    }

    public String getMorningEnd() {
        return morningEnd;
    }

    public void setMorningEnd(String morningEnd) {
        this.morningEnd = morningEnd;
    }

    public String getAfternoonStart() {
        return afternoonStart;
    }

    public void setAfternoonStart(String afternoonStart) {
        this.afternoonStart = afternoonStart;
    }

    public String getAfternoonEnd() {
        return afternoonEnd;
    }

    public void setAfternoonEnd(String afternoonEnd) {
        this.afternoonEnd = afternoonEnd;
    }


}

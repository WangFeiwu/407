package cn.flydou.rubbish407.entity;

import java.sql.Timestamp;

/**
 * Created by Cheng on 2017/6/8.
 */
public class Attendance {
    private int id;
    private String attenderName;
    private Timestamp morningStart;
    private Timestamp morningEnd;
    private Timestamp afternoonStart;
    private Timestamp afternoonEnd;

    public Attendance(int id, String attenderName,
                      Timestamp morningStart, Timestamp morningEnd,
                      Timestamp afternoonStart, Timestamp afternoonEnd) {
        this.id = id;
        this.attenderName = attenderName;
        this.morningStart = morningStart;
        this.morningEnd = morningEnd;
        this.afternoonStart = afternoonStart;
        this.afternoonEnd = afternoonEnd;
    }

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

    public Timestamp getMorningStart() {
        return morningStart;
    }

    public void setMorningStart(Timestamp morningStart) {
        this.morningStart = morningStart;
    }

    public Timestamp getMorningEnd() {
        return morningEnd;
    }

    public void setMorningEnd(Timestamp morningEnd) {
        this.morningEnd = morningEnd;
    }

    public Timestamp getAfternoonStart() {
        return afternoonStart;
    }

    public void setAfternoonStart(Timestamp afternoonStart) {
        this.afternoonStart = afternoonStart;
    }

    public Timestamp getAfternoonEnd() {
        return afternoonEnd;
    }

    public void setAfternoonEnd(Timestamp afternoonEnd) {
        this.afternoonEnd = afternoonEnd;
    }
}

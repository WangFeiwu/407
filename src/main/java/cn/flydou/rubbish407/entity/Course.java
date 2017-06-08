package cn.flydou.rubbish407.entity;

import com.sun.jmx.snmp.Timestamp;

/**
 * Created by Cheng on 2017/6/8.
 */
public class Course {
    private int id;
    private String courseName;
    private String courseRoom;
    private Timestamp courseTime;
    private String courseType;

    public Course(int id, String courseName,
                  String courseRoom, Timestamp courseTime,
                  String courseType) {
        this.id = id;
        this.courseName = courseName;
        this.courseRoom = courseRoom;
        this.courseTime = courseTime;
        this.courseType = courseType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseRoom() {
        return courseRoom;
    }

    public void setCourseRoom(String courseRoom) {
        this.courseRoom = courseRoom;
    }

    public Timestamp getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Timestamp courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
}

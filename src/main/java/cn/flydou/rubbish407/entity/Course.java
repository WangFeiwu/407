package cn.flydou.rubbish407.entity;

/**
 * Created by wanchenqi on 2017/6/8.
 */
public class Course {
    private int id;
    private String courseName;
    private String courseRoom;
    private String courseTime;
    private String courseType;

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseRoom() {
        return courseRoom;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public String getCourseType() {
        return courseType;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseRoom(String courseRoom) {
        this.courseRoom = courseRoom;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }




}

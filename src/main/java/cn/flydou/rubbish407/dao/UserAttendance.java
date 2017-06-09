package cn.flydou.rubbish407.dao;


import org.apache.ibatis.annotations.Param;
import cn.flydou.rubbish407.entity.Attendance;
/**
 * Created by wanchenqi on 2017/6/9.
 */
public interface UserAttendance {
    Attendance queryAttender(@Param("id") int id);

    public void addNewAttendance(Attendance attendance);

    public void deleteAttendanceById(Attendance attendance);

    public void updateAttendance(Attendance attendance);
}

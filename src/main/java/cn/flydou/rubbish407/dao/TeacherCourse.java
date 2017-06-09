package cn.flydou.rubbish407.dao;

import org.apache.ibatis.annotations.Param;
import cn.flydou.rubbish407.entity.Course;
/**
 * Created by wanchenqi on 2017/6/8.
 */
public interface TeacherCourse {

    Course showCourse(@Param("id") int id);

    public void insertNewCourse(TeacherCourse course);

    public void deleteCourseById(TeacherCourse course);

    public void updateCourse(TeacherCourse course);

}

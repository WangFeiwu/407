package cn.flydou.rubbish407.dao;

import org.apache.ibatis.annotations.Param;
import cn.flydou.rubbish407.entity.Note;
/**
 * Created by wanchenqi on 2017/6/8.
 */
public interface NoteList {

    Note queryNote(@Param("id") int id);

    public void createNewNote(NoteList noteList);

    public void deleteCourseById(NoteList noteList);

    public void updateCourse(NoteList noteList);
}

package com.yujr.cms.dao;

import com.yujr.cms.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao {
    int deleteByPrimaryKey(Integer tId);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(Integer tId);

    List<Teacher> selectAllTeachers();

    int updateByPrimaryKey(Teacher record);
}
package com.yujr.cms.dao;

import com.yujr.cms.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao {
    int deleteByPrimaryKey(Integer tId);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(Integer tId);

    int updateByPrimaryKey(Teacher record);
}
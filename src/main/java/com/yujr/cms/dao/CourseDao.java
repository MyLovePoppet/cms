package com.yujr.cms.dao;

import com.yujr.cms.entity.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao {
    int deleteByPrimaryKey(Integer cId);

    int insert(Course record);

    Course selectByPrimaryKey(Integer cId);

    int updateByPrimaryKey(Course record);
}
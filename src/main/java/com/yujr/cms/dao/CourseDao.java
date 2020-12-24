package com.yujr.cms.dao;

import com.yujr.cms.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao {
    int deleteByPrimaryKey(Integer cId);

    int insert(Course record);

    Course selectByPrimaryKey(Integer cId);

    List<Course> selectAllCourses();

    int updateByPrimaryKey(Course record);
}
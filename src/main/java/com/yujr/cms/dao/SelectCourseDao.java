package com.yujr.cms.dao;

import com.yujr.cms.entity.SelectCourse;

public interface SelectCourseDao {
    int deleteByPrimaryKey(Integer scId);

    int insert(SelectCourse record);

    SelectCourse selectByPrimaryKey(Integer scId);

    int updateByPrimaryKey(SelectCourse record);
}
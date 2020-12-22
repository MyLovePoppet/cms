package com.yujr.cms.dao;

import com.yujr.cms.entity.CourseSchedule;

public interface CourseScheduleDao {
    int deleteByPrimaryKey(Integer csId);

    int insert(CourseSchedule record);

    CourseSchedule selectByPrimaryKey(Integer csId);

    int updateByPrimaryKey(CourseSchedule record);
}
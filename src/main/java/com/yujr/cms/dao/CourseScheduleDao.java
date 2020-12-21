package com.yujr.cms.dao;

import com.yujr.cms.entity.CourseSchedule;
import com.yujr.cms.entity.CourseScheduleKey;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseScheduleDao {
    int deleteByPrimaryKey(CourseScheduleKey key);

    int insert(CourseSchedule record);

    CourseSchedule selectByPrimaryKey(CourseScheduleKey key);

    int updateByPrimaryKey(CourseSchedule record);
}
package com.yujr.cms.dao;

import com.yujr.cms.entity.CourseSchedule;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseScheduleDao {
    int deleteByPrimaryKey(Integer csId);

    int insert(CourseSchedule record);

    CourseSchedule selectByPrimaryKey(Integer csId);

    CourseSchedule selectByUniqueKey(@Param("cId") Integer cId, @Param("tId") Integer tId);

    int updateByPrimaryKey(CourseSchedule record);
}
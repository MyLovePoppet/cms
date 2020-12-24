package com.yujr.cms.dao;

import com.yujr.cms.entity.CourseSchedule;
import com.yujr.cms.entity.CourseScheduleFull;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseScheduleDao {
    int deleteByPrimaryKey(Integer csId);

    int insert(CourseSchedule record);

    CourseSchedule selectByPrimaryKey(Integer csId);

    CourseSchedule selectByUniqueKey(@Param("cId") Integer cId, @Param("tId") Integer tId);

    List<CourseScheduleFull> selectAllCourseSchedulesFully();

    int updateByPrimaryKey(CourseSchedule record);
}
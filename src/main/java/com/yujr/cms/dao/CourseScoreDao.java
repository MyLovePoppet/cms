package com.yujr.cms.dao;

import com.yujr.cms.entity.CourseScore;
import com.yujr.cms.entity.CourseScoreFull;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseScoreDao {
    int deleteByPrimaryKey(Integer scId);

    int insert(CourseScore record);

    CourseScore selectByPrimaryKey(Integer scId);

    List<CourseScoreFull> selectAllCourseScoresFully();

    List<CourseScoreFull> selectCourseScoresByCourseScheduleId(@Param("csId") Integer csId);

    List<CourseScoreFull> selectCourseScoresByStudentId(@Param("sId") Integer sId);

    int updateByPrimaryKey(CourseScore record);
}
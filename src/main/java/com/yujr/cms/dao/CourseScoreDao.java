package com.yujr.cms.dao;

import com.yujr.cms.entity.CourseScore;
import com.yujr.cms.entity.CourseScoreFull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseScoreDao {
    int deleteByPrimaryKey(Integer scId);

    int insert(CourseScore record);

    CourseScore selectByPrimaryKey(Integer scId);

    List<CourseScoreFull> selectAllCourseScoresFully();

    int updateByPrimaryKey(CourseScore record);
}
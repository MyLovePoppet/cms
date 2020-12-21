package com.yujr.cms.dao;

import com.yujr.cms.entity.CourseScore;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseScoreDao {
    int deleteByPrimaryKey(Integer csId);

    int insert(CourseScore record);

    CourseScore selectByPrimaryKey(Integer csId);

    int updateByPrimaryKey(CourseScore record);
}
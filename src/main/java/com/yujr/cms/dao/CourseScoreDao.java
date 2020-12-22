package com.yujr.cms.dao;

import com.yujr.cms.entity.CourseScore;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseScoreDao {
    int deleteByPrimaryKey(Integer scId);

    int insert(CourseScore record);

    CourseScore selectByPrimaryKey(Integer scId);

    int updateByPrimaryKey(CourseScore record);
}
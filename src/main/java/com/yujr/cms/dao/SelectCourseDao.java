package com.yujr.cms.dao;

import com.yujr.cms.entity.SelectCourse;
import com.yujr.cms.entity.SelectCourseFull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SelectCourseDao {
    int deleteByPrimaryKey(Integer scId);

    int insert(SelectCourse record);

    SelectCourse selectByPrimaryKey(Integer scId);

    List<SelectCourseFull> selectAllSelectCoursesFully();

    int updateByPrimaryKey(SelectCourse record);
}
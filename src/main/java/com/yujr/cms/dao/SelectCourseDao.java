package com.yujr.cms.dao;

import com.yujr.cms.entity.SelectCourse;
import com.yujr.cms.entity.SelectCourseFull;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SelectCourseDao {
    int deleteByPrimaryKey(Integer scId);

    int insert(SelectCourse record);

    SelectCourse selectByPrimaryKey(Integer scId);

    List<SelectCourseFull> selectAllSelectCoursesFully();

    List<SelectCourseFull> selectSelectCoursesByCourseScheduleId(@Param("csId") Integer csId);

    List<SelectCourseFull> selectSelectCoursesByStudentId(@Param("sId") Integer sId);

    int updateByPrimaryKey(SelectCourse record);
}
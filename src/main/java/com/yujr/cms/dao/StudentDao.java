package com.yujr.cms.dao;

import com.yujr.cms.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {
    int deleteByPrimaryKey(Integer sId);

    int insert(Student record);

    Student selectByPrimaryKey(Integer sId);

    List<Student> selectAllStudents();

    int updateByPrimaryKey(Student record);
}
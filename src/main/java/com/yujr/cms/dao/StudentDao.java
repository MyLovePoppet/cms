package com.yujr.cms.dao;

import com.yujr.cms.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    int deleteByPrimaryKey(Integer sId);

    int insert(Student record);

    Student selectByPrimaryKey(Integer sId);

    int updateByPrimaryKey(Student record);
}
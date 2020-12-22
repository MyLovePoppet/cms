package com.yujr.cms.dao;

import com.yujr.cms.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {
    int deleteByPrimaryKey(String aName);

    int insert(Admin record);

    Admin selectByPrimaryKey(String aName);

    int updateByPrimaryKey(Admin record);
}
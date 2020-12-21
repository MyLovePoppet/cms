package com.yujr.cms;

import com.yujr.cms.dao.AdminDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmsApplicationTests {
    @Autowired
    AdminDao adminDao;

    @Test
    void contextLoads() {
        System.out.println(adminDao.selectByPrimaryKey("admin"));
    }

}

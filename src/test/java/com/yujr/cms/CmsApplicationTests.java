package com.yujr.cms;

import com.yujr.cms.commons.CodecUtils;
import com.yujr.cms.dao.AdminDao;
import com.yujr.cms.dao.CourseDao;
import com.yujr.cms.dao.StudentDao;
import com.yujr.cms.dao.TeacherDao;
import com.yujr.cms.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmsApplicationTests {
    @Autowired
    AdminDao adminDao;
    @Autowired
    CourseDao courseDao;
    @Autowired
    StudentDao studentDao;
    @Autowired
    TeacherDao teacherDao;


    @Test
    void contextLoads() {
        System.out.println(adminDao.selectByPrimaryKey("admin"));
        Course course = new Course(null, "高等代数", "高等代数是一门数学课", "数学", "数学");
        courseDao.insert(course);
        System.out.println(course);
    }

    @Test
    void testOnDelete() {
        //System.out.println(courseDao.deleteByPrimaryKey(1));
        //System.out.println(teacherDao.deleteByPrimaryKey(1));
        System.out.println(studentDao.deleteByPrimaryKey(2));
    }

    @Test
    void testCodec() {
        assert "21232f297a57a5a743894a0e4a801fc3".equals(CodecUtils.md5("admin"));
        //System.out.println(CodecUtils.md5("12346"));
    }
}

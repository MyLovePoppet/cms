package com.yujr.cms;

import com.yujr.cms.entity.*;
import com.yujr.cms.service.CmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmsApplicationTests {
    @Autowired
    CmsService cmsService;

    @Test
    void contextLoads() {
        Teacher teacher = new Teacher(null, "111", "123", "男", "无");
        cmsService.addTeacher(teacher);
        System.out.println(teacher);

        Student student = new Student(null, "111", "男", "123123", null, null, null);
        cmsService.addStudent(student);
        System.out.println(student);

        Course course = new Course(null, "222", null, null, null);
        cmsService.addCourse(course);

        CourseSchedule courseSchedule = new CourseSchedule(null, course.getCId(), teacher.getTId(), null, null, 1, 1, 0);
        cmsService.addCourseSchedule(courseSchedule);
        System.out.println(courseSchedule);

        SelectCourse selectCourse = new SelectCourse(null, student.getSId(), courseSchedule.getCsId());
        cmsService.addSelectCourse(selectCourse);
        System.out.println(selectCourse);

        System.out.println(cmsService.deleteCourse(course.getCId()));
        System.out.println(cmsService.deleteTeacher(teacher.getTId()));
        System.out.println(cmsService.deleteStudent(student.getSId()));
    }

}

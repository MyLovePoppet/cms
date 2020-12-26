package com.yujr.cms.controller;

import com.yujr.cms.entity.*;
import com.yujr.cms.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cms")
public class CmsController {
    @Autowired
    CmsService cmsService;

    /**
     * admin登录请求
     *
     * @param req 请求数据
     * @return AdminRes
     */
    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean adminLogin(@RequestBody Admin req) {
        return cmsService.doAdminLogin(req);
    }

    /**
     * teacher登录请求
     *
     * @param req 请求数据
     * @return AdminRes
     */
    @RequestMapping(value = "/teacherLogin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean teacherLogin(@RequestBody Teacher req) {
        return cmsService.doTeacherLogin(req);
    }
    /**
     * student登录请求
     *
     * @param req 请求数据
     * @return AdminRes
     */
    @RequestMapping(value = "/studentLogin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean teacherLogin(@RequestBody Student req) {
        return cmsService.doStudentLogin(req);
    }
    /**
     * 获取所有的教师
     *
     * @return TeacherRes
     */
    @RequestMapping(value = "/getAllTeachers", method = RequestMethod.GET)
    public List<Teacher> getAllTeachers() {
        return cmsService.getAllTeachers();
    }

    /**
     * 增加一个教师
     *
     * @param req 教师数据
     * @return TeacherRes
     */
    @RequestMapping(value = "/addTeacher", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int addTeacher(@RequestBody Teacher req) {
        return cmsService.addTeacher(req);
    }

    /**
     * 删除一个教师
     *
     * @param id 教师工号
     * @return 是否成功
     */
    @RequestMapping(value = "/deleteTeacher", method = RequestMethod.POST)
    public boolean deleteTeacher(@RequestParam int id) {
        return cmsService.deleteTeacher(id);
    }

    /**
     * 修改一个教师
     *
     * @param req 教师数据
     * @return 是否成功
     */
    @RequestMapping(value = "/updateTeacher", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean updateTeacher(@RequestBody Teacher req) {
        return cmsService.updateTeacher(req);
    }

    /**
     * 获取所有的学生
     *
     * @return student res
     */
    @RequestMapping(value = "/getAllStudents", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return cmsService.getAllStudents();
    }

    /**
     * 增加一个学生
     *
     * @param req 请求
     * @return 学生id
     */
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int addStudent(@RequestBody Student req) {
        return cmsService.addStudent(req);
    }

    /**
     * 删除一个学生
     *
     * @param id 学生号
     * @return 是否成功
     */
    @RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
    public boolean deleteStudent(@RequestParam int id) {
        return cmsService.deleteStudent(id);
    }

    /**
     * 修改一个学生
     *
     * @param req 教师数据
     * @return 是否成功
     */
    @RequestMapping(value = "/updateStudent", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean updateTeacher(@RequestBody Student req) {
        return cmsService.updateStudent(req);
    }

    /**
     * 获取所有的课程
     *
     * @return course res
     */
    @RequestMapping(value = "/getAllCourses", method = RequestMethod.GET)
    public List<Course> getAllCourses() {
        return cmsService.getAllCourses();
    }

    /**
     * 增加一门课程
     *
     * @param req 课程号
     * @return 开课id
     */
    @RequestMapping(value = "/addCourse", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int addCourse(@RequestBody Course req) {
        return cmsService.addCourse(req);
    }

    /**
     * 修改一个课程
     *
     * @param req 课程数据
     * @return 是否成功
     */
    @RequestMapping(value = "/updateCourse", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean updateTeacher(@RequestBody Course req) {
        return cmsService.updateCourse(req);
    }

    /**
     * 删除一门课程
     *
     * @param id 课程号
     * @return 是否成功
     */
    @RequestMapping(value = "/deleteCourse", method = RequestMethod.POST)
    public boolean deleteCourse(@RequestParam int id) {
        return cmsService.deleteCourse(id);
    }

    /**
     * 获取所有的开课详细信息
     *
     * @return student res
     */
    @RequestMapping(value = "/getAllCourseSchedulesFully", method = RequestMethod.GET)
    public List<CourseScheduleFull> getAllCourseSchedulesFully() {
        return cmsService.getAllCourseSchedulesFully();
    }

    /**
     * 获取所有的开课详细信息
     *
     * @return student res
     */
    @RequestMapping(value = "/getCourseSchedulesByTeacherId", method = RequestMethod.GET)
    public List<CourseScheduleFull> getCourseSchedulesByTeacherId(@RequestParam("id") int tId) {
        return cmsService.getCourseSchedulesByTeacherId(tId);
    }

    /**
     * 添加一门开课记录
     *
     * @param req 开课记录
     * @return 学号
     */
    @RequestMapping(value = "/addCourseSchedule", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int addCourseSchedule(@RequestBody CourseSchedule req) {
        return cmsService.addCourseSchedule(req);
    }

    /**
     * 删除一门开课记录
     *
     * @param id 开课记录号
     * @return 是否成功
     */
    @RequestMapping(value = "/deleteCourseSchedule", method = RequestMethod.POST)
    public boolean deleteCourseSchedule(@RequestParam int id) {
        return cmsService.deleteCourseSchedule(id);
    }

    /**
     * 修改一门开课记录
     *
     * @param req 开课记录
     * @return 是否修改成功
     */
    @RequestMapping(value = "/updateCourseSchedule", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean updateCourseScore(@RequestBody CourseSchedule req) {
        return cmsService.updateCourseSchedule(req);
    }

    /**
     * 获取所有选课的详细信息
     *
     * @return 所有开课的详细信息
     */
    @RequestMapping(value = "/getAllSelectCoursesFully", method = RequestMethod.GET)
    public List<SelectCourseFull> getAllSelectCoursesFully() {
        return cmsService.getAllSelectCoursesFully();
    }

    /**
     * 通过教师id获取所有选课的详细信息
     *
     * @return 所有开课的详细信息
     */
    @RequestMapping(value = "/getSelectCoursesByCourseScheduleId", method = RequestMethod.GET)
    public List<SelectCourseFull> getSelectCoursesByCourseScheduleId(@RequestParam("id") int t_id) {
        return cmsService.getSelectCoursesByCourseScheduleId(t_id);
    }

    /**
     * 通过学生id获取所有选课的详细信息
     *
     * @return 所有开课的详细信息
     */
    @RequestMapping(value = "/getSelectCoursesByStudentId", method = RequestMethod.GET)
    public List<SelectCourseFull> getSelectCoursesByStudentId(@RequestParam("id") int t_id) {
        return cmsService.getSelectCoursesByStudentId(t_id);
    }

    /**
     * 增加一个选课信息
     *
     * @param req 选课记录
     * @return 选课的id
     */
    @RequestMapping(value = "/addSelectCourse", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int addSelectCourse(@RequestBody SelectCourse req) {
        return cmsService.addSelectCourse(req);
    }

    /**
     * 删除一门选课
     *
     * @param id 选课的id
     * @return 是否成功
     */
    @RequestMapping(value = "/deleteSelectCourse", method = RequestMethod.POST)
    public boolean deleteSelectCourse(@RequestParam int id) {
        return cmsService.deleteSelectCourse(id);
    }

    /**
     * 修改一门课的得分结果
     *
     * @param record 得分记录
     * @return 是否修改成功
     */
    @RequestMapping(value = "/updateCourseScore", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public boolean updateCourseScore(@RequestBody CourseScore record) {
        return cmsService.updateCourseScore(record);
    }

    /**
     * 获取所有选课结果的详细信息
     *
     * @return 所有开课的详细信息
     */
    @RequestMapping(value = "/getAllCourseScoresFully", method = RequestMethod.GET)
    public List<CourseScoreFull> getAllCourseScoresFully() {
        return cmsService.getAllCourseScoresFully();
    }

    /**
     * 通过教师id获取所有选课结果的详细信息
     *
     * @return 所有开课的详细信息
     */
    @RequestMapping(value = "/getCourseScoresByCourseScheduleId", method = RequestMethod.GET)
    public List<CourseScoreFull> getCourseScoresByCourseScheduleId(@RequestParam("id") int id) {
        return cmsService.getCourseScoresByCourseScheduleId(id);
    }

    /**
     * 通过学生id获取所有选课结果的详细信息
     *
     * @return 所有开课的详细信息
     */
    @RequestMapping(value = "/getCourseScoresByStudentId", method = RequestMethod.GET)
    public List<CourseScoreFull> getCourseScoresByStudentId(@RequestParam("id") int id) {
        return cmsService.getCourseScoresByStudentId(id);
    }
}

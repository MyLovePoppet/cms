package com.yujr.cms.service;

import com.yujr.cms.commons.CodecUtils;
import com.yujr.cms.dao.*;
import com.yujr.cms.dto.AdminRes;
import com.yujr.cms.entity.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private TeacherDao teacherDao;
    @Autowired
    private CourseDao courseDao;
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private CourseScheduleDao courseScheduleDao;
    @Autowired
    private SelectCourseDao selectCourseDao;
    @Autowired
    private CourseScoreDao courseScoreDao;

    /**
     * 登录
     *
     * @param req 请求用户
     * @return 登录结果
     */
    public boolean doAdminLogin(Admin req) {
        log.info("doAdminLogin：" + req.toString());
        //先md5
        String a_name = req.getAName();
        String a_passwd = CodecUtils.md5(req.getAPasswd());
        //再登录
        Admin admin = adminDao.selectByPrimaryKey(a_name);
        return a_passwd.equals(admin.getAPasswd());
    }

    /**
     * 增加一个老师，返回其工号
     *
     * @param record 老师记录
     * @return 具体数据信息
     */
    public int addTeacher(Teacher record) {
        log.info("addTeacher: " + record.toString());
        //先进行md5加密
        record.setTPasswd(CodecUtils.md5(record.getTPasswd()));
        //再加入到数据库里面
        teacherDao.insert(record);
        return record.getTId();
    }

    /**
     * 删除一个老师
     *
     * @param t_id 工号
     * @return 是否成功
     */
    public boolean deleteTeacher(int t_id) {
        return teacherDao.deleteByPrimaryKey(t_id) == 1;
    }

    /**
     * 增加一个学生，返回其学号
     *
     * @param record 学生记录
     * @return 分配的学号
     */
    public int addStudent(Student record) {
        //先进行md5加密密码
        record.setSPasswd(CodecUtils.md5(record.getSPasswd()));
        //加入到数据库内
        studentDao.insert(record);
        //返回学号
        return record.getSId();
    }

    /**
     * 删除一个学生
     *
     * @param s_id 学号
     * @return 是否成功
     */
    public boolean deleteStudent(int s_id) {
        return studentDao.deleteByPrimaryKey(s_id) == 1;
    }

    /**
     * 增加一门课程
     *
     * @param record 课程号
     * @return 开课id
     */
    public int addCourse(Course record) {
        courseDao.insert(record);
        //返回课程id
        return record.getCId();
    }

    /**
     * 删除一门课程
     *
     * @param c_id 课程号
     * @return 是否成功
     */
    public boolean deleteCourse(int c_id) {
        if (courseDao.selectByPrimaryKey(c_id) != null) {
            courseDao.deleteByPrimaryKey(c_id);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 添加一门开课记录
     *
     * @param record 开课记录
     * @return 学号
     */
    public int addCourseSchedule(CourseSchedule record) {
        courseScheduleDao.insert(record);
        //返回记录号
        return record.getCsId();
    }

    /**
     * 删除一门开课记录
     *
     * @param cs_id 开课记录号
     * @return 是否成功
     */
    public boolean deleteCourseSchedule(int cs_id) {
        return courseScheduleDao.deleteByPrimaryKey(cs_id) == 1;
    }

    /**
     * 增加一个选课信息
     *
     * @param record 选课记录
     * @return 选课的id
     */
    public int addSelectCourse(SelectCourse record) {
        selectCourseDao.insert(record);
        return record.getScId();
    }

    /**
     * 删除一门选课
     *
     * @param sc_id 选课的id
     * @return 是否成功
     */
    public boolean deleteSelectCourse(int sc_id) {
        return selectCourseDao.deleteByPrimaryKey(sc_id) == 1;
    }

    /**
     * 修改一门课的得分结果
     *
     * @param record 得分记录
     * @return 是否修改成功
     */
    public boolean updateCourseScore(CourseScore record) {
        return courseScoreDao.updateByPrimaryKey(record) == 1;
    }
}

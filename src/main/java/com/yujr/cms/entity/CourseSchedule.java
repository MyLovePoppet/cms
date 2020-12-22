package com.yujr.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * course_schedule
 *
 * @author yujr
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseSchedule implements Serializable {
    /**
     * 开课记录号
     */
    private Integer csId;

    /**
     * 课程id,外键
     */
    private Integer cId;

    /**
     * 教师id,外键
     */
    private Integer tId;

    /**
     * 上课时间
     */
    private String csTime;

    /**
     * 上课地点
     */
    private String csLocation;

    /**
     * 学分
     */
    private Integer csCredits;

    /**
     * 学时
     */
    private Integer csPeriod;

    /**
     * 选课人数
     */
    private Integer csNum;

    private static final long serialVersionUID = 1L;
}
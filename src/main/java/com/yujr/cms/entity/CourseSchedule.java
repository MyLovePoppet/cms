package com.yujr.cms.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * course_schedule
 * @author yujr
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CourseSchedule extends CourseScheduleKey implements Serializable {
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
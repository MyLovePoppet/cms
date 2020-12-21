package com.yujr.cms.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * course_schedule
 * @author yujr
 */
@Data
public class CourseScheduleKey implements Serializable {
    /**
     * 课程id,外键
     */
    private Integer cId;

    /**
     * 教师id,外键
     */
    private Integer tId;

    private static final long serialVersionUID = 1L;
}
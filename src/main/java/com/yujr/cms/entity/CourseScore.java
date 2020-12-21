package com.yujr.cms.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * course_score
 * @author yujr
 */
@Data
public class CourseScore implements Serializable {
    /**
     * 选课id
     */
    private Integer csId;

    /**
     * 得分
     */
    private Integer score;

    private static final long serialVersionUID = 1L;
}
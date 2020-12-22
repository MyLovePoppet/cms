package com.yujr.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * course_score
 *
 * @author yujr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
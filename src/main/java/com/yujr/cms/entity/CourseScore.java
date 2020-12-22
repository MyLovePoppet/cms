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
@NoArgsConstructor
@AllArgsConstructor
public class CourseScore implements Serializable {
    /**
     * 选课id
     */
    private Integer scId;

    /**
     * 平时得分
     */
    private Integer normalScore;

    /**
     * 期末得分
     */
    private Integer finalExamScore;

    /**
     * 总评成绩
     */
    private Integer overallScore;

    private static final long serialVersionUID = 1L;
}
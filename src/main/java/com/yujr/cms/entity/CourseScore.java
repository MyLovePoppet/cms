package com.yujr.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("sc_id")
    private Integer scId;

    /**
     * 平时得分
     */
    @JsonProperty("normal_score")
    private Integer normalScore;

    /**
     * 期末得分
     */
    @JsonProperty("final_exam_score")
    private Integer finalExamScore;

    /**
     * 总评成绩
     */
    @JsonProperty("overall_score")
    private Integer overallScore;

    private static final long serialVersionUID = 1L;
}
package com.yujr.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("cs_id")
    private Integer csId;

    /**
     * 课程id,外键
     */
    @JsonProperty("c_id")
    private Integer cId;

    /**
     * 教师id,外键
     */
    @JsonProperty("t_id")
    private Integer tId;

    /**
     * 上课时间
     */
    @JsonProperty("cs_time")
    private String csTime;

    /**
     * 上课地点
     */
    @JsonProperty("cs_location")
    private String csLocation;

    /**
     * 学分
     */
    @JsonProperty("cs_credits")
    private Integer csCredits;

    /**
     * 学时
     */
    @JsonProperty("cs_period")
    private Integer csPeriod;

    /**
     * 选课人数
     */
    @JsonProperty("cs_num")
    private Integer csNum;

    private static final long serialVersionUID = 1L;
}
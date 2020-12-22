package com.yujr.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * course
 *
 * @author yujr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable {
    /**
     * id
     */
    @JsonProperty("c_id")
    private Integer cId;

    /**
     * 课程名
     */
    @JsonProperty("c_name")
    private String cName;

    /**
     * 课程介绍
     */
    @JsonProperty("c_introduction")
    private String cIntroduction;

    /**
     * 所属学院
     */
    @JsonProperty("c_major")
    private String cMajor;

    /**
     * 所属专业
     */
    @JsonProperty("c_college")
    private String cCollege;

    private static final long serialVersionUID = 1L;
}
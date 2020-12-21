package com.yujr.cms.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * course
 * @author yujr
 */
@Data
public class Course implements Serializable {
    /**
     * id
     */
    private Integer cId;

    /**
     * 课程名
     */
    private String cName;

    /**
     * 课程介绍
     */
    private String cIntroduction;

    /**
     * 所属学院
     */
    private String cMajor;

    /**
     * 所属专业
     */
    private String cCollege;

    private static final long serialVersionUID = 1L;
}
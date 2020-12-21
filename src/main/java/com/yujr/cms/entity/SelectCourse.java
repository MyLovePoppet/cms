package com.yujr.cms.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * select_course
 * @author yujr
 */
@Data
public class SelectCourse implements Serializable {
    /**
     * 选课id
     */
    private Integer scId;

    /**
     * 学生id,外键
     */
    private Integer sId;

    /**
     * 课程id,外键
     */
    private Integer cId;

    private static final long serialVersionUID = 1L;
}
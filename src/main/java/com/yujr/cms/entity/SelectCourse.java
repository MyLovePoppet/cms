package com.yujr.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * select_course
 *
 * @author yujr
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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
     * 开课记录号
     */
    private Integer csId;

    private static final long serialVersionUID = 1L;
}
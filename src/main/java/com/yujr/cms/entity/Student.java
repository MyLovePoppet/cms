package com.yujr.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * student
 *
 * @author yujr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    /**
     * id
     */
    private Integer sId;

    /**
     * 姓名
     */
    private String sName;

    /**
     * 性别
     */
    private String sSex;

    /**
     * 密码,md5散列后
     */
    private String sPasswd;

    /**
     * 班级
     */
    private String sClass;

    /**
     * 专业
     */
    private String sMajor;

    /**
     * 学院
     */
    private String sCollege;

    private static final long serialVersionUID = 1L;
}
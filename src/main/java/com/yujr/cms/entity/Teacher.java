package com.yujr.cms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * teacher
 *
 * @author yujr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {
    /**
     * id
     */
    private Integer tId;

    /**
     * 姓名
     */
    private String tName;

    /**
     * 密码,md5散列后
     */
    private String tPasswd;

    /**
     * 性别
     */
    private String tSex;

    /**
     * 简介
     */
    private String tIntroduction;

    private static final long serialVersionUID = 1L;
}
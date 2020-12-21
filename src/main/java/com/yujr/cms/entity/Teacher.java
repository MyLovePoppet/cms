package com.yujr.cms.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * teacher
 * @author yujr
 */
@Data
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
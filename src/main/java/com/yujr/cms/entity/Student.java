package com.yujr.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("s_id")
    private Integer sId;

    /**
     * 姓名
     */
    @JsonProperty("s_name")
    private String sName;

    /**
     * 性别
     */
    @JsonProperty("s_sex")
    private String sSex;

    /**
     * 密码,md5散列后
     */
    @JsonProperty("s_passwd")
    private String sPasswd;

    /**
     * 班级
     */
    @JsonProperty("s_class")
    private String sClass;

    /**
     * 专业
     */
    @JsonProperty("s_major")
    private String sMajor;

    /**
     * 学院
     */
    @JsonProperty("s_college")
    private String sCollege;

    private static final long serialVersionUID = 1L;
}
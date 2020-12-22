package com.yujr.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("t_id")
    private Integer tId;

    /**
     * 姓名
     */
    @JsonProperty("t_name")
    private String tName;

    /**
     * 密码,md5散列后
     */
    @JsonProperty("t_passwd")
    private String tPasswd;

    /**
     * 性别
     */
    @JsonProperty("t_sex")
    private String tSex;

    /**
     * 简介
     */
    @JsonProperty("t_introduction")
    private String tIntroduction;

    private static final long serialVersionUID = 1L;
}
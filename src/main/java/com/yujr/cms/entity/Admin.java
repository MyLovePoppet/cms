package com.yujr.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * admin
 *
 * @author yujr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {
    /**
     * 账号
     */
    @JsonProperty("a_name")
    private String aName;

    /**
     * 密码,md5散列后
     */
    @JsonProperty("a_passwd")
    private String aPasswd;

    private static final long serialVersionUID = 1L;
}
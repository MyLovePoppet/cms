package com.yujr.cms.entity;

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
    private String aName;

    /**
     * 密码,md5散列后
     */
    private String aPasswd;

    private static final long serialVersionUID = 1L;
}
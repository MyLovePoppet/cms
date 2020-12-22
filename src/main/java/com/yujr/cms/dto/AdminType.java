package com.yujr.cms.dto;

public enum AdminType {
    LOGIN_OK(new AdminRes(200, "登录成功！")),
    LOGIN_ERROR(new AdminRes(401, "登录失败，请检查用户名密码"));

    AdminType(AdminRes res) {
        this.res = res;
    }

    public final AdminRes res;
}


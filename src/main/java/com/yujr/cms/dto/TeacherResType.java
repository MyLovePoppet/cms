package com.yujr.cms.dto;

public enum TeacherResType {
    OK(new TeacherRes(200, "请求成功！")),
    REQ_ERROR(new TeacherRes(400, "客户端请求失败！"));

    TeacherResType(TeacherRes res) {
        this.res = res;
    }

    public final TeacherRes res;
}

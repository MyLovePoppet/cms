package com.yujr.cms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yujr.cms.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherRes extends BaseRes {
    @JsonProperty("value")
    private Teacher teacher;

    public TeacherRes(int code, String msg) {
        super(code, msg);
    }
}

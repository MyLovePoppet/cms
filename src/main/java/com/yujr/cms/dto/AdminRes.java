package com.yujr.cms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yujr.cms.entity.Admin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminRes extends BaseRes {
    @JsonProperty("value")
    private Admin admin;

    public AdminRes(int code, String msg) {
        super(code, msg);
    }
}

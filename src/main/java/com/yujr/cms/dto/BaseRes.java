package com.yujr.cms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseRes {
    @JsonProperty("code")
    private int code;
    @JsonProperty("message")
    private String message;
}

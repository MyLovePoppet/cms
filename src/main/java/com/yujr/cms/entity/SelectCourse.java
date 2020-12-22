package com.yujr.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * select_course
 *
 * @author yujr
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectCourse implements Serializable {
    /**
     * 选课id
     */
    @JsonProperty("sc_id")
    private Integer scId;

    /**
     * 学生id,外键
     */
    @JsonProperty("s_id")
    private Integer sId;

    /**
     * 开课记录号
     */
    @JsonProperty("cs_id")
    private Integer csId;

    private static final long serialVersionUID = 1L;
}
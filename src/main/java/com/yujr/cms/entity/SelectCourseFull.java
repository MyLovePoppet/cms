package com.yujr.cms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelectCourseFull implements Serializable {
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
     * 姓名
     */
    @JsonProperty("s_name")
    private String sName;

    /**
     * 开课记录号
     */
    @JsonProperty("cs_id")
    private Integer csId;

    /**
     * 课程id,外键
     */
    @JsonProperty("c_id")
    private Integer cId;

    /**
     * 课程名称
     */
    @JsonProperty("c_name")
    private String cName;

    /**
     * 教师id,外键
     */
    @JsonProperty("t_id")
    private Integer tId;

    /**
     * 教师姓名
     */
    @JsonProperty("t_name")
    private String tName;

    private static final long serialVersionUID = 1L;
}

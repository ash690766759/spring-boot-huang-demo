package com.huang.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 实体类  嘉宾
 * @ApiModel    声明实例
 * @ApiModelProperty    声明实例属性  用于接口的参数显示*/
@Data @AllArgsConstructor
@ApiModel("嘉宾")
public class Guest {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("角色")
    private String role;
}

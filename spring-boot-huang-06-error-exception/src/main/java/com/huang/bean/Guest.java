package com.huang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data@AllArgsConstructor
public class Guest {
    @NotBlank(message = "{guest.name.notblank}")
    private String name;
    @NotBlank(message = "嘉宾角色不能为空")
    private String role;
}

package com.huang.controller;

import com.huang.bean.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 业务控制类    返回视图
 * @Api 声明一系列接口的功能      在controller上
 * @ApiOperation    声明具体接口的功能   在方法上*/
@RestController
@Api(tags = "嘉宾相关接口",description = "对嘉宾进行CURD的接口")
public class GuestController {

    @RequestMapping("/guest/list")
    @ApiOperation("查询嘉宾列表")
    public String list(){
        return "list";
    }
    //@ApiIgnore    不显示
    @ApiIgnore
    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }

    @ApiOperation("增加嘉宾")
    @RequestMapping("/guest/add")
    public String add(Guest g){
        return "redirect:/guest/list";
    }

    @ApiIgnore
    @RequestMapping("/guest/toUpdate")
    public String toUpdate(String name){
        return "update";
    }

    @ApiOperation("更新嘉宾")
    @RequestMapping("/guest/update")
    public String update(Guest g){
        return "redirect:/guest/list";
    }

    @ApiOperation("删除嘉宾")
    @ApiImplicitParam(name = "name",value = "姓名")
    @RequestMapping("/guest/delete")
    public String delete(String name){
        return "redirect:/guest/list";
    }
}

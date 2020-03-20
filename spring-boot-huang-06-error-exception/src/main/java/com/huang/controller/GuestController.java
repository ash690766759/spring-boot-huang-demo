package com.huang.controller;

import com.huang.bean.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GuestController {
    /**
     * @Valid   直接放在bean前面  用于校验他的规则
     *          校验不通过时，返回400+失败原因
     *          普通模式 =》失败结果全部返回
     * */
    @PostMapping("/guest/l")
    public String add(@Valid Guest g){
        return "success";
    }

    @PostMapping("/guest")
    public String add2(@Valid Guest g, BindingResult result){
        if (result.getErrorCount()>0){
            List<FieldError> fes=result.getFieldErrors();
            StringBuffer s = new StringBuffer();
            for(FieldError fieldError:fes){
                s.append(fieldError.getField());
                s.append("/t");
                s.append(fieldError.getDefaultMessage()+"/n");
            }
            return s.toString();
        }
        return "success";
    }

}

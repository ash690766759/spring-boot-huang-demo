package com.huang.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Component  //springboot能找到
@Endpoint(id="custom") //端点名
public class CustomPoint {
    @ReadOperation  //查看端点时 =》找到custom方法
    @ResponseBody   //返回JSON数据
    public Map<String,String> custom(){
        Map<String,String> result = new HashMap<>();
        result.put("name","hello custom");
        return result;
    }
}

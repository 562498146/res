package com.ylz.cloud.mioroserviceprovideruser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.\n
 *
 * @author: xzy
 * @Date: 2018/5/30
 * @Time: 15:23
 * @Description:
 */
@RestController
public class DemoCtroll {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}

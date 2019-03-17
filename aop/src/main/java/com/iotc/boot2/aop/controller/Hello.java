package com.iotc.boot2.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Intellij IDEA
 *
 * @Author PercyG
 * @Since 2019/3/17
 * Description:
 * Modified:
 */
@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello1() {
        return "hello world";
    }
}

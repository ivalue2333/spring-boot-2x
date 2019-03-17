package com.iotc.boot2.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// 使用spring initializer ，勾选 core(lombok)，web(web) 实现路由功能
@SpringBootApplication
@RestController
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@RequestMapping("/hello1")
	public String hello1() {
		return "hello1 world";
	}

	@GetMapping("/hello2")
	public String hello2() {
		return "hello2 world";
	}

	@RequestMapping(value = "/hello3", method = RequestMethod.POST)
	private String hello3() {
		return "hello3 world";
	}

	@GetMapping("/hello4")
	public User hello4() {
		User user = new User();
		user.setUserName("percy");
		return user;
	}

}

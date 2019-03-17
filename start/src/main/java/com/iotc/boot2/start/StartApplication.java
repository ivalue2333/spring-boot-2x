package com.iotc.boot2.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用spring initializer ，勾选 core(lombok)
@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
		(new StartApplication()).start();
	}

	public void start() {
		UserModel user = new UserModel();
		user.setUserName("percy");
		System.out.println(user);
		System.out.println(user.getUserName());
	}

}
